import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest50 {

    public static boolean debug = false;

    @Test
    public void test25001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25001");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.util.Map.Entry entry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode();
        boolean boolean11 = response1.hasCookie("");
        java.lang.String str13 = response1.cookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map15 = response1.cookies();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry19 = response1.scanHeaders("hi!");
        java.util.Map map20 = response1.cookies();
        java.util.Map.Entry entry22 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(entry22);
    }

    @Test
    public void test25002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25002");
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
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str17 = response1.contentType();
        java.util.Map map18 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test25003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25003");
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
        java.lang.String str18 = response0.cookie("");
        java.util.Map.Entry entry20 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(entry20);
    }

    @Test
    public void test25004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25004");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.lang.String str6 = response1.cookie("hi!");
        java.lang.Class<?> wildcardClass7 = response1.getClass();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25005");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response0.statusCode();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test25006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25006");
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
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response16 = response0.removeCookie("hi!");
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25007");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map.Entry entry11 = response6.scanHeaders("hi!");
        java.util.Map.Entry entry13 = response6.scanHeaders("hi!");
        java.util.Map map14 = response6.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25008");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.header("");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.statusMessage();
        java.net.URL uRL12 = response0.url();
        java.util.Map map13 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test25009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25009");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Method method11 = response9.method();
        org.jsoup.Connection.Response response13 = response9.removeCookie("");
        java.lang.String str14 = response9.statusMessage();
        java.lang.String str16 = response9.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.net.URL uRL19 = response17.url();
        java.lang.String str21 = response17.cookie("");
        java.util.Map.Entry entry23 = response17.scanHeaders("hi!");
        java.lang.String str25 = response17.getHeaderCaseInsensitive("");
        java.net.URL uRL26 = response17.url();
        java.lang.String str28 = response17.header("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        java.lang.String str31 = response29.statusMessage();
        java.util.Map map32 = response29.cookies();
        java.lang.String str33 = response29.charset();
        java.util.Map map34 = response29.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.lang.String str38 = response9.getHeaderCaseInsensitive("");
        java.lang.String str39 = response9.contentType();
        int int40 = response9.statusCode();
        java.lang.String str41 = response9.contentType();
        java.util.Map map42 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test25010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25010");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response15.statusMessage();
        org.jsoup.Connection.Method method17 = response15.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test25011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25011");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.charset();
        java.lang.String str10 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Method method15 = response12.method();
        java.util.Map.Entry entry17 = response12.scanHeaders("");
        java.lang.String str19 = response12.cookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method21 = response20.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        java.lang.String str25 = response22.header("hi!");
        org.jsoup.Connection.Response response27 = response22.removeCookie("hi!");
        org.jsoup.Connection.Response response29 = response22.removeCookie("");
        java.util.Map map30 = response22.cookies();
        org.jsoup.Connection.Response response33 = response22.header("hi!", "hi!");
        java.lang.String str35 = response22.header("");
        java.util.Map map36 = response22.cookies();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        boolean boolean39 = response20.hasCookie("");
        java.util.Map map40 = response20.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        org.jsoup.Connection.Response response43 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(response43);
    }

    @Test
    public void test25012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25012");
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
        java.lang.String str13 = response0.charset();
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25013");
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
        java.lang.String str13 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25014");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("");
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25015");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test25016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25016");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.contentType();
        java.util.Map map13 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        org.jsoup.Connection.Method method17 = response15.method();
        org.jsoup.Connection.Response response20 = response15.header("hi!", "");
        java.lang.String str22 = response15.header("hi!");
        java.util.Map map23 = response15.headers();
        java.lang.String str24 = response15.statusMessage();
        java.lang.String str25 = response15.statusMessage();
        java.util.Map map26 = response15.headers();
        java.lang.String str27 = response15.contentType();
        boolean boolean29 = response15.hasCookie("hi!");
        java.util.Map map30 = response15.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str32 = response0.charset();
        java.util.Map.Entry entry34 = response0.scanHeaders("hi!");
        java.lang.String str35 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(entry34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test25017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25017");
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
        java.lang.String str16 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25018");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.util.Map map17 = response0.cookies();
        java.util.Map map18 = response0.cookies();
        java.lang.String str19 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25019");
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
        java.lang.String str18 = response0.cookie("hi!");
        java.lang.String str19 = response0.contentType();
        org.jsoup.Connection.Method method20 = response0.method();
        java.util.Map map21 = response0.headers();
        java.lang.String str23 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test25020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25020");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("");
        java.net.URL uRL4 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document5 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test25021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25021");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str9 = response0.cookie("hi!");
        java.util.Map map10 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.cookie("hi!");
        boolean boolean15 = response11.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test25022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25022");
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
        boolean boolean14 = response12.hasCookie("");
        java.lang.String str15 = response12.statusMessage();
        java.lang.String str16 = response12.charset();
        boolean boolean18 = response12.hasHeader("hi!");
        int int19 = response12.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test25023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25023");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response1.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response11.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25024");
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
        java.lang.String str22 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL24 = response23.url();
        java.lang.String str25 = response23.statusMessage();
        int int26 = response23.statusCode();
        int int27 = response23.statusCode();
        int int28 = response23.statusCode();
        org.jsoup.Connection.Response response30 = response23.removeCookie("");
        java.lang.String str31 = response23.charset();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.util.Map map33 = response32.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test25025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25025");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response9.header("hi!");
        java.net.URL uRL12 = response9.url();
        boolean boolean14 = response9.hasHeader("hi!");
        java.util.Map.Entry entry16 = response9.scanHeaders("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test25026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25026");
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
        boolean boolean17 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response21 = response19.removeCookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test25027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25027");
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
        java.util.Map map50 = response37.cookies();
        java.util.Map.Entry entry52 = response37.scanHeaders("hi!");
        java.net.URL uRL53 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response54 = response37.url(uRL53);
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
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(entry52);
    }

    @Test
    public void test25028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25028");
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
        boolean boolean17 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.charset();
        java.net.URL uRL22 = response19.url();
        java.lang.String str24 = response19.header("hi!");
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
        java.lang.String str41 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map43 = response42.headers();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map46 = response45.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test25029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25029");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry entry16 = response14.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str19 = response17.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
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
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25030");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response8 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test25031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25031");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
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
    }

    @Test
    public void test25032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25032");
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
        boolean boolean17 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test25033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25033");
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
        java.util.Map.Entry entry20 = response0.scanHeaders("");
        int int21 = response0.statusCode();
        java.lang.String str22 = response0.charset();
        java.lang.String str24 = response0.cookie("");
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
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test25034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        java.util.Map map5 = response0.headers();
        java.lang.String str7 = response0.header("");
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25035");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        java.lang.String str13 = response10.contentType();
        java.lang.String str15 = response10.header("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str18 = response10.cookie("hi!");
        java.util.Map.Entry entry20 = response10.scanHeaders("hi!");
        java.util.Map map21 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.Connection.Response response24 = response0.removeCookie("");
        org.jsoup.Connection.Response response26 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test25036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25036");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        int int8 = response1.statusCode();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str16 = response1.contentType();
        java.util.Map map17 = response1.cookies();
        org.jsoup.Connection.Response response19 = response1.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test25037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25037");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.util.Map map12 = response0.headers();
        java.util.Map map13 = response0.headers();
        java.util.Map map14 = response0.cookies();
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test25038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25038");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.charset();
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25039");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map map9 = response7.headers();
        java.lang.String str11 = response7.cookie("hi!");
        java.util.Map.Entry entry13 = response7.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test25040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25040");
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
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str21 = response1.header("");
        org.jsoup.Connection.Response response24 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test25041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean10 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25042");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str7 = response4.header("hi!");
        org.jsoup.Connection.Response response9 = response4.removeHeader("hi!");
        java.lang.String str11 = response4.header("hi!");
        java.lang.String str12 = response4.statusMessage();
        java.lang.String str14 = response4.cookie("hi!");
        org.jsoup.Connection.Response response17 = response4.cookie("hi!", "hi!");
        java.lang.String str19 = response4.header("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL21 = response20.url();
        org.jsoup.Connection.Method method22 = response20.method();
        org.jsoup.Connection.Response response25 = response20.header("hi!", "");
        java.util.Map map26 = response20.headers();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response20);
        int int28 = response20.statusCode();
        java.util.Map map29 = response20.headers();
        java.util.Map map30 = response20.cookies();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str34 = response1.cookie("");
        org.jsoup.Connection.Response response36 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test25043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25043");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response10.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response12.cookie("hi!");
        org.jsoup.Connection.Response response16 = response12.removeCookie("hi!");
        org.jsoup.Connection.Method method17 = response12.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test25044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25044");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map6 = response5.headers();
        java.lang.String str8 = response5.header("hi!");
        java.util.Map map9 = response5.cookies();
        java.lang.Class<?> wildcardClass10 = map9.getClass();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response0.header("hi!");
        boolean boolean13 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str21 = response16.cookie("hi!");
        java.util.Map map22 = response16.cookies();
        java.lang.String str24 = response16.getHeaderCaseInsensitive("hi!");
        java.lang.String str25 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        java.net.URL uRL28 = response26.url();
        java.net.URL uRL29 = response26.url();
        java.net.URL uRL30 = response26.url();
        java.lang.String str32 = response26.getHeaderCaseInsensitive("");
        java.lang.String str34 = response26.header("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response35);
        org.jsoup.Connection.Method method37 = response35.method();
        boolean boolean39 = response35.hasCookie("");
        java.util.Map map40 = response35.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        org.jsoup.Connection.Response response44 = response16.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test25046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25046");
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
        java.lang.String str16 = response14.cookie("");
        java.lang.String str17 = response14.statusMessage();
        java.lang.String str19 = response14.cookie("");
        java.net.URL uRL20 = response14.url();
        java.lang.String str22 = response14.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method23 = response14.method();
        org.jsoup.Connection.Response response26 = response14.cookie("hi!", "");
        java.lang.String str27 = response14.charset();
        java.lang.String str28 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        java.lang.String str32 = response29.header("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL34 = response33.url();
        java.lang.String str36 = response33.header("hi!");
        java.util.Map map37 = response33.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        int int39 = response29.statusCode();
        java.lang.String str40 = response29.charset();
        java.util.Map map41 = response29.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        boolean boolean45 = response12.hasCookie("hi!");
        org.jsoup.Connection.Method method46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response47 = response12.method(method46);
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test25047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25047");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.cookie("");
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str11 = response0.header("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test25048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25048");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map13 = response0.cookies();
        java.lang.String str14 = response0.charset();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map17 = response0.headers();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        org.jsoup.Connection.Method method21 = response19.method();
        java.lang.String str23 = response19.cookie("hi!");
        boolean boolean25 = response19.hasCookie("hi!");
        org.jsoup.Connection.Response response28 = response19.cookie("hi!", "");
        boolean boolean30 = response19.hasHeader("hi!");
        java.lang.String str31 = response19.statusMessage();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str33 = response19.statusMessage();
        java.util.Map map34 = response19.headers();
        java.util.Map map35 = response19.cookies();
        org.jsoup.Connection.Response response37 = response19.removeHeader("hi!");
        java.lang.String str39 = response19.getHeaderCaseInsensitive("hi!");
        java.util.Map map40 = response19.headers();
        java.util.Map map41 = response19.cookies();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response44 = response19.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection18, response44);
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test25049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25049");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map map10 = response0.cookies();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Response response15 = response0.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25050");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        boolean boolean8 = response0.hasHeader("hi!");
        boolean boolean10 = response0.hasCookie("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.charset();
        java.net.URL uRL16 = response13.url();
        java.lang.String str18 = response13.header("hi!");
        java.util.Map map19 = response13.cookies();
        java.lang.String str21 = response13.header("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry entry24 = response22.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(entry24);
    }

    @Test
    public void test25051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25051");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        org.jsoup.Connection.Method method8 = response6.method();
        java.lang.String str10 = response6.cookie("hi!");
        java.util.Map.Entry entry12 = response6.scanHeaders("hi!");
        java.util.Map.Entry entry14 = response6.scanHeaders("");
        java.util.Map map15 = response6.cookies();
        java.lang.String str17 = response6.cookie("hi!");
        java.util.Map map18 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test25052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25052");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test25053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25053");
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
        java.lang.String str39 = response36.cookie("hi!");
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
    public void test25054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25054");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map10 = response9.headers();
        java.net.URL uRL11 = response9.url();
        boolean boolean13 = response9.hasHeader("hi!");
        int int14 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response9.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test25055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25055");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.statusMessage();
        int int19 = response16.statusCode();
        org.jsoup.Connection.Response response22 = response16.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str25 = response16.cookie("");
        boolean boolean27 = response16.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map map29 = response16.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test25056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25056");
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
        java.util.Map map21 = response0.headers();
        org.jsoup.Connection.Method method22 = response0.method();
        int int23 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test25057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25057");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        int int14 = response0.statusCode();
        org.jsoup.Connection.Response response16 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str19 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25059");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("");
        java.lang.String str13 = response0.contentType();
        java.lang.String str15 = response0.getHeaderCaseInsensitive("");
        java.util.Map map16 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25060");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        java.util.Map map13 = response10.cookies();
        java.lang.String str15 = response10.header("hi!");
        java.lang.String str17 = response10.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response10.charset();
        java.lang.String str19 = response10.charset();
        boolean boolean21 = response10.hasHeader("hi!");
        java.util.Map map22 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test25061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25061");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25062");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "hi!");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.header("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25063");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Method method8 = response0.method();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str12 = response0.cookie("hi!");
        java.lang.String str13 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("hi!");
        org.jsoup.Connection.Response response19 = response14.removeCookie("hi!");
        java.util.Map.Entry entry21 = response14.scanHeaders("hi!");
        int int22 = response14.statusCode();
        boolean boolean24 = response14.hasCookie("");
        java.lang.String str26 = response14.cookie("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean29 = response14.hasCookie("");
        int int30 = response14.statusCode();
        java.util.Map map31 = response14.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.lang.String str34 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL35 = response0.url();
        boolean boolean37 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response39 = response0.removeCookie("");
        java.lang.String str41 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test25064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25064");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        java.util.Map map7 = response4.cookies();
        java.util.Map map8 = response4.cookies();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.Connection.Response response10 = null;
        // The following exception was thrown during execution in test generation
        try {
            response4.setupFromConnection(httpURLConnection9, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test25065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25065");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        boolean boolean7 = response1.hasCookie("");
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        java.net.URL uRL10 = response1.url();
        java.util.Map.Entry entry12 = response1.scanHeaders("");
        java.util.Map map13 = response1.headers();
        org.jsoup.Connection.Method method14 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test25066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25066");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("hi!");
        org.jsoup.Connection.Response response6 = response2.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response2.removeCookie("");
        java.util.Map.Entry entry10 = response2.scanHeaders("");
        java.lang.String str12 = response2.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25067");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str12 = response10.header("hi!");
        org.jsoup.Connection.Response response14 = response10.removeHeader("hi!");
        org.jsoup.Connection.Response response16 = response10.removeCookie("");
        java.util.Map.Entry entry18 = response10.scanHeaders("");
        java.lang.String str20 = response10.cookie("hi!");
        java.lang.String str21 = response10.charset();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL24 = response23.url();
        org.jsoup.Connection.Method method25 = response23.method();
        java.lang.String str27 = response23.cookie("hi!");
        boolean boolean29 = response23.hasCookie("hi!");
        int int30 = response23.statusCode();
        java.lang.String str31 = response23.charset();
        int int32 = response23.statusCode();
        java.lang.String str34 = response23.getHeaderCaseInsensitive("hi!");
        java.lang.String str35 = response23.contentType();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        org.jsoup.Connection.Method method39 = response37.method();
        org.jsoup.Connection.Response response41 = response37.removeCookie("hi!");
        java.lang.String str43 = response37.getHeaderCaseInsensitive("");
        java.util.Map map44 = response37.cookies();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str50 = response48.cookie("");
        java.lang.String str51 = response48.contentType();
        java.lang.String str53 = response48.header("hi!");
        org.jsoup.Connection.Response response55 = response48.removeCookie("");
        org.jsoup.Connection.Response response58 = response48.header("hi!", "");
        java.lang.String str59 = response48.charset();
        java.lang.String str61 = response48.header("");
        java.net.URL uRL62 = response48.url();
        org.jsoup.Connection.Response response64 = response48.removeCookie("");
        int int65 = response48.statusCode();
        org.jsoup.helper.HttpConnection.Response response66 = new org.jsoup.helper.HttpConnection.Response(response48);
        java.util.Map map67 = response66.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertNotNull(response58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(uRL62);
        org.junit.Assert.assertNotNull(response64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test25068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25068");
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
        int int43 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document44 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test25069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25069");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("hi!");
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasHeader("hi!");
        java.util.Map map13 = response0.headers();
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25070");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry11 = response1.scanHeaders("");
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.Connection.Method method13 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test25071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25071");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.contentType();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test25072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25072");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.net.URL uRL7 = response6.url();
        java.lang.String str8 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str11 = response6.cookie("hi!");
        java.util.Map map12 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
        boolean boolean15 = response0.hasCookie("");
        java.lang.String str17 = response0.cookie("hi!");
        org.jsoup.Connection.Method method18 = response0.method();
        int int19 = response0.statusCode();
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test25073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25073");
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
        org.jsoup.Connection.Response response30 = response0.removeCookie("hi!");
        boolean boolean32 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response34 = response0.removeCookie("");
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
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test25074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25074");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        boolean boolean14 = response11.hasCookie("");
        org.jsoup.Connection.Method method15 = response11.method();
        java.lang.String str16 = response11.statusMessage();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response11.url(uRL17);
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
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25076");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map.Entry entry11 = response6.scanHeaders("hi!");
        java.lang.String str13 = response6.cookie("");
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        org.jsoup.Connection.Response response20 = response15.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str22 = response21.statusMessage();
        java.net.URL uRL23 = response21.url();
        java.lang.String str24 = response21.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        org.jsoup.Connection.Method method27 = response25.method();
        org.jsoup.Connection.Response response30 = response25.header("hi!", "");
        boolean boolean32 = response25.hasCookie("hi!");
        java.lang.String str33 = response25.contentType();
        java.lang.String str34 = response25.statusMessage();
        int int35 = response25.statusCode();
        java.util.Map map36 = response25.cookies();
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test25077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25077");
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
        java.util.Map.Entry entry19 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
    }

    @Test
    public void test25078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25078");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.charset();
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.cookie("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25079");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "hi!");
        java.net.URL uRL11 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test25080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25081");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25082");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response8.method();
        boolean boolean11 = response8.hasHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25083");
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
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test25084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        boolean boolean14 = response10.hasCookie("");
        java.lang.String str16 = response10.getHeaderCaseInsensitive("");
        boolean boolean18 = response10.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.headers();
        java.util.Map map4 = response1.cookies();
        java.util.Map map5 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test25086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25086");
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
        boolean boolean27 = response8.hasCookie("");
        java.net.URL uRL28 = response8.url();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(uRL28);
    }

    @Test
    public void test25087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25087");
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
        int int23 = response0.statusCode();
        java.net.URL uRL24 = response0.url();
        java.lang.String str25 = response0.contentType();
        int int26 = response0.statusCode();
        java.util.Map map27 = response0.cookies();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test25088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25088");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.statusMessage();
        java.util.Map map14 = response0.cookies();
        int int15 = response0.statusCode();
        java.util.Map.Entry entry17 = response0.scanHeaders("hi!");
        java.lang.Class<?> wildcardClass18 = response0.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(entry17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25089");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        int int12 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int14 = response0.statusCode();
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test25090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25090");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response12.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25091");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str9 = response0.header("");
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map15 = response0.headers();
        java.util.Map map16 = response0.headers();
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(entry18);
    }

    @Test
    public void test25092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25092");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response0.statusMessage();
        java.util.Map map8 = response0.cookies();
        java.lang.String str10 = response0.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25093");
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
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test25094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25094");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        int int6 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test25095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25095");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        int int3 = response1.statusCode();
        java.lang.String str5 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test25096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25096");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean14 = response12.hasCookie("hi!");
        boolean boolean16 = response12.hasCookie("");
        java.util.Map map17 = response12.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test25097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25097");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.contentType();
        java.util.Map map6 = response0.cookies();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Method method8 = response0.method();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test25098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25098");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.lang.String str18 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int20 = response19.statusCode();
        org.jsoup.Connection.Response response22 = response19.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        java.lang.String str26 = response24.statusMessage();
        java.util.Map map27 = response24.cookies();
        java.lang.String str29 = response24.header("hi!");
        java.lang.String str31 = response24.getHeaderCaseInsensitive("hi!");
        java.lang.String str32 = response24.charset();
        java.lang.String str33 = response24.charset();
        java.lang.String str35 = response24.header("hi!");
        org.jsoup.Connection.Response response37 = response24.removeCookie("");
        org.jsoup.Connection.Response response39 = response24.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response19.setupFromConnection(httpURLConnection23, response39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNotNull(response39);
    }

    @Test
    public void test25099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25099");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test25100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25100");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        java.util.Map map15 = response0.headers();
        boolean boolean17 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response0.parse();
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
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test25101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str9 = response0.cookie("hi!");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25102");
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
        org.jsoup.Connection.Response response30 = response13.header("hi!", "hi!");
        boolean boolean32 = response13.hasCookie("hi!");
        boolean boolean34 = response13.hasCookie("");
        java.net.URL uRL35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response13.url(uRL35);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test25103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25103");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = response6.method();
        boolean boolean9 = response6.hasCookie("hi!");
        java.lang.String str11 = response6.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25104");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.lang.String str9 = response6.cookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25105");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.lang.String str12 = response0.header("hi!");
        java.util.Map map13 = response0.cookies();
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.contentType();
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25107");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.headers();
        java.util.Map map4 = response1.cookies();
        java.util.Map map5 = response1.cookies();
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test25108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25108");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str27 = response25.header("hi!");
        java.lang.String str29 = response25.getHeaderCaseInsensitive("hi!");
        java.lang.String str31 = response25.getHeaderCaseInsensitive("hi!");
        boolean boolean33 = response25.hasCookie("");
        java.lang.String str34 = response25.charset();
        java.util.Map map35 = response25.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test25109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25109");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        java.util.Map map16 = response13.cookies();
        org.jsoup.Connection.Response response18 = response13.removeHeader("hi!");
        org.jsoup.Connection.Response response20 = response13.removeHeader("hi!");
        org.jsoup.Connection.Response response22 = response13.removeCookie("");
        java.util.Map map23 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test25110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25110");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        org.jsoup.Connection.Response response8 = response0.removeCookie("hi!");
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        java.util.Map map13 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test25111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25111");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Method method5 = response1.method();
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        boolean boolean10 = response1.hasCookie("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset();
        boolean boolean15 = response1.hasCookie("");
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str18 = response1.header("");
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str21 = response1.header("hi!");
        java.util.Map map22 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test25112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25112");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.lang.String str15 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        int int18 = response0.statusCode();
        org.jsoup.Connection.Response response20 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test25113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25113");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        int int12 = response1.statusCode();
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean19 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test25114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25114");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.net.URL uRL9 = response0.url();
        java.lang.String str10 = response0.charset();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25115");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map13 = response0.headers();
        int int14 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test25116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25116");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        java.lang.String str13 = response0.cookie("");
        java.net.URL uRL14 = response0.url();
        org.jsoup.Connection.Response response16 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test25117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25117");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.cookies();
        org.jsoup.Connection.Method method5 = response0.method();
        java.util.Map map6 = response0.headers();
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test25118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25118");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test25119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25119");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        int int10 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        java.util.Map map19 = response15.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        int int21 = response11.statusCode();
        java.lang.String str22 = response11.charset();
        org.jsoup.Connection.Method method23 = response11.method();
        org.jsoup.Connection.Method method24 = response11.method();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("");
        boolean boolean29 = response25.hasHeader("hi!");
        java.net.URL uRL30 = response25.url();
        java.lang.String str32 = response25.getHeaderCaseInsensitive("");
        boolean boolean34 = response25.hasCookie("hi!");
        java.util.Map map35 = response25.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str39 = response37.cookie("");
        java.lang.String str40 = response37.contentType();
        java.lang.String str42 = response37.getHeaderCaseInsensitive("hi!");
        java.lang.String str43 = response37.contentType();
        org.jsoup.Connection.Method method44 = response37.method();
        java.util.Map map45 = response37.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        java.lang.String str49 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL51 = response50.url();
        org.jsoup.Connection.Method method52 = response50.method();
        org.jsoup.Connection.Response response55 = response50.header("hi!", "");
        java.util.Map map56 = response50.headers();
        org.jsoup.helper.HttpConnection.Response response57 = new org.jsoup.helper.HttpConnection.Response(response50);
        boolean boolean59 = response50.hasCookie("");
        java.lang.String str60 = response50.statusMessage();
        java.lang.String str61 = response50.charset();
        org.jsoup.helper.HttpConnection.Response response62 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL63 = response62.url();
        org.jsoup.Connection.Method method64 = response62.method();
        org.jsoup.Connection.Response response67 = response62.header("hi!", "");
        java.lang.String str69 = response62.header("hi!");
        java.util.Map.Entry entry71 = response62.scanHeaders("");
        org.jsoup.Connection.Method method72 = response62.method();
        java.util.Map map73 = response62.cookies();
        response50.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map73);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map73);
        int int76 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(uRL51);
        org.junit.Assert.assertNull(method52);
        org.junit.Assert.assertNotNull(response55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(uRL63);
        org.junit.Assert.assertNull(method64);
        org.junit.Assert.assertNotNull(response67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(entry71);
        org.junit.Assert.assertNull(method72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test25120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25120");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test25121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25121");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.cookie("hi!");
        java.util.Map map7 = response0.cookies();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test25122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25122");
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
        java.lang.String str17 = response0.cookie("");
        java.util.Map map18 = response0.cookies();
        org.jsoup.Connection.Response response20 = response0.removeCookie("");
        java.lang.String str21 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test25123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25123");
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
        boolean boolean21 = response18.hasCookie("hi!");
        java.lang.String str23 = response18.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method24 = response18.method();
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        java.lang.String str28 = response26.statusMessage();
        int int29 = response26.statusCode();
        org.jsoup.Connection.Response response32 = response26.header("hi!", "hi!");
        java.net.URL uRL33 = response26.url();
        java.util.Map.Entry entry35 = response26.scanHeaders("hi!");
        java.lang.String str36 = response26.charset();
        boolean boolean38 = response26.hasCookie("");
        java.util.Map.Entry entry40 = response26.scanHeaders("hi!");
        java.net.URL uRL41 = response26.url();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response26);
        // The following exception was thrown during execution in test generation
        try {
            response18.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response42);
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNotNull(entry35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(entry40);
        org.junit.Assert.assertNull(uRL41);
    }

    @Test
    public void test25124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25124");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map14 = response13.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25125");
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
        int int36 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response39 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test25126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25126");
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
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL36 = response35.url();
        org.jsoup.Connection.Method method37 = response35.method();
        java.lang.String str38 = response35.contentType();
        org.jsoup.Connection.Method method39 = response35.method();
        java.util.Map map40 = response35.headers();
        java.util.Map map41 = response35.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.lang.String str44 = response0.cookie("hi!");
        java.lang.String str45 = response0.contentType();
        org.jsoup.Connection.Response response47 = response0.removeCookie("hi!");
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
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(response47);
    }

    @Test
    public void test25127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25127");
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
        java.util.Map.Entry entry24 = response1.scanHeaders("hi!");
        int int25 = response1.statusCode();
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
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test25128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25128");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response15 = response13.removeCookie("hi!");
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        org.jsoup.Connection.Method method19 = response17.method();
        java.lang.String str21 = response17.header("hi!");
        org.jsoup.Connection.Response response24 = response17.cookie("hi!", "");
        java.lang.String str25 = response17.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test25129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25129");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method13 = response0.method();
        boolean boolean15 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25130");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("hi!");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Method method11 = response0.method();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int15 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test25131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response6.removeCookie("");
        org.jsoup.Connection.Response response13 = response6.removeCookie("");
        int int14 = response6.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test25132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25132");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map14 = response0.headers();
        java.lang.String str16 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str19 = response17.cookie("");
        java.lang.String str20 = response17.contentType();
        java.lang.String str22 = response17.header("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map24 = response17.headers();
        java.util.Map map25 = response17.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        org.jsoup.Connection.Method method29 = response27.method();
        java.lang.String str30 = response27.contentType();
        org.jsoup.Connection.Method method31 = response27.method();
        java.util.Map map32 = response27.headers();
        boolean boolean34 = response27.hasCookie("hi!");
        int int35 = response27.statusCode();
        java.net.URL uRL36 = response27.url();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        java.lang.String str40 = response37.header("hi!");
        java.util.Map map41 = response37.headers();
        response27.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test25133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25133");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map map4 = response1.headers();
        java.net.URL uRL5 = response1.url();
        java.util.Map map6 = response1.cookies();
        java.util.Map map7 = response1.headers();
        int int8 = response1.statusCode();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType();
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25134");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL10 = response9.url();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test25135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25135");
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
        java.util.Map map21 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response22.cookie("hi!", "hi!");
        int int26 = response22.statusCode();
        java.lang.String str28 = response22.cookie("");
        java.util.Map map29 = response22.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.util.Map.Entry entry32 = response1.scanHeaders("hi!");
        int int33 = response1.statusCode();
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
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(entry32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test25136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25136");
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
        java.net.URL uRL20 = response0.url();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("");
        java.lang.String str24 = response21.contentType();
        java.lang.String str26 = response21.header("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str28 = response27.contentType();
        boolean boolean30 = response27.hasHeader("hi!");
        java.util.Map map31 = response27.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test25137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25137");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str22 = response19.header("hi!");
        java.util.Map map23 = response19.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        int int25 = response15.statusCode();
        java.lang.String str26 = response15.charset();
        java.util.Map map27 = response15.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.String str30 = response0.cookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test25138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25138");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.lang.String str7 = response0.charset();
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        java.lang.String str14 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25140");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response9.charset();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25141");
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
        java.util.Map.Entry entry28 = response0.scanHeaders("");
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
        org.junit.Assert.assertNull(entry28);
    }

    @Test
    public void test25142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25142");
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
        org.jsoup.Connection.Response response16 = response13.removeCookie("hi!");
        java.lang.String str17 = response13.charset();
        java.lang.String str19 = response13.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response13.body();
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25143");
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
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        int int14 = response0.statusCode();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test25144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25144");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
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
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        java.lang.String str29 = response27.statusMessage();
        boolean boolean31 = response27.hasCookie("hi!");
        org.jsoup.Connection.Response response34 = response27.header("hi!", "");
        boolean boolean36 = response27.hasCookie("");
        java.util.Map map37 = response27.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str41 = response39.cookie("");
        java.lang.String str42 = response39.contentType();
        java.lang.String str44 = response39.getHeaderCaseInsensitive("hi!");
        java.lang.String str45 = response39.contentType();
        org.jsoup.Connection.Method method46 = response39.method();
        java.util.Map map47 = response39.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        boolean boolean51 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test25145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25145");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.lang.String str18 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry21 = response19.scanHeaders("hi!");
        org.jsoup.Connection.Response response23 = response19.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test25146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25146");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int12 = response11.statusCode();
        java.util.Map.Entry entry14 = response11.scanHeaders("hi!");
        java.lang.String str15 = response11.statusMessage();
        java.lang.String str16 = response11.contentType();
        org.jsoup.Connection.Response response18 = response11.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test25147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25147");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.cookie("");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        int int12 = response0.statusCode();
        int int13 = response0.statusCode();
        org.jsoup.Connection.Response response15 = response0.removeCookie("hi!");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response11 = response8.removeHeader("hi!");
        java.util.Map map12 = response8.headers();
        java.lang.String str14 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response8.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25149");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.lang.String str15 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25150");
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
        java.lang.String str16 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
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
    }

    @Test
    public void test25151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25151");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Response response15 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25152");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        java.lang.String str15 = response0.contentType();
        java.lang.String str17 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response22 = response18.removeCookie("hi!");
        java.lang.String str24 = response18.getHeaderCaseInsensitive("");
        java.util.Map map25 = response18.cookies();
        org.jsoup.Connection.Response response27 = response18.removeCookie("hi!");
        int int28 = response18.statusCode();
        java.lang.String str29 = response18.contentType();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str31 = response30.contentType();
        java.util.Map map32 = response30.headers();
        org.jsoup.Connection.Response response34 = response30.removeHeader("hi!");
        java.lang.String str36 = response30.getHeaderCaseInsensitive("");
        java.util.Map map37 = response30.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test25153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25153");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        java.lang.String str4 = response0.charset();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method7 = response0.method();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.contentType();
        java.util.Map map13 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        org.jsoup.Connection.Method method17 = response15.method();
        org.jsoup.Connection.Response response20 = response15.header("hi!", "");
        java.lang.String str22 = response15.header("hi!");
        java.util.Map map23 = response15.headers();
        java.lang.String str24 = response15.statusMessage();
        java.lang.String str25 = response15.statusMessage();
        java.util.Map map26 = response15.headers();
        java.lang.String str27 = response15.contentType();
        boolean boolean29 = response15.hasCookie("hi!");
        java.util.Map map30 = response15.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.Connection.Method method32 = response0.method();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(method32);
    }

    @Test
    public void test25154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25154");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry entry15 = response13.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response13.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test25155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25155");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("hi!");
        org.jsoup.Connection.Response response19 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        boolean boolean23 = response20.hasHeader("hi!");
        java.net.URL uRL24 = response20.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        java.lang.String str28 = response25.header("hi!");
        org.jsoup.Connection.Response response30 = response25.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str33 = response31.getHeaderCaseInsensitive("hi!");
        java.lang.String str34 = response31.statusMessage();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response31);
        boolean boolean37 = response31.hasCookie("hi!");
        java.net.URL uRL38 = response31.url();
        java.util.Map map39 = response31.cookies();
        response20.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.util.Map map42 = response0.cookies();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test25156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25156");
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
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response40 = response0.removeHeader("hi!");
        java.lang.String str41 = response0.contentType();
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
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test25157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25157");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test25158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25158");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        org.jsoup.Connection.Method method9 = response0.method();
        int int10 = response0.statusCode();
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.charset();
        java.lang.String str15 = response0.getHeaderCaseInsensitive("");
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
        java.lang.String str32 = response16.statusMessage();
        int int33 = response16.statusCode();
        java.lang.String str34 = response16.contentType();
        java.lang.String str35 = response16.statusMessage();
        java.util.Map map36 = response16.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test25159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25159");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("");
        int int11 = response0.statusCode();
        java.net.URL uRL12 = response0.url();
        java.lang.String str14 = response0.cookie("hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test25160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25160");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response4.hasCookie("hi!");
        java.lang.String str8 = response4.header("");
        java.lang.String str10 = response4.getHeaderCaseInsensitive("hi!");
        int int11 = response4.statusCode();
        java.lang.String str13 = response4.cookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25161");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Method method9 = response1.method();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test25162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25162");
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
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "");
        java.lang.String str19 = response0.charset();
        java.net.HttpURLConnection httpURLConnection20 = null;
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
        java.lang.String str37 = response21.statusMessage();
        java.util.Map map38 = response21.cookies();
        java.lang.String str39 = response21.charset();
        java.util.Map map40 = response21.cookies();
        java.util.Map map41 = response21.cookies();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response21);
        int int43 = response42.statusCode();
        org.jsoup.Connection.Response response45 = response42.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection20, response45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(response45);
    }

    @Test
    public void test25163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25163");
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
        java.net.URL uRL36 = response0.url();
        java.lang.String str37 = response0.statusMessage();
        java.lang.String str38 = response0.contentType();
        java.util.Map map39 = response0.headers();
        java.lang.Class<?> wildcardClass40 = map39.getClass();
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
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test25164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25164");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        java.lang.String str11 = response6.header("");
        java.lang.String str13 = response6.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25165");
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
        boolean boolean21 = response0.hasHeader("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test25166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25166");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.util.Map map6 = response0.headers();
        java.util.Map map7 = response0.cookies();
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test25167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25167");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        boolean boolean5 = response0.hasCookie("hi!");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.cookie("");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25168");
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
        java.lang.String str22 = response20.getHeaderCaseInsensitive("");
        boolean boolean24 = response20.hasCookie("");
        java.lang.String str25 = response20.contentType();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test25169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25169");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.cookie("");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        java.net.URL uRL10 = response0.url();
        int int11 = response0.statusCode();
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25170");
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
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test25171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25171");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.net.URL uRL8 = response1.url();
        java.util.Map.Entry entry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.charset();
        boolean boolean13 = response1.hasCookie("");
        java.net.URL uRL14 = response1.url();
        java.net.URL uRL15 = response1.url();
        java.net.URL uRL16 = response1.url();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test25172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25172");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test25173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25173");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int14 = response13.statusCode();
        java.lang.Class<?> wildcardClass15 = response13.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25174");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Response response12 = response7.removeHeader("hi!");
        java.lang.String str14 = response7.cookie("hi!");
        java.lang.String str15 = response7.charset();
        int int16 = response7.statusCode();
        int int17 = response7.statusCode();
        java.util.Map map18 = response7.headers();
        java.lang.String str19 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method21 = response7.method();
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response7.url(uRL22);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test25175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25175");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.contentType();
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Response response5 = response0.removeCookie("");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test25176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25176");
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
        org.jsoup.Connection.Response response54 = response13.removeHeader("hi!");
        java.net.URL uRL55 = response13.url();
        boolean boolean57 = response13.hasCookie("");
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
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNull(uRL55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test25177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25177");
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
        boolean boolean18 = response0.hasHeader("hi!");
        java.lang.String str19 = response0.charset();
        boolean boolean21 = response0.hasCookie("");
        org.jsoup.Connection.Response response23 = response0.removeCookie("");
        org.jsoup.Connection.Response response25 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test25178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25178");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test25179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25179");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.util.Map map5 = response0.cookies();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test25180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        boolean boolean14 = response11.hasCookie("");
        org.jsoup.Connection.Method method15 = response11.method();
        boolean boolean17 = response11.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response11.removeCookie("hi!");
        java.net.URL uRL20 = response11.url();
        java.lang.String str21 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str24 = response22.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = response22.hasHeader("");
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
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test25181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25182");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        java.net.URL uRL9 = response0.url();
        java.lang.String str11 = response0.header("");
        java.util.Map map12 = response0.cookies();
        java.util.Map map13 = response0.cookies();
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25183");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.charset();
        int int9 = response7.statusCode();
        java.util.Map.Entry entry11 = response7.scanHeaders("hi!");
        java.lang.String str12 = response7.statusMessage();
        java.util.Map map13 = response7.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test25184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25184");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("");
        org.jsoup.Connection.Method method11 = response0.method();
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        java.util.Map map16 = response0.cookies();
        java.lang.String str18 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test25185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25185");
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
        org.jsoup.Connection.Response response21 = response15.removeHeader("hi!");
        java.lang.String str23 = response15.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response25 = response15.removeCookie("");
        boolean boolean27 = response15.hasCookie("hi!");
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test25186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25186");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.headers();
        java.lang.String str13 = response0.statusMessage();
        java.util.Map map14 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25187");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.cookie("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL6 = response5.url();
        java.lang.String str7 = response5.statusMessage();
        boolean boolean9 = response5.hasCookie("hi!");
        java.lang.String str11 = response5.header("hi!");
        int int12 = response5.statusCode();
        boolean boolean14 = response5.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str19 = response16.header("hi!");
        org.jsoup.Connection.Response response21 = response16.removeHeader("hi!");
        org.jsoup.Connection.Method method22 = response16.method();
        java.util.Map map23 = response16.headers();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str25 = response24.contentType();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        org.jsoup.Connection.Method method28 = response26.method();
        org.jsoup.Connection.Response response31 = response26.header("hi!", "");
        java.util.Map map32 = response26.headers();
        org.jsoup.Connection.Response response34 = response26.removeCookie("");
        java.util.Map map35 = response26.cookies();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str40 = response1.cookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test25188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25188");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response12.cookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25189");
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
        java.util.Map map18 = response0.headers();
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
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test25190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.util.Map map11 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method14 = response12.method();
        java.util.Map map15 = response12.headers();
        org.jsoup.Connection.Response response17 = response12.removeHeader("hi!");
        java.lang.String str18 = response12.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean21 = response19.hasCookie("hi!");
        java.util.Map map22 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test25191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25191");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map map4 = response0.headers();
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test25192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25192");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map map10 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        java.util.Map map17 = response11.headers();
        org.jsoup.Connection.Response response19 = response11.removeHeader("hi!");
        java.util.Map.Entry entry21 = response11.scanHeaders("hi!");
        java.net.URL uRL22 = response11.url();
        org.jsoup.Connection.Method method23 = response11.method();
        org.jsoup.Connection.Response response25 = response11.removeCookie("hi!");
        boolean boolean27 = response11.hasCookie("hi!");
        java.util.Map map28 = response11.headers();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Response response32 = response6.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test25193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25193");
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
        int int20 = response8.statusCode();
        java.lang.String str21 = response8.charset();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test25194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25194");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.Connection.Response response14 = response0.removeHeader("hi!");
        java.lang.String str15 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25195");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map map6 = response1.headers();
        boolean boolean8 = response1.hasCookie("hi!");
        int int9 = response1.statusCode();
        int int10 = response1.statusCode();
        java.util.Map.Entry entry12 = response1.scanHeaders("hi!");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test25196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25196");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        boolean boolean7 = response1.hasCookie("");
        java.lang.String str9 = response1.header("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test25197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str12 = response0.charset();
        boolean boolean14 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test25198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25198");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        org.jsoup.Connection.Method method21 = response19.method();
        org.jsoup.Connection.Response response24 = response19.header("hi!", "");
        java.lang.String str25 = response19.charset();
        java.util.Map map26 = response19.cookies();
        boolean boolean28 = response19.hasHeader("hi!");
        boolean boolean30 = response19.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response31);
        java.lang.String str34 = response32.header("hi!");
        org.jsoup.Connection.Response response36 = response32.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL39 = response38.url();
        java.lang.String str40 = response38.statusMessage();
        java.util.Map map41 = response38.cookies();
        java.lang.String str43 = response38.header("hi!");
        java.lang.String str45 = response38.getHeaderCaseInsensitive("hi!");
        java.lang.String str46 = response38.charset();
        java.lang.String str47 = response38.charset();
        boolean boolean49 = response38.hasHeader("hi!");
        java.util.Map map50 = response38.headers();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.util.Map map52 = response32.headers();
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response56 = response53.cookie("hi!", "hi!");
        int int57 = response53.statusCode();
        java.lang.String str59 = response53.cookie("");
        java.util.Map map60 = response53.headers();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        boolean boolean65 = response15.hasCookie("hi!");
        java.net.URL uRL66 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response67 = response15.url(uRL66);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(response56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test25199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25199");
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
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str54 = response52.cookie("");
        java.lang.String str55 = response52.contentType();
        java.lang.String str57 = response52.getHeaderCaseInsensitive("hi!");
        java.lang.String str58 = response52.contentType();
        java.lang.String str59 = response52.statusMessage();
        java.util.Map map60 = response52.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map60);
        int int62 = response13.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response64 = response13.removeHeader("");
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
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test25200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25200");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("hi!");
        java.util.Map map11 = response8.headers();
        org.jsoup.Connection.Response response13 = response8.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25201");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.contentType();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test25202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25202");
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
        boolean boolean22 = response14.hasCookie("hi!");
        java.lang.String str24 = response14.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL25 = response14.url();
        java.util.Map map26 = response14.headers();
        int int27 = response14.statusCode();
        java.lang.String str29 = response14.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test25203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25203");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        org.jsoup.Connection.Response response10 = response6.header("hi!", "hi!");
        org.jsoup.Connection.Response response13 = response6.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25204");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response7.cookie("");
        java.lang.String str14 = response7.contentType();
        org.jsoup.Connection.Response response17 = response7.header("hi!", "hi!");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response7.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test25205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25205");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.cookies();
        java.lang.String str8 = response6.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25206");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        boolean boolean9 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        int int12 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test25207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25207");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.util.Map map8 = response6.cookies();
        java.net.URL uRL9 = response6.url();
        java.lang.String str11 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response6.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response6.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25208");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response7.cookie("hi!", "hi!");
        int int11 = response7.statusCode();
        java.util.Map map12 = response7.cookies();
        java.lang.String str14 = response7.header("hi!");
        java.net.URL uRL15 = response7.url();
        java.lang.String str16 = response7.statusMessage();
        org.jsoup.Connection.Response response18 = response7.removeHeader("hi!");
        java.util.Map map19 = response7.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str21 = response0.statusMessage();
        java.lang.String str22 = response0.charset();
        java.lang.String str24 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str26 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test25209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25209");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "hi!");
        int int14 = response0.statusCode();
        java.lang.String str16 = response0.header("");
        java.lang.String str17 = response0.statusMessage();
        java.lang.String str19 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25210");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.lang.String str10 = response1.cookie("");
        java.util.Map map11 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("hi!");
        boolean boolean18 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test25211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25211");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        java.lang.String str15 = response0.cookie("");
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test25212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25212");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("");
        java.lang.String str7 = response1.statusMessage();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.contentType();
        java.util.Map.Entry entry14 = response1.scanHeaders("");
        java.lang.String str15 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25213");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Response response13 = response0.header("hi!", "hi!");
        java.util.Map map14 = response0.headers();
        java.lang.String str16 = response0.header("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25214");
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
        java.util.Map.Entry entry26 = response1.scanHeaders("");
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
        org.junit.Assert.assertNull(entry26);
    }

    @Test
    public void test25215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25215");
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
        boolean boolean21 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        java.lang.String str25 = response22.contentType();
        org.jsoup.Connection.Response response27 = response22.removeHeader("hi!");
        boolean boolean29 = response22.hasHeader("hi!");
        boolean boolean31 = response22.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Method method34 = response32.method();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response32);
        java.lang.String str37 = response32.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry39 = response32.scanHeaders("");
        java.util.Map map40 = response32.cookies();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.util.Map map43 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(entry39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test25216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25216");
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
        java.util.Map map22 = response0.headers();
        java.net.URL uRL23 = response0.url();
        org.jsoup.Connection.Method method24 = response0.method();
        boolean boolean26 = response0.hasCookie("");
        org.jsoup.Connection.Response response29 = response0.header("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test25217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25217");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.lang.String str12 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25218");
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
        java.lang.String str14 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean17 = response13.hasCookie("");
        java.lang.Class<?> wildcardClass18 = response13.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25219");
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
        java.util.Map map16 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("");
        java.util.Map.Entry entry14 = response1.scanHeaders("");
        java.lang.String str16 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25221");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test25222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25222");
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
        java.lang.String str12 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25223");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response15 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25224");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        java.lang.String str10 = response0.charset();
        java.lang.String str12 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25225");
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
        org.jsoup.Connection.Response response56 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray57 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response56);
    }

    @Test
    public void test25226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25226");
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
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test25227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25227");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.cookie("hi!");
        org.jsoup.Connection.Method method14 = response0.method();
        java.util.Map map15 = response0.cookies();
        java.util.Map.Entry entry17 = response0.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test25228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25228");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
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
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25229");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("");
        java.lang.String str13 = response1.contentType();
        java.net.URL uRL14 = response1.url();
        java.util.Map map15 = response1.cookies();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test25230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25230");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.contentType();
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test25231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25231");
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
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response28 = response0.removeCookie("");
        java.util.Map map29 = response0.cookies();
        java.lang.String str30 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test25232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.headers();
        java.util.Map map4 = response1.cookies();
        java.util.Map map5 = response1.cookies();
        java.lang.Class<?> wildcardClass6 = response1.getClass();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test25233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25233");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test25234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25234");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str10 = response0.cookie("hi!");
        java.util.Map.Entry entry12 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("");
        java.lang.String str16 = response13.statusMessage();
        java.lang.String str18 = response13.cookie("");
        java.net.URL uRL19 = response13.url();
        java.lang.String str21 = response13.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method22 = response13.method();
        org.jsoup.Connection.Response response25 = response13.cookie("hi!", "");
        java.lang.String str26 = response13.charset();
        java.lang.String str27 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        java.lang.String str31 = response28.header("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str35 = response32.header("hi!");
        java.util.Map map36 = response32.cookies();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        int int38 = response28.statusCode();
        java.lang.String str39 = response28.charset();
        java.util.Map map40 = response28.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.net.URL uRL43 = response0.url();
        java.lang.String str44 = response0.contentType();
        java.lang.String str45 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test25235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25235");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.util.Map map3 = response0.cookies();
        java.util.Map map4 = response0.cookies();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test25236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25236");
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
        boolean boolean17 = response1.hasCookie("");
        java.net.URL uRL18 = response1.url();
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Response response21 = response1.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test25237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25237");
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
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.header("", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25238");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response15.contentType();
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response15.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25240");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response4.statusMessage();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test25241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25241");
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
        java.lang.String str41 = response0.getHeaderCaseInsensitive("");
        boolean boolean43 = response0.hasCookie("hi!");
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
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test25242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        java.lang.String str10 = response0.statusMessage();
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean14 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test25243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25243");
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
        java.util.Map.Entry entry17 = response0.scanHeaders("");
        org.jsoup.Connection.Response response20 = response0.cookie("hi!", "hi!");
        java.lang.String str21 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test25244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25244");
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
        java.util.Map map19 = response0.headers();
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
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test25245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25245");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map10 = response0.cookies();
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test25246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25246");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str9 = response0.cookie("hi!");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        java.lang.String str13 = response0.cookie("");
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str20 = response17.header("hi!");
        org.jsoup.Connection.Response response22 = response17.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL24 = response23.url();
        java.lang.String str25 = response23.statusMessage();
        java.util.Map map26 = response23.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test25247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25247");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.lang.String str11 = response0.charset();
        java.net.URL uRL12 = response0.url();
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean18 = response16.hasHeader("hi!");
        java.lang.String str20 = response16.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test25248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25248");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeCookie("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
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
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map44 = response43.cookies();
        org.jsoup.Connection.Method method45 = response43.method();
        java.util.Map map46 = response43.cookies();
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL48 = response47.url();
        java.lang.String str50 = response47.header("hi!");
        org.jsoup.Connection.Response response52 = response47.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response53 = new org.jsoup.helper.HttpConnection.Response(response47);
        int int54 = response53.statusCode();
        java.util.Map map55 = response53.cookies();
        response43.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map55);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
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
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(uRL48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test25249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25249");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test25250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25250");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.header("hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test25251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25251");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        java.lang.String str14 = response0.header("hi!");
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test25252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25252");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response6.statusCode();
        java.util.Map map8 = response6.cookies();
        java.net.URL uRL9 = response6.url();
        int int10 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response6.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test25253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25253");
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
        boolean boolean18 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response20 = response0.removeCookie("hi!");
        boolean boolean22 = response0.hasHeader("hi!");
        java.util.Map map23 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(entry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test25254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        java.util.Map map8 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response9.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test25255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25255");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.lang.String str12 = response0.contentType();
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str15 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test25256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25256");
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
        java.net.URL uRL17 = response0.url();
        java.util.Map map18 = response0.cookies();
        boolean boolean20 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response0.hasHeader("");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test25257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25257");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.Connection.Response response17 = response0.cookie("hi!", "hi!");
        java.lang.String str18 = response0.statusMessage();
        org.jsoup.Connection.Response response20 = response0.removeHeader("hi!");
        java.lang.Class<?> wildcardClass21 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test25258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.statusMessage();
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test25259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25259");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Method method7 = response0.method();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25260");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeCookie("");
        java.util.Map map6 = response0.headers();
        java.net.URL uRL7 = response0.url();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test25261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25261");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test25262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25262");
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
            java.lang.String str36 = response35.body();
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
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test25263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25263");
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
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Method method18 = response0.method();
        java.util.Map map19 = response0.headers();
        int int20 = response0.statusCode();
        org.jsoup.Connection.Response response23 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test25264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25264");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test25265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25265");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25266");
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
        java.lang.String str16 = response14.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25267");
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
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str40 = response38.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test25268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25268");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25269");
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
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25270");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        boolean boolean5 = response2.hasCookie("hi!");
        java.lang.String str6 = response2.contentType();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response9 = response7.removeCookie("hi!");
        java.lang.String str11 = response7.header("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25271");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map map8 = response1.cookies();
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str12 = response1.cookie("");
        boolean boolean14 = response1.hasCookie("");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test25272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25272");
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
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response37 = response34.header("hi!", "hi!");
        org.jsoup.Connection.Method method38 = response34.method();
        org.jsoup.Connection.Response response40 = response34.removeHeader("hi!");
        java.util.Map map41 = response34.headers();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL43 = response42.url();
        java.lang.String str44 = response42.statusMessage();
        java.util.Map map45 = response42.cookies();
        java.lang.String str47 = response42.header("");
        java.lang.String str49 = response42.header("hi!");
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response42);
        java.lang.String str52 = response50.getHeaderCaseInsensitive("hi!");
        java.util.Map map53 = response50.cookies();
        response34.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        java.util.Map map56 = response0.headers();
        java.util.Map map57 = response0.cookies();
        java.util.Map map58 = response0.cookies();
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
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(uRL43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
    }

    @Test
    public void test25273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25273");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test25274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25274");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response6 = response0.removeCookie("");
        java.lang.String str8 = response0.header("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25275");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25276");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.cookie("");
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25277");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test25278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25278");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
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
    }

    @Test
    public void test25279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25279");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.Connection.Response response5 = response1.removeCookie("");
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response10 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test25280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25280");
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
        boolean boolean22 = response14.hasCookie("hi!");
        java.lang.String str24 = response14.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL25 = response14.url();
        java.util.Map map26 = response14.headers();
        int int27 = response14.statusCode();
        java.util.Map map28 = response14.headers();
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test25281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25281");
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
        java.net.URL uRL13 = response6.url();
        boolean boolean15 = response6.hasHeader("hi!");
        org.jsoup.Connection.Method method16 = response6.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        org.jsoup.Connection.Method method19 = response17.method();
        org.jsoup.Connection.Response response22 = response17.header("hi!", "");
        org.jsoup.Connection.Response response24 = response17.removeHeader("hi!");
        java.lang.String str26 = response17.header("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map29 = response28.headers();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.lang.String str31 = response6.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test25282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25282");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test25283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25283");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map.Entry entry12 = response0.scanHeaders("hi!");
        int int13 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test25284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25284");
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
        org.jsoup.Connection.Response response17 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response0.parse();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test25285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25285");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        java.util.Map map15 = response12.cookies();
        java.lang.String str17 = response12.header("hi!");
        java.lang.String str19 = response12.getHeaderCaseInsensitive("hi!");
        java.lang.String str20 = response12.contentType();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("");
        java.lang.String str24 = response21.contentType();
        java.lang.String str26 = response21.header("hi!");
        java.util.Map map27 = response21.cookies();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        java.lang.String str32 = response28.cookie("hi!");
        boolean boolean34 = response28.hasCookie("hi!");
        org.jsoup.Connection.Response response37 = response28.cookie("hi!", "");
        boolean boolean39 = response28.hasHeader("hi!");
        java.lang.String str40 = response28.statusMessage();
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.lang.String str42 = response28.statusMessage();
        java.util.Map map43 = response28.headers();
        java.util.Map map44 = response28.cookies();
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL46 = response45.url();
        java.lang.String str47 = response45.statusMessage();
        int int48 = response45.statusCode();
        org.jsoup.Connection.Response response51 = response45.header("hi!", "hi!");
        java.util.Map map52 = response45.cookies();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(uRL46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(response51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test25286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25286");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str7 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response0.bodyAsBytes();
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
    public void test25287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25287");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test25288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25288");
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
        boolean boolean20 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry23 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response25 = response0.removeHeader("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(entry23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test25289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25289");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Method method10 = response6.method();
        java.lang.String str12 = response6.header("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map.Entry entry15 = response13.scanHeaders("hi!");
        org.jsoup.Connection.Method method16 = response13.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method18 = response13.method();
        java.util.Map map19 = response13.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test25290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.cookie("");
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
        org.junit.Assert.assertNotNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25291");
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
        java.lang.String str25 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.util.Map map28 = response27.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test25292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25292");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method6 = response4.method();
        java.lang.String str7 = response4.charset();
        java.net.URL uRL8 = response4.url();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test25293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25293");
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
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        java.net.URL uRL23 = response1.url();
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
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test25294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25294");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test25295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25295");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.contentType();
        java.lang.String str16 = response11.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response11.contentType();
        java.util.Map map18 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test25296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25296");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test25297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25297");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str10 = response0.charset();
        java.util.Map map11 = response0.cookies();
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str14 = response0.header("");
        org.jsoup.Connection.Response response17 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test25298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25298");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25299");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.lang.String str10 = response0.header("hi!");
        java.lang.String str12 = response0.header("hi!");
        java.lang.String str14 = response0.cookie("hi!");
        java.util.Map map15 = response0.cookies();
        java.lang.String str17 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test25300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25300");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.header("");
        java.util.Map map12 = response0.headers();
        java.lang.String str14 = response0.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test25301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25301");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.contentType();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        boolean boolean13 = response0.hasCookie("hi!");
        boolean boolean15 = response0.hasCookie("");
        java.util.Map map16 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25302");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.header("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test25303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25303");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map.Entry entry6 = response3.scanHeaders("");
        java.lang.String str7 = response3.statusMessage();
        java.lang.String str8 = response3.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25304");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response14.statusMessage();
        java.net.URL uRL16 = response14.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test25305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25305");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        java.lang.String str16 = response0.statusMessage();
        org.jsoup.Connection.Response response18 = response0.removeCookie("");
        int int19 = response0.statusCode();
        org.jsoup.Connection.Method method20 = response0.method();
        java.util.Map map21 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test25306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25306");
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
        boolean boolean50 = response0.hasCookie("hi!");
        java.net.URL uRL51 = response0.url();
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(uRL51);
    }

    @Test
    public void test25307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25307");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str4 = response0.contentType();
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.net.URL uRL11 = response9.url();
        java.net.URL uRL12 = response9.url();
        java.net.URL uRL13 = response9.url();
        java.lang.String str15 = response9.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method16 = response9.method();
        java.util.Map map17 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.removeHeader("");
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
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test25308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25308");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasCookie("");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        org.jsoup.Connection.Response response19 = response14.header("hi!", "");
        java.util.Map map20 = response14.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean23 = response14.hasCookie("");
        java.lang.String str24 = response14.contentType();
        org.jsoup.Connection.Method method25 = response14.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        org.jsoup.Connection.Method method28 = response26.method();
        org.jsoup.Connection.Response response31 = response26.header("hi!", "");
        java.lang.String str33 = response26.getHeaderCaseInsensitive("");
        java.lang.String str34 = response26.statusMessage();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL36 = response35.url();
        java.lang.String str38 = response35.header("hi!");
        org.jsoup.Connection.Response response40 = response35.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response35);
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response41);
        java.lang.String str44 = response42.getHeaderCaseInsensitive("hi!");
        java.util.Map map45 = response42.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        java.lang.String str48 = response14.charset();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test25309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25309");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map.Entry entry5 = response0.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(entry5);
    }

    @Test
    public void test25310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25310");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        java.lang.String str13 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "hi!");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25311");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.contentType();
        boolean boolean14 = response11.hasCookie("");
        org.jsoup.Connection.Method method15 = response11.method();
        boolean boolean17 = response11.hasCookie("hi!");
        org.jsoup.Connection.Response response19 = response11.removeCookie("hi!");
        java.net.URL uRL20 = response11.url();
        java.lang.String str21 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str24 = response22.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test25312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25312");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str5 = response1.cookie("hi!");
        boolean boolean7 = response1.hasCookie("hi!");
        int int8 = response1.statusCode();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test25313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25313");
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
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        java.util.Map map51 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map53 = response52.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = response52.hasHeader("");
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
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test25314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25314");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        boolean boolean15 = response0.hasCookie("hi!");
        java.lang.String str17 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test25315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25315");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        java.util.Map map8 = response3.cookies();
        java.lang.String str9 = response3.statusMessage();
        org.jsoup.Connection.Response response11 = response3.removeCookie("hi!");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response3.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test25316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25316");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.statusMessage();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry13 = response11.scanHeaders("");
        java.lang.String str15 = response11.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25317");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.lang.String str10 = response7.header("hi!");
        org.jsoup.Connection.Response response12 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str14 = response7.contentType();
        java.util.Map map15 = response7.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        int int17 = response0.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test25318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25318");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.contentType();
        java.net.URL uRL10 = response0.url();
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25319");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.lang.String str9 = response0.header("hi!");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test25320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test25321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25321");
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
        java.util.Map map17 = response0.cookies();
        java.lang.Class<?> wildcardClass18 = map17.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test25322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25322");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("");
        java.lang.String str11 = response0.header("");
        java.lang.String str12 = response0.statusMessage();
        java.net.URL uRL13 = response0.url();
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test25323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25323");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response5.removeCookie("");
        java.lang.String str9 = response5.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry11 = response5.scanHeaders("");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response5.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test25324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25324");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25325");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25326");
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
        java.util.Map map17 = response15.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response15.body();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test25327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25327");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.header("");
        java.util.Map map15 = response0.headers();
        java.lang.String str16 = response0.contentType();
        java.lang.String str18 = response0.header("hi!");
        java.lang.String str19 = response0.charset();
        java.lang.Class<?> wildcardClass20 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test25328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25328");
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
        java.lang.String str42 = response0.contentType();
        org.jsoup.Connection.Method method43 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document44 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(method43);
    }

    @Test
    public void test25329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25329");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str8 = response0.header("");
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test25330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25330");
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
        java.lang.String str24 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test25331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25331");
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
        java.lang.String str15 = response0.contentType();
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25332");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
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
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map29 = response28.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map32 = response31.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response35);
        org.jsoup.Connection.Method method37 = response35.method();
        java.util.Map map38 = response35.headers();
        boolean boolean40 = response35.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response35);
        java.net.URL uRL42 = response35.url();
        java.util.Map map43 = response35.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        org.jsoup.Connection.Response response46 = response7.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document47 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
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
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(response46);
    }

    @Test
    public void test25333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25333");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test25334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25334");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.cookie("");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = response11.method();
        org.jsoup.Connection.Method method14 = response11.method();
        java.util.Map.Entry entry16 = response11.scanHeaders("");
        java.lang.String str18 = response11.cookie("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str21 = response19.charset();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.net.URL uRL24 = response23.url();
        java.lang.String str25 = response23.charset();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.lang.String str27 = response26.statusMessage();
        java.lang.String str29 = response26.header("");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL32 = response31.url();
        org.jsoup.Connection.Method method33 = response31.method();
        java.lang.String str35 = response31.cookie("hi!");
        boolean boolean37 = response31.hasCookie("hi!");
        org.jsoup.Connection.Response response40 = response31.cookie("hi!", "");
        boolean boolean42 = response31.hasHeader("hi!");
        java.lang.String str43 = response31.statusMessage();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response(response31);
        java.lang.String str45 = response31.statusMessage();
        java.util.Map map46 = response31.headers();
        java.lang.String str47 = response31.statusMessage();
        java.util.Map map48 = response31.cookies();
        java.lang.String str49 = response31.charset();
        java.util.Map map50 = response31.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        java.lang.String str54 = response0.contentType();
        java.util.Map map55 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test25336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25336");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25337");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("");
        boolean boolean12 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.util.Map.Entry entry16 = response0.scanHeaders("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test25338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25338");
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
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response17.header("hi!", "hi!");
        boolean boolean22 = response17.hasCookie("hi!");
        java.lang.String str24 = response17.header("");
        java.lang.String str26 = response17.header("");
        int int27 = response17.statusCode();
        boolean boolean29 = response17.hasHeader("hi!");
        java.lang.String str31 = response17.getHeaderCaseInsensitive("hi!");
        java.util.Map map32 = response17.headers();
        java.util.Map map33 = response17.headers();
        org.jsoup.Connection.Response response35 = response17.removeHeader("hi!");
        org.jsoup.Connection.Response response37 = response17.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, response37);
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(response37);
    }

    @Test
    public void test25339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25339");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test25340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25340");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str8 = response1.header("");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.cookie("");
        java.util.Map map12 = response1.headers();
        java.net.URL uRL13 = response1.url();
        boolean boolean15 = response1.hasCookie("");
        java.util.Map map16 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25341");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response9.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test25342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25342");
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
        boolean boolean16 = response13.hasHeader("hi!");
        java.lang.String str18 = response13.header("hi!");
        java.lang.String str20 = response13.header("");
        org.jsoup.Connection.Method method21 = response13.method();
        java.util.Map map22 = response13.headers();
        int int23 = response13.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test25343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25343");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        java.util.Map map12 = response0.cookies();
        java.lang.String str14 = response0.cookie("hi!");
        org.jsoup.Connection.Response response17 = response0.cookie("hi!", "hi!");
        java.lang.String str19 = response0.header("hi!");
        org.jsoup.Connection.Response response21 = response0.removeCookie("hi!");
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test25344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25345");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.util.Map map11 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test25347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25347");
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
        org.jsoup.Connection.Response response17 = response14.cookie("hi!", "");
        java.lang.String str19 = response14.header("");
        org.jsoup.Connection.Response response21 = response14.removeHeader("hi!");
        java.lang.String str23 = response14.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test25348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25348");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        org.jsoup.Connection.Response response10 = response6.header("hi!", "hi!");
        org.jsoup.Connection.Response response12 = response6.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str14 = response6.contentType();
        java.util.Map map15 = response6.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test25349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25349");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.statusMessage();
        java.util.Map map12 = response9.cookies();
        org.jsoup.Connection.Response response14 = response9.removeHeader("hi!");
        java.net.URL uRL15 = response9.url();
        boolean boolean17 = response9.hasCookie("");
        java.util.Map map18 = response9.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response23 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test25350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25350");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response15 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        java.lang.String str19 = response0.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25351");
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
        boolean boolean27 = response15.hasHeader("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test25352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25352");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str17 = response16.contentType();
        org.jsoup.Connection.Method method18 = response16.method();
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
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test25353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25353");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.statusMessage();
        int int12 = response9.statusCode();
        org.jsoup.Connection.Response response15 = response9.header("hi!", "hi!");
        java.net.URL uRL16 = response9.url();
        boolean boolean18 = response9.hasCookie("hi!");
        java.util.Map map19 = response9.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test25354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25354");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.net.URL uRL12 = response10.url();
        java.net.URL uRL13 = response10.url();
        java.net.URL uRL14 = response10.url();
        org.jsoup.Connection.Method method15 = response10.method();
        boolean boolean17 = response10.hasHeader("hi!");
        java.lang.String str18 = response10.charset();
        java.util.Map map19 = response10.cookies();
        java.util.Map map20 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        int int22 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.Connection.Response response24 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection23, response24);
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test25355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25355");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        java.lang.String str12 = response0.charset();
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test25356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25356");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.charset();
        java.util.Map map11 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        org.jsoup.Connection.Method method14 = response12.method();
        java.lang.String str16 = response12.cookie("hi!");
        boolean boolean18 = response12.hasCookie("hi!");
        int int19 = response12.statusCode();
        java.lang.String str20 = response12.charset();
        int int21 = response12.statusCode();
        java.lang.String str23 = response12.cookie("");
        org.jsoup.Connection.Response response26 = response12.header("hi!", "");
        java.util.Map map27 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test25357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25357");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.cookie("hi!");
        org.jsoup.Connection.Response response12 = response8.removeCookie("hi!");
        boolean boolean14 = response8.hasCookie("");
        boolean boolean16 = response8.hasCookie("hi!");
        java.lang.String str18 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str19 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response20.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25358");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.charset();
        java.util.Map map8 = response0.headers();
        int int9 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test25359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25359");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.URL uRL16 = response15.url();
        java.lang.String str17 = response15.charset();
        java.net.URL uRL18 = response15.url();
        org.jsoup.Connection.Response response21 = response15.header("hi!", "");
        java.lang.String str23 = response15.cookie("");
        int int24 = response15.statusCode();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("");
        java.lang.String str28 = response25.contentType();
        java.lang.String str30 = response25.header("hi!");
        boolean boolean32 = response25.hasCookie("hi!");
        java.lang.String str34 = response25.getHeaderCaseInsensitive("");
        java.lang.String str35 = response25.statusMessage();
        java.lang.String str37 = response25.header("");
        java.util.Map map38 = response25.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        java.lang.String str40 = response15.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test25360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25360");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        boolean boolean5 = response0.hasCookie("hi!");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method10 = response9.method();
        org.jsoup.Connection.Method method11 = response9.method();
        java.lang.String str13 = response9.header("");
        org.jsoup.Connection.Method method14 = response9.method();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.statusMessage();
        int int19 = response16.statusCode();
        org.jsoup.Connection.Response response22 = response16.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean25 = response16.hasCookie("");
        org.jsoup.Connection.Response response28 = response16.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test25361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25361");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
    }

    @Test
    public void test25362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25362");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("");
        boolean boolean7 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method12 = response10.method();
        java.util.Map map13 = response10.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        java.net.URL uRL15 = response9.url();
        java.util.Map map16 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25363");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str18 = response16.cookie("");
        org.jsoup.Connection.Response response20 = response16.removeHeader("hi!");
        int int21 = response16.statusCode();
        boolean boolean23 = response16.hasHeader("hi!");
        java.lang.String str24 = response16.statusMessage();
        java.lang.String str25 = response16.statusMessage();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response16);
        int int27 = response26.statusCode();
        boolean boolean29 = response26.hasCookie("hi!");
        java.util.Map map30 = response26.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str32 = response0.charset();
        org.jsoup.Connection.Method method33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response0.method(method33);
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test25364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25364");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response2.header("hi!");
        org.jsoup.Connection.Response response6 = response2.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.lang.String str10 = response8.statusMessage();
        java.util.Map map11 = response8.cookies();
        java.lang.String str13 = response8.header("hi!");
        java.lang.String str15 = response8.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response8.charset();
        java.lang.String str17 = response8.charset();
        boolean boolean19 = response8.hasHeader("hi!");
        java.util.Map map20 = response8.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test25365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25365");
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
        java.lang.String str22 = response1.contentType();
        java.util.Map.Entry entry24 = response1.scanHeaders("");
        java.lang.String str26 = response1.header("hi!");
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
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test25366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25366");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map11 = response10.headers();
        java.lang.String str13 = response10.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25367");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Method method11 = response0.method();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.header("hi!");
        org.jsoup.Connection.Response response20 = response15.removeHeader("hi!");
        java.lang.String str21 = response15.contentType();
        org.jsoup.Connection.Response response23 = response15.removeCookie("");
        java.util.Map map24 = response15.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map27 = response0.cookies();
        java.lang.String str28 = response0.statusMessage();
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response0.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test25368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25368");
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
        java.util.Map map14 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25369");
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
        org.jsoup.Connection.Method method15 = response0.method();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.net.URL uRL19 = response18.url();
        java.lang.String str20 = response18.charset();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str22 = response21.statusMessage();
        java.lang.String str23 = response21.contentType();
        java.lang.String str25 = response21.header("");
        java.lang.String str26 = response21.charset();
        boolean boolean28 = response21.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response21);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test25370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25370");
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
        int int20 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test25371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25371");
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
        java.util.Map map24 = response0.cookies();
        java.lang.String str25 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean28 = response26.hasHeader("hi!");
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
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test25372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25372");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.header("hi!");
        int int13 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test25373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25373");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response0.cookies();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test25374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25374");
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
        org.jsoup.Connection.Response response52 = response49.cookie("hi!", "");
        boolean boolean54 = response49.hasCookie("hi!");
        java.net.URL uRL55 = response49.url();
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
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(uRL55);
    }

    @Test
    public void test25375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25375");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test25376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25376");
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
        boolean boolean18 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Method method21 = response19.method();
        org.jsoup.Connection.Method method22 = response19.method();
        java.util.Map.Entry entry24 = response19.scanHeaders("");
        java.lang.String str26 = response19.cookie("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str29 = response19.header("");
        java.lang.String str30 = response19.statusMessage();
        java.util.Map map31 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test25377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25377");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        org.jsoup.Connection.Method method17 = response15.method();
        java.lang.String str19 = response15.cookie("hi!");
        boolean boolean21 = response15.hasCookie("hi!");
        org.jsoup.Connection.Response response24 = response15.cookie("hi!", "");
        boolean boolean26 = response15.hasHeader("hi!");
        java.lang.String str27 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str29 = response28.statusMessage();
        org.jsoup.Connection.Response response32 = response28.header("hi!", "hi!");
        java.util.Map.Entry entry34 = response28.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response28);
        org.jsoup.Connection.Response response37 = response28.removeCookie("");
        java.util.Map map38 = response28.headers();
        java.util.Map map39 = response28.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.lang.String str42 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(entry34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test25378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25378");
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
        org.jsoup.Connection.Method method18 = response0.method();
        org.jsoup.Connection.Method method19 = response0.method();
        org.jsoup.Connection.Response response22 = response0.header("hi!", "hi!");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response0.url(uRL23);
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
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test25379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25379");
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
        org.jsoup.Connection.Response response15 = response0.header("hi!", "hi!");
        java.lang.String str17 = response0.cookie("hi!");
        org.jsoup.Connection.Response response19 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response21 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test25380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25380");
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
        java.lang.String str18 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response22 = response0.header("hi!", "");
        java.lang.String str24 = response0.cookie("");
        org.jsoup.Connection.Response response26 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test25381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.header("hi!");
        java.lang.String str10 = response6.statusMessage();
        java.lang.String str12 = response6.header("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25382");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        java.lang.String str13 = response0.header("");
        boolean boolean15 = response0.hasCookie("");
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test25383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25383");
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
        org.jsoup.Connection.Response response17 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test25384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25384");
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
        boolean boolean22 = response0.hasHeader("hi!");
        java.lang.String str24 = response0.header("");
        java.lang.String str26 = response0.getHeaderCaseInsensitive("hi!");
        int int27 = response0.statusCode();
        boolean boolean29 = response0.hasCookie("");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test25385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("");
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map14 = response13.cookies();
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
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str33 = response31.cookie("hi!");
        java.lang.String str35 = response31.header("");
        boolean boolean37 = response31.hasCookie("hi!");
        java.lang.String str38 = response31.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test25386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25386");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("hi!");
        java.lang.String str11 = response7.cookie("hi!");
        java.lang.String str12 = response7.contentType();
        org.jsoup.Connection.Response response15 = response7.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25387");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str9 = response7.cookie("");
        java.net.URL uRL10 = response7.url();
        org.jsoup.Connection.Method method11 = response7.method();
        java.lang.String str12 = response7.statusMessage();
        org.jsoup.Connection.Response response14 = response7.removeCookie("");
        java.util.Map map15 = response7.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        java.util.Map.Entry entry18 = response0.scanHeaders("hi!");
        java.net.URL uRL19 = response0.url();
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(entry18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test25388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25388");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map map9 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response10.statusMessage();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response10.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25389");
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
        org.jsoup.Connection.Method method29 = response28.method();
        org.jsoup.Connection.Response response32 = response28.header("hi!", "");
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
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test25390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25390");
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
        boolean boolean25 = response14.hasCookie("hi!");
        java.util.Map map26 = response14.headers();
        java.lang.String str28 = response14.cookie("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test25391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25391");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25392");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.contentType();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25393");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean14 = response12.hasCookie("hi!");
        java.util.Map map15 = response12.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test25394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25394");
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
        boolean boolean18 = response0.hasHeader("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test25395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25395");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str4 = response0.contentType();
        int int5 = response0.statusCode();
        java.util.Map map6 = response0.cookies();
        java.lang.Class<?> wildcardClass7 = response0.getClass();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test25396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25396");
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
        java.lang.String str55 = response13.header("");
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
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test25397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25397");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        java.lang.String str6 = response3.getHeaderCaseInsensitive("");
        int int7 = response3.statusCode();
        java.lang.String str9 = response3.getHeaderCaseInsensitive("");
        java.net.URL uRL10 = response3.url();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test25398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25398");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        int int11 = response0.statusCode();
        java.lang.String str13 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25399");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        org.jsoup.Connection.Method method5 = response3.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str9 = response6.header("hi!");
        org.jsoup.Connection.Response response11 = response6.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int13 = response12.statusCode();
        java.util.Map map14 = response12.cookies();
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.util.Map map16 = response3.cookies();
        java.lang.String str17 = response3.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test25400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        int int13 = response0.statusCode();
        java.util.Map map14 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25401");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        java.util.Map map15 = response10.headers();
        java.util.Map map16 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry20 = response18.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str23 = response21.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test25402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25402");
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
        java.util.Map.Entry entry20 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method21 = response0.method();
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
        org.junit.Assert.assertNotNull(entry20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test25403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25403");
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
        java.lang.String str15 = response0.statusMessage();
        java.lang.String str17 = response0.header("");
        java.lang.String str18 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test25404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25404");
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
        java.lang.String str36 = response0.cookie("hi!");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test25405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean13 = response0.hasCookie("");
        java.util.Map.Entry entry15 = response0.scanHeaders("");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test25406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25406");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.cookie("");
        java.lang.String str8 = response0.header("hi!");
        java.util.Map map9 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test25407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25407");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.headers();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str8 = response1.header("hi!");
        java.util.Map map9 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        org.jsoup.Connection.Response response14 = response10.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL17 = response16.url();
        java.lang.String str18 = response16.charset();
        java.net.URL uRL19 = response16.url();
        java.util.Map map20 = response16.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        java.net.URL uRL23 = response1.url();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test25408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25408");
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
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test25409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25409");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        boolean boolean5 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str13 = response10.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        boolean boolean16 = response14.hasCookie("hi!");
        java.lang.String str18 = response14.header("");
        java.lang.String str19 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int21 = response20.statusCode();
        java.util.Map map22 = response20.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        org.jsoup.Connection.Response response26 = response0.cookie("hi!", "hi!");
        java.net.HttpURLConnection httpURLConnection27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        java.lang.String str30 = response28.statusMessage();
        int int31 = response28.statusCode();
        org.jsoup.Connection.Response response34 = response28.header("hi!", "hi!");
        java.net.URL uRL35 = response28.url();
        java.lang.String str37 = response28.header("hi!");
        java.lang.String str39 = response28.cookie("");
        org.jsoup.Connection.Response response41 = response28.removeHeader("hi!");
        java.lang.String str43 = response28.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str46 = response44.cookie("");
        org.jsoup.Connection.Method method47 = response44.method();
        java.lang.String str49 = response44.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str52 = response50.cookie("");
        java.lang.String str53 = response50.contentType();
        java.lang.String str55 = response50.header("hi!");
        boolean boolean57 = response50.hasCookie("hi!");
        java.lang.String str59 = response50.getHeaderCaseInsensitive("");
        java.lang.String str60 = response50.statusMessage();
        java.lang.String str62 = response50.header("");
        java.util.Map map63 = response50.cookies();
        response44.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
        java.util.Map map65 = response44.headers();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map65);
        org.jsoup.Connection.Response response68 = response28.removeCookie("");
        java.lang.String str69 = response28.statusMessage();
        java.lang.String str70 = response28.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection27, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(response68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str70);
    }

    @Test
    public void test25410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25410");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test25411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25411");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.header("", "");
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test25412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25412");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasCookie("hi!");
        int int4 = response1.statusCode();
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry10 = response8.scanHeaders("hi!");
        org.jsoup.Connection.Method method11 = response8.method();
        java.lang.String str13 = response8.header("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.lang.String str6 = response4.statusMessage();
        boolean boolean8 = response4.hasCookie("hi!");
        java.lang.String str10 = response4.header("hi!");
        java.util.Map map11 = response4.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.header("");
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25414");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasHeader("hi!");
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        java.lang.String str18 = response0.cookie("hi!");
        java.lang.String str20 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test25415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25415");
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
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Method method18 = response0.method();
        java.util.Map map19 = response0.headers();
        int int20 = response0.statusCode();
        java.lang.String str21 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test25416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25416");
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
        java.lang.String str15 = response0.header("");
        java.util.Map map16 = response0.headers();
        java.util.Map map17 = response0.cookies();
        org.jsoup.Connection.Method method18 = response0.method();
        boolean boolean20 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry23 = response0.scanHeaders("");
        org.jsoup.Connection.Response response25 = response0.removeCookie("");
        java.net.URL uRL26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response0.url(uRL26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test25417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25417");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean9 = response0.hasCookie("");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.contentType();
        int int12 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method15 = response13.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method17 = response16.method();
        boolean boolean19 = response16.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str22 = response20.cookie("");
        java.lang.String str23 = response20.contentType();
        java.lang.String str25 = response20.header("hi!");
        boolean boolean27 = response20.hasCookie("hi!");
        int int28 = response20.statusCode();
        java.util.Map map29 = response20.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.lang.String str33 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test25418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.lang.String str3 = response0.contentType();
        int int4 = response0.statusCode();
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.cookie("");
        java.util.Map map11 = response8.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test25419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25419");
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
        int int37 = response0.statusCode();
        boolean boolean39 = response0.hasHeader("hi!");
        java.util.Map.Entry entry41 = response0.scanHeaders("hi!");
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(entry41);
    }

    @Test
    public void test25420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25420");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response14 = response12.removeCookie("");
        int int15 = response12.statusCode();
        java.util.Map.Entry entry17 = response12.scanHeaders("hi!");
        java.lang.String str19 = response12.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test25421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25421");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry7 = response5.scanHeaders("");
        java.lang.String str9 = response5.getHeaderCaseInsensitive("");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response5.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test25422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25422");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        int int11 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.removeHeader("");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test25423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25423");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str12 = response10.cookie("");
        java.lang.String str13 = response10.statusMessage();
        java.lang.String str15 = response10.cookie("");
        java.net.URL uRL16 = response10.url();
        java.lang.String str18 = response10.getHeaderCaseInsensitive("");
        java.util.Map map19 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        org.jsoup.Connection.Response response22 = response0.removeCookie("hi!");
        java.lang.String str24 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str27 = response25.cookie("");
        java.lang.String str28 = response25.contentType();
        java.lang.String str30 = response25.header("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map32 = response31.headers();
        java.lang.String str34 = response31.header("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response31);
        java.util.Map map36 = response31.cookies();
        java.util.Map map37 = response31.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
    }

    @Test
    public void test25424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25424");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeCookie("");
        java.util.Map map14 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str16 = response0.contentType();
        java.util.Map map17 = response0.headers();
        boolean boolean19 = response0.hasHeader("hi!");
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test25425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25425");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.Connection.Response response5 = response1.removeCookie("");
        java.util.Map map6 = response1.cookies();
        java.lang.String str8 = response1.cookie("");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test25426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25426");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str19 = response17.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.util.Map.Entry entry24 = response17.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map26 = response25.cookies();
        java.util.Map map27 = response25.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        org.jsoup.Connection.Method method29 = response16.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(method29);
    }

    @Test
    public void test25427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25427");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str17 = response8.header("");
        java.util.Map.Entry entry19 = response8.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response8.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(entry19);
    }

    @Test
    public void test25428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25428");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.cookies();
        java.net.URL uRL10 = response0.url();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test25429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25429");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str15 = response13.cookie("hi!");
        java.lang.String str17 = response13.cookie("");
        java.util.Map map18 = response13.cookies();
        java.lang.String str19 = response13.statusMessage();
        java.lang.String str21 = response13.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test25430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25430");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str4 = response0.charset();
        boolean boolean6 = response0.hasCookie("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.lang.String str10 = response0.cookie("");
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.cookie("");
        java.net.URL uRL14 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test25431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25431");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response12.url(uRL15);
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
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test25432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25432");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str11 = response0.header("hi!");
        java.lang.String str13 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25433");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response6 = response0.header("hi!", "");
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test25434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25434");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("hi!");
        boolean boolean11 = response7.hasCookie("");
        java.lang.String str13 = response7.header("hi!");
        java.util.Map.Entry entry15 = response7.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test25435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25435");
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
        java.lang.Class<?> wildcardClass27 = response25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test25436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25436");
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
        java.lang.String str17 = response11.header("");
        java.lang.String str18 = response11.charset();
        java.lang.String str20 = response11.cookie("");
        java.lang.String str21 = response11.statusMessage();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        org.jsoup.Connection.Method method24 = response22.method();
        java.lang.String str26 = response22.cookie("hi!");
        boolean boolean28 = response22.hasCookie("hi!");
        int int29 = response22.statusCode();
        java.lang.String str30 = response22.charset();
        int int31 = response22.statusCode();
        java.util.Map.Entry entry33 = response22.scanHeaders("");
        java.lang.String str35 = response22.getHeaderCaseInsensitive("hi!");
        boolean boolean37 = response22.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL39 = response38.url();
        org.jsoup.Connection.Method method40 = response38.method();
        java.lang.String str42 = response38.cookie("hi!");
        boolean boolean44 = response38.hasCookie("hi!");
        org.jsoup.Connection.Response response47 = response38.cookie("hi!", "");
        java.lang.String str49 = response38.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response38);
        org.jsoup.Connection.Response response52 = response50.removeCookie("");
        int int53 = response50.statusCode();
        org.jsoup.Connection.Response response56 = response50.header("hi!", "");
        java.util.Map map57 = response50.cookies();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        java.util.Map map59 = response22.headers();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        java.lang.String str62 = response11.cookie("hi!");
        int int63 = response11.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(entry33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(response56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test25437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25437");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        int int5 = response1.statusCode();
        java.util.Map map6 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.charset();
        java.lang.String str12 = response1.cookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25438");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test25439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25439");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        boolean boolean13 = response0.hasCookie("");
        java.lang.String str15 = response0.header("hi!");
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        java.lang.String str18 = response0.charset();
        int int19 = response0.statusCode();
        java.util.Map map20 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test25440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25440");
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
        org.jsoup.Connection.Method method15 = response0.method();
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "");
        java.lang.String str20 = response0.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test25441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25441");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.charset();
        boolean boolean10 = response0.hasCookie("");
        java.net.URL uRL11 = response0.url();
        java.lang.Class<?> wildcardClass12 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test25442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25442");
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
        org.jsoup.Connection.Response response26 = response0.header("hi!", "");
        java.net.URL uRL27 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response0.header("", "hi!");
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
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(uRL27);
    }

    @Test
    public void test25443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25443");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL3 = response2.url();
        java.lang.String str4 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str6 = response5.statusMessage();
        java.lang.String str8 = response5.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        java.util.Map map13 = response10.cookies();
        org.jsoup.Connection.Response response15 = response10.removeHeader("hi!");
        java.lang.String str17 = response10.getHeaderCaseInsensitive("hi!");
        java.util.Map map18 = response10.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.util.Map.Entry entry21 = response9.scanHeaders("");
        org.jsoup.Connection.Method method22 = response9.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test25444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25444");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.cookie("hi!");
        java.net.URL uRL12 = response0.url();
        java.lang.String str13 = response0.charset();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25445");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response6.removeCookie("");
        org.jsoup.Connection.Response response13 = response6.removeCookie("");
        java.net.URL uRL14 = response6.url();
        java.lang.String str16 = response6.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry18 = response6.scanHeaders("");
        java.util.Map map19 = response6.cookies();
        java.net.URL uRL20 = response6.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test25446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25446");
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
        boolean boolean15 = response0.hasCookie("");
        org.jsoup.Connection.Response response17 = response0.removeCookie("hi!");
        java.util.Map map18 = response0.cookies();
        org.jsoup.Connection.Response response21 = response0.cookie("hi!", "hi!");
        boolean boolean23 = response0.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25447");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.contentType();
        java.lang.String str16 = response11.header("hi!");
        java.util.Map map17 = response11.cookies();
        java.net.URL uRL18 = response11.url();
        java.net.URL uRL19 = response11.url();
        org.jsoup.Connection.Method method20 = response11.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int22 = response11.statusCode();
        java.util.Map map23 = response11.cookies();
        java.util.Map map24 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test25448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test25449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25449");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "");
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25450");
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
        int int17 = response10.statusCode();
        java.util.Map.Entry entry19 = response10.scanHeaders("hi!");
        java.util.Map map20 = response10.headers();
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response10.method(method21);
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(entry19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test25451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25451");
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
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean32 = response30.hasCookie("");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test25452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25452");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map10 = response0.cookies();
        java.lang.String str11 = response0.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25453");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test25454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25454");
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
        java.lang.String str37 = response0.statusMessage();
        java.lang.String str39 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test25455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25455");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Method method11 = response0.method();
        java.net.URL uRL12 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.cookie("", "hi!");
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
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test25456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25456");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        int int10 = response0.statusCode();
        org.jsoup.Connection.Method method11 = response0.method();
        org.jsoup.Connection.Method method12 = response0.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test25457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25457");
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
        java.net.URL uRL28 = response0.url();
        java.util.Map map29 = response0.cookies();
        int int30 = response0.statusCode();
        java.net.URL uRL31 = response0.url();
        org.jsoup.Connection.Response response34 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method35 = response0.method();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean38 = response0.hasCookie("hi!");
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
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test25458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25458");
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
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int23 = response22.statusCode();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test25459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25459");
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
        java.lang.String str14 = response12.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response12.charset();
        org.jsoup.Connection.Response response18 = response12.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test25460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25460");
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
        java.lang.String str24 = response13.cookie("hi!");
        org.jsoup.Connection.Method method25 = response13.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document26 = response13.parse();
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test25461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25461");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.net.URL uRL12 = response10.url();
        java.net.URL uRL13 = response10.url();
        java.net.URL uRL14 = response10.url();
        org.jsoup.Connection.Method method15 = response10.method();
        boolean boolean17 = response10.hasHeader("hi!");
        java.lang.String str18 = response10.charset();
        java.util.Map map19 = response10.cookies();
        java.util.Map map20 = response10.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
        int int22 = response0.statusCode();
        java.lang.Class<?> wildcardClass23 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test25462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25462");
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
        java.lang.String str13 = response0.contentType();
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
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25463");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.cookie("hi!");
        java.util.Map map10 = response6.headers();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.Connection.Method method12 = response6.method();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response6.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test25464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25464");
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
        boolean boolean20 = response0.hasHeader("hi!");
        org.jsoup.Connection.Method method21 = response0.method();
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test25465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25465");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        boolean boolean11 = response0.hasCookie("");
        java.net.URL uRL12 = response0.url();
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test25466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25466");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        boolean boolean11 = response0.hasCookie("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response15 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test25467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25467");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        boolean boolean10 = response0.hasCookie("");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        boolean boolean15 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test25468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25468");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        java.lang.String str5 = response3.statusMessage();
        org.jsoup.Connection.Response response7 = response3.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test25469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25469");
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
        java.lang.String str21 = response16.cookie("");
        org.jsoup.Connection.Response response23 = response16.removeHeader("hi!");
        java.lang.String str24 = response16.statusMessage();
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test25470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25470");
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
        int int20 = response15.statusCode();
        java.util.Map.Entry entry22 = response15.scanHeaders("hi!");
        java.util.Map map23 = response15.headers();
        org.jsoup.Connection.Method method24 = response15.method();
        java.lang.Class<?> wildcardClass25 = response15.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test25471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25471");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test25472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25472");
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
        boolean boolean23 = response21.hasCookie("");
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response21.url(uRL24);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test25473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25473");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response15.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25474");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = response1.url();
        java.util.Map map10 = response1.cookies();
        java.lang.String str12 = response1.cookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test25475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25475");
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
        java.lang.String str22 = response0.cookie("hi!");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test25476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25476");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test25477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25477");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method12 = response11.method();
        org.jsoup.Connection.Method method13 = response11.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response14.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean20 = response14.hasHeader("hi!");
        java.lang.String str21 = response14.charset();
        org.jsoup.Connection.Method method22 = response14.method();
        boolean boolean24 = response14.hasCookie("");
        java.util.Map map25 = response14.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        boolean boolean28 = response11.hasHeader("hi!");
        java.util.Map map29 = response11.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test25478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25478");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        java.lang.String str8 = response3.contentType();
        boolean boolean10 = response3.hasCookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25479");
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
        org.jsoup.Connection.Response response29 = response1.header("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test25480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.contentType();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.contentType();
        java.lang.String str14 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("hi!");
        java.lang.String str11 = response7.cookie("hi!");
        org.jsoup.Connection.Response response13 = response7.removeCookie("");
        org.jsoup.Connection.Response response16 = response7.header("hi!", "hi!");
        java.net.URL uRL17 = response7.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test25482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25482");
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
        java.net.URL uRL15 = response13.url();
        org.jsoup.Connection.Response response18 = response13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response13.bodyAsBytes();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test25483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.lang.String str8 = response1.statusMessage();
        boolean boolean10 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test25484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25484");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        org.jsoup.Connection.Method method12 = response0.method();
        int int13 = response0.statusCode();
        java.lang.String str14 = response0.statusMessage();
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
        org.junit.Assert.assertNotNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test25485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25485");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("");
        java.lang.String str21 = response18.statusMessage();
        java.lang.String str23 = response18.header("hi!");
        java.lang.String str24 = response18.contentType();
        org.jsoup.Connection.Response response27 = response18.cookie("hi!", "");
        int int28 = response18.statusCode();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        java.lang.String str32 = response29.header("hi!");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL34 = response33.url();
        java.lang.String str36 = response33.header("hi!");
        java.util.Map map37 = response33.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        int int39 = response29.statusCode();
        java.lang.String str40 = response29.charset();
        org.jsoup.Connection.Method method41 = response29.method();
        org.jsoup.Connection.Method method42 = response29.method();
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str45 = response43.cookie("");
        boolean boolean47 = response43.hasHeader("hi!");
        java.net.URL uRL48 = response43.url();
        java.lang.String str50 = response43.getHeaderCaseInsensitive("");
        boolean boolean52 = response43.hasCookie("hi!");
        java.util.Map map53 = response43.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str57 = response55.cookie("");
        java.lang.String str58 = response55.contentType();
        java.lang.String str60 = response55.getHeaderCaseInsensitive("hi!");
        java.lang.String str61 = response55.contentType();
        org.jsoup.Connection.Method method62 = response55.method();
        java.util.Map map63 = response55.cookies();
        response29.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response69 = response13.cookie("", "");
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(method41);
        org.junit.Assert.assertNull(method42);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(uRL48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(method62);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test25486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25486");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.contentType();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "hi!");
        int int13 = response0.statusCode();
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
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test25487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25487");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.util.Map map7 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean11 = response8.hasCookie("");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test25488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25488");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25489");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        boolean boolean5 = response0.hasHeader("hi!");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "");
        java.lang.String str11 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test25490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25490");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response9 = response1.header("hi!", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test25491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25491");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        java.lang.String str9 = response6.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map11 = response6.cookies();
        org.jsoup.Connection.Response response13 = response6.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test25492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25492");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str17 = response14.header("hi!");
        org.jsoup.Connection.Response response19 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str23 = response21.getHeaderCaseInsensitive("");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Response response26 = response21.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str28 = response21.charset();
        java.util.Map map29 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.Connection.Response response32 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test25493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25493");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.statusMessage();
        java.net.URL uRL10 = response0.url();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        java.lang.String str15 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25494");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry6 = response4.scanHeaders("");
        org.jsoup.Connection.Response response9 = response4.header("hi!", "");
        java.lang.String str10 = response4.statusMessage();
        boolean boolean12 = response4.hasCookie("hi!");
        org.jsoup.Connection.Method method13 = response4.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response4.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test25495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25495");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response1.url();
        java.net.URL uRL11 = response1.url();
        boolean boolean13 = response1.hasHeader("hi!");
        java.util.Map map14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test25496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25496");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.cookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str16 = response0.cookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test25497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25497");
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
        java.lang.String str18 = response0.contentType();
        java.lang.String str19 = response0.contentType();
        org.jsoup.Connection.Response response22 = response0.header("hi!", "hi!");
        boolean boolean24 = response0.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        org.jsoup.Connection.Method method28 = response26.method();
        org.jsoup.Connection.Response response31 = response26.header("hi!", "");
        java.util.Map map32 = response26.headers();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response26);
        int int34 = response26.statusCode();
        java.lang.String str35 = response26.charset();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str38 = response36.cookie("");
        boolean boolean40 = response36.hasHeader("hi!");
        java.net.URL uRL41 = response36.url();
        java.lang.String str43 = response36.getHeaderCaseInsensitive("");
        java.net.URL uRL44 = response36.url();
        java.lang.String str45 = response36.statusMessage();
        java.util.Map map46 = response36.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL49 = response48.url();
        java.lang.String str50 = response48.statusMessage();
        java.util.Map map51 = response48.cookies();
        org.jsoup.Connection.Response response53 = response48.removeHeader("hi!");
        java.util.Map.Entry entry55 = response48.scanHeaders("");
        org.jsoup.Connection.Response response58 = response48.header("hi!", "hi!");
        java.util.Map map59 = response48.cookies();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        org.jsoup.helper.HttpConnection.Response response61 = new org.jsoup.helper.HttpConnection.Response(response26);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response26);
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(uRL49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(response53);
        org.junit.Assert.assertNull(entry55);
        org.junit.Assert.assertNotNull(response58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test25498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25498");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
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
        java.util.Map map28 = response12.cookies();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        java.lang.String str31 = response29.statusMessage();
        int int32 = response29.statusCode();
        org.jsoup.Connection.Response response35 = response29.header("hi!", "hi!");
        java.util.Map map36 = response29.cookies();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map36);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL39 = response38.url();
        java.util.Map map40 = response38.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        java.net.URL uRL42 = response0.url();
        java.lang.String str44 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean46 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response48 = response0.method(method47);
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
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test25499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25499");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        boolean boolean14 = response0.hasHeader("hi!");
        java.net.URL uRL15 = response0.url();
        java.net.URL uRL16 = response0.url();
        java.util.Map map17 = response0.headers();
        java.util.Map.Entry entry19 = response0.scanHeaders("hi!");
        java.lang.String str20 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test25500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest50.test25500");
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
        int int17 = response10.statusCode();
        java.util.Map.Entry entry19 = response10.scanHeaders("hi!");
        java.util.Map map20 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response10.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(entry19);
        org.junit.Assert.assertNotNull(map20);
    }
}

