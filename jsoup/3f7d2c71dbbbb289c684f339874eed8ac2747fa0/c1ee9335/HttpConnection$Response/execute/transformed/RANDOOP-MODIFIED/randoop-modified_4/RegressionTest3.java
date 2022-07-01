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
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map5 = response4.headers();
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response4.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method10 = response9.method();
        java.lang.String str12 = response9.getHeaderCaseInsensitive("");
        int int13 = response9.statusCode();
        java.util.Map.Entry entry15 = response9.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Method method17 = response16.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response21 = response16.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str22 = response16.contentType();
        java.lang.String str23 = response16.contentType();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map.Entry entry28 = response26.scanHeaders("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(entry28);
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry16 = response0.scanHeaders("");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        java.util.Map map11 = response0.cookies();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.removeHeader("\\Qhi!\\E");
        int int13 = response1.statusCode();
        boolean boolean15 = response1.hasHeader("\\Qhi!\\E");
        java.lang.String str16 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean20 = response18.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.lang.String str9 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method3 = response2.method();
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        int int6 = response2.statusCode();
        java.util.Map.Entry entry8 = response2.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method10 = response9.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map12 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Response response16 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map18 = response0.headers();
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response13 = response8.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str15 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map.Entry entry21 = response17.scanHeaders("");
        java.net.URL uRL22 = response17.url();
        org.jsoup.Connection.Response response25 = response17.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str26 = response17.contentType();
        java.lang.String str28 = response17.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map29 = response17.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray32 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass12 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.contentType();
        java.net.URL uRL10 = response0.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.removeHeader("\\Qhi!\\E");
        int int13 = response1.statusCode();
        boolean boolean15 = response1.hasHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response17 = response1.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map14 = response7.headers();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        org.jsoup.Connection.Method method17 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasHeader("\\Qhi!\\E");
        java.lang.String str15 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean18 = response16.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean20 = response16.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry22 = response16.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(entry22);
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.lang.String str16 = response11.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response20 = response17.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.Connection.Method method26 = response21.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.lang.String str29 = response28.statusMessage();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response28);
        boolean boolean32 = response28.hasCookie("\\Qhi!\\E");
        java.util.Map map33 = response28.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.String str37 = response0.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response39 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response39);
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        java.util.Map.Entry entry10 = response7.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean16 = response12.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean18 = response12.hasCookie("\\Qhi!\\E");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response12.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = response1.header("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("");
        int int12 = response8.statusCode();
        java.lang.String str13 = response8.charset();
        java.net.URL uRL14 = response8.url();
        java.lang.String str15 = response8.contentType();
        org.jsoup.Connection.Response response17 = response8.removeCookie("hi!");
        org.jsoup.Connection.Response response20 = response8.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response23 = response8.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean25 = response8.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry5 = response1.scanHeaders("");
        org.jsoup.Connection.Response response7 = response1.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map17 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL21 = response0.url();
        org.jsoup.Connection.Response response23 = response0.removeHeader("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.util.Map map9 = response6.headers();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response0.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean6 = response0.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean8 = response0.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        int int12 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\E");
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass19 = strStream18.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        org.jsoup.Connection.Response response15 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str16 = response0.contentType();
        boolean boolean18 = response0.hasCookie("\\Q\\E");
        org.jsoup.Connection.Response response21 = response0.header("hi!", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response23.removeHeader("hi!");
        java.lang.String str26 = response23.contentType();
        org.jsoup.Connection.Method method27 = response23.method();
        org.jsoup.Connection.Method method28 = response23.method();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str31 = response30.statusMessage();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.util.Map.Entry entry34 = response30.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str35 = response30.statusMessage();
        java.util.Map map36 = response30.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(entry34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.lang.String str9 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response13 = response11.removeCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry9 = response7.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response14 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response7.hasCookie("");
        java.util.Map map10 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean13 = response11.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response9.charset();
        java.lang.Class<?> wildcardClass11 = response9.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        java.lang.String str10 = response0.cookie("\\Qhi!\\E");
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response13.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response7.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map15 = response7.cookies();
        java.util.Map.Entry entry17 = response7.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response7.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        java.lang.String str7 = response4.contentType();
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map map11 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        int int13 = response1.statusCode();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry17 = response1.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response18.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int21 = response18.statusCode();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.util.Map.Entry entry17 = response11.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method19 = response18.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response23 = response18.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str24 = response18.contentType();
        java.lang.String str25 = response18.contentType();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str29 = response18.getHeaderCaseInsensitive("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.regex.Matcher matcher20 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass21 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(matcher20);
        org.junit.Assert.assertEquals(matcher20.toString(), "java.util.regex.Matcher[pattern= region=0,32 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response6.statusMessage();
        java.lang.String str10 = response6.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        int int16 = response12.statusCode();
        java.util.Map.Entry entry18 = response12.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method20 = response19.method();
        boolean boolean22 = response19.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map23 = response19.cookies();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Method method25 = response6.method();
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.Connection.Response response27 = null;
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection26, response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        java.util.Map.Entry entry14 = response8.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        java.lang.String str18 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response22 = response20.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response23.removeHeader("hi!");
        java.lang.String str26 = response23.contentType();
        org.jsoup.Connection.Method method27 = response23.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.util.Map map30 = response23.headers();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.util.Map.Entry entry36 = response6.scanHeaders("hi!");
        java.net.URL uRL37 = response6.url();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(entry36);
        org.junit.Assert.assertNull(uRL37);
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str12 = response0.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("hi!", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream(charSequence5);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "hi!");
        org.junit.Assert.assertNotNull(strStream4);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str11 = response7.charset();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        org.jsoup.Connection.Response response4 = response0.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response13 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str16 = response6.cookie("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str6 = response1.statusMessage();
        boolean boolean8 = response1.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response1.cookies();
        java.lang.String str10 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        java.util.function.Predicate<java.lang.String> strPredicate2 = pattern0.asPredicate();
        java.lang.String str3 = pattern0.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        int int12 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        java.lang.String str14 = pattern2.pattern();
        java.lang.String str15 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        java.lang.String str7 = response4.contentType();
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map17 = response10.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str21 = response3.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str22 = response3.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str14 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response16 = response7.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str17 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str14 = response12.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int16 = response15.statusCode();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.cookies();
        org.jsoup.Connection.Response response5 = response1.removeCookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response11 = response8.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean15 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response11 = response6.removeHeader("\\Qhi!\\E");
        java.net.URL uRL12 = response6.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        boolean boolean13 = response0.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        java.lang.String str16 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str7 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response2.contentType();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response2.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        java.lang.String str7 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.regex.Matcher matcher7 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(matcher7);
        org.junit.Assert.assertEquals(matcher7.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,309 lastmatch=]");
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL8 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str10 = response8.charset();
        int int11 = response8.statusCode();
        java.util.Map map12 = response8.cookies();
        java.lang.Class<?> wildcardClass13 = response8.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int9 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.Connection.Method method17 = response11.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map19 = response18.headers();
        java.net.URL uRL20 = response18.url();
        java.lang.String str22 = response18.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response23.removeCookie("\\Qhi!\\E");
        java.lang.String str26 = response23.charset();
        java.lang.String str28 = response23.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response31 = response29.removeHeader("hi!");
        java.lang.String str32 = response29.contentType();
        org.jsoup.Connection.Method method33 = response29.method();
        org.jsoup.Connection.Method method34 = response29.method();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.Connection.Response response37 = response29.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str40 = response29.header("\\Qhi!\\E");
        java.lang.String str41 = response29.charset();
        java.util.Map map42 = response29.cookies();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method46 = response45.method();
        java.lang.String str48 = response45.getHeaderCaseInsensitive("");
        int int49 = response45.statusCode();
        java.lang.String str50 = response45.charset();
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response45);
        org.jsoup.Connection.Response response54 = response51.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response57 = response55.removeHeader("hi!");
        java.lang.String str58 = response55.contentType();
        org.jsoup.Connection.Method method59 = response55.method();
        org.jsoup.Connection.Method method60 = response55.method();
        org.jsoup.helper.HttpConnection.Response response61 = new org.jsoup.helper.HttpConnection.Response(response55);
        org.jsoup.helper.HttpConnection.Response response62 = new org.jsoup.helper.HttpConnection.Response(response61);
        java.lang.String str63 = response62.statusMessage();
        org.jsoup.helper.HttpConnection.Response response64 = new org.jsoup.helper.HttpConnection.Response(response62);
        boolean boolean66 = response62.hasCookie("\\Qhi!\\E");
        java.util.Map map67 = response62.cookies();
        response51.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNull(method60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        java.lang.String str15 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response17 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean19 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str20 = response0.charset();
        java.lang.String str21 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method23 = response22.method();
        java.lang.String str24 = response22.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response28 = response26.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response31 = response29.removeHeader("hi!");
        java.lang.String str32 = response29.contentType();
        org.jsoup.Connection.Method method33 = response29.method();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.util.Map map36 = response29.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method40 = response39.method();
        java.lang.String str42 = response39.getHeaderCaseInsensitive("");
        int int43 = response39.statusCode();
        java.util.Map.Entry entry45 = response39.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response(response39);
        org.jsoup.Connection.Method method47 = response46.method();
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response46);
        java.util.Map map49 = response48.cookies();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(entry45);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map11 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response12.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int2 = pattern1.flags();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.cookie("", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        org.jsoup.Connection.Response response5 = response1.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map8 = response0.cookies();
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry7 = response0.scanHeaders("\\Qhi!\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response7.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map15 = response7.cookies();
        java.util.Map.Entry entry17 = response7.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str18 = response7.statusMessage();
        org.jsoup.Connection.Response response21 = response7.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response0.url();
        java.util.Map map10 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        java.lang.String str10 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response8.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response1.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.cookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response7.hasCookie("");
        java.util.Map map10 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean13 = response11.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int14 = response11.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str9 = response0.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate10 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate11 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate12 = pattern2.asPredicate();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response13 = response8.removeCookie("hi!");
        boolean boolean15 = response8.hasHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response17 = response8.removeCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry19 = response8.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean16 = response12.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response18 = response12.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str19 = response12.statusMessage();
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.net.URL uRL28 = response21.url();
        java.net.URL uRL29 = response21.url();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response32 = response30.removeHeader("hi!");
        java.lang.String str33 = response30.contentType();
        org.jsoup.Connection.Method method34 = response30.method();
        org.jsoup.Connection.Method method35 = response30.method();
        org.jsoup.Connection.Method method36 = response30.method();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.util.Map map38 = response37.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        java.lang.String str40 = response21.statusMessage();
        java.lang.String str42 = response21.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str43 = response21.statusMessage();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response46 = response21.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response12.setupFromConnection(httpURLConnection20, response46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(response46);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response11.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map map18 = response17.headers();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response0.hasCookie("hi!");
        boolean boolean14 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.header("\\Qhi!\\E");
        java.lang.String str13 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Response response18 = response1.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response2.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response7 = response5.removeHeader("hi!");
        java.lang.String str8 = response5.contentType();
        org.jsoup.Connection.Method method9 = response5.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map map12 = response5.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL12 = response11.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response11.header("", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) '#');
        java.util.regex.Matcher matcher13 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray15 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(matcher13);
        org.junit.Assert.assertEquals(matcher13.toString(), "java.util.regex.Matcher[pattern= region=0,153 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response14.statusMessage();
        java.util.Map.Entry entry17 = response14.scanHeaders("");
        boolean boolean19 = response14.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response14.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.util.Map map11 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        int int16 = response12.statusCode();
        java.util.Map.Entry entry18 = response12.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response24 = response19.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map25 = response19.cookies();
        java.util.Map map26 = response19.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray29 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        int int12 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream14 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        int int15 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream17 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(strStream17);
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        int int7 = pattern2.flags();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        int int9 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String str4 = pattern2.pattern();
        java.lang.String str5 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", 97);
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str14 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response10.contentType();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        org.jsoup.Connection.Response response10 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response9 = response7.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str17 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method19 = response18.method();
        java.lang.String str20 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response24 = response22.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response27 = response25.removeHeader("hi!");
        java.lang.String str28 = response25.contentType();
        org.jsoup.Connection.Method method29 = response25.method();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map32 = response25.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response37 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        java.net.URL uRL13 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.cookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response10 = response6.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response12 = response6.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass13 = response12.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response12.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate19 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream21 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate22 = pattern2.asPredicate();
        java.lang.String[] strArray24 = pattern2.split((java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strPredicate19);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNotNull(strPredicate22);
        org.junit.Assert.assertNotNull(strArray24);
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean6 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate5 = pattern2.asPredicate();
        java.lang.Class<?> wildcardClass6 = strPredicate5.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.Connection.Method method14 = response8.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map16 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str26 = response24.statusMessage();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method28 = response27.method();
        java.lang.String str29 = response27.statusMessage();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response33 = response31.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response36 = response34.removeHeader("hi!");
        java.lang.String str37 = response34.contentType();
        org.jsoup.Connection.Method method38 = response34.method();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response34);
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response34);
        java.util.Map map41 = response34.headers();
        response31.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response27.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        boolean boolean47 = response0.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL49 = response48.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document50 = response48.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(uRL49);
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        java.lang.String str14 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL17 = response16.url();
        int int18 = response16.statusCode();
        int int19 = response16.statusCode();
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response16.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        java.lang.String str7 = response4.contentType();
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map17 = response10.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str21 = response3.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.statusMessage();
        java.lang.String str13 = response8.header("\\Qhi!\\E");
        java.util.Map map14 = response8.headers();
        java.util.Map map15 = response8.cookies();
        java.lang.String str17 = response8.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map10 = response0.cookies();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.cookie("", "\\Qhi!\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.header("", "\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.function.Predicate<java.lang.String> strPredicate19 = pattern2.asPredicate();
        java.lang.String[] strArray22 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 128);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strPredicate19);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map.Entry entry12 = response0.scanHeaders("\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response7.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response11 = response7.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray9 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str11 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL5 = response4.url();
        org.jsoup.Connection.Response response7 = response4.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
        boolean boolean13 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean16 = response14.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response14.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map10 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response15.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response15.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        java.lang.String str7 = response4.contentType();
        java.net.URL uRL8 = response4.url();
        java.util.Map map9 = response4.headers();
        java.util.Map.Entry entry11 = response4.scanHeaders("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response13 = response4.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection3, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response13.contentType();
        java.util.Map map15 = response13.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response13.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map11 = response0.headers();
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response17 = response14.cookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response14.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.String[] strArray12 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str15 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response9.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean14 = response9.hasHeader("\\Qhi!\\E");
        java.util.Map.Entry entry16 = response9.scanHeaders("\\Qhi!\\E");
        java.util.Map map17 = response9.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        java.lang.String str14 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        boolean boolean21 = response19.hasHeader("hi!");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        java.lang.String str12 = response1.cookie("hi!");
        int int13 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 100);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,150 lastmatch=]");
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map16 = response9.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.lang.String str20 = response2.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry22 = response2.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map23 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int6 = response0.statusCode();
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response13 = response8.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str15 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response19 = response8.removeHeader("hi!");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 0);
        java.lang.String str9 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        java.lang.String str14 = response7.contentType();
        org.jsoup.Connection.Method method15 = response7.method();
        java.lang.String str16 = response7.statusMessage();
        int int17 = response7.statusCode();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response19.removeHeader("hi!");
        java.lang.String str22 = response19.contentType();
        org.jsoup.Connection.Method method23 = response19.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response27 = response19.cookie("\\Qhi!\\E", "");
        org.jsoup.Connection.Response response30 = response19.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response33 = response19.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection18, response33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str6 = pattern2.pattern();
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        boolean boolean13 = response0.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response0.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass16 = response15.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map.Entry entry12 = response8.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response8.statusMessage();
        org.jsoup.Connection.Response response16 = response8.header("\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map11 = response10.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL13 = response10.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response17 = response10.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response10.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "hi!", (int) ' ');
        java.lang.String str12 = pattern2.pattern();
        java.lang.String str13 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 52);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Qhi!\\E" + "'", str3, "\\Qhi!\\E");
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map11 = response7.cookies();
        org.jsoup.Connection.Response response14 = response7.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean12 = response8.hasCookie("\\Qhi!\\E");
        java.util.Map map13 = response8.cookies();
        org.jsoup.Connection.Response response16 = response8.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response13 = response10.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map14 = response10.headers();
        java.net.URL uRL15 = response10.url();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Response response16 = response0.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response10.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map13 = response10.cookies();
        java.lang.Class<?> wildcardClass14 = response10.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.headers();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeHeader("hi!");
        java.lang.String str18 = response15.contentType();
        org.jsoup.Connection.Method method19 = response15.method();
        java.util.Map.Entry entry21 = response15.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method24 = response23.method();
        java.lang.String str25 = response23.statusMessage();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response29 = response27.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response32 = response30.removeHeader("hi!");
        java.lang.String str33 = response30.contentType();
        org.jsoup.Connection.Method method34 = response30.method();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response30);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.util.Map map37 = response30.headers();
        response27.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.util.Map map41 = response22.cookies();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response22);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str9 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response7.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "\\Q\\E");
        int int19 = pattern2.flags();
        java.lang.String str20 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int12 = response7.statusCode();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL13 = response8.url();
        org.jsoup.Connection.Response response16 = response8.cookie("\\Qhi!\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        int int17 = response8.statusCode();
        java.net.URL uRL18 = response8.url();
        org.jsoup.Connection.Response response21 = response8.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map22 = response8.cookies();
        java.lang.String str24 = response8.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass25 = response8.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map4 = response3.headers();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response1.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.header("\\Qhi!\\E");
        org.jsoup.Connection.Response response18 = response1.removeCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response11.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map28 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        int int30 = response18.statusCode();
        boolean boolean32 = response18.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.util.Map map34 = response33.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document37 = response17.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.Connection.Response response11 = response7.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response13 = response7.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.Connection.Response response17 = null;
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection16, response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str15, "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map10 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map16 = response15.headers();
        boolean boolean18 = response15.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str21 = response15.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int22 = response15.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response15.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.charset();
        boolean boolean7 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("");
        java.util.regex.Matcher matcher3 = pattern1.matcher((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher5 = pattern1.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern1;
        java.lang.String str7 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "");
        org.junit.Assert.assertNotNull(matcher3);
        org.junit.Assert.assertEquals(matcher3.toString(), "java.util.regex.Matcher[pattern= region=0,13 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher5);
        org.junit.Assert.assertEquals(matcher5.toString(), "java.util.regex.Matcher[pattern= region=0,74 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.statusMessage();
        java.lang.String str13 = response8.header("\\Qhi!\\E");
        java.util.Map map14 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response16.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response8.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str16 = response15.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response15.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasHeader("\\Qhi!\\E");
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.header("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str20 = response0.statusMessage();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response13 = response1.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map16 = response15.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 2);
        java.lang.String[] strArray10 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str11 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.statusMessage();
        java.lang.String str13 = response8.header("\\Qhi!\\E");
        java.util.Map map14 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str16 = response8.statusMessage();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.removeHeader("\\Qhi!\\E");
        int int13 = response1.statusCode();
        java.util.Map map14 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response15.charset();
        boolean boolean18 = response15.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response4 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        org.jsoup.Connection.Response response7 = response0.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL11 = response7.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response7.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.Connection.Method method17 = response11.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map19 = response18.headers();
        java.net.URL uRL20 = response18.url();
        java.util.Map map21 = response18.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean25 = response7.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str26 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response8.contentType();
        java.util.Map map10 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher20 = pattern2.matcher((java.lang.CharSequence) "\\Q\\E");
        java.lang.String[] strArray23 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertNotNull(matcher20);
        org.junit.Assert.assertEquals(matcher20.toString(), "java.util.regex.Matcher[pattern= region=0,4 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int12 = response8.statusCode();
        int int13 = response8.statusCode();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response10.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            response10.processResponseHeaders(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", 64);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass5 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Q\\E region=0,312 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        java.util.Map map13 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.contentType();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response3.contentType();
        java.lang.String str6 = response3.cookie("");
        int int7 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.util.Map map19 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method21 = response20.method();
        java.lang.String str23 = response20.getHeaderCaseInsensitive("");
        int int24 = response20.statusCode();
        java.util.Map.Entry entry26 = response20.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Method method28 = response27.method();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Response response32 = response27.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map33 = response27.cookies();
        java.util.Map map34 = response27.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.net.URL uRL37 = response3.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response38 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(uRL37);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate5 = pattern2.asPredicate();
        java.util.regex.Matcher matcher7 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray10 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertNotNull(matcher7);
        org.junit.Assert.assertEquals(matcher7.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,32 lastmatch=]");
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response9.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int13 = response12.statusCode();
        java.util.Map map14 = response12.headers();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response12.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map10 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response0.statusCode();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry16 = response0.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.Connection.Method method24 = response18.method();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.util.Map map26 = response25.headers();
        java.net.URL uRL27 = response25.url();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map29 = response28.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream11 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str12 = pattern2.pattern();
        java.util.regex.Matcher matcher14 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(matcher14);
        org.junit.Assert.assertEquals(matcher14.toString(), "java.util.regex.Matcher[pattern= region=0,32 lastmatch=]");
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        java.util.Map map12 = response7.cookies();
        org.jsoup.Connection.Response response15 = response7.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map map16 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response7.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.cookies();
        java.util.Map.Entry entry12 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean14 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL15 = response0.url();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        int int12 = pattern2.flags();
        java.util.regex.Matcher matcher14 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.regex.Matcher matcher18 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass19 = matcher18.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(matcher14);
        org.junit.Assert.assertEquals(matcher14.toString(), "java.util.regex.Matcher[pattern= region=0,32 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(matcher18);
        org.junit.Assert.assertEquals(matcher18.toString(), "java.util.regex.Matcher[pattern= region=0,150 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response9.statusMessage();
        java.lang.String str12 = response9.header("\\Qhi!\\E");
        java.lang.String str13 = response9.charset();
        org.jsoup.Connection.Response response15 = response9.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.cookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response10 = response6.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response13 = response6.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response6.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Qhi!\\E\\\\E\\Q\\E", 10);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Qhi!\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) -1);
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response11 = response8.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        java.util.Map.Entry entry11 = response8.scanHeaders("\\Qhi!\\E");
        int int12 = response8.statusCode();
        java.lang.String str14 = response8.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map15 = response8.cookies();
        boolean boolean17 = response8.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        int int14 = response10.statusCode();
        java.lang.String str15 = response10.charset();
        java.net.URL uRL16 = response10.url();
        java.lang.String str17 = response10.contentType();
        org.jsoup.Connection.Response response19 = response10.removeCookie("hi!");
        org.jsoup.Connection.Response response22 = response10.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response25 = response10.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method27 = response26.method();
        java.lang.String str29 = response26.getHeaderCaseInsensitive("");
        int int30 = response26.statusCode();
        java.lang.String str32 = response26.getHeaderCaseInsensitive("");
        boolean boolean34 = response26.hasCookie("\\Qhi!\\E");
        java.util.Map map35 = response26.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream11 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray15 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream17 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str18 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        java.lang.String str14 = response7.contentType();
        java.lang.String str16 = response7.cookie("hi!");
        java.lang.String str18 = response7.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        java.net.URL uRL14 = response0.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str17 = response0.cookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response20 = response18.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response22 = response18.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response18.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response14 = response8.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.lang.String str16 = response8.header("");
        java.lang.String str17 = response8.contentType();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response8.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str15 = response8.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response8.statusMessage();
        org.jsoup.Connection.Response response19 = response8.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        java.util.Map map12 = response7.cookies();
        org.jsoup.Connection.Response response15 = response7.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map map16 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str18 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response7.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str22 = response21.statusMessage();
        java.util.Map.Entry entry24 = response21.scanHeaders("\\Qhi!\\E");
        org.jsoup.Connection.Response response26 = response21.removeHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Method method11 = response9.method();
        int int12 = response9.statusCode();
        boolean boolean14 = response9.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        java.lang.String str9 = response6.getHeaderCaseInsensitive("");
        int int10 = response6.statusCode();
        java.lang.String str11 = response6.charset();
        java.net.URL uRL12 = response6.url();
        java.lang.String str13 = response6.contentType();
        org.jsoup.Connection.Response response15 = response6.removeCookie("hi!");
        org.jsoup.Connection.Response response17 = response6.removeHeader("\\Qhi!\\E");
        int int18 = response6.statusCode();
        org.jsoup.Connection.Response response21 = response6.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int23 = response22.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response2.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response7 = response5.removeHeader("hi!");
        java.lang.String str8 = response5.contentType();
        org.jsoup.Connection.Method method9 = response5.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map map12 = response5.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL16 = response0.url();
        java.lang.String str18 = response0.cookie("hi!");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        java.lang.String str9 = response6.getHeaderCaseInsensitive("");
        int int10 = response6.statusCode();
        java.util.Map.Entry entry12 = response6.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method14 = response13.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response18 = response13.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map19 = response13.cookies();
        java.util.Map map20 = response13.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response6.contentType();
        java.util.Map.Entry entry13 = response6.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        java.lang.String str12 = response1.cookie("hi!");
        boolean boolean14 = response1.hasCookie("");
        org.jsoup.Connection.Response response17 = response1.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response9.statusMessage();
        java.lang.String str11 = response9.charset();
        int int12 = response9.statusCode();
        java.util.Map map13 = response9.cookies();
        boolean boolean15 = response9.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response13 = response1.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map10 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response0.statusCode();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry16 = response0.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method21 = response20.method();
        java.lang.String str22 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response26 = response24.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response29 = response27.removeHeader("hi!");
        java.lang.String str30 = response27.contentType();
        org.jsoup.Connection.Method method31 = response27.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.util.Map map34 = response27.headers();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method38 = response37.method();
        java.lang.String str40 = response37.getHeaderCaseInsensitive("");
        int int41 = response37.statusCode();
        java.util.Map.Entry entry43 = response37.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response37);
        org.jsoup.Connection.Method method45 = response44.method();
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response(response44);
        java.util.Map map47 = response46.cookies();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        java.lang.String str49 = response20.charset();
        // The following exception was thrown during execution in test generation
        try {
            response18.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNull(entry43);
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response9 = response7.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean19 = response11.hasCookie("");
        org.jsoup.Connection.Response response21 = response11.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str23 = response11.contentType();
        java.util.Map map24 = response11.headers();
        int int25 = response11.statusCode();
        boolean boolean27 = response11.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String str4 = pattern2.pattern();
        int int5 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response13 = response7.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        java.util.Map map6 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response8 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response3.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response14 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str17 = response6.header("\\Qhi!\\E");
        java.lang.String str18 = response6.charset();
        java.util.Map map19 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response7.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        int int19 = response15.statusCode();
        java.util.Map.Entry entry21 = response15.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Method method23 = response22.method();
        boolean boolean25 = response22.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map26 = response22.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        java.net.URL uRL14 = response0.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str17 = response0.cookie("\\Qhi!\\E");
        java.lang.Class<?> wildcardClass18 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response8 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean10 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("hi!", (int) ' ');
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "hi!");
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        java.lang.String str14 = response7.contentType();
        java.lang.String str16 = response7.cookie("hi!");
        boolean boolean18 = response7.hasHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str20 = response7.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str12 = response9.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.Connection.Method method18 = response13.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str21 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response25 = response20.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.util.Map map26 = response20.headers();
        // The following exception was thrown during execution in test generation
        try {
            response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method11 = response7.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response12.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        int int18 = pattern2.flags();
        java.lang.String str19 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str9 = response1.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map10 = response1.cookies();
        java.util.Map map11 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map10 = response9.cookies();
        org.jsoup.Connection.Response response13 = response9.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method15 = response14.method();
        java.lang.String str17 = response14.getHeaderCaseInsensitive("");
        java.lang.String str19 = response14.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response21 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map23 = response22.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Method method25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response9.method(method25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        java.util.Map.Entry entry12 = response6.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method15 = response14.method();
        java.lang.String str16 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map28 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response5.url(uRL33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response11 = response6.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        java.util.Map map12 = response6.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method4 = response3.method();
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        int int7 = response3.statusCode();
        java.util.Map.Entry entry9 = response3.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method11 = response10.method();
        boolean boolean13 = response10.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map15 = response10.cookies();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        org.jsoup.Connection.Response response18 = response2.removeCookie("hi!");
        java.lang.Class<?> wildcardClass19 = response2.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.lang.String str12 = pattern2.pattern();
        int int13 = pattern2.flags();
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Q\\E", (int) (short) 10);
        java.lang.String[] strArray19 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 10);
        java.lang.CharSequence charSequence20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher21 = pattern2.matcher(charSequence20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray19);
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        java.net.URL uRL12 = response0.url();
        int int13 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.pattern();
        java.lang.String str9 = pattern2.pattern();
        java.lang.String str10 = pattern2.pattern();
        java.lang.String str11 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("");
        java.lang.String str6 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response5.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String str4 = pattern2.pattern();
        java.lang.String str5 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str9 = pattern2.pattern();
        java.util.regex.Matcher matcher11 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(matcher11);
        org.junit.Assert.assertEquals(matcher11.toString(), "java.util.regex.Matcher[pattern= region=0,150 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        java.lang.String str10 = response0.cookie("\\Qhi!\\E");
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.Connection.Response response15 = response0.cookie("\\Qhi!\\E", "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        java.util.Map map9 = response5.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeCookie("\\Qhi!\\E");
        java.lang.String str15 = response12.charset();
        java.lang.String str17 = response12.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response26 = response18.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str29 = response18.header("\\Qhi!\\E");
        java.lang.String str30 = response18.charset();
        java.util.Map map31 = response18.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method35 = response34.method();
        java.lang.String str37 = response34.getHeaderCaseInsensitive("");
        int int38 = response34.statusCode();
        java.lang.String str39 = response34.charset();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response34);
        org.jsoup.Connection.Response response43 = response40.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response46 = response44.removeHeader("hi!");
        java.lang.String str47 = response44.contentType();
        org.jsoup.Connection.Method method48 = response44.method();
        org.jsoup.Connection.Method method49 = response44.method();
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response44);
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response50);
        java.lang.String str52 = response51.statusMessage();
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response51);
        boolean boolean55 = response51.hasCookie("\\Qhi!\\E");
        java.util.Map map56 = response51.cookies();
        response40.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        org.jsoup.Connection.Response response62 = response7.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response63 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray64 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNull(method49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(response62);
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response0.method();
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map14 = response7.headers();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        org.jsoup.Connection.Response response18 = response6.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response20 = response6.removeCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map21 = response6.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int8 = response7.statusCode();
        java.lang.String str10 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.lang.String str6 = pattern2.pattern();
        java.lang.String str7 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.cookies();
        java.util.Map.Entry entry12 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean14 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean16 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response13.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str17 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Method method27 = response24.method();
        java.lang.String str28 = response24.contentType();
        org.jsoup.Connection.Response response31 = response24.header("\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.util.Map map34 = response24.headers();
        // The following exception was thrown during execution in test generation
        try {
            response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str10 = response7.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str12 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response7.hasCookie("");
        java.util.Map map10 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str12 = response7.contentType();
        int int13 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL11 = response10.url();
        java.util.Map map12 = response10.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.Connection.Method method14 = response8.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map16 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str26 = response24.statusMessage();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method28 = response27.method();
        java.lang.String str29 = response27.statusMessage();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response33 = response31.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response36 = response34.removeHeader("hi!");
        java.lang.String str37 = response34.contentType();
        org.jsoup.Connection.Method method38 = response34.method();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response34);
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response34);
        java.util.Map map41 = response34.headers();
        response31.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response27.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        boolean boolean47 = response0.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response50 = response0.method(method49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL5 = response0.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method7 = response6.method();
        java.lang.String str8 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map map20 = response13.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method24 = response23.method();
        java.lang.String str26 = response23.getHeaderCaseInsensitive("");
        int int27 = response23.statusCode();
        java.util.Map.Entry entry29 = response23.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Method method31 = response30.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.util.Map map33 = response32.cookies();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.util.Map map35 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.net.URL uRL37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response38 = response0.url(uRL37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method3 = response2.method();
        java.lang.String str5 = response2.getHeaderCaseInsensitive("");
        int int6 = response2.statusCode();
        java.util.Map.Entry entry8 = response2.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method10 = response9.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map12 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Response response16 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map10 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response0.statusCode();
        java.lang.String str14 = response0.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry16 = response0.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        boolean boolean11 = response7.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response13 = response7.removeCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.String[] strArray3 = pattern1.split((java.lang.CharSequence) "\\Q\\E");
        int int4 = pattern1.flags();
        java.lang.String[] strArray7 = pattern1.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 1);
        java.lang.String[] strArray9 = pattern1.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream11 = pattern1.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray14 = pattern1.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map5 = response4.headers();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response4.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        int int18 = pattern2.flags();
        java.util.regex.Matcher matcher20 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str21 = pattern2.pattern();
        java.lang.String str22 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(matcher20);
        org.junit.Assert.assertEquals(matcher20.toString(), "java.util.regex.Matcher[pattern= region=0,16 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response9.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response17 = response13.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean19 = response13.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method20 = response13.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response23 = response13.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection12, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean9 = response0.hasCookie("");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map11 = response0.headers();
        boolean boolean13 = response0.hasCookie("");
        java.util.Map map14 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Method method11 = response9.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response14 = response12.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response17 = response12.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean19 = response12.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str21 = response12.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        boolean boolean13 = response0.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response7.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response7.cookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        java.lang.String str20 = response17.contentType();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map24 = response17.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str26 = response7.statusMessage();
        org.jsoup.Connection.Method method27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response7.method(method27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response3.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.removeHeader("\\Qhi!\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        boolean boolean12 = response7.hasCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL14 = response7.url();
        java.lang.String str15 = response7.contentType();
        boolean boolean17 = response7.hasHeader("\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response8.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.Class<?> wildcardClass17 = response16.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        java.lang.String str9 = response5.statusMessage();
        java.lang.Class<?> wildcardClass10 = response5.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.header("");
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str14 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response7.contentType();
        org.jsoup.Connection.Response response17 = response7.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response18.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response0.header("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method5 = response4.method();
        java.util.Map.Entry entry7 = response4.scanHeaders("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map12 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method15 = response14.method();
        java.lang.String str17 = response14.getHeaderCaseInsensitive("");
        int int18 = response14.statusCode();
        java.lang.String str19 = response14.charset();
        java.net.URL uRL20 = response14.url();
        java.lang.String str21 = response14.contentType();
        org.jsoup.Connection.Response response23 = response14.removeCookie("hi!");
        org.jsoup.Connection.Response response25 = response14.removeHeader("\\Qhi!\\E");
        int int26 = response14.statusCode();
        boolean boolean28 = response14.hasHeader("\\Qhi!\\E");
        java.lang.String str29 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response30);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map11 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeHeader("hi!");
        java.lang.String str18 = response15.contentType();
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map map22 = response15.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        int int24 = response12.statusCode();
        boolean boolean26 = response12.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map map28 = response27.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Response response32 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response0.url(uRL33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response8.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("hi!");
        java.net.URL uRL8 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL13 = response8.url();
        org.jsoup.Connection.Response response16 = response8.cookie("\\Qhi!\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        int int17 = response8.statusCode();
        java.net.URL uRL18 = response8.url();
        org.jsoup.Connection.Response response21 = response8.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map22 = response8.cookies();
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response8.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response2.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response7 = response5.removeHeader("hi!");
        java.lang.String str8 = response5.contentType();
        org.jsoup.Connection.Method method9 = response5.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map map12 = response5.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL16 = response0.url();
        java.lang.String str18 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response9.statusMessage();
        java.lang.String str12 = response9.header("\\Qhi!\\E");
        java.lang.String str13 = response9.charset();
        org.jsoup.Connection.Response response15 = response9.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean18 = response9.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.util.Map map13 = response7.headers();
        java.lang.String str15 = response7.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response17.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String str4 = pattern2.pattern();
        java.lang.String str5 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", 97);
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL8 = response1.url();
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str12 = response1.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method9 = response0.method();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.statusMessage();
        java.lang.String str13 = response8.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response8.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response8.contentType();
        java.lang.String str15 = response8.contentType();
        org.jsoup.Connection.Method method16 = response8.method();
        java.lang.String str17 = response8.statusMessage();
        int int18 = response8.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.contentType();
        java.net.URL uRL10 = response0.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response11.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        java.util.Map.Entry entry12 = response6.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method15 = response14.method();
        java.lang.String str16 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map28 = response21.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document34 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL12 = response7.url();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("");
        java.util.regex.Matcher matcher3 = pattern1.matcher((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str4 = pattern1.pattern();
        java.lang.Class<?> wildcardClass5 = pattern1.getClass();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "");
        org.junit.Assert.assertNotNull(matcher3);
        org.junit.Assert.assertEquals(matcher3.toString(), "java.util.regex.Matcher[pattern= region=0,13 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map15 = response14.cookies();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response14.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        boolean boolean13 = response0.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
        java.lang.String str16 = response0.statusMessage();
        java.util.Map map17 = response0.headers();
        java.lang.Class<?> wildcardClass18 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response11.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) 'a');
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.util.regex.Matcher matcher6 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(matcher6);
        org.junit.Assert.assertEquals(matcher6.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,7 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str7, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        java.lang.String str15 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response17 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean19 = response0.hasCookie("\\Qhi!\\E");
        java.net.URL uRL20 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response8.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str15 = response8.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.contentType();
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method8 = response7.method();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        java.lang.String str12 = response7.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str13 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String str15 = pattern2.pattern();
        java.lang.String str16 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str19 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response14 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str17 = response6.header("\\Qhi!\\E");
        java.lang.String str18 = response6.charset();
        java.util.Map map19 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.header("", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        int int12 = response7.statusCode();
        java.lang.String str14 = response7.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = response7.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response18 = response7.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str20 = response19.statusMessage();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.header("", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.util.regex.Matcher matcher7 = pattern2.matcher((java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(matcher7);
        org.junit.Assert.assertEquals(matcher7.toString(), "java.util.regex.Matcher[pattern= region=0,4 lastmatch=]");
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response1.removeHeader("\\Qhi!\\E");
        int int13 = response1.statusCode();
        java.util.Map map14 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry17 = response15.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response7.hasCookie("");
        java.lang.String str10 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean14 = response12.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass7 = response6.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.header("\\Qhi!\\E");
        java.lang.String str12 = response8.charset();
        java.lang.String str13 = response8.statusMessage();
        java.lang.String str14 = response8.statusMessage();
        org.jsoup.Connection.Response response16 = response8.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response8.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", (int) 'a');
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern= region=0,4 lastmatch=]");
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        int int17 = pattern2.flags();
        java.lang.CharSequence charSequence18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = pattern2.split(charSequence18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response9.statusCode();
        java.lang.String str11 = response9.statusMessage();
        org.jsoup.Connection.Response response13 = response9.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response9.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean11 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str11 = response0.contentType();
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) -1);
        java.lang.String str8 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\Q\\E" + "'", str8, "\\Q\\E");
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response8.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.util.regex.Matcher matcher12 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray15 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) '4');
        java.lang.String str16 = pattern2.pattern();
        java.lang.String str17 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher12);
        org.junit.Assert.assertEquals(matcher12.toString(), "java.util.regex.Matcher[pattern= region=0,16 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str11 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL12 = response11.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        java.util.Map map9 = response0.headers();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str16 = response11.header("hi!");
        org.jsoup.Connection.Response response19 = response11.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map17 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str22 = response0.statusMessage();
        java.util.Map.Entry entry24 = response0.scanHeaders("");
        java.util.Map map25 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        java.lang.String str8 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response8.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response8.contentType();
        java.lang.String str15 = response8.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str17 = response16.contentType();
        java.lang.String str18 = response16.charset();
        java.lang.String str20 = response16.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.util.Map map11 = response8.headers();
        java.lang.String str13 = response8.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str14 = response8.contentType();
        java.lang.String str15 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response19 = response16.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str20 = response16.charset();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response12 = response0.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        boolean boolean14 = response0.hasHeader("\\Qhi!\\E");
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.header("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response18.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        java.util.Map.Entry entry11 = response8.scanHeaders("\\Qhi!\\E");
        int int12 = response8.statusCode();
        java.lang.String str14 = response8.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean16 = response8.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Response response13 = response9.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response9.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        java.util.Map map12 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str15 = response13.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method16 = response13.method();
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response13.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        int int12 = response7.statusCode();
        java.lang.String str14 = response7.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response17 = response7.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response5 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.cookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str14 = response12.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response12.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        int int12 = response7.statusCode();
        java.lang.String str14 = response7.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = response7.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response18 = response7.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.Connection.Method method26 = response21.method();
        org.jsoup.Connection.Method method27 = response21.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map29 = response28.headers();
        java.net.URL uRL30 = response28.url();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.util.Map map32 = response31.cookies();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response31);
        java.lang.String str34 = response31.charset();
        // The following exception was thrown during execution in test generation
        try {
            response19.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.function.Predicate<java.lang.String> strPredicate18 = pattern2.asPredicate();
        java.lang.String str19 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(strPredicate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int12 = response11.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.lang.String str12 = pattern2.pattern();
        int int13 = pattern2.flags();
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 10);
        java.lang.String str17 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        org.jsoup.Connection.Response response10 = response6.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response5 = response1.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL6 = response1.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        org.jsoup.Connection.Method method12 = response7.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.statusMessage();
        java.util.Map.Entry entry17 = response14.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL18 = response14.url();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map20 = response14.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        int int22 = response1.statusCode();
        boolean boolean24 = response1.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str26 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response14 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str17 = response6.cookie("\\Q\\E");
        java.util.Map map18 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.charset();
        java.lang.String str21 = response0.charset();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.contentType();
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        org.jsoup.Connection.Response response4 = response0.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str8 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str9 = response7.charset();
        java.lang.String str11 = response7.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean16 = response7.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map11 = response7.headers();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response9.statusCode();
        java.util.Map.Entry entry12 = response9.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL13 = response9.url();
        java.lang.String str14 = response9.contentType();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean11 = response7.hasCookie("\\Qhi!\\E");
        java.util.Map map12 = response7.cookies();
        org.jsoup.Connection.Response response15 = response7.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        org.jsoup.Connection.Response response18 = response7.cookie("\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response22 = response20.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean24 = response20.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str26 = response25.charset();
        java.lang.String str27 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method29 = response28.method();
        java.lang.String str30 = response28.statusMessage();
        java.lang.String str31 = response28.charset();
        org.jsoup.Connection.Response response33 = response28.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.util.Map.Entry entry36 = response34.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response39 = response34.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        java.util.Map map40 = response34.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(entry36);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.lang.String str6 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,35 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str6, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map map4 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response7 = response4.cookie("\\Qhi!\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean9 = response4.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", (int) '#');
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("", (int) (byte) -1);
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream(charSequence3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "");
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean9 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate11 = pattern2.asPredicate();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E", 2);
        java.lang.String[] strArray17 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E", (int) (short) 10);
        java.lang.String str18 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.regex.Matcher matcher21 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream23 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate24 = pattern2.asPredicate();
        int int25 = pattern2.flags();
        int int26 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(matcher21);
        org.junit.Assert.assertEquals(matcher21.toString(), "java.util.regex.Matcher[pattern= region=0,32 lastmatch=]");
        org.junit.Assert.assertNotNull(strStream23);
        org.junit.Assert.assertNotNull(strPredicate24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 16 + "'", int25 == 16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response11.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str19 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate20 = pattern2.asPredicate();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strPredicate20);
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response8.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response8.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        java.util.Map map13 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response22 = response20.removeHeader("hi!");
        java.lang.String str23 = response20.contentType();
        org.jsoup.Connection.Method method24 = response20.method();
        org.jsoup.Connection.Method method25 = response20.method();
        org.jsoup.Connection.Method method26 = response20.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str28 = response20.charset();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            response18.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map13 = response7.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method12 = response7.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str9 = response1.cookie("\\Q\\E");
        java.util.Map map10 = response1.headers();
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Method method12 = response1.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response14.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response8 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean10 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map13 = response12.headers();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response12.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.Connection.Method method13 = response7.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str15 = response14.charset();
        java.lang.Class<?> wildcardClass16 = response14.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        boolean boolean15 = response0.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean17 = response0.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method18 = response0.method();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str4 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str7 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str10 = response8.statusMessage();
        java.lang.String str11 = response8.charset();
        org.jsoup.Connection.Response response13 = response8.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map.Entry entry16 = response14.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response19 = response14.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        java.util.Map map20 = response14.cookies();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response5.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map8 = response1.headers();
        java.util.Map.Entry entry10 = response1.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str11 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response13 = response10.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean15 = response10.hasHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL16 = response10.url();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 128);
        java.util.function.Predicate<java.lang.String> strPredicate15 = pattern2.asPredicate();
        java.lang.String str16 = pattern2.pattern();
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "");
        int int19 = pattern2.flags();
        int int20 = pattern2.flags();
        java.lang.String[] strArray23 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) '4');
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 16 + "'", int20 == 16);
        org.junit.Assert.assertNotNull(strArray23);
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        java.lang.String str5 = response3.statusMessage();
        org.jsoup.Connection.Response response7 = response3.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response8.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method9 = response6.method();
        java.lang.String str10 = response6.contentType();
        org.jsoup.Connection.Response response13 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map16 = response6.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 10);
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str8 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str8, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str14 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response7.contentType();
        java.util.Map map16 = response7.cookies();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response26 = response18.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response29 = response18.removeHeader("\\Q\\E");
        boolean boolean31 = response18.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response33 = response18.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response10.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.lang.String str11 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        int int12 = response0.statusCode();
        java.util.Map map13 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response19.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean8 = response1.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean4 = response2.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response14.statusMessage();
        java.lang.String str17 = response14.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str20 = response19.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 4);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,32 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray4 = pattern1.split((java.lang.CharSequence) "\\Qhi!\\E", (int) '#');
        java.util.stream.Stream<java.lang.String> strStream6 = pattern1.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher8 = pattern1.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray10 = pattern1.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(matcher8);
        org.junit.Assert.assertEquals(matcher8.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,150 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map11 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response8.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response8.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\E");
        java.util.Map map5 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response13 = response8.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str15 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map.Entry entry21 = response17.scanHeaders("");
        java.net.URL uRL22 = response17.url();
        org.jsoup.Connection.Response response25 = response17.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str26 = response17.contentType();
        java.lang.String str28 = response17.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map29 = response17.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.Connection.Response response32 = response8.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response34 = response8.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document36 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = matcher4.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,3 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str11 = response8.header("\\Qhi!\\E");
        java.lang.String str12 = response8.charset();
        org.jsoup.Connection.Response response14 = response8.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response15.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.lang.String str9 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map12 = response11.cookies();
        java.net.URL uRL13 = response11.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response11.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map11 = response10.cookies();
        org.jsoup.Connection.Method method12 = response10.method();
        java.util.Map map13 = response10.cookies();
        java.lang.Class<?> wildcardClass14 = map13.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map16 = response9.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.lang.String str20 = response2.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str21 = response2.charset();
        int int22 = response2.statusCode();
        int int23 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response2.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        java.util.Map.Entry entry11 = response8.scanHeaders("\\Qhi!\\E");
        boolean boolean13 = response8.hasCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry12 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response12.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response12.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("\\Qhi!\\E");
        java.lang.String str12 = response0.charset();
        java.util.Map map13 = response0.cookies();
        java.net.URL uRL14 = response0.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response15.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 8);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response10.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int13 = response10.statusCode();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeHeader("hi!");
        java.lang.String str18 = response15.contentType();
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.Connection.Method method20 = response15.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response24 = response15.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response27 = response15.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection14, response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        java.lang.String str14 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response21 = response18.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response18.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response16 = response14.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map17 = response14.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate19 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream21 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.Class<?> wildcardClass23 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(strPredicate19);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map10 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response0.statusCode();
        java.util.Map map13 = response0.cookies();
        int int14 = response0.statusCode();
        java.lang.String str16 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.lang.String str16 = response11.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response20 = response17.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.Connection.Method method26 = response21.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.lang.String str29 = response28.statusMessage();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response28);
        boolean boolean32 = response28.hasCookie("\\Qhi!\\E");
        java.util.Map map33 = response28.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass37 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response7.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        org.jsoup.Connection.Method method12 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        java.util.Map.Entry entry11 = response8.scanHeaders("\\Qhi!\\E");
        int int12 = response8.statusCode();
        java.lang.String str13 = response8.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str12 = response7.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method13 = response7.method();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response7.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.cookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response10 = response6.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response13 = response6.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map12 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        org.jsoup.Connection.Response response5 = response1.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry entry17 = response13.scanHeaders("");
        java.net.URL uRL18 = response13.url();
        org.jsoup.Connection.Response response21 = response13.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str22 = response13.contentType();
        java.lang.String str24 = response13.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map25 = response13.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        java.lang.String str10 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        java.lang.String str18 = response13.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response20 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map map22 = response21.headers();
        org.jsoup.Connection.Method method23 = response21.method();
        java.lang.String str24 = response21.statusMessage();
        java.lang.String str26 = response21.header("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response14 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str17 = response6.header("\\Qhi!\\E");
        java.lang.String str18 = response6.charset();
        java.util.Map map19 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        int int21 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response8.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str15 = response8.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response8.contentType();
        int int17 = response8.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String str4 = pattern2.pattern();
        java.lang.String str5 = pattern2.pattern();
        java.lang.String str6 = pattern2.pattern();
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.CharSequence charSequence9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray11 = pattern2.split(charSequence9, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map12 = response7.headers();
        boolean boolean14 = response7.hasCookie("\\Qhi!\\E");
        boolean boolean16 = response7.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.Connection.Method method17 = response11.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map19 = response18.headers();
        java.net.URL uRL20 = response18.url();
        java.util.Map map21 = response18.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map24 = response23.cookies();
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response28 = response26.removeHeader("hi!");
        java.lang.String str29 = response26.contentType();
        org.jsoup.Connection.Method method30 = response26.method();
        org.jsoup.Connection.Method method31 = response26.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        java.lang.String str34 = response33.statusMessage();
        java.lang.String str35 = response33.charset();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response33);
        java.util.Map map37 = response36.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response23.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int10 = pattern2.flags();
        java.util.regex.Matcher matcher12 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.regex.Matcher matcher14 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(matcher12);
        org.junit.Assert.assertEquals(matcher12.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher14);
        org.junit.Assert.assertEquals(matcher14.toString(), "java.util.regex.Matcher[pattern= region=0,150 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        int int17 = pattern2.flags();
        int int18 = pattern2.flags();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream21 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 16 + "'", int17 == 16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(strStream21);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.CharSequence charSequence2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream3 = pattern1.splitAsStream(charSequence2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response13 = response6.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.net.URL uRL14 = response6.url();
        java.util.Map.Entry entry16 = response6.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        java.lang.String str20 = response17.contentType();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response23.removeHeader("hi!");
        java.lang.String str26 = response23.contentType();
        org.jsoup.Connection.Method method27 = response23.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.util.Map map30 = response23.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.net.URL uRL33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response6.url(uRL33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.charset();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response9.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str6 = response1.statusMessage();
        boolean boolean8 = response1.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response1.cookies();
        java.util.Map.Entry entry11 = response1.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        boolean boolean12 = response7.hasCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response7.header("hi!", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response7.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response0.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        java.lang.String str19 = response16.getHeaderCaseInsensitive("");
        int int20 = response16.statusCode();
        java.lang.String str22 = response16.getHeaderCaseInsensitive("");
        boolean boolean24 = response16.hasCookie("\\Qhi!\\E");
        java.util.Map map25 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.jsoup.Connection.Method method27 = response0.method();
        org.jsoup.Connection.Response response30 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str33 = response31.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str33);
    }
}
