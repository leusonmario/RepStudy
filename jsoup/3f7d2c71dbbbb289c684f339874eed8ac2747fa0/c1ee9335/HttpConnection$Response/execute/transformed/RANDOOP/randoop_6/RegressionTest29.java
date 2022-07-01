import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        org.jsoup.Connection.Response response21 = response16.header("hi!", "");
        java.lang.String str23 = response16.header("hi!");
        java.util.Map map24 = response16.cookies();
        boolean boolean26 = response16.hasHeader("hi!");
        java.lang.String str27 = response16.charset();
        java.lang.String str29 = response16.cookie("");
        java.util.Map.Entry entry31 = response16.scanHeaders("");
        java.net.URL uRL32 = response16.url();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL34 = response33.url();
        org.jsoup.Connection.Method method35 = response33.method();
        java.lang.String str37 = response33.cookie("hi!");
        boolean boolean39 = response33.hasCookie("hi!");
        org.jsoup.Connection.Response response42 = response33.cookie("hi!", "");
        boolean boolean44 = response33.hasHeader("hi!");
        java.lang.String str45 = response33.statusMessage();
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response(response33);
        java.lang.String str47 = response46.statusMessage();
        org.jsoup.Connection.Response response50 = response46.header("hi!", "hi!");
        java.util.Map.Entry entry52 = response46.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response46);
        org.jsoup.Connection.Response response55 = response46.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response(response46);
        java.lang.String str57 = response56.statusMessage();
        boolean boolean59 = response56.hasCookie("hi!");
        java.util.Map map60 = response56.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        java.util.Map map63 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response66 = response0.header("", "");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(entry31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNull(entry52);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response10.removeCookie("");
        boolean boolean14 = response10.hasCookie("");
        java.lang.String str16 = response10.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
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
        org.jsoup.Connection.Response response30 = response0.removeCookie("");
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
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Response response15 = response9.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response4.statusCode();
        boolean boolean7 = response4.hasCookie("");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str15 = response12.header("hi!");
        org.jsoup.Connection.Response response17 = response12.removeHeader("hi!");
        java.util.Map map18 = response12.headers();
        org.jsoup.Connection.Response response20 = response12.removeHeader("hi!");
        java.util.Map.Entry entry22 = response12.scanHeaders("hi!");
        boolean boolean24 = response12.hasCookie("hi!");
        java.util.Map.Entry entry26 = response12.scanHeaders("");
        java.lang.String str27 = response12.contentType();
        java.util.Map.Entry entry29 = response12.scanHeaders("hi!");
        org.jsoup.Connection.Response response31 = response12.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, response31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
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
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
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
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        int int3 = response0.statusCode();
        java.util.Map map4 = response0.cookies();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response10.removeCookie("hi!");
        boolean boolean14 = response10.hasHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int12 = response11.statusCode();
        java.lang.String str13 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response14.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.charset();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        java.lang.String str16 = response10.charset();
        java.util.Map map17 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.net.URL uRL5 = response1.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response6.hasCookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response5.hasCookie("hi!");
        int int8 = response5.statusCode();
        org.jsoup.Connection.Response response10 = response5.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response5.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
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
        java.lang.String str55 = response13.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry entry58 = response13.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = response13.body();
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
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(entry58);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
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
        java.lang.String str15 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response0.statusMessage();
        java.lang.String str17 = response0.charset();
        boolean boolean19 = response0.hasCookie("");
        java.lang.String str21 = response0.cookie("hi!");
        java.net.URL uRL22 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map map10 = response6.headers();
        java.util.Map map11 = response6.cookies();
        java.lang.String str12 = response6.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map map9 = response1.cookies();
        java.lang.String str11 = response1.cookie("");
        java.lang.String str13 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
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
        int int29 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str34 = response32.cookie("");
        java.lang.String str35 = response32.contentType();
        java.lang.String str37 = response32.getHeaderCaseInsensitive("hi!");
        java.lang.String str38 = response32.contentType();
        java.lang.String str40 = response32.cookie("hi!");
        org.jsoup.Connection.Method method41 = response32.method();
        java.lang.String str43 = response32.getHeaderCaseInsensitive("");
        boolean boolean45 = response32.hasCookie("hi!");
        boolean boolean47 = response32.hasCookie("hi!");
        org.jsoup.Connection.Method method48 = response32.method();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection31, (org.jsoup.Connection.Response) response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(method48);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map map6 = response0.headers();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
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
        java.lang.String str13 = response7.cookie("");
        java.util.Map.Entry entry15 = response7.scanHeaders("");
        java.lang.String str16 = response7.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.lang.String str11 = response0.contentType();
        java.lang.String str12 = response0.contentType();
        boolean boolean14 = response0.hasCookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("");
        java.util.Map map3 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.header("hi!", "");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.cookie("");
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        java.lang.String str15 = response0.contentType();
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
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        java.util.Map map12 = response0.cookies();
        int int13 = response0.statusCode();
        java.net.URL uRL14 = response0.url();
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response0.hasHeader("");
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        java.util.Map map12 = response1.cookies();
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Method method14 = response1.method();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL14 = response0.url();
        java.util.Map map15 = response0.headers();
        int int16 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        org.jsoup.Connection.Response response18 = response13.header("hi!", "");
        org.jsoup.Connection.Response response20 = response13.removeHeader("hi!");
        java.lang.String str22 = response13.header("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response26 = response13.removeCookie("");
        org.jsoup.Connection.Response response29 = response13.header("hi!", "");
        java.util.Map map30 = response13.cookies();
        java.util.Map map31 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.Connection.Method method33 = response0.method();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(method33);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
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
        java.lang.String str15 = response0.charset();
        java.lang.String str16 = response0.charset();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.url(uRL17);
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.cookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean10 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
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
        java.lang.String str14 = response0.charset();
        java.lang.String str15 = response0.statusMessage();
        java.net.URL uRL16 = response0.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method19 = response17.method();
        java.util.Map map20 = response17.headers();
        org.jsoup.Connection.Response response22 = response17.removeHeader("hi!");
        java.lang.String str23 = response17.charset();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method25 = response17.method();
        org.jsoup.Connection.Response response27 = response17.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        org.jsoup.Connection.Method method30 = response28.method();
        java.lang.String str31 = response28.statusMessage();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.lang.String str34 = response32.header("");
        java.lang.String str36 = response32.header("");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        org.jsoup.Connection.Method method39 = response37.method();
        java.lang.String str41 = response37.cookie("hi!");
        boolean boolean43 = response37.hasCookie("hi!");
        org.jsoup.Connection.Response response46 = response37.cookie("hi!", "");
        boolean boolean48 = response37.hasHeader("hi!");
        java.lang.String str49 = response37.statusMessage();
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response37);
        java.lang.String str51 = response37.statusMessage();
        java.util.Map map52 = response37.headers();
        java.lang.String str53 = response37.statusMessage();
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map55 = response54.headers();
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        org.jsoup.helper.HttpConnection.Response response57 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map58 = response57.cookies();
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        org.jsoup.Connection.Method method63 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response64 = response0.method(method63);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
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
        java.net.URL uRL20 = response16.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response16.parse();
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
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        boolean boolean7 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.header("hi!");
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.header("hi!");
        java.util.Map map15 = response0.cookies();
        int int16 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection17 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        boolean boolean12 = response0.hasCookie("hi!");
        java.lang.String str14 = response0.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
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
        java.lang.String str29 = response0.charset();
        boolean boolean31 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response34 = response0.header("hi!", "");
        org.jsoup.Connection.Response response37 = response0.header("hi!", "");
        java.util.Map.Entry entry39 = response0.scanHeaders("");
        java.util.Map map40 = response0.cookies();
        boolean boolean42 = response0.hasCookie("hi!");
        java.lang.String str43 = response0.charset();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(entry39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        java.lang.String str10 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str17 = response15.statusMessage();
        java.util.Map map18 = response15.cookies();
        java.lang.String str20 = response15.header("");
        java.lang.String str22 = response15.header("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str25 = response23.getHeaderCaseInsensitive("hi!");
        java.util.Map map26 = response23.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
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
        org.jsoup.Connection.Method method21 = response1.method();
        java.net.URL uRL22 = response1.url();
        java.util.Map.Entry entry24 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(entry24);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        org.jsoup.Connection.Response response10 = response6.header("hi!", "hi!");
        org.jsoup.Connection.Response response12 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int14 = response6.statusCode();
        java.lang.Class<?> wildcardClass15 = response6.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
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
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.net.URL uRL14 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.header("", "");
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
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
        java.lang.String str26 = response0.header("");
        java.lang.String str27 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        int int9 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
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
        org.jsoup.Connection.Response response18 = response0.removeHeader("hi!");
        java.lang.String str19 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str22 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("");
        org.jsoup.Connection.Response response5 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.header("hi!");
        org.jsoup.Connection.Response response11 = response7.removeHeader("hi!");
        org.jsoup.Connection.Response response13 = response7.removeCookie("");
        java.util.Map map14 = response7.headers();
        java.util.Map map15 = response7.cookies();
        java.util.Map map16 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry20 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(entry20);
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.util.Map map11 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str16 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str19 = response13.getHeaderCaseInsensitive("hi!");
        boolean boolean21 = response13.hasCookie("");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.util.Map map12 = response0.cookies();
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean15 = response0.hasHeader("hi!");
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str7 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.statusMessage();
        java.util.Map map12 = response9.cookies();
        org.jsoup.Connection.Response response14 = response9.removeHeader("hi!");
        java.lang.String str16 = response9.getHeaderCaseInsensitive("hi!");
        java.util.Map map17 = response9.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.util.Map.Entry entry20 = response8.scanHeaders("");
        org.jsoup.Connection.Response response23 = response8.header("hi!", "hi!");
        org.jsoup.Connection.Response response26 = response8.header("hi!", "");
        java.lang.String str27 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        java.lang.String str30 = response28.statusMessage();
        int int31 = response28.statusCode();
        org.jsoup.Connection.Response response34 = response28.header("hi!", "hi!");
        java.lang.String str35 = response28.statusMessage();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL37 = response36.url();
        org.jsoup.Connection.Method method38 = response36.method();
        org.jsoup.Connection.Response response41 = response36.header("hi!", "");
        java.util.Map map42 = response36.headers();
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response36);
        int int44 = response36.statusCode();
        java.util.Map.Entry entry46 = response36.scanHeaders("");
        java.lang.String str48 = response36.header("");
        java.lang.String str50 = response36.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response(response51);
        java.lang.String str54 = response52.header("hi!");
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL56 = response55.url();
        java.lang.String str58 = response55.header("hi!");
        org.jsoup.Connection.Response response60 = response55.removeHeader("hi!");
        java.lang.String str62 = response55.header("hi!");
        java.lang.String str63 = response55.statusMessage();
        java.lang.String str65 = response55.cookie("hi!");
        org.jsoup.Connection.Response response68 = response55.cookie("hi!", "hi!");
        java.lang.String str70 = response55.header("hi!");
        org.jsoup.helper.HttpConnection.Response response71 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL72 = response71.url();
        org.jsoup.Connection.Method method73 = response71.method();
        org.jsoup.Connection.Response response76 = response71.header("hi!", "");
        java.util.Map map77 = response71.headers();
        org.jsoup.helper.HttpConnection.Response response78 = new org.jsoup.helper.HttpConnection.Response(response71);
        int int79 = response71.statusCode();
        java.util.Map map80 = response71.headers();
        java.util.Map map81 = response71.cookies();
        response55.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map81);
        response52.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map81);
        response36.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map81);
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map81);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map81);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(entry46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(uRL56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(response60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNotNull(response68);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(uRL72);
        org.junit.Assert.assertNull(method73);
        org.junit.Assert.assertNotNull(response76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.lang.String str11 = response0.cookie("");
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
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
        org.jsoup.Connection.Response response19 = response0.cookie("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
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
        org.jsoup.Connection.Method method29 = response0.method();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str32 = response30.cookie("");
        java.lang.String str33 = response30.contentType();
        java.lang.String str35 = response30.header("hi!");
        org.jsoup.Connection.Response response37 = response30.removeCookie("");
        org.jsoup.Connection.Response response40 = response30.header("hi!", "");
        java.lang.String str41 = response30.charset();
        java.lang.String str43 = response30.header("");
        java.net.URL uRL44 = response30.url();
        org.jsoup.Connection.Response response46 = response30.removeCookie("");
        java.util.Map map47 = response30.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        org.jsoup.Connection.Response response50 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response52 = response0.removeCookie("hi!");
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
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNotNull(response52);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.header("");
        java.net.URL uRL14 = response0.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response15.statusMessage();
        java.net.URL uRL17 = response15.url();
        java.util.Map map18 = response15.cookies();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.statusMessage();
        java.util.Map map22 = response19.cookies();
        java.lang.String str24 = response19.header("");
        java.lang.String str26 = response19.header("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.util.Map map28 = response19.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response23 = response18.header("hi!", "");
        boolean boolean25 = response18.hasCookie("hi!");
        java.lang.String str26 = response18.contentType();
        org.jsoup.Connection.Method method27 = response18.method();
        java.util.Map map28 = response18.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Response response32 = response17.cookie("hi!", "hi!");
        java.util.Map map33 = response17.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
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
        java.net.URL uRL19 = response0.url();
        boolean boolean21 = response0.hasHeader("hi!");
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
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
        java.lang.String str33 = response0.header("hi!");
        java.net.URL uRL34 = response0.url();
        java.net.URL uRL35 = response0.url();
        java.lang.String str37 = response0.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
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
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.util.Map map14 = response0.headers();
        org.jsoup.Connection.Response response17 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.header("");
        java.lang.String str10 = response0.header("hi!");
        int int11 = response0.statusCode();
        boolean boolean13 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        boolean boolean16 = response0.hasCookie("hi!");
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL11 = response10.url();
        boolean boolean13 = response10.hasCookie("");
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        boolean boolean19 = response15.hasHeader("hi!");
        java.net.URL uRL20 = response15.url();
        java.lang.String str22 = response15.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response24 = response15.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("");
        java.lang.String str28 = response25.contentType();
        java.lang.String str30 = response25.header("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str33 = response25.cookie("hi!");
        java.util.Map.Entry entry35 = response25.scanHeaders("hi!");
        java.util.Map map36 = response25.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.Connection.Response response39 = response15.removeCookie("");
        java.util.Map.Entry entry41 = response15.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(entry35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNull(entry41);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
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
        java.util.Map.Entry entry26 = response0.scanHeaders("hi!");
        java.lang.String str28 = response0.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean10 = response8.hasHeader("hi!");
        java.net.URL uRL11 = response8.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.cookies();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.util.Map.Entry entry8 = response1.scanHeaders("");
        java.util.Map.Entry entry10 = response1.scanHeaders("");
        java.util.Map.Entry entry12 = response1.scanHeaders("");
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        boolean boolean16 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        int int17 = response1.statusCode();
        java.util.Map map18 = response1.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str8 = response1.header("");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.statusMessage();
        java.util.Map map15 = response1.cookies();
        int int16 = response1.statusCode();
        java.util.Map.Entry entry18 = response1.scanHeaders("hi!");
        java.lang.String str19 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(entry18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        boolean boolean15 = response0.hasCookie("");
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str19 = response17.statusMessage();
        boolean boolean21 = response17.hasCookie("hi!");
        java.lang.String str23 = response17.header("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map.Entry entry26 = response24.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response24);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response24);
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(entry26);
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("");
        java.net.URL uRL4 = response0.url();
        boolean boolean6 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.charset();
        java.lang.String str13 = response8.header("hi!");
        java.lang.String str15 = response8.getHeaderCaseInsensitive("hi!");
        java.util.Map map16 = response8.headers();
        org.jsoup.Connection.Response response18 = response8.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.charset();
        java.lang.String str11 = response8.header("");
        boolean boolean13 = response8.hasCookie("hi!");
        java.lang.String str15 = response8.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
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
        java.lang.String str16 = response0.contentType();
        java.net.URL uRL17 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        boolean boolean19 = response15.hasHeader("hi!");
        java.net.URL uRL20 = response15.url();
        java.lang.String str22 = response15.getHeaderCaseInsensitive("");
        java.net.URL uRL23 = response15.url();
        java.lang.String str24 = response15.statusMessage();
        java.lang.String str25 = response15.statusMessage();
        java.util.Map map26 = response15.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.util.Map map28 = response0.headers();
        int int29 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.net.URL uRL7 = response6.url();
        java.lang.String str8 = response6.charset();
        java.net.URL uRL9 = response6.url();
        java.util.Map map10 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map13 = response12.headers();
        java.lang.String str14 = response12.contentType();
        java.util.Map.Entry entry16 = response12.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
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
        java.lang.String str15 = response0.charset();
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "");
        java.util.Map.Entry entry20 = response0.scanHeaders("");
        java.lang.String str21 = response0.contentType();
        java.util.Map.Entry entry23 = response0.scanHeaders("");
        java.lang.String str24 = response0.contentType();
        java.lang.String str25 = response0.contentType();
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        boolean boolean11 = response1.hasCookie("hi!");
        java.util.Map map12 = response1.cookies();
        java.util.Map map13 = response1.headers();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response8.header("hi!", "");
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.Connection.Response response14 = response8.removeCookie("");
        org.jsoup.Connection.Response response17 = response8.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
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
        java.util.Map map38 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
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
        java.util.Map.Entry entry15 = response9.scanHeaders("");
        boolean boolean17 = response9.hasCookie("");
        java.util.Map.Entry entry19 = response9.scanHeaders("hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(entry19);
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.lang.String str10 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        java.util.Map map15 = response12.cookies();
        java.lang.String str17 = response12.header("");
        java.lang.String str19 = response12.header("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str22 = response12.header("");
        org.jsoup.Connection.Method method23 = response12.method();
        java.util.Map map24 = response12.headers();
        java.lang.String str26 = response12.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str29 = response27.cookie("");
        boolean boolean31 = response27.hasHeader("hi!");
        java.net.URL uRL32 = response27.url();
        java.lang.String str34 = response27.getHeaderCaseInsensitive("");
        java.net.URL uRL35 = response27.url();
        java.lang.String str36 = response27.statusMessage();
        java.lang.String str37 = response27.statusMessage();
        java.util.Map map38 = response27.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        java.util.Map map40 = response12.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL12 = response0.url();
        java.lang.String str14 = response0.header("hi!");
        int int15 = response0.statusCode();
        boolean boolean17 = response0.hasHeader("hi!");
        int int18 = response0.statusCode();
        boolean boolean20 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasCookie("");
        java.lang.String str14 = response0.header("");
        java.lang.String str15 = response0.contentType();
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.cookie("");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
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
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.lang.String str9 = response6.cookie("");
        java.util.Map.Entry entry11 = response6.scanHeaders("hi!");
        org.jsoup.Connection.Method method12 = response6.method();
        java.lang.String str13 = response6.contentType();
        java.lang.String str14 = response6.charset();
        boolean boolean16 = response6.hasHeader("hi!");
        java.util.Map map17 = response6.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response10.method();
        int int12 = response10.statusCode();
        java.util.Map map13 = response10.cookies();
        org.jsoup.Connection.Response response15 = response10.removeCookie("hi!");
        org.jsoup.Connection.Response response17 = response10.removeHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str13 = response10.header("hi!");
        org.jsoup.Connection.Response response15 = response10.removeCookie("hi!");
        org.jsoup.Connection.Response response17 = response10.removeCookie("");
        java.util.Map map18 = response10.cookies();
        org.jsoup.Connection.Response response21 = response10.header("hi!", "hi!");
        java.lang.String str23 = response10.header("");
        java.util.Map map24 = response10.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.HttpURLConnection httpURLConnection27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        java.net.URL uRL30 = response28.url();
        java.net.URL uRL31 = response28.url();
        java.net.URL uRL32 = response28.url();
        org.jsoup.Connection.Method method33 = response28.method();
        boolean boolean35 = response28.hasHeader("hi!");
        java.lang.String str36 = response28.charset();
        org.jsoup.Connection.Response response38 = response28.removeCookie("");
        int int39 = response28.statusCode();
        java.util.Map.Entry entry41 = response28.scanHeaders("");
        java.util.Map map42 = response28.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection27, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(entry41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Response response13 = response8.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response8.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.lang.String str9 = response0.header("hi!");
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.net.URL uRL14 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
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
        int int14 = response0.statusCode();
        org.jsoup.Connection.Method method15 = response0.method();
        java.lang.String str17 = response0.header("hi!");
        java.lang.Class<?> wildcardClass18 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
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
        java.util.Map map15 = response0.cookies();
        java.lang.String str17 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response6.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
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
        boolean boolean17 = response0.hasCookie("hi!");
        java.util.Map map18 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean13 = response11.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
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
        java.lang.String str29 = response13.header("hi!");
        java.util.Map map30 = response13.headers();
        int int31 = response13.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response33 = response13.removeHeader("");
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.contentType();
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        org.jsoup.Connection.Response response20 = response15.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str22 = response21.statusMessage();
        org.jsoup.Connection.Method method23 = response21.method();
        int int24 = response21.statusCode();
        java.lang.String str25 = response21.charset();
        java.util.Map.Entry entry27 = response21.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(entry27);
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
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
        java.net.URL uRL19 = response0.url();
        int int20 = response0.statusCode();
        java.lang.String str21 = response0.statusMessage();
        int int22 = response0.statusCode();
        org.jsoup.Connection.Method method23 = response0.method();
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
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response15.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
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
        boolean boolean19 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        org.jsoup.Connection.Response response10 = response6.header("hi!", "hi!");
        org.jsoup.Connection.Response response12 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str15 = response6.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response6.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str15 = response0.cookie("");
        java.lang.String str17 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
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
        org.jsoup.Connection.Response response16 = response13.header("hi!", "hi!");
        java.util.Map map17 = response13.cookies();
        org.jsoup.Connection.Method method18 = response13.method();
        java.util.Map.Entry entry20 = response13.scanHeaders("hi!");
        java.lang.Class<?> wildcardClass21 = entry20.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(entry20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.net.URL uRL13 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
        java.lang.String str15 = response0.charset();
        java.lang.String str16 = response0.contentType();
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        boolean boolean20 = response0.hasCookie("");
        java.net.URL uRL21 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method16 = response15.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = method16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasHeader("hi!");
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
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
        java.util.Map map19 = response15.headers();
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
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response14.removeCookie("hi!");
        java.lang.String str17 = response14.contentType();
        java.util.Map map18 = response14.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
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
        org.jsoup.Connection.Method method23 = response0.method();
        java.lang.String str25 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry27 = response0.scanHeaders("");
        org.jsoup.Connection.Method method28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response0.method(method28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(entry27);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str8 = response0.statusMessage();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL12 = response10.url();
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Response response16 = response10.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        boolean boolean14 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str17 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str7 = response0.charset();
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response9.body();
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
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str2 = response0.charset();
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        java.util.Map map5 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.header("hi!");
        java.util.Map map15 = response0.headers();
        int int16 = response0.statusCode();
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        java.lang.String str19 = response0.contentType();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        boolean boolean10 = response0.hasHeader("hi!");
        int int11 = response0.statusCode();
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        int int14 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response8.contentType();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response8.header("hi!");
        org.jsoup.Connection.Response response16 = response8.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.header("hi!");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.net.URL uRL8 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map map10 = response6.headers();
        java.lang.String str12 = response6.cookie("hi!");
        org.jsoup.Connection.Response response14 = response6.removeHeader("hi!");
        java.util.Map.Entry entry16 = response6.scanHeaders("");
        java.lang.String str17 = response6.charset();
        boolean boolean19 = response6.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
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
        java.util.Map.Entry entry27 = response15.scanHeaders("hi!");
        java.lang.Class<?> wildcardClass28 = response15.getClass();
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
        org.junit.Assert.assertNotNull(entry27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasCookie("");
        java.util.Map map11 = response0.cookies();
        java.util.Map map12 = response0.cookies();
        java.lang.String str13 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        boolean boolean15 = response11.hasHeader("hi!");
        java.net.URL uRL16 = response11.url();
        java.lang.String str18 = response11.getHeaderCaseInsensitive("");
        java.net.URL uRL19 = response11.url();
        boolean boolean21 = response11.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        java.lang.String str24 = response22.statusMessage();
        java.util.Map map25 = response22.cookies();
        java.lang.String str27 = response22.header("hi!");
        java.lang.String str29 = response22.getHeaderCaseInsensitive("hi!");
        java.lang.String str30 = response22.charset();
        java.lang.String str31 = response22.charset();
        java.util.Map map32 = response22.headers();
        org.jsoup.Connection.Response response34 = response22.removeHeader("hi!");
        org.jsoup.Connection.Response response37 = response22.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL39 = response38.url();
        java.lang.String str41 = response38.header("hi!");
        org.jsoup.Connection.Response response43 = response38.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL45 = response44.url();
        java.lang.String str46 = response44.statusMessage();
        java.util.Map map47 = response44.cookies();
        response38.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNull(uRL45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.header("hi!");
        java.lang.String str9 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.cookie("");
        java.lang.String str12 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
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
        java.util.Map map20 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response0.cookie("", "hi!");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeCookie("hi!");
        java.lang.String str9 = response5.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response12 = response5.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response11.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        java.lang.String str11 = response0.contentType();
        java.util.Map map12 = response0.headers();
        java.util.Map map13 = response0.headers();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.url(uRL14);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str11 = response0.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str10 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response20.cookie("hi!", "hi!");
        java.util.Map map24 = response20.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
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
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        int int5 = response0.statusCode();
        int int6 = response0.statusCode();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method10 = response9.method();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        org.jsoup.Connection.Method method16 = response0.method();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
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
        java.lang.String str29 = response0.charset();
        boolean boolean31 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response34 = response0.header("hi!", "");
        org.jsoup.Connection.Response response37 = response0.header("hi!", "");
        java.util.Map.Entry entry39 = response0.scanHeaders("");
        int int40 = response0.statusCode();
        java.lang.String str41 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document42 = response0.parse();
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
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(entry39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.util.Map.Entry entry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.lang.String str9 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        boolean boolean14 = response10.hasHeader("hi!");
        java.net.URL uRL15 = response10.url();
        java.lang.String str17 = response10.getHeaderCaseInsensitive("");
        java.net.URL uRL18 = response10.url();
        java.lang.String str19 = response10.statusMessage();
        java.util.Map map20 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        java.lang.String str24 = response22.statusMessage();
        java.util.Map map25 = response22.cookies();
        org.jsoup.Connection.Response response27 = response22.removeHeader("hi!");
        java.util.Map.Entry entry29 = response22.scanHeaders("");
        org.jsoup.Connection.Response response32 = response22.header("hi!", "hi!");
        java.util.Map map33 = response22.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.String str35 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str37 = response36.statusMessage();
        java.lang.String str39 = response36.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.charset();
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
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
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
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
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map29 = response28.headers();
        java.util.Map map30 = response28.cookies();
        java.net.URL uRL31 = response28.url();
        org.jsoup.Connection.Response response34 = response28.cookie("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.lang.Class<?> wildcardClass14 = response13.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
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
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response37);
        java.lang.String str50 = response49.charset();
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
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        java.lang.String str11 = response1.contentType();
        java.util.Map map12 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response10.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        java.net.URL uRL11 = response0.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = response12.method();
        java.lang.String str15 = response12.cookie("hi!");
        java.util.Map.Entry entry17 = response12.scanHeaders("hi!");
        java.util.Map map18 = response12.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.Connection.Method method20 = response0.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.net.URL uRL23 = response22.url();
        java.lang.String str25 = response22.header("");
        java.lang.String str26 = response22.charset();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        java.lang.String str29 = response27.statusMessage();
        boolean boolean31 = response27.hasCookie("hi!");
        boolean boolean33 = response27.hasHeader("hi!");
        java.lang.String str35 = response27.cookie("");
        java.util.Map map36 = response27.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
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
        java.net.URL uRL12 = response0.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry15 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(entry15);
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method20 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = method20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str14 = response0.cookie("hi!");
        int int15 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.cookie("");
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str12 = response0.cookie("");
        java.lang.String str13 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("hi!");
        boolean boolean12 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.util.Map map14 = response0.headers();
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(entry16);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Response response11 = response8.removeCookie("");
        java.util.Map map12 = response8.headers();
        java.util.Map map13 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
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
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.Connection.Response response32 = response29.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str35 = response33.getHeaderCaseInsensitive("hi!");
        java.lang.String str36 = response33.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document37 = response33.parse();
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
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Response response12 = response7.removeCookie("hi!");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
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
        java.net.URL uRL34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response35 = response0.url(uRL34);
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(entry33);
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.cookie("");
        java.lang.String str8 = response0.header("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("");
        org.jsoup.Connection.Response response5 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.header("hi!");
        org.jsoup.Connection.Response response11 = response7.removeHeader("hi!");
        org.jsoup.Connection.Response response13 = response7.removeCookie("");
        java.util.Map map14 = response7.headers();
        java.util.Map map15 = response7.cookies();
        java.util.Map map16 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean20 = response18.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response21.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response14 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        java.lang.String str18 = response15.contentType();
        java.lang.String str20 = response15.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map map22 = response21.headers();
        java.lang.String str24 = response21.cookie("hi!");
        java.util.Map map25 = response21.headers();
        java.util.Map map26 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.lang.String str29 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response10.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
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
        boolean boolean15 = response8.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        org.jsoup.Connection.Method method8 = response6.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map10 = response6.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
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
        java.util.Map.Entry entry17 = response15.scanHeaders("");
        java.lang.String str19 = response15.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response22 = response15.cookie("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
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
        java.lang.String str23 = response1.cookie("");
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
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.lang.String str6 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean13 = response0.hasCookie("hi!");
        java.lang.String str15 = response0.cookie("hi!");
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
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
        boolean boolean22 = response0.hasCookie("");
        java.util.Map map23 = response0.headers();
        org.jsoup.Connection.Method method24 = response0.method();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response0.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Response response14 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        org.jsoup.Connection.Method method17 = response15.method();
        org.jsoup.Connection.Response response20 = response15.header("hi!", "");
        java.lang.String str22 = response15.header("hi!");
        java.util.Map map23 = response15.cookies();
        boolean boolean25 = response15.hasHeader("hi!");
        java.util.Map map26 = response15.cookies();
        java.lang.String str27 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        org.jsoup.Connection.Method method30 = response28.method();
        org.jsoup.Connection.Method method31 = response28.method();
        java.lang.String str32 = response28.contentType();
        java.lang.String str33 = response28.charset();
        boolean boolean35 = response28.hasCookie("hi!");
        int int36 = response28.statusCode();
        java.util.Map map37 = response28.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response15.body();
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
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        boolean boolean17 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.cookie("hi!", "hi!");
        int int5 = response1.statusCode();
        java.util.Map map6 = response1.cookies();
        java.lang.String str8 = response1.header("hi!");
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response0.contentType();
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        boolean boolean11 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.charset();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.lang.String str11 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
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
        java.util.Map.Entry entry19 = response13.scanHeaders("hi!");
        org.jsoup.Connection.Method method20 = response13.method();
        boolean boolean22 = response13.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response25 = response13.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(entry19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map map4 = response1.headers();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL9 = response1.url();
        java.lang.String str11 = response1.header("");
        boolean boolean13 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.header("");
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
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
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
        java.lang.String str55 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray56 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
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
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
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
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL32 = response31.url();
        java.net.URL uRL33 = response31.url();
        java.net.URL uRL34 = response31.url();
        java.util.Map map35 = response31.cookies();
        java.util.Map map36 = response31.cookies();
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        boolean boolean39 = response30.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document40 = response30.parse();
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
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.charset();
        java.lang.String str11 = response8.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response0.cookies();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        java.lang.String str15 = response0.header("");
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str19 = response17.statusMessage();
        java.lang.String str20 = response17.statusMessage();
        java.util.Map.Entry entry22 = response17.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response25 = response17.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, response25);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map map6 = response1.headers();
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
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
        java.util.Map map31 = response0.headers();
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
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeCookie("hi!");
        int int8 = response5.statusCode();
        java.util.Map map9 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        java.util.Map map13 = response10.cookies();
        java.lang.String str15 = response10.header("hi!");
        java.lang.String str17 = response10.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response10.charset();
        java.lang.String str19 = response10.charset();
        java.lang.String str21 = response10.header("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        java.lang.String str25 = response22.header("hi!");
        java.util.Map map26 = response22.headers();
        java.lang.String str28 = response22.cookie("hi!");
        java.lang.String str29 = response22.charset();
        java.util.Map.Entry entry31 = response22.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str34 = response32.cookie("");
        java.lang.String str35 = response32.contentType();
        java.lang.String str37 = response32.header("hi!");
        java.util.Map map38 = response32.cookies();
        java.net.URL uRL39 = response32.url();
        java.net.URL uRL40 = response32.url();
        org.jsoup.Connection.Method method41 = response32.method();
        java.util.Map map42 = response32.cookies();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        java.lang.String str47 = response5.header("hi!");
        java.lang.String str49 = response5.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(entry31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.lang.String str9 = response0.header("hi!");
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.lang.String str10 = response0.contentType();
        boolean boolean12 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.charset();
        java.net.URL uRL19 = response16.url();
        java.lang.String str21 = response16.header("hi!");
        java.util.Map map22 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Response response25 = response0.removeCookie("");
        java.util.Map.Entry entry27 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response0.body();
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(entry27);
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.cookie("hi!");
        java.util.Map map7 = response1.cookies();
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        java.util.Map map8 = response4.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map8);
        int int10 = response0.statusCode();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.header("", "hi!");
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
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response13 = response10.removeCookie("");
        java.lang.String str14 = response10.statusMessage();
        java.lang.String str15 = response10.charset();
        java.lang.String str16 = response10.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response6.removeCookie("");
        org.jsoup.Connection.Response response13 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
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
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        boolean boolean17 = response0.hasCookie("");
        boolean boolean19 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str22 = response21.charset();
        java.lang.String str24 = response21.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        int int5 = response1.statusCode();
        java.util.Map map6 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        java.lang.String str13 = response1.cookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        org.jsoup.Connection.Method method13 = response11.method();
        org.jsoup.Connection.Response response15 = response11.removeCookie("hi!");
        java.lang.String str17 = response11.getHeaderCaseInsensitive("");
        java.util.Map map18 = response11.cookies();
        java.util.Map map19 = response11.headers();
        java.util.Map map20 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.jsoup.Connection.Response response23 = response0.removeHeader("hi!");
        java.lang.String str24 = response0.charset();
        java.net.URL uRL25 = response0.url();
        boolean boolean27 = response0.hasHeader("hi!");
        java.lang.String str28 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method14 = response13.method();
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str16 = response13.statusMessage();
        java.lang.String str18 = response13.header("hi!");
        org.jsoup.Connection.Response response20 = response13.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        boolean boolean18 = response14.hasHeader("hi!");
        java.net.URL uRL19 = response14.url();
        java.lang.String str21 = response14.getHeaderCaseInsensitive("");
        boolean boolean23 = response14.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str27 = response24.header("hi!");
        org.jsoup.Connection.Response response29 = response24.removeHeader("hi!");
        java.lang.String str31 = response24.header("hi!");
        java.lang.String str32 = response24.statusMessage();
        org.jsoup.Connection.Response response35 = response24.header("hi!", "hi!");
        java.util.Map map36 = response24.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        java.lang.String str38 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL40 = response39.url();
        java.lang.String str41 = response39.statusMessage();
        java.util.Map map42 = response39.cookies();
        java.lang.String str44 = response39.header("hi!");
        java.lang.String str46 = response39.getHeaderCaseInsensitive("hi!");
        java.lang.String str47 = response39.charset();
        java.lang.String str48 = response39.charset();
        boolean boolean50 = response39.hasHeader("hi!");
        org.jsoup.Connection.Response response52 = response39.removeCookie("hi!");
        org.jsoup.Connection.Response response55 = response39.header("hi!", "hi!");
        org.jsoup.Connection.Response response57 = response39.removeHeader("hi!");
        java.util.Map map58 = response39.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
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
        java.net.URL uRL15 = response0.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
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
        java.lang.String str19 = response1.contentType();
        java.lang.String str20 = response1.contentType();
        org.jsoup.Connection.Response response22 = response1.removeCookie("");
        java.lang.String str23 = response1.charset();
        org.jsoup.Connection.Response response25 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response27 = response1.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response1.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean13 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.net.URL uRL3 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(uRL3);
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.charset();
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        boolean boolean18 = response0.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Method method13 = response0.method();
        int int14 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response10.method();
        boolean boolean13 = response10.hasHeader("hi!");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response10.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.cookie("");
        int int11 = response8.statusCode();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        java.util.Map.Entry entry19 = response13.scanHeaders("");
        java.lang.String str21 = response13.header("hi!");
        java.lang.String str23 = response13.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL14 = response13.url();
        java.util.Map.Entry entry16 = response13.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.cookie("");
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        boolean boolean12 = response0.hasCookie("hi!");
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        java.lang.String str15 = response0.contentType();
        int int16 = response0.statusCode();
        java.util.Map.Entry entry18 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method19 = response0.method();
        java.lang.String str20 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.header("hi!");
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        java.lang.String str18 = response0.header("");
        java.net.URL uRL19 = response0.url();
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method20 = response0.method();
        org.jsoup.Connection.Method method21 = response0.method();
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.url(uRL22);
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
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
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
        org.jsoup.Connection.Response response30 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document31 = response0.parse();
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
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
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
        java.net.URL uRL21 = response13.url();
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response13.url(uRL22);
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Method method11 = response0.method();
        java.util.Map map12 = response0.headers();
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        org.jsoup.Connection.Response response21 = response16.header("hi!", "");
        java.lang.String str23 = response16.header("hi!");
        java.util.Map map24 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.net.URL uRL26 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("");
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        boolean boolean14 = response10.hasCookie("hi!");
        boolean boolean16 = response10.hasHeader("hi!");
        java.util.Map map17 = response10.cookies();
        java.lang.String str18 = response10.contentType();
        org.jsoup.Connection.Method method19 = response10.method();
        java.util.Map map20 = response10.headers();
        java.lang.String str22 = response10.header("");
        java.util.Map map23 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        int int25 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
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
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.net.URL uRL12 = response0.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map14 = response13.headers();
        boolean boolean16 = response13.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        org.jsoup.Connection.Response response12 = response7.header("hi!", "");
        org.jsoup.Connection.Response response14 = response7.removeHeader("hi!");
        java.util.Map map15 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(entry18);
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        org.jsoup.Connection.Method method19 = response17.method();
        org.jsoup.Connection.Response response22 = response17.header("hi!", "");
        java.util.Map map23 = response17.headers();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        int int25 = response17.statusCode();
        java.util.Map.Entry entry27 = response17.scanHeaders("");
        java.util.Map map28 = response17.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str32 = response30.header("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL34 = response33.url();
        java.lang.String str36 = response33.header("hi!");
        org.jsoup.Connection.Response response38 = response33.removeHeader("hi!");
        java.lang.String str40 = response33.header("hi!");
        java.lang.String str41 = response33.statusMessage();
        java.lang.String str43 = response33.cookie("hi!");
        org.jsoup.Connection.Response response46 = response33.cookie("hi!", "hi!");
        java.lang.String str48 = response33.header("hi!");
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL50 = response49.url();
        org.jsoup.Connection.Method method51 = response49.method();
        org.jsoup.Connection.Response response54 = response49.header("hi!", "");
        java.util.Map map55 = response49.headers();
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response(response49);
        int int57 = response49.statusCode();
        java.util.Map map58 = response49.headers();
        java.util.Map map59 = response49.cookies();
        response33.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response30.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        org.jsoup.Connection.Response response66 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response68 = response0.method(method67);
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
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(entry27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(uRL50);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(response66);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL10 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        org.jsoup.Connection.Method method16 = response0.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.net.URL uRL19 = response17.url();
        org.jsoup.Connection.Response response21 = response17.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response22.header("hi!", "hi!");
        java.util.Map map26 = response22.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.util.Map map28 = response17.headers();
        java.util.Map.Entry entry30 = response17.scanHeaders("hi!");
        org.jsoup.Connection.Method method31 = response17.method();
        org.jsoup.Connection.Method method32 = response17.method();
        java.util.Map map33 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.net.URL uRL35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response0.url(uRL35);
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        boolean boolean15 = response0.hasCookie("hi!");
        java.net.URL uRL16 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response12 = response9.cookie("hi!", "hi!");
        java.lang.String str13 = response9.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("");
        org.jsoup.Connection.Method method12 = response0.method();
        boolean boolean14 = response0.hasHeader("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test14756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14756");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str13 = response11.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response11.cookie("", "hi!");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14757");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.header("");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test14758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14758");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.net.URL uRL17 = response14.url();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.charset();
        java.util.Map map22 = response19.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        boolean boolean25 = response0.hasCookie("");
        int int26 = response0.statusCode();
        org.jsoup.Connection.Response response28 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test14759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14759");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.header("");
        java.util.Map map10 = response0.headers();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14760");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.util.Map map8 = response0.headers();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        java.lang.String str13 = response0.contentType();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14761");
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
        java.lang.String str15 = response10.contentType();
        java.lang.String str17 = response10.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test14762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14762");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14763");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("");
        java.util.Map map5 = response1.cookies();
        int int6 = response1.statusCode();
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        java.util.Map.Entry entry12 = response1.scanHeaders("");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test14764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14764");
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
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "hi!");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test14765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14765");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("hi!");
        int int11 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test14766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14766");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.contentType();
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14767");
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
        java.lang.String str39 = response0.header("hi!");
        java.util.Map map40 = response0.cookies();
        java.lang.String str41 = response0.charset();
        java.util.Map map42 = response0.headers();
        int int43 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection44 = null;
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL46 = response45.url();
        org.jsoup.Connection.Method method47 = response45.method();
        org.jsoup.Connection.Response response50 = response45.header("hi!", "");
        java.lang.String str52 = response45.header("hi!");
        java.util.Map.Entry entry54 = response45.scanHeaders("");
        org.jsoup.Connection.Method method55 = response45.method();
        java.lang.String str56 = response45.statusMessage();
        java.lang.String str58 = response45.getHeaderCaseInsensitive("hi!");
        java.lang.String str59 = response45.charset();
        java.lang.String str61 = response45.cookie("hi!");
        org.jsoup.Connection.Method method62 = response45.method();
        java.util.Map.Entry entry64 = response45.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection44, (org.jsoup.Connection.Response) response45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(entry54);
        org.junit.Assert.assertNull(method55);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(method62);
        org.junit.Assert.assertNull(entry64);
    }

    @Test
    public void test14768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14768");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map10 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test14769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14769");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.header("hi!");
        java.lang.String str12 = response0.contentType();
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response16.cookie("", "hi!");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14770");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.contentType();
        java.util.Map.Entry entry11 = response1.scanHeaders("hi!");
        boolean boolean13 = response1.hasCookie("");
        java.lang.String str14 = response1.contentType();
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str16 = response1.statusMessage();
        boolean boolean18 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method19 = response1.method();
        java.lang.String str20 = response1.charset();
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test14771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14771");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.charset();
        boolean boolean11 = response8.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response8.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14772");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL10 = response9.url();
        java.net.URL uRL11 = response9.url();
        java.lang.String str12 = response9.charset();
        java.lang.String str14 = response9.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14773");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL6 = response5.url();
        java.lang.String str8 = response5.header("hi!");
        org.jsoup.Connection.Response response10 = response5.removeHeader("hi!");
        org.jsoup.Connection.Method method11 = response5.method();
        java.util.Map map12 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str19 = response17.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.util.Map.Entry entry24 = response17.scanHeaders("");
        java.lang.String str26 = response17.header("");
        java.util.Map map27 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.util.Map map29 = response0.headers();
        org.jsoup.Connection.Response response32 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test14774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14774");
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
        org.jsoup.Connection.Response response16 = response6.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test14775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14775");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str8 = response0.header("");
        java.net.URL uRL9 = response0.url();
        java.util.Map map10 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test14776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14776");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        java.util.Map map11 = response1.cookies();
        java.util.Map map12 = response1.cookies();
        org.jsoup.Connection.Method method13 = response1.method();
        boolean boolean15 = response1.hasHeader("hi!");
        java.net.URL uRL16 = response1.url();
        java.net.URL uRL17 = response1.url();
        java.util.Map map18 = response1.headers();
        java.util.Map map19 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test14777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14777");
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
        java.lang.String str29 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response0.body();
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
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test14778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14778");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("");
        org.jsoup.Connection.Method method5 = response1.method();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test14779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14779");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.cookie("");
        java.util.Map map12 = response0.cookies();
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        java.lang.String str16 = response0.cookie("");
        boolean boolean18 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14780");
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
        org.jsoup.Connection.Response response18 = response6.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test14781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14781");
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
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response21.hasHeader("");
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
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test14782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14782");
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
        java.util.Map map28 = response13.cookies();
        java.util.Map map29 = response13.cookies();
        java.lang.String str31 = response13.header("");
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test14783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14783");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        java.net.URL uRL4 = response0.url();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test14784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14784");
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
        java.util.Map map14 = response13.cookies();
        boolean boolean16 = response13.hasHeader("hi!");
        java.util.Map.Entry entry18 = response13.scanHeaders("");
        int int19 = response13.statusCode();
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.Connection.Response response21 = null;
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection20, response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test14785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14785");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.net.URL uRL10 = response8.url();
        org.jsoup.Connection.Response response12 = response8.removeCookie("");
        java.lang.String str14 = response8.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.charset();
        java.net.URL uRL19 = response16.url();
        java.util.Map map20 = response16.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map24 = response1.headers();
        java.util.Map.Entry entry26 = response1.scanHeaders("hi!");
        java.lang.String str27 = response1.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test14786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14786");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("");
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14787");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method4 = response2.method();
        java.util.Map map5 = response2.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.lang.String str7 = response1.statusMessage();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test14788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14788");
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
        java.lang.String str15 = response0.cookie("");
        int int16 = response0.statusCode();
        java.net.URL uRL17 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test14789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14789");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
        java.net.URL uRL15 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.header("", "");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test14790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14790");
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
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.util.Map map17 = response0.cookies();
        org.jsoup.Connection.Response response20 = response0.header("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test14791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14791");
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
        org.jsoup.Connection.Method method13 = response0.method();
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        java.lang.String str18 = response0.cookie("");
        java.lang.String str20 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test14792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14792");
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
        int int23 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test14793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14793");
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
            java.lang.String str12 = response0.body();
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14794");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str15 = response0.cookie("");
        int int16 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test14795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14795");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        java.lang.String str8 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14796");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test14797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14797");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map5 = response0.cookies();
        java.util.Map map6 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test14798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14798");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response4.header("hi!", "");
        java.util.Map.Entry entry9 = response4.scanHeaders("");
        boolean boolean11 = response4.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14799");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        java.util.Map map7 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test14800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14800");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        org.jsoup.Connection.Method method9 = response0.method();
        int int10 = response0.statusCode();
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.contentType();
        java.net.URL uRL14 = response0.url();
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test14801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14801");
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
        java.lang.String str15 = response0.cookie("");
        org.jsoup.Connection.Response response18 = response0.header("hi!", "");
        org.jsoup.Connection.Response response21 = response0.cookie("hi!", "hi!");
        int int22 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test14802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14802");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str7 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("");
        java.lang.String str12 = response9.contentType();
        java.lang.String str14 = response9.header("hi!");
        org.jsoup.Connection.Response response16 = response9.removeCookie("");
        org.jsoup.Connection.Response response19 = response9.header("hi!", "");
        java.lang.String str21 = response9.cookie("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str23 = response9.contentType();
        java.net.URL uRL24 = response9.url();
        java.lang.String str25 = response9.contentType();
        java.util.Map map26 = response9.headers();
        // The following exception was thrown during execution in test generation
        try {
            response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test14803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14803");
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
        java.net.URL uRL22 = response1.url();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response23);
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
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test14804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14804");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.lang.String str10 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14805");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        java.lang.String str16 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14806");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean5 = response0.hasHeader("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.net.URL uRL9 = response7.url();
        java.net.URL uRL10 = response7.url();
        java.net.URL uRL11 = response7.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response12.statusMessage();
        java.util.Map map14 = response12.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str16 = response0.contentType();
        org.jsoup.Connection.Method method17 = response0.method();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test14807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14807");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.lang.String str17 = response1.cookie("hi!");
        java.lang.String str18 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test14808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14808");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.lang.String str15 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str18 = response16.cookie("");
        org.jsoup.Connection.Method method19 = response16.method();
        java.lang.String str21 = response16.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        java.lang.String str27 = response22.header("hi!");
        boolean boolean29 = response22.hasCookie("hi!");
        java.lang.String str31 = response22.getHeaderCaseInsensitive("");
        java.lang.String str32 = response22.statusMessage();
        java.lang.String str34 = response22.header("");
        java.util.Map map35 = response22.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.util.Map map37 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.jsoup.Connection.Response response40 = response0.removeCookie("");
        java.lang.String str41 = response0.statusMessage();
        java.lang.String str42 = response0.contentType();
        java.net.URL uRL43 = response0.url();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map45 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test14809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14809");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14810");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int10 = response8.statusCode();
        java.util.Map map11 = response8.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test14811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14811");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        java.util.Map.Entry entry15 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL17 = response0.url();
        org.jsoup.Connection.Method method18 = response0.method();
        java.util.Map map19 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test14812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.header("hi!");
        boolean boolean11 = response0.hasHeader("hi!");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14813");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.cookie("");
        java.net.URL uRL9 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test14814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14814");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test14815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14815");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response14.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method17 = response14.method();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test14816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14816");
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
        org.jsoup.Connection.Response response21 = response11.removeCookie("hi!");
        java.lang.String str22 = response11.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response11.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test14817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14817");
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
        org.jsoup.Connection.Method method46 = response0.method();
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL48 = response47.url();
        java.lang.String str50 = response47.header("hi!");
        org.jsoup.Connection.Response response52 = response47.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response47);
        java.util.Map map54 = response47.cookies();
        java.util.Map map55 = response47.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        java.lang.String str57 = response0.statusMessage();
        int int58 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response59 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL60 = response59.url();
        org.jsoup.Connection.Method method61 = response59.method();
        java.lang.String str63 = response59.cookie("hi!");
        boolean boolean65 = response59.hasCookie("hi!");
        int int66 = response59.statusCode();
        org.jsoup.Connection.Method method67 = response59.method();
        org.jsoup.Connection.Response response70 = response59.cookie("hi!", "hi!");
        java.lang.String str72 = response59.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response73 = new org.jsoup.helper.HttpConnection.Response(response59);
        org.jsoup.Connection.Response response76 = response73.header("hi!", "");
        java.lang.String str77 = response73.statusMessage();
        boolean boolean79 = response73.hasCookie("");
        java.lang.String str80 = response73.charset();
        java.util.Map map81 = response73.cookies();
        java.util.Map map82 = response73.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map82);
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
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNull(uRL48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNull(uRL60);
        org.junit.Assert.assertNull(method61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNull(method67);
        org.junit.Assert.assertNotNull(response70);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(response76);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(str80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
    }

    @Test
    public void test14818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14818");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response22 = response0.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response0.hasHeader("");
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test14819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14819");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.header("hi!");
        java.lang.String str5 = response0.contentType();
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test14820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14820");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.util.Map.Entry entry14 = response0.scanHeaders("");
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
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test14821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14821");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str15 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.net.URL uRL18 = response16.url();
        java.net.URL uRL19 = response16.url();
        java.net.URL uRL20 = response16.url();
        org.jsoup.Connection.Method method21 = response16.method();
        boolean boolean23 = response16.hasHeader("hi!");
        java.lang.String str24 = response16.charset();
        java.util.Map map25 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test14822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14822");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        java.lang.String str18 = response11.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response21 = response11.header("hi!", "hi!");
        java.lang.String str23 = response11.getHeaderCaseInsensitive("");
        java.lang.String str25 = response11.header("");
        java.lang.String str26 = response11.statusMessage();
        java.lang.String str27 = response11.contentType();
        java.util.Map.Entry entry29 = response11.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(entry29);
    }

    @Test
    public void test14823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14823");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str16 = response14.statusMessage();
        boolean boolean18 = response14.hasCookie("hi!");
        org.jsoup.Connection.Response response21 = response14.header("hi!", "");
        boolean boolean23 = response14.hasCookie("");
        java.util.Map map24 = response14.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str28 = response26.cookie("");
        java.lang.String str29 = response26.contentType();
        java.lang.String str31 = response26.getHeaderCaseInsensitive("hi!");
        java.lang.String str32 = response26.contentType();
        org.jsoup.Connection.Method method33 = response26.method();
        java.util.Map map34 = response26.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.lang.Class<?> wildcardClass36 = map34.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test14824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14824");
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
        org.jsoup.Connection.Method method17 = response16.method();
        org.jsoup.Connection.Response response19 = response16.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("");
        java.lang.String str24 = response21.statusMessage();
        java.lang.String str26 = response21.cookie("");
        java.net.URL uRL27 = response21.url();
        java.lang.String str29 = response21.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL31 = response30.url();
        org.jsoup.Connection.Method method32 = response30.method();
        org.jsoup.Connection.Response response35 = response30.header("hi!", "");
        java.lang.String str36 = response30.charset();
        java.util.Map map37 = response30.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.jsoup.Connection.Method method39 = response21.method();
        java.lang.String str41 = response21.cookie("hi!");
        java.lang.String str42 = response21.charset();
        // The following exception was thrown during execution in test generation
        try {
            response16.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test14825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14825");
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
            org.jsoup.nodes.Document document15 = response0.parse();
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14826");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.lang.String str10 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        java.lang.String str14 = response1.contentType();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14827");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14828");
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
        java.lang.String str15 = response0.contentType();
        boolean boolean17 = response0.hasCookie("");
        java.util.Map map18 = response0.cookies();
        boolean boolean20 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test14829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14829");
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
        org.jsoup.Connection.Response response16 = response12.removeHeader("hi!");
        boolean boolean18 = response12.hasCookie("");
        java.util.Map.Entry entry20 = response12.scanHeaders("");
        int int21 = response12.statusCode();
        java.lang.String str22 = response12.statusMessage();
        java.lang.String str23 = response12.contentType();
        java.lang.String str25 = response12.header("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test14830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14830");
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
        org.jsoup.Connection.Response response29 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response34 = response0.header("hi!", "");
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
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test14831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14831");
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
        java.net.URL uRL18 = response0.url();
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test14832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14832");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("");
        java.lang.String str15 = response12.contentType();
        java.lang.String str17 = response12.header("hi!");
        org.jsoup.Connection.Response response19 = response12.removeCookie("");
        boolean boolean21 = response12.hasCookie("");
        java.lang.String str22 = response12.charset();
        org.jsoup.Connection.Response response25 = response12.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response27 = response12.removeCookie("hi!");
        org.jsoup.Connection.Response response29 = response12.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map map31 = response12.headers();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test14833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14833");
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
        java.lang.String str16 = response0.cookie("hi!");
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
    public void test14834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14834");
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
        java.lang.String str22 = response1.cookie("hi!");
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str26 = response24.cookie("");
        java.lang.String str27 = response24.contentType();
        java.lang.String str29 = response24.header("hi!");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str31 = response30.contentType();
        java.lang.String str33 = response30.cookie("");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.lang.String str35 = response34.charset();
        int int36 = response34.statusCode();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response34);
        java.lang.String str39 = response37.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test14835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14835");
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
        java.util.Map.Entry entry40 = response0.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection41 = null;
        org.jsoup.Connection.Response response42 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection41, response42);
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
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(entry40);
    }

    @Test
    public void test14836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14836");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.cookie("hi!");
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
    public void test14837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14837");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        boolean boolean8 = response0.hasCookie("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14838");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method14 = response0.method();
        java.util.Map map15 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(entry11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test14839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14839");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test14840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14840");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14841");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.lang.String str13 = response0.charset();
        java.lang.String str14 = response0.contentType();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14842");
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
        org.jsoup.Connection.Response response19 = response0.cookie("hi!", "");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test14843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14843");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        boolean boolean12 = response0.hasCookie("hi!");
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        java.lang.String str15 = response0.contentType();
        int int16 = response0.statusCode();
        java.util.Map map17 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test14844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14844");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response15 = response0.header("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14845");
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
        java.util.Map map19 = response15.cookies();
        boolean boolean21 = response15.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test14846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14846");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response5 = response1.removeCookie("");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        java.lang.String str15 = response1.statusMessage();
        java.util.Map map16 = response1.cookies();
        org.jsoup.Connection.Response response19 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test14847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14847");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        org.jsoup.Connection.Method method8 = response6.method();
        java.lang.String str10 = response6.header("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14848");
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
        int int19 = response15.statusCode();
        java.lang.String str21 = response15.cookie("");
        java.lang.String str22 = response15.statusMessage();
        boolean boolean24 = response15.hasCookie("hi!");
        org.jsoup.Connection.Response response26 = response15.removeCookie("");
        java.lang.Class<?> wildcardClass27 = response26.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test14849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14849");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.header("");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map17 = response16.headers();
        org.jsoup.Connection.Method method18 = response16.method();
        java.lang.String str19 = response16.charset();
        java.lang.String str21 = response16.header("hi!");
        java.lang.String str23 = response16.getHeaderCaseInsensitive("");
        java.lang.String str25 = response16.getHeaderCaseInsensitive("hi!");
        java.util.Map map26 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.lang.String str31 = response29.header("hi!");
        org.jsoup.Connection.Response response33 = response29.removeHeader("hi!");
        org.jsoup.Connection.Response response35 = response29.removeCookie("");
        java.util.Map map36 = response29.headers();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.Connection.Method method38 = response29.method();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL40 = response39.url();
        java.lang.String str42 = response39.header("hi!");
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL44 = response43.url();
        java.lang.String str46 = response43.header("hi!");
        java.util.Map map47 = response43.cookies();
        response39.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        int int49 = response39.statusCode();
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str52 = response50.cookie("");
        java.lang.String str53 = response50.contentType();
        java.lang.String str55 = response50.header("hi!");
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response(response50);
        java.lang.String str58 = response50.cookie("hi!");
        java.util.Map map59 = response50.headers();
        response39.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        java.util.Map.Entry entry62 = response39.scanHeaders("hi!");
        java.lang.String str63 = response39.contentType();
        java.lang.String str65 = response39.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method66 = response39.method();
        java.util.Map map67 = response39.headers();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        java.lang.String str71 = response0.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(entry62);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertNull(method66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test14850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14850");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "hi!");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
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
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14851");
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
        int int16 = response1.statusCode();
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test14852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14852");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.net.URL uRL7 = response6.url();
        java.lang.String str8 = response6.charset();
        java.net.URL uRL9 = response6.url();
        java.util.Map map10 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL13 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test14853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14853");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response6.hasCookie("");
        org.jsoup.Connection.Response response10 = response6.removeCookie("");
        java.net.URL uRL11 = response6.url();
        int int12 = response6.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test14854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14854");
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
        org.jsoup.Connection.Response response23 = response15.removeCookie("");
        java.lang.String str25 = response15.cookie("");
        java.lang.Class<?> wildcardClass26 = response15.getClass();
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
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test14855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14855");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        org.jsoup.Connection.Response response19 = response14.header("hi!", "");
        org.jsoup.Connection.Response response21 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str25 = response23.header("hi!");
        java.util.Map.Entry entry27 = response23.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        java.lang.String str31 = response28.contentType();
        org.jsoup.Connection.Method method32 = response28.method();
        java.util.Map.Entry entry34 = response28.scanHeaders("");
        java.lang.String str35 = response28.contentType();
        java.util.Map map36 = response28.headers();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        java.util.Map map39 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(entry27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNull(entry34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test14856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        org.jsoup.Connection.Response response10 = response6.cookie("hi!", "");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response6.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test14857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14857");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response8.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response8.method(method13);
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14858");
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
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str25 = response23.cookie("");
        java.lang.String str26 = response23.statusMessage();
        java.lang.String str28 = response23.cookie("");
        java.net.URL uRL29 = response23.url();
        java.lang.String str31 = response23.getHeaderCaseInsensitive("");
        java.util.Map map32 = response23.headers();
        int int33 = response23.statusCode();
        boolean boolean35 = response23.hasHeader("hi!");
        java.util.Map.Entry entry37 = response23.scanHeaders("");
        java.lang.String str38 = response23.statusMessage();
        java.util.Map map39 = response23.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.net.URL uRL41 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response42 = response0.url(uRL41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(entry37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test14859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14859");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
        java.lang.String str16 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14860");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response8.contentType();
        java.util.Map.Entry entry11 = response8.scanHeaders("");
        int int12 = response8.statusCode();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response8.method(method13);
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
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test14861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14861");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test14862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14862");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response14 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        java.lang.String str18 = response15.contentType();
        java.lang.String str20 = response15.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map map22 = response21.headers();
        java.lang.String str24 = response21.cookie("hi!");
        java.util.Map map25 = response21.headers();
        java.util.Map map26 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        org.jsoup.Connection.Response response33 = response28.header("hi!", "");
        java.lang.String str35 = response28.header("hi!");
        java.util.Map.Entry entry37 = response28.scanHeaders("");
        org.jsoup.Connection.Method method38 = response28.method();
        java.util.Map map39 = response28.cookies();
        org.jsoup.Connection.Response response42 = response28.cookie("hi!", "hi!");
        java.lang.String str44 = response28.getHeaderCaseInsensitive("hi!");
        java.util.Map map45 = response28.headers();
        org.jsoup.Connection.Method method46 = response28.method();
        java.util.Map map47 = response28.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(entry37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNotNull(map47);
    }

    @Test
    public void test14863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14863");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.header("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14864");
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
        java.util.Map.Entry entry19 = response13.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response13.header("", "hi!");
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
        org.junit.Assert.assertNotNull(entry19);
    }

    @Test
    public void test14865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14865");
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
        java.lang.String str15 = response0.header("");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.method(method16);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14866");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL6 = response5.url();
        java.lang.String str8 = response5.header("hi!");
        java.util.Map map9 = response5.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        int int11 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response12.cookie("");
        java.lang.String str15 = response12.contentType();
        java.lang.String str17 = response12.header("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str20 = response12.cookie("hi!");
        java.util.Map map21 = response12.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str24 = response1.header("hi!");
        boolean boolean26 = response1.hasHeader("hi!");
        java.lang.String str28 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response29 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test14867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14867");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        org.jsoup.Connection.Response response6 = response3.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test14868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14868");
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
        java.net.URL uRL12 = response0.url();
        int int13 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map15 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test14869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14869");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.net.URL uRL18 = response16.url();
        org.jsoup.Connection.Response response20 = response16.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response24 = response21.header("hi!", "hi!");
        java.util.Map map25 = response21.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.util.Map map27 = response16.headers();
        java.util.Map map28 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str30 = response0.contentType();
        java.net.URL uRL31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response32 = response0.url(uRL31);
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test14870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14870");
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
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int18 = response0.statusCode();
        org.jsoup.Connection.Response response21 = response0.header("hi!", "hi!");
        java.util.Map.Entry entry23 = response0.scanHeaders("");
        java.lang.Class<?> wildcardClass24 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test14871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14871");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        java.lang.String str6 = response1.contentType();
        java.lang.String str7 = response1.statusMessage();
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        java.util.Map.Entry entry11 = response1.scanHeaders("hi!");
        boolean boolean13 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test14872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14872");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.lang.String str9 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        boolean boolean14 = response10.hasHeader("hi!");
        java.net.URL uRL15 = response10.url();
        java.lang.String str17 = response10.getHeaderCaseInsensitive("");
        java.net.URL uRL18 = response10.url();
        java.lang.String str19 = response10.statusMessage();
        java.util.Map map20 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.lang.String str22 = response0.charset();
        java.lang.String str24 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test14873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14873");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.lang.String str11 = response1.header("hi!");
        java.util.Map map12 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "");
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14874");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Method method15 = response12.method();
        java.util.Map.Entry entry17 = response12.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str20 = response12.getHeaderCaseInsensitive("");
        java.lang.String str21 = response12.charset();
        java.util.Map map22 = response12.headers();
        org.jsoup.Connection.Response response24 = response12.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection11, response24);
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
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test14875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14875");
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
        java.lang.String str15 = response0.cookie("hi!");
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14876");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        java.lang.String str8 = response0.charset();
        java.net.URL uRL9 = response0.url();
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test14877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14877");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14878");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        int int3 = response0.statusCode();
        java.util.Map map4 = response0.cookies();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.contentType();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14879");
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
        java.lang.String str15 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response18 = response0.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test14880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14880");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response10.cookie("hi!", "");
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str17 = response15.cookie("");
        java.lang.String str18 = response15.contentType();
        java.lang.String str20 = response15.header("hi!");
        org.jsoup.Connection.Response response22 = response15.removeCookie("");
        org.jsoup.Connection.Response response24 = response15.removeCookie("hi!");
        java.util.Map map25 = response15.cookies();
        java.lang.String str26 = response15.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test14881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14881");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.charset();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map map8 = response0.cookies();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test14882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14882");
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
        int int53 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document55 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test14883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14883");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.header("hi!");
        java.lang.String str10 = response6.statusMessage();
        java.net.URL uRL11 = response6.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test14884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14884");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        java.net.URL uRL13 = response0.url();
        boolean boolean15 = response0.hasCookie("hi!");
        java.lang.String str17 = response0.header("hi!");
        java.util.Map map18 = response0.headers();
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.Connection.Response response20 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection19, response20);
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
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14885");
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
        java.lang.String str29 = response13.header("hi!");
        java.util.Map map30 = response13.headers();
        int int31 = response13.statusCode();
        int int32 = response13.statusCode();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test14886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14886");
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
        java.lang.String str18 = response0.cookie("hi!");
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response24 = response22.removeCookie("");
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response29 = response26.header("hi!", "hi!");
        boolean boolean31 = response26.hasCookie("hi!");
        java.util.Map map32 = response26.headers();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str35 = response33.cookie("");
        java.net.URL uRL36 = response33.url();
        org.jsoup.Connection.Method method37 = response33.method();
        java.lang.String str38 = response33.statusMessage();
        org.jsoup.Connection.Response response40 = response33.removeCookie("");
        java.util.Map map41 = response33.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.util.Map.Entry entry44 = response26.scanHeaders("hi!");
        java.net.URL uRL45 = response26.url();
        // The following exception was thrown during execution in test generation
        try {
            response22.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response26);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(entry44);
        org.junit.Assert.assertNull(uRL45);
    }

    @Test
    public void test14887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14887");
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
        java.util.Map map15 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.statusMessage();
        java.util.Map map20 = response16.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response16.parse();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test14888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14888");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response1.url();
        boolean boolean12 = response1.hasCookie("hi!");
        java.util.Map map13 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        java.util.Map map18 = response1.headers();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        java.lang.String str25 = response1.header("hi!");
        java.lang.String str27 = response1.cookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test14889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14889");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.header("hi!");
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response18 = response0.removeHeader("hi!");
        java.lang.String str20 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test14890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14890");
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
        org.jsoup.Connection.Response response34 = response0.cookie("hi!", "");
        int int35 = response0.statusCode();
        java.lang.String str37 = response0.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test14891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14891");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.util.Map.Entry entry9 = response6.scanHeaders("");
        java.lang.String str10 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str13 = response11.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map15 = response14.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        java.util.Map.Entry entry18 = response11.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str21 = response11.header("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response24 = response11.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map26 = response25.headers();
        org.jsoup.Connection.Method method27 = response25.method();
        java.lang.String str28 = response25.charset();
        java.lang.String str30 = response25.header("hi!");
        java.util.Map.Entry entry32 = response25.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map34 = response25.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        boolean boolean37 = response11.hasHeader("hi!");
        java.lang.String str39 = response11.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str42 = response40.cookie("");
        java.lang.String str43 = response40.contentType();
        java.lang.String str45 = response40.getHeaderCaseInsensitive("hi!");
        java.lang.String str46 = response40.contentType();
        org.jsoup.Connection.Method method47 = response40.method();
        java.util.Map map48 = response40.cookies();
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL50 = response49.url();
        org.jsoup.Connection.Method method51 = response49.method();
        java.lang.String str53 = response49.cookie("hi!");
        boolean boolean55 = response49.hasCookie("hi!");
        org.jsoup.Connection.Response response58 = response49.cookie("hi!", "");
        boolean boolean60 = response49.hasHeader("hi!");
        java.lang.String str61 = response49.statusMessage();
        org.jsoup.helper.HttpConnection.Response response62 = new org.jsoup.helper.HttpConnection.Response(response49);
        java.lang.String str63 = response62.statusMessage();
        org.jsoup.Connection.Response response66 = response62.header("hi!", "hi!");
        java.util.Map.Entry entry68 = response62.scanHeaders("");
        java.util.Map map69 = response62.cookies();
        response40.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map69);
        java.lang.String str73 = response6.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(entry32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(uRL50);
        org.junit.Assert.assertNull(method51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(response58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(response66);
        org.junit.Assert.assertNull(entry68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(str73);
    }

    @Test
    public void test14892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14892");
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
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test14893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14893");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        int int11 = response0.statusCode();
        int int12 = response0.statusCode();
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14894");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14895");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response5.header("hi!", "hi!");
        java.util.Map map9 = response5.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.util.Map map11 = response0.headers();
        java.lang.String str13 = response0.header("");
        org.jsoup.Connection.Method method14 = response0.method();
        java.lang.String str16 = response0.header("");
        org.jsoup.Connection.Response response19 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response21.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test14896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14896");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test14897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14897");
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
        java.net.URL uRL13 = response0.url();
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
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test14898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14898");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        boolean boolean6 = response0.hasHeader("hi!");
        boolean boolean8 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test14899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14899");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test14900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14900");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test14901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14901");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str18 = response14.cookie("hi!");
        boolean boolean20 = response14.hasCookie("hi!");
        int int21 = response14.statusCode();
        java.lang.String str22 = response14.charset();
        int int23 = response14.statusCode();
        java.lang.String str25 = response14.getHeaderCaseInsensitive("hi!");
        java.lang.String str26 = response14.contentType();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        org.jsoup.Connection.Response response32 = response28.removeCookie("hi!");
        java.lang.String str34 = response28.getHeaderCaseInsensitive("");
        java.util.Map map35 = response28.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        org.jsoup.Connection.Response response39 = response0.removeHeader("hi!");
        java.net.URL uRL40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response41 = response0.url(uRL40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(response39);
    }

    @Test
    public void test14902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14902");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14903");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response9.contentType();
        org.jsoup.Connection.Method method11 = response9.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test14904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14904");
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
        java.lang.String str22 = response0.cookie("hi!");
        java.lang.String str24 = response0.cookie("hi!");
        org.jsoup.Connection.Response response26 = response0.removeHeader("hi!");
        int int27 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test14905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14905");
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
        java.net.URL uRL15 = response0.url();
        java.lang.String str16 = response0.statusMessage();
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        boolean boolean20 = response0.hasHeader("hi!");
        boolean boolean22 = response0.hasCookie("");
        java.lang.String str24 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean26 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test14906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14906");
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
        java.util.Map map57 = response0.headers();
        org.jsoup.Connection.Method method58 = response0.method();
        org.jsoup.Connection.Method method59 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response60 = response0.method(method59);
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
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(method58);
    }

    @Test
    public void test14907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14907");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        java.util.Map map14 = response0.cookies();
        java.util.Map map15 = response0.cookies();
        java.util.Map map16 = response0.cookies();
        java.net.URL uRL17 = response0.url();
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
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14908");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test14909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14909");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        boolean boolean7 = response0.hasCookie("");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14910");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str12 = response0.header("");
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        boolean boolean18 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL21 = response20.url();
        org.jsoup.Connection.Method method22 = response20.method();
        java.lang.String str24 = response20.cookie("hi!");
        boolean boolean26 = response20.hasCookie("hi!");
        org.jsoup.Connection.Response response29 = response20.cookie("hi!", "");
        boolean boolean31 = response20.hasHeader("hi!");
        java.lang.String str32 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str34 = response33.statusMessage();
        boolean boolean36 = response33.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.Connection.Response response39 = response33.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection19, response39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(response39);
    }

    @Test
    public void test14911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14911");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("");
        java.lang.String str5 = response0.header("hi!");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test14912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14912");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str16 = response13.header("hi!");
        org.jsoup.Connection.Response response18 = response13.removeHeader("hi!");
        java.lang.String str20 = response13.header("hi!");
        java.lang.String str21 = response13.statusMessage();
        java.lang.String str23 = response13.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map map25 = response24.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        java.lang.String str27 = response0.contentType();
        java.lang.String str28 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test14913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14913");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = response0.url();
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.lang.String str14 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14914");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.net.URL uRL11 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test14915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14915");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.net.URL uRL9 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test14916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14916");
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
        org.jsoup.Connection.Method method21 = response1.method();
        java.net.URL uRL22 = response1.url();
        java.util.Map.Entry entry24 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(entry24);
    }

    @Test
    public void test14917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14917");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test14918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14918");
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
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str18 = response14.cookie("hi!");
        boolean boolean20 = response14.hasCookie("hi!");
        org.jsoup.Connection.Response response23 = response14.cookie("hi!", "");
        boolean boolean25 = response14.hasHeader("hi!");
        java.lang.String str26 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str28 = response14.statusMessage();
        java.util.Map map29 = response14.headers();
        java.lang.String str30 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map32 = response31.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.util.Map map35 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test14919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14919");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str13 = response11.statusMessage();
        java.util.Map map14 = response11.cookies();
        java.lang.String str15 = response11.charset();
        java.lang.String str16 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("");
        java.lang.String str20 = response17.contentType();
        java.lang.String str22 = response17.header("hi!");
        org.jsoup.Connection.Method method23 = response17.method();
        java.util.Map map24 = response17.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Response response27 = response11.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test14920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14920");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map.Entry entry9 = response1.scanHeaders("");
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response13.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14921");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.lang.String str6 = response0.cookie("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.header("");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test14922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14922");
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
        int int14 = response0.statusCode();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test14923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14923");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response1.url();
        java.lang.String str11 = response1.charset();
        int int12 = response1.statusCode();
        java.lang.String str14 = response1.header("hi!");
        java.util.Map map15 = response1.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test14924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14924");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str7 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
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
        java.lang.String str25 = response9.statusMessage();
        java.util.Map map26 = response9.cookies();
        java.lang.String str27 = response9.charset();
        java.util.Map map28 = response9.headers();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str31 = response4.header("hi!");
        boolean boolean33 = response4.hasCookie("");
        java.util.Map map34 = response4.headers();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(map34);
    }

    @Test
    public void test14925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14925");
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
        java.util.Map map12 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test14926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14926");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map.Entry entry11 = response6.scanHeaders("hi!");
        java.net.URL uRL12 = response6.url();
        java.lang.String str14 = response6.cookie("");
        java.lang.String str15 = response6.contentType();
        java.lang.String str17 = response6.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test14927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14927");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        int int4 = response1.statusCode();
        org.jsoup.Connection.Method method5 = response1.method();
        java.lang.String str6 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.lang.String str10 = response8.statusMessage();
        boolean boolean12 = response8.hasCookie("hi!");
        java.lang.String str14 = response8.header("hi!");
        int int15 = response8.statusCode();
        boolean boolean17 = response8.hasHeader("hi!");
        java.util.Map map18 = response8.headers();
        java.lang.String str20 = response8.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test14928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14928");
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
        java.lang.String str23 = response21.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        org.jsoup.Connection.Method method26 = response24.method();
        java.lang.String str27 = response24.contentType();
        org.jsoup.Connection.Method method28 = response24.method();
        java.util.Map.Entry entry30 = response24.scanHeaders("");
        java.lang.String str31 = response24.contentType();
        java.util.Map map32 = response24.headers();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Method method35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response34.method(method35);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test14929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14929");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.util.Map.Entry entry5 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        org.jsoup.Connection.Method method8 = response6.method();
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        java.util.Map.Entry entry12 = response6.scanHeaders("");
        java.lang.String str13 = response6.contentType();
        java.util.Map map14 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.util.Map map16 = response1.headers();
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        java.net.URL uRL20 = response1.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test14930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14930");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        int int4 = response1.statusCode();
        org.jsoup.Connection.Method method5 = response1.method();
        java.lang.String str6 = response1.statusMessage();
        java.lang.String str7 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response8.cookie("");
        java.lang.String str11 = response8.statusMessage();
        int int12 = response8.statusCode();
        java.lang.String str14 = response8.cookie("hi!");
        java.lang.String str16 = response8.header("");
        java.lang.String str17 = response8.contentType();
        java.lang.String str18 = response8.contentType();
        java.lang.String str20 = response8.cookie("hi!");
        java.util.Map map21 = response8.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test14931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14931");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL3 = response2.url();
        java.lang.String str4 = response2.statusMessage();
        boolean boolean6 = response2.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test14932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14932");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean10 = response8.hasCookie("");
        java.lang.String str12 = response8.header("");
        java.lang.String str13 = response8.statusMessage();
        java.util.Map map14 = response8.headers();
        java.lang.String str15 = response8.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14933");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        java.lang.String str14 = response0.statusMessage();
        org.jsoup.Connection.Response response16 = response0.removeHeader("hi!");
        boolean boolean18 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test14934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14934");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.header("");
        boolean boolean8 = response4.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14935");
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
        org.jsoup.Connection.Response response26 = response6.header("hi!", "");
        org.jsoup.Connection.Method method27 = response6.method();
        boolean boolean29 = response6.hasCookie("hi!");
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
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test14936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14936");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str18 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test14937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14937");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        java.util.Map map10 = response8.headers();
        java.lang.String str12 = response8.getHeaderCaseInsensitive("");
        java.net.URL uRL13 = response8.url();
        java.lang.String str15 = response8.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14938");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean15 = response0.hasHeader("hi!");
        int int16 = response0.statusCode();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test14939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14939");
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
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int26 = response25.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response25.hasHeader("");
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test14940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14940");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("hi!");
        java.util.Map map19 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str21 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test14941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14941");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("");
        int int11 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response13.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test14942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14942");
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
        java.lang.String str17 = response11.charset();
        java.lang.String str19 = response11.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test14943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14943");
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
        java.lang.String str24 = response13.header("");
        org.jsoup.Connection.Response response27 = response13.cookie("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = response13.getClass();
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
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test14944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14944");
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
        java.util.Map.Entry entry23 = response0.scanHeaders("hi!");
        java.lang.String str24 = response0.contentType();
        java.lang.String str26 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method27 = response0.method();
        org.jsoup.Connection.Response response30 = response0.header("hi!", "hi!");
        java.lang.String str32 = response0.header("");
        java.lang.String str33 = response0.statusMessage();
        java.lang.String str35 = response0.cookie("hi!");
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
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test14945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14945");
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
        org.jsoup.Connection.Method method16 = response9.method();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.Connection.Response response18 = null;
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection17, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test14946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14946");
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
        java.lang.String str15 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.statusMessage();
        java.util.Map map19 = response16.cookies();
        java.lang.String str21 = response16.header("");
        java.lang.String str23 = response16.header("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response27 = response16.cookie("hi!", "");
        java.lang.String str28 = response16.contentType();
        java.lang.String str30 = response16.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str33 = response31.cookie("");
        java.lang.String str34 = response31.contentType();
        java.lang.String str36 = response31.header("hi!");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response31);
        java.util.Map map38 = response31.headers();
        java.util.Map map39 = response31.cookies();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL41 = response40.url();
        java.lang.String str43 = response40.header("hi!");
        org.jsoup.Connection.Response response45 = response40.removeCookie("hi!");
        java.util.Map.Entry entry47 = response40.scanHeaders("hi!");
        int int48 = response40.statusCode();
        boolean boolean50 = response40.hasCookie("");
        java.lang.String str52 = response40.cookie("");
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response40);
        java.util.Map map54 = response40.cookies();
        response31.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertNull(entry47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test14947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14947");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        java.lang.String str11 = response0.contentType();
        java.util.Map map12 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        org.jsoup.Connection.Method method15 = response13.method();
        org.jsoup.Connection.Response response18 = response13.header("hi!", "");
        org.jsoup.Connection.Response response20 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response22.header("hi!");
        java.util.Map.Entry entry26 = response22.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        org.jsoup.Connection.Method method29 = response27.method();
        java.lang.String str30 = response27.contentType();
        org.jsoup.Connection.Method method31 = response27.method();
        java.util.Map.Entry entry33 = response27.scanHeaders("");
        java.lang.String str34 = response27.contentType();
        java.util.Map map35 = response27.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.util.Map map38 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(entry33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test14948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14948");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.charset();
        java.net.URL uRL8 = response0.url();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test14949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14949");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str16 = response14.statusMessage();
        java.util.Map map17 = response14.cookies();
        org.jsoup.Connection.Response response19 = response14.removeHeader("hi!");
        java.util.Map.Entry entry21 = response14.scanHeaders("");
        java.util.Map.Entry entry23 = response14.scanHeaders("");
        java.lang.String str24 = response14.statusMessage();
        java.net.URL uRL25 = response14.url();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str29 = response27.cookie("");
        java.lang.String str30 = response27.contentType();
        java.lang.String str32 = response27.header("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.util.Map map34 = response33.headers();
        java.lang.String str36 = response33.cookie("hi!");
        java.util.Map map37 = response33.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test14950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14950");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.header("");
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test14951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14951");
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
        java.lang.String str15 = response12.charset();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14952");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14953");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        java.lang.String str10 = response7.statusMessage();
        boolean boolean12 = response7.hasCookie("hi!");
        java.lang.String str13 = response7.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14954");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response13.header("hi!", "hi!");
        java.lang.String str18 = response13.cookie("hi!");
        java.lang.String str20 = response13.getHeaderCaseInsensitive("");
        java.util.Map map21 = response13.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test14955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14955");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        java.util.Map map10 = response0.cookies();
        java.lang.String str11 = response0.statusMessage();
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
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14956");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response4.cookie("hi!", "");
        java.lang.String str8 = response4.statusMessage();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14957");
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
        org.jsoup.Connection.Response response41 = response0.removeCookie("");
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
        org.junit.Assert.assertNotNull(response41);
    }

    @Test
    public void test14958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14958");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("hi!");
        java.util.Map map12 = response0.headers();
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test14959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14959");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response10.method();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test14960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14960");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14961");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.Class<?> wildcardClass13 = response10.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test14962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14962");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        int int16 = response0.statusCode();
        java.util.Map map17 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test14963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14963");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.header("");
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test14964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14964");
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
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        org.jsoup.Connection.Method method28 = response26.method();
        java.lang.String str30 = response26.cookie("hi!");
        java.util.Map.Entry entry32 = response26.scanHeaders("hi!");
        java.net.URL uRL33 = response26.url();
        java.lang.String str34 = response26.statusMessage();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.util.Map map36 = response35.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(entry32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test14965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14965");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.util.Map map10 = response0.cookies();
        java.lang.String str11 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test14966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14966");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map10 = response9.headers();
        java.lang.String str12 = response9.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method13 = response9.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test14967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14967");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("");
        java.lang.String str13 = response0.cookie("");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14968");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.util.Map map9 = response1.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test14969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14969");
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
        boolean boolean15 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test14970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14970");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test14971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14971");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        java.lang.String str15 = response0.charset();
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test14972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14972");
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
        org.jsoup.Connection.Method method16 = response12.method();
        java.lang.String str17 = response12.statusMessage();
        java.util.Map map18 = response12.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
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
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14973");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.contentType();
        java.util.Map map12 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test14974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14974");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.util.Map map10 = response1.cookies();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test14975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14975");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map2 = response1.headers();
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.statusMessage();
        java.net.URL uRL6 = response1.url();
        java.lang.String str8 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test14976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14976");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        java.util.Map.Entry entry15 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str18 = response16.cookie("");
        java.lang.String str19 = response16.charset();
        org.jsoup.Connection.Response response21 = response16.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test14977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14977");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL15 = response14.url();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response14.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test14978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14978");
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
        org.jsoup.Connection.Response response29 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str32 = response0.header("");
        org.jsoup.Connection.Response response35 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response37 = response0.method(method36);
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
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response35);
    }

    @Test
    public void test14979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14979");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response13.parse();
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14980");
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
        java.lang.String str33 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response36 = response0.cookie("hi!", "");
        java.lang.String str37 = response0.charset();
        java.util.Map map38 = response0.headers();
        java.lang.String str39 = response0.contentType();
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
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test14981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14981");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        boolean boolean7 = response0.hasCookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test14982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14982");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.net.URL uRL3 = response1.url();
        java.net.URL uRL4 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test14983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14983");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        java.lang.String str16 = response0.header("");
        java.util.Map map17 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test14984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14984");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.header("hi!");
        java.lang.String str17 = response14.charset();
        org.jsoup.Connection.Response response20 = response14.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str24 = response14.header("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Response response28 = response26.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test14985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14985");
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
        boolean boolean14 = response0.hasCookie("hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        java.lang.String str17 = response0.charset();
        java.util.Map.Entry entry19 = response0.scanHeaders("");
        org.jsoup.Connection.Response response21 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test14986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14986");
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
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        java.lang.String str17 = response0.charset();
        java.lang.String str18 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test14987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14987");
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
        java.net.URL uRL17 = response0.url();
        java.util.Map map18 = response0.cookies();
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test14988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14988");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        java.lang.String str12 = response0.contentType();
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test14989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14989");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        java.util.Map map12 = response0.headers();
        java.lang.String str14 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test14990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14990");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        int int4 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.removeCookie("");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test14991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14991");
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
        java.lang.String str14 = response0.cookie("hi!");
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        java.lang.String str17 = response0.charset();
        java.lang.String str19 = response0.cookie("hi!");
        java.util.Map map20 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response0.hasHeader("");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test14992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14992");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map map10 = response1.headers();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test14993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14993");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
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
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test14994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14994");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL6 = response5.url();
        java.lang.String str8 = response5.header("hi!");
        org.jsoup.Connection.Response response10 = response5.removeHeader("hi!");
        org.jsoup.Connection.Method method11 = response5.method();
        java.util.Map map12 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test14995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14995");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
    }

    @Test
    public void test14996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14996");
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
        java.lang.String str22 = response1.charset();
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test14997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14997");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean5 = response0.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        boolean boolean14 = response0.hasCookie("");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        java.util.Map map17 = response0.cookies();
        java.lang.String str18 = response0.statusMessage();
        java.lang.String str20 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test14998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14998");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        int int4 = response0.statusCode();
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.header("hi!");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test14999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14999");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.lang.String str12 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test15000");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.header("");
        int int10 = response0.statusCode();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }
}

