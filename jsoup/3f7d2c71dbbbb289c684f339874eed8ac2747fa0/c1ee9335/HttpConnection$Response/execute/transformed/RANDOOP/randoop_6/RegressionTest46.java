import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test23001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23001");
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
        java.lang.String str22 = response21.charset();
        java.util.Map.Entry entry24 = response21.scanHeaders("");
        java.util.Map map25 = response21.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response21.header("", "hi!");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test23002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23002");
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
        org.jsoup.Connection.Response response25 = response0.removeHeader("hi!");
        boolean boolean27 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection29 = null;
        org.jsoup.Connection.Response response30 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection29, response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test23003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23003");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response10.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23004");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response20.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test23005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23005");
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
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "");
        java.util.Map map19 = response0.headers();
        boolean boolean21 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23006");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        boolean boolean14 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23007");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test23008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23008");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str6 = response4.charset();
        org.jsoup.Connection.Response response8 = response4.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test23009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23009");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        java.lang.String str11 = response1.contentType();
        java.lang.String str12 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        boolean boolean18 = response14.hasHeader("hi!");
        java.net.URL uRL19 = response14.url();
        org.jsoup.Connection.Response response21 = response14.removeCookie("hi!");
        org.jsoup.Connection.Response response23 = response14.removeCookie("");
        java.lang.String str24 = response14.contentType();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int26 = response25.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test23010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23010");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23011");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL11 = response0.url();
        boolean boolean13 = response0.hasCookie("");
        java.lang.String str15 = response0.header("");
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test23012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23012");
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
        org.jsoup.Connection.Response response16 = response11.cookie("hi!", "");
        java.lang.String str17 = response11.statusMessage();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test23013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23013");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        java.lang.String str14 = response0.statusMessage();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23014");
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
        org.jsoup.Connection.Response response19 = response0.removeCookie("hi!");
        java.lang.String str20 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean23 = response21.hasCookie("");
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
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test23015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23015");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        org.jsoup.Connection.Response response15 = response10.header("hi!", "");
        java.lang.String str16 = response10.charset();
        java.util.Map map17 = response10.cookies();
        boolean boolean19 = response10.hasHeader("hi!");
        boolean boolean21 = response10.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str25 = response23.header("hi!");
        org.jsoup.Connection.Response response27 = response23.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL30 = response29.url();
        java.lang.String str31 = response29.statusMessage();
        java.util.Map map32 = response29.cookies();
        java.lang.String str34 = response29.header("hi!");
        java.lang.String str36 = response29.getHeaderCaseInsensitive("hi!");
        java.lang.String str37 = response29.charset();
        java.lang.String str38 = response29.charset();
        boolean boolean40 = response29.hasHeader("hi!");
        java.util.Map map41 = response29.headers();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.util.Map map43 = response23.headers();
        org.jsoup.helper.HttpConnection.Response response44 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response47 = response44.cookie("hi!", "hi!");
        int int48 = response44.statusCode();
        java.lang.String str50 = response44.cookie("");
        java.util.Map map51 = response44.headers();
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map51);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map51);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map51);
        java.lang.String str56 = response0.header("");
        java.util.Map map57 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test23016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23016");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map12 = response11.cookies();
        java.util.Map map13 = response11.cookies();
        java.lang.String str14 = response11.statusMessage();
        java.lang.String str15 = response11.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23017");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.contentType();
        java.net.URL uRL9 = response7.url();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.contentType();
        java.lang.String str16 = response11.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response11.contentType();
        java.lang.String str19 = response11.cookie("hi!");
        org.jsoup.Connection.Method method20 = response11.method();
        boolean boolean22 = response11.hasHeader("hi!");
        java.lang.String str24 = response11.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test23018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23018");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.lang.String str14 = response0.charset();
        boolean boolean16 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23019");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.contentType();
        org.jsoup.Connection.Response response8 = response0.cookie("hi!", "hi!");
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23020");
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
        java.lang.String str19 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str21 = response20.statusMessage();
        org.jsoup.Connection.Response response23 = response20.removeHeader("hi!");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test23021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23021");
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
        java.util.Map map19 = response0.cookies();
        java.util.Map map20 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int22 = response21.statusCode();
        org.jsoup.Connection.Response response24 = response21.removeCookie("");
        java.util.Map.Entry entry26 = response21.scanHeaders("hi!");
        java.lang.String str28 = response21.getHeaderCaseInsensitive("");
        java.lang.String str30 = response21.cookie("");
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
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test23022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23022");
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
        org.jsoup.Connection.Response response46 = response0.cookie("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(response46);
    }

    @Test
    public void test23023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23023");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map13 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean18 = response1.hasHeader("hi!");
        java.lang.String str19 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test23024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23024");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23025");
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
        java.net.URL uRL22 = response0.url();
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
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test23026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23026");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        java.lang.String str13 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.net.URL uRL17 = response14.url();
        org.jsoup.Connection.Method method18 = response14.method();
        java.lang.String str19 = response14.statusMessage();
        org.jsoup.Connection.Response response21 = response14.removeCookie("");
        boolean boolean23 = response14.hasCookie("");
        org.jsoup.Connection.Response response25 = response14.removeCookie("");
        java.lang.String str27 = response14.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL29 = response28.url();
        org.jsoup.Connection.Method method30 = response28.method();
        java.lang.String str31 = response28.contentType();
        org.jsoup.Connection.Response response34 = response28.cookie("hi!", "");
        java.util.Map map35 = response28.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str37 = response14.statusMessage();
        java.util.Map map38 = response14.headers();
        java.util.Map map39 = response14.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray41 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map39);
    }

    @Test
    public void test23027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23027");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.charset();
        boolean boolean13 = response0.hasCookie("");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.lang.Class<?> wildcardClass17 = response16.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test23028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23028");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str5 = response1.contentType();
        java.net.URL uRL6 = response1.url();
        java.util.Map map7 = response1.cookies();
        java.lang.String str9 = response1.cookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23029");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response0.header("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23030");
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
        java.lang.String str31 = response30.statusMessage();
        org.jsoup.Connection.Method method32 = response30.method();
        java.util.Map.Entry entry34 = response30.scanHeaders("hi!");
        java.lang.String str36 = response30.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response37 = org.jsoup.helper.HttpConnection.Response.execute(request0, response30);
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNull(entry34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test23031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23031");
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
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response20 = response0.removeCookie("hi!");
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test23032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23032");
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
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.net.URL uRL25 = response23.url();
        java.net.URL uRL26 = response23.url();
        java.net.URL uRL27 = response23.url();
        java.util.Map map28 = response23.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.Connection.Response response32 = response0.header("hi!", "hi!");
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
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test23033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23033");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = uRL13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test23034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.util.Map map3 = response0.headers();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.header("");
        java.lang.String str11 = response0.contentType();
        java.lang.String str13 = response0.cookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23035");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        boolean boolean13 = response0.hasCookie("hi!");
        boolean boolean15 = response0.hasHeader("hi!");
        java.lang.String str16 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test23036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23036");
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
        java.lang.String str27 = response0.contentType();
        org.jsoup.Connection.Response response30 = response0.header("hi!", "hi!");
        int int31 = response0.statusCode();
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test23037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23037");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        java.util.Map map5 = response1.cookies();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.util.Map map8 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test23038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23038");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        java.util.Map map8 = response1.cookies();
        java.lang.String str9 = response1.contentType();
        java.util.Map.Entry entry11 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        java.util.Map map15 = response12.cookies();
        java.lang.String str17 = response12.header("hi!");
        java.lang.String str19 = response12.getHeaderCaseInsensitive("hi!");
        java.lang.String str20 = response12.contentType();
        java.util.Map map21 = response12.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str23 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test23039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23039");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str8 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map10 = response0.headers();
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23040");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.util.Map map11 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test23041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test23042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23042");
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
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        java.lang.String str16 = response0.header("hi!");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test23043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23043");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.header("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL9 = response8.url();
        java.net.URL uRL10 = response8.url();
        org.jsoup.Connection.Response response12 = response8.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response13.header("hi!", "hi!");
        java.util.Map map17 = response13.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str20 = response8.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str23 = response21.cookie("");
        java.lang.String str24 = response21.statusMessage();
        java.lang.String str26 = response21.header("hi!");
        java.lang.String str27 = response21.contentType();
        org.jsoup.Connection.Response response30 = response21.cookie("hi!", "");
        int int31 = response21.statusCode();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str35 = response32.header("hi!");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL37 = response36.url();
        java.lang.String str39 = response36.header("hi!");
        java.util.Map map40 = response36.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map40);
        int int42 = response32.statusCode();
        java.lang.String str43 = response32.charset();
        org.jsoup.Connection.Method method44 = response32.method();
        org.jsoup.Connection.Method method45 = response32.method();
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str48 = response46.cookie("");
        boolean boolean50 = response46.hasHeader("hi!");
        java.net.URL uRL51 = response46.url();
        java.lang.String str53 = response46.getHeaderCaseInsensitive("");
        boolean boolean55 = response46.hasCookie("hi!");
        java.util.Map map56 = response46.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        org.jsoup.helper.HttpConnection.Response response58 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str60 = response58.cookie("");
        java.lang.String str61 = response58.contentType();
        java.lang.String str63 = response58.getHeaderCaseInsensitive("hi!");
        java.lang.String str64 = response58.contentType();
        org.jsoup.Connection.Method method65 = response58.method();
        java.util.Map map66 = response58.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map66);
        response21.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map66);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map66);
        java.net.URL uRL70 = response8.url();
        java.util.Map map71 = response8.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map71);
        org.jsoup.helper.HttpConnection.Response response73 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response76 = response7.header("hi!", "hi!");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNull(method45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(uRL51);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNull(method65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(uRL70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(response76);
    }

    @Test
    public void test23044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23044");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.contentType();
        org.jsoup.Connection.Method method7 = response5.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test23045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23046");
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
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response41 = response0.cookie("", "hi!");
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
    public void test23047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23047");
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
        org.jsoup.Connection.Method method14 = response0.method();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        java.lang.String str18 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test23048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23048");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23049");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasHeader("hi!");
        boolean boolean11 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str15 = response13.header("hi!");
        org.jsoup.Connection.Response response17 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.statusMessage();
        java.util.Map map22 = response19.cookies();
        java.lang.String str24 = response19.header("hi!");
        java.lang.String str26 = response19.getHeaderCaseInsensitive("hi!");
        java.lang.String str27 = response19.charset();
        java.lang.String str28 = response19.charset();
        boolean boolean30 = response19.hasHeader("hi!");
        java.util.Map map31 = response19.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.util.Map map33 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response37 = response34.cookie("hi!", "hi!");
        int int38 = response34.statusCode();
        java.lang.String str40 = response34.cookie("");
        java.util.Map map41 = response34.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        java.util.Map map44 = response0.cookies();
        java.lang.String str45 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test23050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23050");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        int int8 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response3.cookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23051");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.header("hi!");
        java.lang.String str10 = response0.cookie("");
        boolean boolean12 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23052");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.statusMessage();
        int int11 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response12.header("", "");
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test23053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23053");
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
        java.lang.String str32 = response30.header("");
        java.lang.String str33 = response30.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray34 = response30.bodyAsBytes();
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
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test23054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23054");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasCookie("");
        java.lang.String str8 = response0.header("hi!");
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test23055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23055");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.cookies();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23056");
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
        java.net.URL uRL14 = response0.url();
        java.util.Map map15 = response0.cookies();
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test23057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23057");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map14 = response0.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test23058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23058");
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
        java.lang.String str31 = response29.getHeaderCaseInsensitive("");
        java.util.Map map32 = response29.cookies();
        org.jsoup.Connection.Response response34 = response29.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = response29.hasHeader("");
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test23059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23059");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeCookie("hi!");
        java.lang.String str5 = response1.header("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test23060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23060");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("");
        java.lang.String str16 = response13.contentType();
        java.lang.String str18 = response13.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map map20 = response19.headers();
        java.lang.String str22 = response19.cookie("hi!");
        java.util.Map map23 = response19.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map map25 = response12.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = response12.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test23061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23061");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Response response11 = response8.removeCookie("");
        boolean boolean13 = response8.hasCookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23062");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.util.Map map11 = response0.cookies();
        java.lang.String str12 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method15 = response13.method();
        org.jsoup.Connection.Method method16 = response13.method();
        java.lang.String str17 = response13.contentType();
        java.lang.String str18 = response13.charset();
        boolean boolean20 = response13.hasCookie("hi!");
        int int21 = response13.statusCode();
        java.util.Map map22 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test23063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23063");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response4.cookie("hi!", "");
        java.lang.String str8 = response4.contentType();
        int int9 = response4.statusCode();
        java.lang.String str10 = response4.statusMessage();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23064");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL13 = response12.url();
        java.util.Map.Entry entry15 = response12.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map map17 = response12.cookies();
        java.lang.String str18 = response12.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test23065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23065");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str15 = response12.header("hi!");
        org.jsoup.Connection.Response response17 = response12.removeHeader("hi!");
        java.lang.String str19 = response12.header("hi!");
        org.jsoup.Connection.Response response21 = response12.removeCookie("hi!");
        java.net.URL uRL22 = response12.url();
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
        org.jsoup.Connection.Response response41 = response23.removeHeader("hi!");
        java.lang.String str43 = response23.getHeaderCaseInsensitive("hi!");
        java.util.Map map44 = response23.headers();
        java.util.Map map45 = response23.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        org.jsoup.Connection.Method method48 = response9.method();
        java.net.HttpURLConnection httpURLConnection49 = null;
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL51 = response50.url();
        java.lang.String str52 = response50.statusMessage();
        java.util.Map map53 = response50.cookies();
        java.lang.String str54 = response50.charset();
        org.jsoup.Connection.Response response56 = response50.removeHeader("hi!");
        java.util.Map.Entry entry58 = response50.scanHeaders("hi!");
        org.jsoup.Connection.Method method59 = response50.method();
        org.jsoup.Connection.Method method60 = response50.method();
        boolean boolean62 = response50.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection49, (org.jsoup.Connection.Response) response50);
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
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(uRL22);
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
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNull(uRL51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(response56);
        org.junit.Assert.assertNull(entry58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNull(method60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test23066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23066");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.contentType();
        org.jsoup.Connection.Method method9 = response7.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test23067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23067");
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
        java.util.Map map17 = response13.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response13.body();
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
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test23068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23068");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.net.URL uRL12 = response0.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        java.lang.String str16 = response14.statusMessage();
        int int17 = response14.statusCode();
        org.jsoup.Connection.Response response20 = response14.header("hi!", "hi!");
        java.util.Map map21 = response14.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.lang.String str23 = response13.charset();
        java.lang.String str25 = response13.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response13.header("", "");
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
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test23069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23069");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Method method20 = response18.method();
        org.jsoup.Connection.Response response23 = response18.header("hi!", "");
        java.lang.String str25 = response18.getHeaderCaseInsensitive("");
        java.lang.String str27 = response18.cookie("");
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
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map52);
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response57 = response55.removeCookie("");
        java.util.Map map58 = response55.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        java.lang.String str61 = response0.getHeaderCaseInsensitive("");
        java.lang.String str63 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
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
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNull(str63);
    }

    @Test
    public void test23070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23070");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response20 = response0.removeCookie("");
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
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test23071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23071");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map map8 = response0.cookies();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(entry6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test23072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23072");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.header("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str11 = response0.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23073");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.cookie("");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23074");
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
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        java.lang.String str18 = response0.cookie("");
        java.lang.String str20 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.method(method21);
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test23075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test23076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23076");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.statusMessage();
        boolean boolean10 = response1.hasCookie("");
        java.lang.String str11 = response1.charset();
        java.net.URL uRL12 = response1.url();
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23077");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response6 = response0.header("hi!", "");
        java.lang.Class<?> wildcardClass7 = response0.getClass();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23078");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.Connection.Method method3 = response1.method();
        java.lang.String str4 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test23079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23079");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.header("hi!");
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        boolean boolean10 = response1.hasCookie("");
        java.lang.String str12 = response1.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.util.Map.Entry entry15 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response18 = response0.header("hi!", "");
        java.net.URL uRL19 = response0.url();
        boolean boolean21 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(entry15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test23081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23081");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str7 = response0.statusMessage();
        int int8 = response0.statusCode();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        java.lang.String str13 = response0.cookie("");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test23082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23082");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response1.header("hi!", "hi!");
        boolean boolean6 = response1.hasCookie("hi!");
        java.lang.String str8 = response1.header("");
        boolean boolean10 = response1.hasCookie("hi!");
        java.util.Map map11 = response1.cookies();
        boolean boolean13 = response1.hasHeader("hi!");
        java.lang.String str14 = response1.charset();
        java.util.Map map15 = response1.cookies();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test23083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23083");
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
        java.util.Map.Entry entry22 = response16.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response16.header("", "");
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(entry22);
    }

    @Test
    public void test23084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23084");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        boolean boolean12 = response0.hasCookie("");
        boolean boolean14 = response0.hasHeader("hi!");
        java.util.Map map15 = response0.cookies();
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23085");
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
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str18 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        org.jsoup.Connection.Method method21 = response19.method();
        org.jsoup.Connection.Response response24 = response19.header("hi!", "");
        java.lang.String str26 = response19.header("hi!");
        java.util.Map map27 = response19.cookies();
        boolean boolean29 = response19.hasHeader("hi!");
        java.lang.String str30 = response19.charset();
        java.lang.String str32 = response19.cookie("");
        java.util.Map.Entry entry34 = response19.scanHeaders("");
        java.net.URL uRL35 = response19.url();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL37 = response36.url();
        org.jsoup.Connection.Method method38 = response36.method();
        java.lang.String str40 = response36.cookie("hi!");
        boolean boolean42 = response36.hasCookie("hi!");
        org.jsoup.Connection.Response response45 = response36.cookie("hi!", "");
        boolean boolean47 = response36.hasHeader("hi!");
        java.lang.String str48 = response36.statusMessage();
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response36);
        java.lang.String str50 = response49.statusMessage();
        org.jsoup.Connection.Response response53 = response49.header("hi!", "hi!");
        java.util.Map.Entry entry55 = response49.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response56 = new org.jsoup.helper.HttpConnection.Response(response49);
        org.jsoup.Connection.Response response58 = response49.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response59 = new org.jsoup.helper.HttpConnection.Response(response49);
        java.lang.String str60 = response59.statusMessage();
        boolean boolean62 = response59.hasCookie("hi!");
        java.util.Map map63 = response59.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
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
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(entry34);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(response53);
        org.junit.Assert.assertNull(entry55);
        org.junit.Assert.assertNotNull(response58);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(map63);
    }

    @Test
    public void test23086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23086");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        int int10 = response7.statusCode();
        org.jsoup.Connection.Response response12 = response7.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str14 = response13.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response13.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23087");
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
        org.jsoup.Connection.Method method14 = response13.method();
        java.util.Map map15 = response13.cookies();
        org.jsoup.Connection.Response response17 = response13.removeHeader("hi!");
        int int18 = response13.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23088");
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
        java.net.URL uRL20 = response0.url();
        java.util.Map map21 = response0.cookies();
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test23089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23089");
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
        boolean boolean20 = response13.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL23 = response22.url();
        org.jsoup.Connection.Method method24 = response22.method();
        java.lang.String str26 = response22.cookie("hi!");
        boolean boolean28 = response22.hasCookie("hi!");
        org.jsoup.Connection.Response response31 = response22.cookie("hi!", "");
        java.lang.String str33 = response22.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str36 = response22.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response22);
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test23090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23090");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.charset();
        java.net.URL uRL12 = response0.url();
        java.util.Map map13 = response0.cookies();
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test23091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23091");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.header("", "");
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
    }

    @Test
    public void test23092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23092");
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
        java.util.Map map23 = response0.headers();
        boolean boolean25 = response0.hasHeader("hi!");
        java.lang.String str26 = response0.charset();
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
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test23093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23093");
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
        java.lang.String str26 = response8.statusMessage();
        java.util.Map map27 = response8.cookies();
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
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test23094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23094");
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
        java.util.Map.Entry entry39 = response0.scanHeaders("hi!");
        java.util.Map map40 = response0.cookies();
        java.lang.String str42 = response0.header("");
        org.jsoup.Connection.Response response45 = response0.header("hi!", "hi!");
        java.net.URL uRL46 = response0.url();
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
        org.junit.Assert.assertNull(entry39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertNull(uRL46);
    }

    @Test
    public void test23095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23095");
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
        java.lang.String str14 = response13.contentType();
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
    public void test23096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23096");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        org.jsoup.Connection.Method method26 = response24.method();
        org.jsoup.Connection.Response response28 = response24.removeCookie("hi!");
        java.lang.String str30 = response24.getHeaderCaseInsensitive("");
        java.util.Map map31 = response24.cookies();
        java.util.Map map32 = response24.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        int int34 = response18.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document35 = response18.parse();
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test23097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23097");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = response0.body();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test23098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23098");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.net.URL uRL9 = response0.url();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test23099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23099");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response6.headers();
        org.jsoup.Connection.Response response10 = response6.header("hi!", "hi!");
        boolean boolean12 = response6.hasCookie("hi!");
        int int13 = response6.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23100");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray50 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    }

    @Test
    public void test23101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response9.url();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test23102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23102");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
    }

    @Test
    public void test23103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23103");
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
        org.jsoup.Connection.Response response15 = response13.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test23104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23104");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        java.lang.String str10 = response1.header("");
        java.util.Map map11 = response1.headers();
        int int12 = response1.statusCode();
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "hi!");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str20 = response18.cookie("");
        java.lang.String str21 = response18.contentType();
        java.lang.String str23 = response18.header("hi!");
        boolean boolean25 = response18.hasCookie("hi!");
        java.lang.String str27 = response18.getHeaderCaseInsensitive("");
        boolean boolean29 = response18.hasHeader("hi!");
        java.util.Map.Entry entry31 = response18.scanHeaders("hi!");
        java.lang.String str33 = response18.header("");
        org.jsoup.Connection.Response response35 = response18.removeHeader("hi!");
        java.lang.String str36 = response18.charset();
        java.util.Map map37 = response18.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.lang.String str39 = response1.charset();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(entry31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test23105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23105");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.cookie("");
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        int int12 = response0.statusCode();
        java.net.URL uRL13 = response0.url();
        java.net.URL uRL14 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test23106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map map6 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test23107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23107");
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
        java.util.Map map30 = response13.headers();
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
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test23108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23108");
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
        boolean boolean16 = response0.hasCookie("");
        java.lang.String str17 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str19 = response18.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response18.header("", "");
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
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test23109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23109");
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
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int15 = response14.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response14.bodyAsBytes();
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test23110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23110");
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
        java.lang.String str30 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry33 = response31.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL35 = response34.url();
        java.lang.String str37 = response34.header("hi!");
        org.jsoup.Connection.Response response39 = response34.removeHeader("hi!");
        java.lang.String str41 = response34.cookie("hi!");
        org.jsoup.Connection.Response response43 = response34.removeHeader("hi!");
        int int44 = response34.statusCode();
        java.util.Map.Entry entry46 = response34.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL48 = response47.url();
        java.lang.String str49 = response47.statusMessage();
        java.util.Map map50 = response47.cookies();
        org.jsoup.Connection.Response response52 = response47.removeHeader("hi!");
        java.lang.String str54 = response47.getHeaderCaseInsensitive("hi!");
        java.util.Map map55 = response47.cookies();
        java.util.Map.Entry entry57 = response47.scanHeaders("");
        java.util.Map map58 = response47.headers();
        java.util.Map map59 = response47.headers();
        response34.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response31.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        org.jsoup.helper.HttpConnection.Response response62 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL63 = response62.url();
        java.lang.String str64 = response62.statusMessage();
        java.util.Map map65 = response62.cookies();
        java.lang.String str67 = response62.header("hi!");
        java.lang.String str69 = response62.getHeaderCaseInsensitive("hi!");
        java.lang.String str70 = response62.charset();
        java.lang.String str71 = response62.charset();
        boolean boolean73 = response62.hasHeader("hi!");
        org.jsoup.Connection.Response response75 = response62.removeCookie("hi!");
        org.jsoup.Connection.Response response77 = response62.removeHeader("hi!");
        org.jsoup.Connection.Method method78 = response62.method();
        java.util.Map map79 = response62.cookies();
        response31.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map79);
        int int81 = response31.statusCode();
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
        org.junit.Assert.assertNull(entry33);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(entry46);
        org.junit.Assert.assertNull(uRL48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(entry57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(uRL63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(response75);
        org.junit.Assert.assertNotNull(response77);
        org.junit.Assert.assertNull(method78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }

    @Test
    public void test23111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23111");
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
        java.util.Map map17 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test23112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23112");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        boolean boolean13 = response0.hasCookie("");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23113");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        java.lang.String str9 = response7.statusMessage();
        boolean boolean11 = response7.hasCookie("hi!");
        org.jsoup.Connection.Response response13 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int15 = response7.statusCode();
        java.util.Map map16 = response7.headers();
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        boolean boolean19 = response6.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test23114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23114");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.charset();
        int int9 = response1.statusCode();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str12 = response1.header("hi!");
        java.lang.String str14 = response1.cookie("");
        java.lang.String str15 = response1.contentType();
        int int16 = response1.statusCode();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23115");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("hi!");
        boolean boolean13 = response0.hasCookie("hi!");
        java.lang.String str14 = response0.contentType();
        boolean boolean16 = response0.hasCookie("");
        org.jsoup.Connection.Response response18 = response0.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test23116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23116");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.header("hi!");
        java.lang.String str12 = response8.cookie("hi!");
        java.lang.String str13 = response8.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23117");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str12 = response0.contentType();
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test23118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23118");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasHeader("hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test23119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23119");
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
        java.lang.String str39 = response34.getHeaderCaseInsensitive("hi!");
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
    public void test23120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23120");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method13 = response0.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str18 = response14.cookie("hi!");
        boolean boolean20 = response14.hasCookie("hi!");
        int int21 = response14.statusCode();
        java.lang.String str22 = response14.charset();
        int int23 = response14.statusCode();
        java.lang.String str25 = response14.cookie("");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response28 = response26.removeCookie("hi!");
        java.lang.String str30 = response26.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.util.Map map32 = response26.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map32);
        java.lang.String str35 = response0.header("hi!");
        java.net.URL uRL36 = response0.url();
        java.lang.String str38 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response40 = response0.method(method39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(uRL36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test23121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23121");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        org.jsoup.Connection.Response response6 = response0.removeCookie("");
        boolean boolean8 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23122");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map7 = response6.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map7);
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.util.Map map11 = response0.headers();
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test23123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23123");
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
        java.util.Map map19 = response0.headers();
        org.jsoup.Connection.Response response21 = response0.removeHeader("hi!");
        java.util.Map map22 = response0.headers();
        java.util.Map map23 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response0.parse();
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test23124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23124");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("");
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.header("");
        java.util.Map map16 = response1.headers();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test23125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23125");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int12 = response11.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test23126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23126");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("");
        java.lang.String str12 = response9.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23127");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response8 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response0.header("hi!", "");
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23128");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL15 = response0.url();
        java.util.Map map16 = response0.cookies();
        org.jsoup.Connection.Method method17 = response0.method();
        java.util.Map map18 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test23129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23129");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        int int8 = response0.statusCode();
        java.lang.String str10 = response0.header("hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL13 = response0.url();
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test23130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23130");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        java.lang.String str4 = response0.cookie("");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.lang.String str7 = response0.charset();
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response0.header("hi!", "hi!");
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test23131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        java.lang.String str20 = response16.cookie("hi!");
        boolean boolean22 = response16.hasCookie("hi!");
        int int23 = response16.statusCode();
        java.lang.String str24 = response16.charset();
        int int25 = response16.statusCode();
        java.lang.String str27 = response16.cookie("");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response30 = response28.removeCookie("hi!");
        java.lang.String str32 = response28.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.util.Map map34 = response28.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.util.Map map36 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test23132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23132");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str20 = response18.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23133");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map6 = response5.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map6);
        java.lang.String str9 = response0.header("hi!");
        boolean boolean11 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method15 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test23134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23134");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        java.lang.String str6 = response4.contentType();
        java.lang.String str8 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        boolean boolean11 = response9.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str14 = response12.statusMessage();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23135");
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
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.contentType();
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        java.lang.String str18 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test23136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23136");
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
        org.jsoup.Connection.Response response28 = response0.removeCookie("hi!");
        java.lang.String str30 = response0.cookie("");
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
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test23137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23137");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response18 = response15.removeHeader("hi!");
        java.net.URL uRL19 = response15.url();
        java.util.Map.Entry entry21 = response15.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response26 = response23.header("hi!", "hi!");
        org.jsoup.Connection.Method method27 = response23.method();
        int int28 = response23.statusCode();
        int int29 = response23.statusCode();
        java.util.Map.Entry entry31 = response23.scanHeaders("hi!");
        org.jsoup.Connection.Response response33 = response23.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(entry31);
        org.junit.Assert.assertNotNull(response33);
    }

    @Test
    public void test23138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23138");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        org.jsoup.Connection.Method method12 = response0.method();
        boolean boolean14 = response0.hasHeader("hi!");
        java.lang.String str15 = response0.statusMessage();
        org.jsoup.Connection.Method method16 = response0.method();
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test23139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.util.Map.Entry entry15 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method16 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(entry11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(entry15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test23140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23140");
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
        java.lang.Class<?> wildcardClass41 = response0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test23141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23141");
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
        int int18 = response10.statusCode();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response10.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23142");
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
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL24 = response23.url();
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
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test23143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23143");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.header("hi!");
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response15 = response0.removeCookie("hi!");
        java.util.Map.Entry entry17 = response0.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.statusMessage();
        int int22 = response19.statusCode();
        boolean boolean24 = response19.hasHeader("hi!");
        java.lang.String str25 = response19.statusMessage();
        org.jsoup.Connection.Response response28 = response19.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response19);
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
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test23144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23144");
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
        org.jsoup.Connection.Response response18 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test23145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23145");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.statusMessage();
        java.util.Map map13 = response11.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test23146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23146");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.cookie("");
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.getHeaderCaseInsensitive("hi!");
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
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.util.Map.Entry entry34 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(entry34);
    }

    @Test
    public void test23147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23147");
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
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response8.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test23148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.contentType();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.statusMessage();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test23149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23149");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.cookies();
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        java.lang.String str12 = response0.contentType();
        java.util.Map.Entry entry14 = response0.scanHeaders("hi!");
        java.util.Map map15 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test23150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23150");
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
        java.lang.String str51 = response0.cookie("hi!");
        java.lang.String str53 = response0.header("");
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
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test23151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23151");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.getHeaderCaseInsensitive("");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Response response12 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response15 = response7.removeHeader("hi!");
        java.net.URL uRL16 = response7.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test23152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23152");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("");
        java.lang.String str10 = response0.cookie("");
        java.net.URL uRL11 = response0.url();
        int int12 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test23153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23153");
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
        java.lang.String str12 = response0.statusMessage();
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23154");
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
        java.util.Map map15 = response14.cookies();
        java.lang.String str16 = response14.contentType();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        java.net.URL uRL20 = response18.url();
        java.net.URL uRL21 = response18.url();
        java.net.URL uRL22 = response18.url();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response25 = response23.removeCookie("hi!");
        int int26 = response23.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test23155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23155");
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
        java.util.Map.Entry entry17 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(entry17);
    }

    @Test
    public void test23156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23156");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document49 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test23157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23157");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasCookie("");
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test23158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23158");
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
        org.jsoup.Connection.Response response22 = response8.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str24 = response8.statusMessage();
        java.lang.Class<?> wildcardClass25 = response8.getClass();
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
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test23159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23159");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23160");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.statusMessage();
        java.util.Map.Entry entry14 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
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
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test23161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23161");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.statusMessage();
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasHeader("hi!");
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23162");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        int int10 = response0.statusCode();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test23163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23163");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.statusMessage();
        java.lang.String str6 = response1.cookie("");
        java.net.URL uRL7 = response1.url();
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.contentType();
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        java.lang.String str15 = response1.contentType();
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23164");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response18 = response15.removeHeader("hi!");
        java.net.URL uRL19 = response15.url();
        java.util.Map.Entry entry21 = response15.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(entry21);
    }

    @Test
    public void test23165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23165");
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
        java.lang.String str30 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = response0.hasHeader("");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test23166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23166");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        java.lang.String str15 = response0.contentType();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23167");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.net.URL uRL4 = response0.url();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23168");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.headers();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.net.URL uRL14 = response11.url();
        org.jsoup.Connection.Method method15 = response11.method();
        java.lang.String str16 = response11.statusMessage();
        org.jsoup.Connection.Response response18 = response11.removeCookie("");
        boolean boolean20 = response11.hasCookie("");
        java.lang.String str21 = response11.charset();
        java.lang.String str22 = response11.contentType();
        java.lang.String str24 = response11.header("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response28 = response25.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response30 = response25.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str33 = response31.cookie("");
        java.net.URL uRL34 = response31.url();
        org.jsoup.Connection.Method method35 = response31.method();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response31);
        java.net.URL uRL37 = response36.url();
        java.lang.String str38 = response36.charset();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str41 = response39.cookie("");
        boolean boolean43 = response39.hasHeader("hi!");
        java.net.URL uRL44 = response39.url();
        java.lang.String str46 = response39.getHeaderCaseInsensitive("");
        boolean boolean48 = response39.hasCookie("hi!");
        java.util.Map map49 = response39.cookies();
        response36.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map49);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(uRL44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(map49);
    }

    @Test
    public void test23169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23169");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int20 = response0.statusCode();
        java.lang.String str22 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test23170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23170");
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
        java.lang.String str18 = response0.getHeaderCaseInsensitive("hi!");
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.Connection.Response response20 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection19, response20);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test23171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23171");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        java.util.Map map5 = response1.cookies();
        java.lang.String str6 = response1.contentType();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        java.lang.String str9 = response1.contentType();
        org.jsoup.Connection.Method method10 = response1.method();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test23172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23172");
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
        int int22 = response12.statusCode();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test23173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23173");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL14 = response0.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response0.hasHeader("");
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
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test23174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23174");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.util.Map map7 = response5.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test23175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23175");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean9 = response1.hasCookie("");
        java.lang.String str10 = response1.charset();
        java.util.Map map11 = response1.headers();
        java.net.URL uRL12 = response1.url();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test23176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23176");
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
        int int17 = response16.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test23177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23177");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        java.net.URL uRL3 = response0.url();
        java.util.Map map4 = response0.cookies();
        java.util.Map map5 = response0.cookies();
        org.jsoup.Connection.Response response8 = response0.cookie("hi!", "");
        int int9 = response0.statusCode();
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str12 = response0.contentType();
        boolean boolean14 = response0.hasHeader("hi!");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23178");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.statusMessage();
        boolean boolean12 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23179");
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
        java.net.URL uRL18 = response0.url();
        int int19 = response0.statusCode();
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
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test23180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23180");
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
        java.net.URL uRL18 = response0.url();
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
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test23181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str8 = response0.contentType();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test23182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23182");
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
        java.lang.String str19 = response0.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass20 = response0.getClass();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23183");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.cookie("hi!");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test23184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23184");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "");
        int int13 = response0.statusCode();
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23185");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str12 = response0.contentType();
        java.util.Map map13 = response0.headers();
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
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test23186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23186");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL7 = response6.url();
        java.lang.String str8 = response6.statusMessage();
        boolean boolean10 = response6.hasCookie("hi!");
        boolean boolean12 = response6.hasHeader("hi!");
        java.util.Map map13 = response6.cookies();
        java.lang.String str14 = response6.contentType();
        org.jsoup.Connection.Method method15 = response6.method();
        java.net.URL uRL16 = response6.url();
        java.util.Map map17 = response6.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method20 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test23187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23187");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        boolean boolean4 = response0.hasCookie("");
        java.lang.String str6 = response0.cookie("");
        boolean boolean8 = response0.hasCookie("hi!");
        java.net.URL uRL9 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test23188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23188");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("hi!");
        boolean boolean7 = response1.hasHeader("hi!");
        boolean boolean9 = response1.hasCookie("");
        java.util.Map.Entry entry11 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.cookie("hi!");
        int int14 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test23189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23189");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test23190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response1.cookie("hi!");
        java.util.Map map7 = response1.cookies();
        boolean boolean9 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23191");
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
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response38);
        java.net.URL uRL40 = response39.url();
        java.lang.String str42 = response39.header("");
        org.jsoup.helper.HttpConnection.Response response43 = new org.jsoup.helper.HttpConnection.Response(response39);
        int int44 = response39.statusCode();
        java.util.Map map45 = response39.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map45);
        java.lang.String str48 = response0.header("hi!");
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
        org.junit.Assert.assertNull(uRL40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test23192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23192");
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
        boolean boolean15 = response0.hasHeader("hi!");
        java.lang.String str17 = response0.header("");
        java.util.Map map18 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.header("", "");
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test23193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23193");
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
        boolean boolean16 = response0.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23194");
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
        java.lang.String str18 = response16.header("hi!");
        java.lang.String str19 = response16.charset();
        org.jsoup.Connection.Response response21 = response16.removeCookie("");
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
    public void test23195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23195");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method5 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test23196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23196");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map6 = response5.headers();
        java.lang.String str8 = response5.header("hi!");
        java.lang.String str9 = response5.contentType();
        java.util.Map map10 = response5.cookies();
        java.util.Map.Entry entry12 = response5.scanHeaders("");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test23197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.headers();
        int int10 = response0.statusCode();
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.cookie("hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL17 = response0.url();
        java.lang.String str19 = response0.header("");
        java.lang.String str20 = response0.charset();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23198");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        java.net.URL uRL4 = response0.url();
        java.net.URL uRL5 = response0.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test23199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23199");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.header("hi!");
        java.util.Map map12 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test23200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23200");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.net.URL uRL11 = response0.url();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23201");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL14 = response0.url();
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
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test23202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23202");
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
        java.util.Map map21 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test23203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23203");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.cookie("hi!", "");
        java.util.Map map6 = response0.cookies();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test23204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23204");
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
        java.lang.String str20 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23205");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map12 = response11.cookies();
        org.jsoup.Connection.Method method13 = response11.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test23206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23206");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response8.cookie("hi!", "hi!");
        boolean boolean13 = response8.hasHeader("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23207");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test23208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23208");
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
        java.net.URL uRL16 = response0.url();
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
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test23209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23209");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.statusMessage();
        int int22 = response19.statusCode();
        org.jsoup.Connection.Response response25 = response19.header("hi!", "hi!");
        java.net.URL uRL26 = response19.url();
        java.util.Map.Entry entry28 = response19.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.net.URL uRL30 = response19.url();
        java.util.Map map31 = response19.headers();
        // The following exception was thrown during execution in test generation
        try {
            response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(entry28);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test23210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23210");
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
        int int17 = response0.statusCode();
        int int18 = response0.statusCode();
        java.lang.String str20 = response0.cookie("");
        int int21 = response0.statusCode();
        org.jsoup.Connection.Method method22 = response0.method();
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test23211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23211");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response8.header("");
        boolean boolean12 = response8.hasCookie("hi!");
        java.lang.String str13 = response8.contentType();
        boolean boolean15 = response8.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23212");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response14 = response12.removeCookie("");
        java.lang.String str15 = response12.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map map17 = response12.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test23213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23213");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        java.lang.String str4 = response0.statusMessage();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry8 = response0.scanHeaders("hi!");
        java.lang.String str10 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23214");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.net.URL uRL17 = response15.url();
        org.jsoup.Connection.Response response19 = response15.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response20.header("hi!", "hi!");
        java.util.Map map24 = response20.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.util.Map map26 = response15.headers();
        org.jsoup.Connection.Response response28 = response15.removeCookie("");
        java.util.Map map29 = response15.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test23215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23215");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        java.util.Map map8 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        java.util.Map map13 = response9.headers();
        java.util.Map map14 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str17 = response0.getHeaderCaseInsensitive("hi!");
        int int18 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23216");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasHeader("hi!");
        int int7 = response1.statusCode();
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        org.jsoup.Connection.Method method11 = response9.method();
        java.lang.String str13 = response9.cookie("hi!");
        boolean boolean15 = response9.hasCookie("hi!");
        org.jsoup.Connection.Response response18 = response9.cookie("hi!", "");
        boolean boolean20 = response9.hasHeader("hi!");
        java.lang.String str21 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str23 = response22.statusMessage();
        boolean boolean25 = response22.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.net.URL uRL27 = response22.url();
        boolean boolean29 = response22.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test23217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23217");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str10 = response0.cookie("");
        java.lang.String str11 = response0.statusMessage();
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method14 = response0.method();
        boolean boolean16 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23218");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        boolean boolean14 = response0.hasCookie("hi!");
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        java.lang.String str17 = response0.contentType();
        java.lang.String str19 = response0.header("");
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
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test23219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23219");
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
        int int20 = response0.statusCode();
        java.lang.String str22 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response23.method(method24);
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test23220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
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
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23221");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        java.lang.String str8 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test23222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23222");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry8 = response4.scanHeaders("");
        java.lang.String str10 = response4.header("");
        java.lang.String str12 = response4.getHeaderCaseInsensitive("");
        java.lang.String str13 = response4.statusMessage();
        java.net.URL uRL14 = response4.url();
        org.jsoup.Connection.Response response17 = response4.header("hi!", "");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response4.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test23223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23223");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("");
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test23224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23224");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.net.URL uRL15 = response1.url();
        java.util.Map.Entry entry17 = response1.scanHeaders("");
        java.lang.String str18 = response1.charset();
        java.lang.String str20 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        java.lang.String str23 = response21.statusMessage();
        java.util.Map map24 = response21.cookies();
        java.lang.String str26 = response21.header("hi!");
        java.lang.String str28 = response21.getHeaderCaseInsensitive("hi!");
        java.lang.String str29 = response21.charset();
        java.lang.String str30 = response21.charset();
        boolean boolean32 = response21.hasHeader("hi!");
        org.jsoup.Connection.Response response34 = response21.removeCookie("hi!");
        org.jsoup.Connection.Response response36 = response21.removeHeader("hi!");
        org.jsoup.Connection.Method method37 = response21.method();
        java.util.Map map38 = response21.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        java.lang.String str40 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response41 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test23225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23225");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeHeader("hi!");
        java.lang.String str16 = response9.header("hi!");
        java.lang.String str17 = response9.statusMessage();
        java.util.Map map18 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.charset();
        java.net.URL uRL21 = response0.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test23226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23226");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response0.url();
        int int3 = response0.statusCode();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.Connection.Response response8 = response0.cookie("hi!", "");
        java.lang.String str10 = response0.header("hi!");
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test23227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23227");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test23228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23228");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.cookie("hi!");
        int int11 = response0.statusCode();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23229");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("");
        int int13 = response0.statusCode();
        org.jsoup.Connection.Response response16 = response0.header("hi!", "");
        java.util.Map map17 = response0.headers();
        org.jsoup.Connection.Response response19 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test23230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23230");
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
        java.util.Map.Entry entry39 = response0.scanHeaders("hi!");
        java.util.Map map40 = response0.cookies();
        java.util.Map map41 = response0.cookies();
        java.lang.String str42 = response0.statusMessage();
        java.util.Map map43 = response0.headers();
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
        org.junit.Assert.assertNull(entry39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test23231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23231");
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
        java.util.Map.Entry entry20 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(entry20);
    }

    @Test
    public void test23232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23232");
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
        java.lang.String str24 = response0.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        java.net.URL uRL27 = response25.url();
        org.jsoup.Connection.Response response29 = response25.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response33 = response30.header("hi!", "hi!");
        java.util.Map map34 = response30.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.util.Map map36 = response25.headers();
        java.lang.String str38 = response25.header("");
        java.util.Map map39 = response25.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map39);
        java.lang.Class<?> wildcardClass41 = response0.getClass();
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
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test23233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23233");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean10 = response8.hasCookie("");
        org.jsoup.Connection.Method method11 = response8.method();
        org.jsoup.Connection.Response response13 = response8.removeCookie("");
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        org.jsoup.Connection.Method method17 = response15.method();
        org.jsoup.Connection.Response response20 = response15.header("hi!", "");
        java.lang.String str22 = response15.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response24 = response15.removeHeader("hi!");
        org.jsoup.Connection.Method method25 = response15.method();
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test23234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23234");
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
        java.util.Map map15 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response16.header("hi!", "hi!");
        java.util.Map map20 = response16.cookies();
        org.jsoup.Connection.Response response23 = response16.header("hi!", "hi!");
        org.jsoup.Connection.Method method24 = response16.method();
        java.lang.String str25 = response16.contentType();
        java.util.Map map26 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document28 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test23235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23235");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        java.util.Map map12 = response7.headers();
        org.jsoup.Connection.Response response14 = response7.removeHeader("hi!");
        java.lang.String str15 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map17 = response7.headers();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str20 = response4.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        java.net.URL uRL23 = response21.url();
        java.net.URL uRL24 = response21.url();
        java.net.URL uRL25 = response21.url();
        org.jsoup.Connection.Method method26 = response21.method();
        java.lang.String str27 = response21.charset();
        java.util.Map map28 = response21.headers();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str30 = response4.charset();
        int int31 = response4.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test23236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23236");
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
        org.jsoup.Connection.Method method32 = response0.method();
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
        org.junit.Assert.assertNull(method32);
    }

    @Test
    public void test23237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23237");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str22 = response20.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test23238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23238");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.Connection.Response response16 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response0.method();
        java.lang.String str19 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test23239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.lang.String str11 = response0.contentType();
        boolean boolean13 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "");
        java.util.Map map17 = response0.headers();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test23240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23240");
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
        java.lang.String str30 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry33 = response31.scanHeaders("");
        java.lang.String str34 = response31.statusMessage();
        java.lang.String str36 = response31.header("");
        java.net.URL uRL37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response38 = response31.url(uRL37);
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
        org.junit.Assert.assertNull(entry33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test23241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23241");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        java.net.URL uRL8 = response6.url();
        org.jsoup.Connection.Response response11 = response6.header("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test23242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.charset();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23243");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        org.jsoup.Connection.Method method9 = response6.method();
        org.jsoup.Connection.Response response12 = response6.cookie("hi!", "");
        java.lang.String str14 = response6.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response6.cookie("hi!");
        java.util.Map.Entry entry18 = response6.scanHeaders("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(entry18);
    }

    @Test
    public void test23244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23244");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.headers();
        boolean boolean14 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test23245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23245");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str3 = response1.cookie("");
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.util.Map map12 = response1.cookies();
        java.lang.String str13 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23246");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response8 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test23247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23247");
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
        java.lang.String str53 = response13.charset();
        int int54 = response13.statusCode();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test23248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23248");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        org.jsoup.Connection.Method method8 = response6.method();
        int int9 = response6.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test23249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23249");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        java.lang.String str11 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.net.URL uRL14 = response12.url();
        org.jsoup.Connection.Response response16 = response12.removeCookie("");
        java.lang.String str18 = response12.cookie("hi!");
        java.util.Map map19 = response12.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.lang.String str21 = response1.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test23250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23250");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        boolean boolean5 = response0.hasCookie("hi!");
        java.util.Map map6 = response0.cookies();
        org.jsoup.Connection.Method method7 = response0.method();
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str9 = response0.charset();
        java.lang.String str11 = response0.cookie("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method14 = response0.method();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test23251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23251");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map10 = response0.cookies();
        java.lang.String str11 = response0.charset();
        java.util.Map map12 = response0.headers();
        java.lang.Class<?> wildcardClass13 = map12.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test23252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23252");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.util.Map map8 = response0.headers();
        java.net.URL uRL9 = response0.url();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.Connection.Method method11 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test23253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23253");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        int int8 = response0.statusCode();
        boolean boolean10 = response0.hasCookie("");
        java.lang.String str12 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response0.contentType();
        java.lang.String str19 = response0.cookie("");
        boolean boolean21 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int15 = response14.statusCode();
        int int16 = response14.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23255");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response10.cookie("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test23256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23256");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.net.URL uRL18 = response16.url();
        java.net.URL uRL19 = response16.url();
        java.net.URL uRL20 = response16.url();
        java.lang.String str22 = response16.getHeaderCaseInsensitive("");
        java.util.Map map23 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Response response27 = response0.header("hi!", "");
        java.util.Map map28 = response0.cookies();
        java.lang.String str29 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test23257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23257");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.util.Map map9 = response0.cookies();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23259");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.statusMessage();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry13 = response11.scanHeaders("");
        java.lang.String str14 = response11.charset();
        org.jsoup.Connection.Response response17 = response11.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str20 = response18.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response18.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23260");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map17 = response16.cookies();
        int int18 = response16.statusCode();
        java.lang.String str20 = response16.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
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
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23261");
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
        java.lang.String str27 = response8.getHeaderCaseInsensitive("");
        java.util.Map map28 = response8.cookies();
        java.util.Map.Entry entry30 = response8.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.lang.String str35 = response32.header("hi!");
        org.jsoup.Connection.Response response37 = response32.removeCookie("hi!");
        org.jsoup.Connection.Response response39 = response32.removeCookie("");
        java.util.Map map40 = response32.cookies();
        org.jsoup.Connection.Response response43 = response32.header("hi!", "hi!");
        java.lang.String str45 = response32.header("");
        java.lang.String str46 = response32.charset();
        java.lang.String str47 = response32.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection31, (org.jsoup.Connection.Response) response32);
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
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test23262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23262");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.cookie("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("");
        boolean boolean15 = response0.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23263");
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
        java.net.URL uRL15 = response0.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        org.jsoup.Connection.Method method18 = response16.method();
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        java.util.Map.Entry entry22 = response16.scanHeaders("");
        java.lang.String str23 = response16.contentType();
        java.lang.String str25 = response16.cookie("hi!");
        java.util.Map map26 = response16.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.lang.Class<?> wildcardClass28 = map26.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test23264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23264");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        org.jsoup.Connection.Method method17 = response11.method();
        java.util.Map map18 = response11.headers();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str20 = response19.contentType();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL22 = response21.url();
        org.jsoup.Connection.Method method23 = response21.method();
        org.jsoup.Connection.Response response26 = response21.header("hi!", "");
        java.util.Map map27 = response21.headers();
        org.jsoup.Connection.Response response29 = response21.removeCookie("");
        java.util.Map map30 = response21.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str34 = response0.header("hi!");
        org.jsoup.Connection.Method method35 = response0.method();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(method35);
    }

    @Test
    public void test23265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23265");
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
        java.util.Map map13 = response12.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test23266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23266");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map map11 = response0.cookies();
        java.util.Map map12 = response0.cookies();
        boolean boolean14 = response0.hasCookie("hi!");
        java.util.Map map15 = response0.headers();
        java.util.Map map16 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test23267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23267");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str22 = response20.cookie("");
        org.jsoup.Connection.Method method23 = response20.method();
        java.util.Map.Entry entry25 = response20.scanHeaders("");
        java.lang.String str26 = response20.statusMessage();
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(entry25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test23268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23268");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "hi!");
        java.lang.String str14 = response0.charset();
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23269");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "hi!");
        java.util.Map map12 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map14 = response13.cookies();
        org.jsoup.Connection.Response response16 = response13.removeCookie("");
        java.lang.String str17 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean20 = response13.hasHeader("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test23270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23270");
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
        org.jsoup.Connection.Method method35 = response0.method();
        java.lang.String str36 = response0.charset();
        java.lang.String str37 = response0.contentType();
        boolean boolean39 = response0.hasHeader("hi!");
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
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test23271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.header("hi!");
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        java.lang.String str14 = response0.charset();
        java.net.URL uRL15 = response0.url();
        java.util.Map map16 = response0.headers();
        org.jsoup.Connection.Method method17 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test23272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23272");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str12 = response0.header("");
        java.lang.String str13 = response0.statusMessage();
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test23273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23273");
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
        java.lang.String str20 = response0.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.Connection.Response response22 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection21, response22);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23274");
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
        org.jsoup.Connection.Response response21 = response8.removeCookie("hi!");
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
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test23275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23275");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response4.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL8 = response7.url();
        org.jsoup.Connection.Method method9 = response7.method();
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        java.util.Map map12 = response7.headers();
        org.jsoup.Connection.Response response14 = response7.removeHeader("hi!");
        java.lang.String str15 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map17 = response7.headers();
        response4.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str20 = response4.cookie("hi!");
        boolean boolean22 = response4.hasHeader("hi!");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response4.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23276");
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
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test23277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23277");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        int int14 = response0.statusCode();
        java.net.URL uRL15 = response0.url();
        int int16 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test23278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23278");
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
        org.jsoup.Connection.Response response15 = response0.header("hi!", "");
        int int16 = response0.statusCode();
        java.lang.String str18 = response0.cookie("");
        java.util.Map map19 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test23279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23279");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.headers();
        java.util.Map map9 = response0.cookies();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "");
        java.lang.String str14 = response0.cookie("hi!");
        java.net.URL uRL15 = response0.url();
        boolean boolean17 = response0.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        java.lang.String str21 = response18.header("hi!");
        java.util.Map map22 = response18.headers();
        org.jsoup.Connection.Response response24 = response18.removeHeader("hi!");
        java.util.Map map25 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map25);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test23280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23280");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.lang.String str10 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str13 = response11.statusMessage();
        boolean boolean15 = response11.hasCookie("hi!");
        boolean boolean17 = response11.hasHeader("hi!");
        java.util.Map map18 = response11.cookies();
        java.lang.String str19 = response11.contentType();
        org.jsoup.Connection.Method method20 = response11.method();
        java.net.URL uRL21 = response11.url();
        java.util.Map map22 = response11.cookies();
        java.util.Map map23 = response11.cookies();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map25 = response11.headers();
        java.lang.String str26 = response11.charset();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL28 = response27.url();
        java.lang.String str30 = response27.header("hi!");
        org.jsoup.Connection.Response response32 = response27.removeCookie("hi!");
        org.jsoup.Connection.Response response34 = response27.removeCookie("");
        boolean boolean36 = response27.hasCookie("hi!");
        org.jsoup.Connection.Method method37 = response27.method();
        java.util.Map map38 = response27.cookies();
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.lang.String str40 = response39.contentType();
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL42 = response41.url();
        java.lang.String str43 = response41.statusMessage();
        java.util.Map map44 = response41.cookies();
        java.lang.String str46 = response41.header("");
        java.lang.String str48 = response41.header("hi!");
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response41);
        org.jsoup.Connection.Response response52 = response41.cookie("hi!", "");
        java.lang.String str53 = response41.statusMessage();
        java.util.Map map54 = response41.headers();
        response39.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map54);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test23281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23281");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "hi!");
        boolean boolean14 = response0.hasCookie("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23282");
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
        java.lang.String str28 = response13.charset();
        boolean boolean30 = response13.hasCookie("");
        java.lang.String str32 = response13.getHeaderCaseInsensitive("");
        java.lang.String str34 = response13.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method35 = response13.method();
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
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(method35);
    }

    @Test
    public void test23283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23283");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int13 = response12.statusCode();
        java.util.Map.Entry entry15 = response12.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test23284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23284");
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
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        org.jsoup.Connection.Method method18 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test23285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23285");
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
        boolean boolean58 = response0.hasCookie("");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test23286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23286");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.lang.String str7 = response0.statusMessage();
        java.lang.String str8 = response0.contentType();
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.Connection.Method method13 = response0.method();
        java.lang.String str14 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(entry10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23287");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.contentType();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("");
        java.lang.String str12 = response0.header("hi!");
        boolean boolean14 = response0.hasCookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test23288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23288");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        java.util.Map map4 = response0.headers();
        java.lang.String str6 = response0.cookie("hi!");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test23289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23289");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        int int3 = response0.statusCode();
        java.lang.String str4 = response0.charset();
        java.lang.String str5 = response0.charset();
        java.util.Map map6 = response0.cookies();
        java.lang.Class<?> wildcardClass7 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test23291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23291");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.net.URL uRL10 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test23292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23292");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test23293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23293");
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
        int int25 = response0.statusCode();
        org.jsoup.Connection.Method method26 = response0.method();
        boolean boolean28 = response0.hasCookie("");
        java.lang.String str30 = response0.cookie("hi!");
        java.net.HttpURLConnection httpURLConnection31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        org.jsoup.Connection.Method method34 = response32.method();
        java.lang.String str35 = response32.contentType();
        org.jsoup.Connection.Method method36 = response32.method();
        java.lang.String str37 = response32.contentType();
        org.jsoup.Connection.Response response40 = response32.cookie("hi!", "hi!");
        java.net.URL uRL41 = response32.url();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection31, (org.jsoup.Connection.Response) response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNull(uRL41);
    }

    @Test
    public void test23294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23294");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        org.jsoup.Connection.Response response10 = response6.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test23295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23295");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        boolean boolean10 = response0.hasCookie("");
        int int11 = response0.statusCode();
        java.util.Map map12 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test23296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23296");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasCookie("hi!");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str13 = response0.header("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23297");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        int int9 = response0.statusCode();
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test23298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23298");
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
        java.lang.String str18 = response0.header("hi!");
        org.jsoup.Connection.Response response20 = response0.removeCookie("");
        java.lang.String str21 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test23299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23299");
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
        org.jsoup.Connection.Method method18 = response11.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test23300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23300");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        boolean boolean9 = response0.hasCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        java.util.Map map13 = response0.cookies();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test23301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23301");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str8 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test23302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23302");
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
        boolean boolean17 = response0.hasCookie("hi!");
        java.util.Map.Entry entry19 = response0.scanHeaders("");
        boolean boolean21 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test23303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23303");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.header("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test23304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23304");
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
        java.util.Map map11 = response0.cookies();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23305");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean11 = response8.hasCookie("hi!");
        org.jsoup.Connection.Method method12 = response8.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test23306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23306");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.cookie("hi!", "hi!");
        int int4 = response0.statusCode();
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str11 = response0.cookie("");
        org.jsoup.Connection.Response response14 = response0.header("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23307");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        java.lang.String str7 = response1.charset();
        java.util.Map map8 = response1.cookies();
        boolean boolean10 = response1.hasHeader("hi!");
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response1.statusCode();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test23308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23308");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("hi!");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23309");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("hi!");
        java.util.Map map12 = response9.headers();
        org.jsoup.Connection.Response response14 = response9.removeCookie("");
        java.util.Map map15 = response9.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test23310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23310");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str4 = response0.contentType();
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23311");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.charset();
        java.util.Map.Entry entry9 = response0.scanHeaders("");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test23312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23312");
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
        java.net.URL uRL16 = response7.url();
        boolean boolean18 = response7.hasCookie("hi!");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response7.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test23313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23313");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        java.lang.String str11 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.net.URL uRL14 = response12.url();
        org.jsoup.Connection.Response response16 = response12.removeCookie("");
        java.lang.String str18 = response12.cookie("hi!");
        java.util.Map map19 = response12.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        java.util.Map map21 = response1.headers();
        java.lang.String str23 = response1.header("");
        org.jsoup.Connection.Response response26 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response28 = response1.removeCookie("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test23314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23314");
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
        java.util.Map map22 = response0.cookies();
        java.lang.String str23 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL25 = response24.url();
        org.jsoup.Connection.Method method26 = response24.method();
        java.lang.String str28 = response24.cookie("hi!");
        boolean boolean30 = response24.hasCookie("hi!");
        org.jsoup.Connection.Response response33 = response24.cookie("hi!", "");
        boolean boolean35 = response24.hasHeader("hi!");
        java.lang.String str36 = response24.statusMessage();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str38 = response24.statusMessage();
        java.util.Map map39 = response24.headers();
        java.util.Map map40 = response24.cookies();
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL42 = response41.url();
        org.jsoup.Connection.Method method43 = response41.method();
        org.jsoup.Connection.Response response45 = response41.removeCookie("hi!");
        java.lang.String str47 = response41.getHeaderCaseInsensitive("");
        java.util.Map map48 = response41.cookies();
        java.util.Map map49 = response41.headers();
        java.util.Map map50 = response41.cookies();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map50);
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL53 = response52.url();
        org.jsoup.Connection.Method method54 = response52.method();
        java.lang.String str56 = response52.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response57 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map58 = response57.headers();
        response52.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map58);
        java.util.Map map61 = response24.headers();
        java.util.Map map62 = response24.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map62);
        java.lang.String str64 = response0.contentType();
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
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(uRL42);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(uRL53);
        org.junit.Assert.assertNull(method54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test23315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23315");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        java.util.Map map8 = response0.headers();
        java.lang.String str9 = response0.charset();
        org.jsoup.Connection.Response response11 = response0.removeHeader("hi!");
        int int12 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test23316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.headers();
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test23317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23317");
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
        java.util.Map.Entry entry22 = response8.scanHeaders("");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response8.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(entry22);
    }

    @Test
    public void test23318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23318");
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
        java.lang.String str33 = response0.contentType();
        org.jsoup.Connection.Response response36 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document37 = response0.parse();
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
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response36);
    }

    @Test
    public void test23319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23319");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test23320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23320");
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
        java.lang.String str16 = response0.contentType();
        java.lang.String str17 = response0.statusMessage();
        java.util.Map map18 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test23321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23321");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test23322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23322");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.contentType();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean8 = response1.hasCookie("");
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
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        org.jsoup.Connection.Method method28 = response26.method();
        org.jsoup.Connection.Response response30 = response26.removeCookie("hi!");
        java.lang.String str32 = response26.getHeaderCaseInsensitive("");
        java.util.Map map33 = response26.cookies();
        java.util.Map map34 = response26.headers();
        java.util.Map map35 = response26.cookies();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        org.jsoup.Connection.Method method39 = response37.method();
        java.lang.String str41 = response37.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map43 = response42.headers();
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response48 = org.jsoup.helper.HttpConnection.Response.execute(request0, response47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
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
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test23323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23323");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        java.lang.String str9 = response0.contentType();
        java.util.Map.Entry entry11 = response0.scanHeaders("hi!");
        boolean boolean13 = response0.hasCookie("hi!");
        java.util.Map map14 = response0.cookies();
        java.lang.String str16 = response0.header("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(entry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test23324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23324");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response1.url();
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.header("hi!");
        int int14 = response1.statusCode();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test23325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23325");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        int int9 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = response11.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method15 = response14.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.lang.String str19 = response16.header("hi!");
        org.jsoup.Connection.Response response21 = response16.removeHeader("hi!");
        java.lang.String str23 = response16.header("hi!");
        java.lang.String str24 = response16.statusMessage();
        java.lang.String str26 = response16.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map map28 = response16.cookies();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.lang.String str32 = response10.cookie("");
        java.util.Map.Entry entry34 = response10.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(entry34);
    }

    @Test
    public void test23326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23326");
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
        org.jsoup.Connection.Response response20 = response13.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test23327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23327");
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
        java.lang.String str20 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23328");
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
        java.util.Map map32 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = response0.hasHeader("");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map32);
    }

    @Test
    public void test23329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23329");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str12 = response9.header("hi!");
        org.jsoup.Connection.Response response14 = response9.removeHeader("hi!");
        java.lang.String str16 = response9.header("hi!");
        java.lang.String str17 = response9.statusMessage();
        java.util.Map map18 = response9.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response0.charset();
        java.lang.String str22 = response0.cookie("hi!");
        java.lang.String str23 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test23330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23330");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.net.URL uRL3 = response1.url();
        org.jsoup.Connection.Response response5 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response6.header("hi!", "hi!");
        java.util.Map map10 = response6.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map10);
        int int12 = response1.statusCode();
        java.net.URL uRL13 = response1.url();
        boolean boolean15 = response1.hasCookie("hi!");
        java.util.Map map16 = response1.cookies();
        java.net.URL uRL17 = response1.url();
        java.util.Map map18 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test23331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23331");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.statusMessage();
        java.util.Map map4 = response1.cookies();
        java.lang.String str5 = response1.charset();
        java.util.Map map6 = response1.headers();
        java.lang.String str8 = response1.header("");
        int int9 = response1.statusCode();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23332");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.util.Map map7 = response1.cookies();
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.statusMessage();
        java.util.Map map12 = response9.cookies();
        java.lang.String str14 = response9.header("hi!");
        java.lang.String str16 = response9.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL17 = response9.url();
        java.net.URL uRL18 = response9.url();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test23333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23333");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("");
        java.util.Map.Entry entry14 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test23334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23334");
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
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean22 = response20.hasHeader("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test23335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.cookie("");
        boolean boolean7 = response0.hasCookie("");
        java.lang.String str8 = response0.charset();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test23336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23336");
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
        java.lang.String str21 = response0.header("hi!");
        org.jsoup.Connection.Response response24 = response0.header("hi!", "");
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL27 = response26.url();
        org.jsoup.Connection.Method method28 = response26.method();
        org.jsoup.Connection.Response response31 = response26.header("hi!", "");
        org.jsoup.Connection.Response response33 = response26.removeHeader("hi!");
        java.lang.String str35 = response26.header("hi!");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.Connection.Response response39 = response26.removeCookie("");
        org.jsoup.Connection.Response response42 = response26.header("hi!", "");
        java.util.Map map43 = response26.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response26);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test23337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23337");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
        java.util.Map.Entry entry13 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map16 = response14.headers();
        java.lang.String str18 = response14.header("hi!");
        java.util.Map map19 = response14.cookies();
        java.lang.Class<?> wildcardClass20 = response14.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(entry13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test23338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23338");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.cookies();
        java.util.Map map11 = response0.cookies();
        java.lang.String str12 = response0.charset();
        java.lang.String str14 = response0.header("hi!");
        java.net.URL uRL15 = response0.url();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test23339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23339");
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
        java.lang.String str19 = response0.statusMessage();
        java.lang.String str21 = response0.header("");
        java.lang.String str23 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test23340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23340");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.contentType();
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Method method11 = response0.method();
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
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test23341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23341");
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
        java.lang.String str17 = response0.contentType();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.method(method18);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test23342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23342");
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
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method36 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response37 = response35.method(method36);
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
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(method34);
    }

    @Test
    public void test23343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23343");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL5 = response0.url();
        boolean boolean7 = response0.hasCookie("");
        boolean boolean9 = response0.hasHeader("hi!");
        int int10 = response0.statusCode();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test23344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.cookie("hi!");
        java.lang.String str15 = response0.getHeaderCaseInsensitive("");
        java.util.Map map16 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test23345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23345");
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
        org.jsoup.Connection.Method method27 = response26.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.Connection.Response response31 = response28.cookie("hi!", "hi!");
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
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test23346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.cookie("");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL8 = response0.url();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.net.URL uRL12 = response10.url();
        org.jsoup.Connection.Response response14 = response10.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response15.header("hi!", "hi!");
        java.util.Map map19 = response15.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        int int21 = response10.statusCode();
        java.net.URL uRL22 = response10.url();
        boolean boolean24 = response10.hasCookie("hi!");
        java.util.Map map25 = response10.cookies();
        boolean boolean27 = response10.hasCookie("hi!");
        java.util.Map map28 = response10.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test23347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23347");
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
        java.lang.String str15 = response7.contentType();
        java.lang.String str16 = response7.charset();
        java.lang.String str18 = response7.getHeaderCaseInsensitive("");
        java.lang.String str19 = response7.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test23348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23348");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response11.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response11.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23349");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.contentType();
        java.util.Map map10 = response1.headers();
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str15 = response12.header("hi!");
        org.jsoup.Connection.Response response17 = response12.removeCookie("hi!");
        java.util.Map.Entry entry19 = response12.scanHeaders("hi!");
        int int20 = response12.statusCode();
        boolean boolean22 = response12.hasCookie("");
        java.util.Map map23 = response12.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test23350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23350");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        java.lang.String str7 = response0.charset();
        java.net.URL uRL8 = response0.url();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL12 = response11.url();
        java.lang.String str14 = response11.header("hi!");
        java.util.Map map15 = response11.cookies();
        org.jsoup.Connection.Method method16 = response11.method();
        int int17 = response11.statusCode();
        java.lang.String str18 = response11.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str22 = response19.header("hi!");
        org.jsoup.Connection.Response response24 = response19.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        int int26 = response25.statusCode();
        java.util.Map.Entry entry28 = response25.scanHeaders("");
        boolean boolean30 = response25.hasCookie("");
        java.util.Map map31 = response25.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        java.lang.String str34 = response0.contentType();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(entry28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test23351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23351");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("hi!");
        java.lang.String str4 = response0.statusMessage();
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.Connection.Response response9 = response0.removeCookie("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test23352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23352");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        boolean boolean11 = response0.hasHeader("hi!");
        java.lang.String str12 = response0.contentType();
        java.net.URL uRL13 = response0.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test23353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23353");
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
        int int13 = response0.statusCode();
        java.lang.String str15 = response0.header("hi!");
        java.util.Map map16 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test23354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23354");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("");
        java.lang.String str11 = response0.header("hi!");
        org.jsoup.Connection.Response response14 = response0.cookie("hi!", "");
        org.jsoup.Connection.Method method15 = response0.method();
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test23355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23355");
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
        org.jsoup.Connection.Response response16 = response0.cookie("hi!", "hi!");
        java.lang.String str18 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        java.lang.String str21 = response19.statusMessage();
        java.util.Map map22 = response19.cookies();
        org.jsoup.Connection.Response response24 = response19.removeHeader("hi!");
        java.util.Map.Entry entry26 = response19.scanHeaders("");
        java.util.Map.Entry entry28 = response19.scanHeaders("");
        java.lang.String str29 = response19.statusMessage();
        java.net.URL uRL30 = response19.url();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str33 = response31.cookie("hi!");
        java.util.Map map34 = response31.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection37 = null;
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL39 = response38.url();
        java.lang.String str41 = response38.header("hi!");
        org.jsoup.Connection.Response response43 = response38.removeHeader("hi!");
        java.lang.String str44 = response38.contentType();
        java.lang.String str45 = response38.charset();
        org.jsoup.helper.HttpConnection.Response response46 = new org.jsoup.helper.HttpConnection.Response(response38);
        java.lang.String str48 = response46.header("");
        boolean boolean50 = response46.hasCookie("hi!");
        java.lang.String str52 = response46.getHeaderCaseInsensitive("hi!");
        java.util.Map map53 = response46.headers();
        java.lang.String str55 = response46.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            response36.setupFromConnection(httpURLConnection37, (org.jsoup.Connection.Response) response46);
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(entry28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test23356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23356");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.URL uRL5 = response0.url();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response0.url();
        boolean boolean10 = response0.hasCookie("");
        java.util.Map map11 = response0.cookies();
        boolean boolean13 = response0.hasCookie("");
        java.lang.String str14 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL16 = response15.url();
        java.net.URL uRL17 = response15.url();
        org.jsoup.Connection.Response response19 = response15.removeCookie("");
        java.lang.String str21 = response15.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.net.URL uRL24 = response23.url();
        java.lang.String str25 = response23.charset();
        java.net.URL uRL26 = response23.url();
        java.util.Map map27 = response23.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.String str30 = response15.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response33 = response15.header("hi!", "hi!");
        org.jsoup.Connection.Method method34 = response15.method();
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response36);
        org.jsoup.Connection.Method method38 = response36.method();
        java.lang.String str39 = response36.statusMessage();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response36);
        java.net.URL uRL41 = response36.url();
        boolean boolean43 = response36.hasCookie("");
        java.util.Map map44 = response36.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test23357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23357");
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
        java.util.Map map36 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test23358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23358");
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
        java.lang.String str50 = response37.contentType();
        org.jsoup.Connection.Response response52 = response37.removeHeader("hi!");
        java.lang.Class<?> wildcardClass53 = response52.getClass();
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
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test23359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23359");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        int int5 = response0.statusCode();
        boolean boolean7 = response0.hasCookie("");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        boolean boolean11 = response0.hasCookie("");
        int int12 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.net.URL uRL15 = response13.url();
        org.jsoup.Connection.Response response17 = response13.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response18.header("hi!", "hi!");
        java.util.Map map22 = response18.cookies();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.util.Map map24 = response13.headers();
        java.lang.String str25 = response13.contentType();
        java.util.Map map26 = response13.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
        java.lang.String str28 = response0.contentType();
        org.jsoup.Connection.Response response31 = response0.cookie("hi!", "hi!");
        java.lang.String str33 = response0.cookie("");
        java.lang.Class<?> wildcardClass34 = response0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test23360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23360");
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
        int int14 = response0.statusCode();
        java.net.URL uRL15 = response0.url();
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
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test23361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23361");
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
        int int17 = response0.statusCode();
        org.jsoup.Connection.Response response20 = response0.cookie("hi!", "");
        java.lang.String str22 = response0.getHeaderCaseInsensitive("");
        int int23 = response0.statusCode();
        java.util.Map.Entry entry25 = response0.scanHeaders("");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(entry25);
    }

    @Test
    public void test23362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23362");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.contentType();
        org.jsoup.Connection.Response response9 = response6.removeCookie("hi!");
        org.jsoup.Connection.Method method10 = response6.method();
        java.lang.String str11 = response6.contentType();
        java.net.URL uRL12 = response6.url();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test23363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23363");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map5 = response0.cookies();
        java.lang.String str7 = response0.cookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test23364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23364");
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
        org.jsoup.Connection.Method method37 = response33.method();
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
        org.junit.Assert.assertNull(method37);
    }

    @Test
    public void test23365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23365");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.header("hi!");
        boolean boolean11 = response0.hasCookie("");
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.lang.String str14 = response0.statusMessage();
        java.lang.String str16 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str20 = response18.cookie("hi!");
        java.lang.String str22 = response18.header("hi!");
        java.util.Map map23 = response18.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.lang.String str26 = response0.cookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test23366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23366");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str9 = response0.cookie("");
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.charset();
        int int12 = response0.statusCode();
        java.lang.String str13 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23367");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.lang.String str9 = response0.header("");
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.header("");
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test23369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23369");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str21 = response19.cookie("");
        java.net.URL uRL22 = response19.url();
        java.net.URL uRL23 = response19.url();
        java.util.Map map24 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        boolean boolean27 = response0.hasHeader("hi!");
        java.lang.String str29 = response0.cookie("hi!");
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test23370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23370");
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
        org.jsoup.Connection.Method method22 = response13.method();
        java.util.Map map23 = response13.cookies();
        java.lang.String str25 = response13.getHeaderCaseInsensitive("hi!");
        java.lang.Class<?> wildcardClass26 = response13.getClass();
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
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test23371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23371");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        java.util.Map map4 = response0.cookies();
        java.lang.String str5 = response0.statusMessage();
        java.lang.String str7 = response0.cookie("");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.header("");
        int int11 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test23372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23372");
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
        org.jsoup.Connection.Method method23 = response1.method();
        java.util.Map map24 = response1.headers();
        java.lang.String str26 = response1.header("");
        boolean boolean28 = response1.hasCookie("");
        java.lang.String str29 = response1.charset();
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
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test23373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23373");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.util.Map map6 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Response response17 = response12.header("hi!", "");
        java.lang.String str19 = response12.header("hi!");
        java.util.Map.Entry entry21 = response12.scanHeaders("");
        org.jsoup.Connection.Method method22 = response12.method();
        java.util.Map map23 = response12.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map.Entry entry26 = response0.scanHeaders("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(entry26);
    }

    @Test
    public void test23374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23374");
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
        java.lang.String str17 = response14.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method18 = response14.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test23375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23375");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str7 = response0.header("hi!");
        java.lang.String str8 = response0.statusMessage();
        java.lang.String str10 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response13 = response11.removeCookie("");
        org.jsoup.Connection.Response response15 = response11.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response11.header("", "hi!");
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test23376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23376");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method4 = response2.method();
        java.util.Map map5 = response2.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map5);
        java.net.URL uRL7 = response1.url();
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.statusMessage();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23377");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.lang.String str8 = response0.statusMessage();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry13 = response11.scanHeaders("");
        java.lang.String str14 = response11.charset();
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        java.lang.String str17 = response11.statusMessage();
        java.util.Map map18 = response11.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test23378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23378");
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
        java.lang.String str34 = response0.contentType();
        org.jsoup.Connection.Method method35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response0.method(method35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test23379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23379");
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
        int int33 = response0.statusCode();
        java.net.URL uRL34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response35 = response0.url(uRL34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test23380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23380");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        org.jsoup.Connection.Response response11 = response6.removeCookie("");
        boolean boolean13 = response6.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response6.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test23381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        java.lang.String str3 = response1.charset();
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        java.lang.String str9 = response1.cookie("");
        int int10 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str13 = response11.cookie("");
        java.lang.String str14 = response11.contentType();
        java.lang.String str16 = response11.header("hi!");
        boolean boolean18 = response11.hasCookie("hi!");
        java.lang.String str20 = response11.getHeaderCaseInsensitive("");
        java.lang.String str21 = response11.statusMessage();
        java.lang.String str23 = response11.header("");
        java.util.Map map24 = response11.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Response response28 = response1.header("hi!", "hi!");
        java.lang.String str29 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test23382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23382");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        java.lang.String str3 = response0.cookie("");
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test23383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23383");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str4 = response1.statusMessage();
        java.util.Map.Entry entry6 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        boolean boolean11 = response1.hasCookie("hi!");
        java.util.Map map12 = response1.cookies();
        java.util.Map map13 = response1.cookies();
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test23384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23384");
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
        java.lang.String str21 = response13.getHeaderCaseInsensitive("hi!");
        java.lang.String str22 = response13.statusMessage();
        java.lang.String str23 = response13.contentType();
        java.lang.String str24 = response13.statusMessage();
        java.lang.String str25 = response13.statusMessage();
        java.lang.String str27 = response13.cookie("");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test23385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.cookie("hi!", "");
        java.lang.String str11 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response0.cookie("");
        java.lang.String str15 = response0.charset();
        java.lang.String str17 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response20 = response0.header("hi!", "hi!");
        java.util.Map map21 = response0.cookies();
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response0.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test23386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23386");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test23387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23387");
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
        boolean boolean24 = response22.hasHeader("hi!");
        org.jsoup.Connection.Response response27 = response22.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response22);
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test23388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23388");
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
        java.lang.String str14 = response0.cookie("");
        int int15 = response0.statusCode();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test23389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23389");
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
        int int23 = response0.statusCode();
        org.jsoup.Connection.Response response25 = response0.removeCookie("");
        java.util.Map map26 = response0.headers();
        java.net.URL uRL27 = response0.url();
        java.util.Map map28 = response0.headers();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test23390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23390");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
        java.lang.String str11 = response0.contentType();
        java.net.URL uRL12 = response0.url();
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test23391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23391");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.util.Map map4 = response0.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test23392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23392");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23393");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response10.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23394");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.contentType();
        java.util.Map map9 = response0.cookies();
        java.util.Map.Entry entry11 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL13 = response12.url();
        java.lang.String str14 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map16 = response15.headers();
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        java.util.Map.Entry entry19 = response12.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str22 = response12.header("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response27 = response24.header("hi!", "hi!");
        boolean boolean29 = response24.hasCookie("hi!");
        java.lang.String str31 = response24.header("");
        int int32 = response24.statusCode();
        org.jsoup.Connection.Response response34 = response24.removeCookie("hi!");
        org.jsoup.Connection.Response response36 = response24.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        org.jsoup.Connection.Method method39 = response37.method();
        org.jsoup.Connection.Response response41 = response37.removeCookie("hi!");
        java.lang.String str43 = response37.getHeaderCaseInsensitive("");
        java.util.Map map44 = response37.cookies();
        java.util.Map map45 = response37.headers();
        java.util.Map map46 = response37.cookies();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response23.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        java.net.URL uRL50 = response0.url();
        java.util.Map map51 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(response41);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(uRL50);
        org.junit.Assert.assertNotNull(map51);
    }

    @Test
    public void test23395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23395");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("hi!");
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeCookie("");
        java.lang.String str12 = response0.charset();
        org.jsoup.Connection.Method method13 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test23396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response10.getHeaderCaseInsensitive("hi!");
        java.lang.String str13 = response10.contentType();
        boolean boolean15 = response10.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test23397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23397");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        java.lang.String str6 = response0.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test23398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23398");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL10 = response9.url();
        java.net.URL uRL11 = response9.url();
        java.util.Map map12 = response9.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str15 = response13.statusMessage();
        java.util.Map map16 = response13.cookies();
        java.lang.String str18 = response13.header("hi!");
        java.lang.String str20 = response13.getHeaderCaseInsensitive("hi!");
        java.lang.String str21 = response13.contentType();
        java.util.Map map22 = response13.cookies();
        java.util.Map.Entry entry24 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        java.lang.String str27 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map29 = response28.headers();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.util.Map.Entry entry32 = response25.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str35 = response25.header("hi!");
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response40 = response37.header("hi!", "hi!");
        boolean boolean42 = response37.hasCookie("hi!");
        java.lang.String str44 = response37.header("");
        int int45 = response37.statusCode();
        org.jsoup.Connection.Response response47 = response37.removeCookie("hi!");
        org.jsoup.Connection.Response response49 = response37.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL51 = response50.url();
        org.jsoup.Connection.Method method52 = response50.method();
        org.jsoup.Connection.Response response54 = response50.removeCookie("hi!");
        java.lang.String str56 = response50.getHeaderCaseInsensitive("");
        java.util.Map map57 = response50.cookies();
        java.util.Map map58 = response50.headers();
        java.util.Map map59 = response50.cookies();
        response37.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response36.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map59);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(entry32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(response47);
        org.junit.Assert.assertNotNull(response49);
        org.junit.Assert.assertNull(uRL51);
        org.junit.Assert.assertNull(method52);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test23399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23399");
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
        int int29 = response0.statusCode();
        java.util.Map.Entry entry31 = response0.scanHeaders("");
        java.lang.String str33 = response0.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(entry31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test23400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23400");
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
        java.util.Map map19 = response18.cookies();
        java.lang.String str21 = response18.getHeaderCaseInsensitive("");
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
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test23401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23401");
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
        java.lang.String str20 = response0.header("hi!");
        java.util.Map map21 = response0.cookies();
        java.lang.String str23 = response0.cookie("hi!");
        java.lang.String str25 = response0.header("hi!");
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
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test23402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23402");
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
        java.lang.String str18 = response0.contentType();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test23403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23403");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response6.statusMessage();
        java.net.URL uRL8 = response6.url();
        java.lang.String str9 = response6.statusMessage();
        java.lang.String str10 = response6.contentType();
        java.util.Map map11 = response6.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test23404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23404");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL17 = response16.url();
        java.net.URL uRL18 = response16.url();
        java.net.URL uRL19 = response16.url();
        java.net.URL uRL20 = response16.url();
        java.lang.String str22 = response16.getHeaderCaseInsensitive("");
        java.util.Map map23 = response16.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        org.jsoup.Connection.Response response27 = response0.header("hi!", "");
        java.lang.String str28 = response0.statusMessage();
        java.util.Map.Entry entry30 = response0.scanHeaders("");
        java.lang.String str31 = response0.charset();
        org.jsoup.Connection.Method method32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response33 = response0.method(method32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test23405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23405");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        java.lang.String str7 = response0.header("");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.lang.String str12 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23406");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str6 = response5.contentType();
        org.jsoup.Connection.Response response8 = response5.removeCookie("");
        java.lang.String str10 = response5.header("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23407");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.header("hi!");
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Response response12 = response0.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response0.hasHeader("");
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
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23408");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        java.lang.String str12 = response10.statusMessage();
        boolean boolean14 = response10.hasCookie("hi!");
        boolean boolean16 = response10.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.lang.String str19 = response17.statusMessage();
        java.util.Map map20 = response17.cookies();
        java.lang.String str22 = response17.header("");
        java.lang.String str24 = response17.header("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response28 = response17.cookie("hi!", "");
        java.util.Map map29 = response17.headers();
        java.util.Map map30 = response17.headers();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.Connection.Response response35 = response0.header("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response35);
    }

    @Test
    public void test23409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23409");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map.Entry entry4 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.cookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str9 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23410");
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
        org.jsoup.Connection.Response response16 = response13.cookie("hi!", "");
        java.lang.String str17 = response13.statusMessage();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL20 = response19.url();
        org.jsoup.Connection.Method method21 = response19.method();
        org.jsoup.Connection.Response response24 = response19.header("hi!", "");
        java.util.Map map25 = response19.headers();
        org.jsoup.Connection.Response response27 = response19.removeCookie("");
        java.lang.String str29 = response19.getHeaderCaseInsensitive("");
        boolean boolean31 = response19.hasHeader("hi!");
        org.jsoup.Connection.Response response33 = response19.removeHeader("hi!");
        java.lang.String str35 = response19.header("hi!");
        boolean boolean37 = response19.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response19);
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
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test23411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23411");
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
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response8.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test23412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23412");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.lang.String str4 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL6 = response5.url();
        java.lang.String str8 = response5.header("hi!");
        java.util.Map map9 = response5.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response1.statusMessage();
        int int12 = response1.statusCode();
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL16 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test23413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23413");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.cookies();
        boolean boolean9 = response0.hasCookie("hi!");
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = response0.url();
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
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test23414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23414");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.util.Map map10 = response1.cookies();
        java.lang.String str12 = response1.cookie("");
        java.lang.String str13 = response1.charset();
        java.util.Map map14 = response1.cookies();
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.util.Map map17 = response1.cookies();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str21 = response19.cookie("");
        java.lang.String str22 = response19.contentType();
        java.lang.String str24 = response19.header("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str26 = response25.contentType();
        boolean boolean28 = response25.hasHeader("hi!");
        java.util.Map map29 = response25.cookies();
        java.util.Map map30 = response25.cookies();
        java.util.Map.Entry entry32 = response25.scanHeaders("");
        java.net.URL uRL33 = response25.url();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(entry32);
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test23415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23415");
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test23416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23416");
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
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str16 = response14.cookie("");
        java.lang.String str17 = response14.contentType();
        java.lang.String str19 = response14.getHeaderCaseInsensitive("hi!");
        java.lang.String str20 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response24 = response21.cookie("hi!", "");
        java.lang.String str25 = response21.charset();
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test23417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23417");
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
        java.lang.String str16 = response0.charset();
        java.util.Map.Entry entry18 = response0.scanHeaders("");
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
        org.junit.Assert.assertNull(entry18);
    }

    @Test
    public void test23418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.cookie("hi!");
        java.util.Map.Entry entry13 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test23419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23419");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.cookie("");
        org.jsoup.Connection.Method method5 = response1.method();
        java.lang.String str6 = response1.statusMessage();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test23420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23420");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response0.header("hi!", "hi!");
        boolean boolean5 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.cookies();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test23421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23421");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str6 = response0.charset();
        java.util.Map map7 = response0.cookies();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response11 = response0.cookie("hi!", "");
        java.lang.String str12 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test23422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23422");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map4 = response3.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map4);
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.header("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        boolean boolean16 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23423");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map map7 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean13 = response11.hasCookie("");
        java.util.Map map14 = response11.headers();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response11.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test23424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23424");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map map15 = response11.headers();
        java.lang.String str17 = response11.getHeaderCaseInsensitive("");
        java.lang.String str18 = response11.contentType();
        org.jsoup.Connection.Response response20 = response11.removeCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test23425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23425");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        java.lang.String str13 = response0.charset();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23426");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        boolean boolean6 = response0.hasCookie("hi!");
        int int7 = response0.statusCode();
        java.lang.String str8 = response0.charset();
        java.util.Map map9 = response0.cookies();
        boolean boolean11 = response0.hasCookie("");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23427");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        java.lang.String str9 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.cookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.Connection.Method method16 = response14.method();
        java.lang.String str18 = response14.cookie("hi!");
        boolean boolean20 = response14.hasCookie("hi!");
        org.jsoup.Connection.Response response23 = response14.cookie("hi!", "");
        boolean boolean25 = response14.hasHeader("hi!");
        java.lang.String str26 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str28 = response27.statusMessage();
        boolean boolean30 = response27.hasCookie("");
        java.util.Map map31 = response27.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.jsoup.Connection.Method method33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response34 = response0.method(method33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test23428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23428");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        boolean boolean9 = response0.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test23429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23429");
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
        java.lang.String str20 = response0.cookie("hi!");
        java.lang.String str21 = response0.contentType();
        org.jsoup.Connection.Response response23 = response0.removeHeader("hi!");
        java.net.URL uRL24 = response0.url();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test23430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23430");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response6 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response7.scanHeaders("hi!");
        boolean boolean11 = response7.hasCookie("");
        java.lang.String str12 = response7.contentType();
        java.lang.String str14 = response7.getHeaderCaseInsensitive("");
        int int15 = response7.statusCode();
        boolean boolean17 = response7.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response7.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test23431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23431");
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
        java.lang.String str21 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response24 = response0.cookie("hi!", "hi!");
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
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test23432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23432");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str7 = response0.statusMessage();
        boolean boolean9 = response0.hasCookie("");
        boolean boolean11 = response0.hasHeader("hi!");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test23433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23433");
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
        java.lang.String str16 = response0.contentType();
        java.net.URL uRL17 = response0.url();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test23434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23434");
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
        java.util.Map.Entry entry26 = response13.scanHeaders("");
        org.jsoup.Connection.Method method27 = response13.method();
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
        org.junit.Assert.assertNull(entry26);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test23435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23435");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map16 = response6.cookies();
        java.util.Map.Entry entry18 = response6.scanHeaders("hi!");
        java.lang.String str19 = response6.contentType();
        java.lang.String str20 = response6.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23436");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.cookie("");
        java.lang.String str5 = response1.contentType();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test23437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23437");
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
        java.lang.String str15 = response0.getHeaderCaseInsensitive("");
        java.lang.String str16 = response0.contentType();
        java.lang.String str18 = response0.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.header("", "hi!");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test23438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23438");
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
        org.jsoup.Connection.Method method16 = response0.method();
        java.lang.String str17 = response0.charset();
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
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test23439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23439");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        boolean boolean7 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test23440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23440");
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
        boolean boolean27 = response12.hasCookie("hi!");
        int int28 = response12.statusCode();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test23441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23441");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        java.lang.String str10 = response0.cookie("");
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        java.lang.String str14 = response0.charset();
        org.jsoup.Connection.Response response16 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response0.removeCookie("hi!");
        java.util.Map map19 = response0.cookies();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test23442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23442");
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
        java.net.URL uRL50 = response37.url();
        java.lang.String str52 = response37.header("");
        int int53 = response37.statusCode();
        int int54 = response37.statusCode();
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
        org.junit.Assert.assertNull(uRL50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test23443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23443");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.net.URL uRL6 = response0.url();
        java.util.Map map7 = response0.headers();
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        boolean boolean14 = response0.hasCookie("hi!");
        java.net.URL uRL15 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test23444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23444");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map8 = response1.headers();
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("");
        java.util.Map.Entry entry14 = response1.scanHeaders("");
        java.lang.String str15 = response1.charset();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry entry20 = response1.scanHeaders("");
        org.jsoup.Connection.Response response22 = response1.removeCookie("");
        java.lang.String str24 = response1.header("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test23445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23445");
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
        org.jsoup.Connection.Response response13 = response9.removeCookie("hi!");
        java.util.Map map14 = response9.cookies();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test23446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23446");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        int int8 = response0.statusCode();
        java.lang.String str9 = response0.contentType();
        java.net.URL uRL10 = response0.url();
        org.jsoup.Connection.Response response13 = response0.header("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test23447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23447");
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
        org.jsoup.Connection.Response response16 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test23448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test23449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23449");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry entry7 = response0.scanHeaders("");
        int int8 = response0.statusCode();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test23450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23450");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        boolean boolean6 = response0.hasHeader("hi!");
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.util.Map map10 = response0.headers();
        java.lang.String str11 = response0.charset();
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test23451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23451");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str11 = response9.cookie("");
        java.lang.String str12 = response9.contentType();
        java.lang.String str14 = response9.header("hi!");
        org.jsoup.Connection.Response response16 = response9.removeCookie("");
        org.jsoup.Connection.Response response19 = response9.header("hi!", "");
        int int20 = response9.statusCode();
        org.jsoup.Connection.Response response23 = response9.cookie("hi!", "");
        java.lang.String str25 = response9.cookie("hi!");
        boolean boolean27 = response9.hasCookie("hi!");
        java.util.Map map28 = response9.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test23452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23452");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Response response3 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23453");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response5 = response0.header("hi!", "");
        java.lang.String str7 = response0.header("hi!");
        java.util.Map map8 = response0.cookies();
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response13 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response15 = response0.removeHeader("hi!");
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test23454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23454");
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
        java.net.URL uRL18 = response0.url();
        java.lang.String str19 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Method method22 = response20.method();
        java.lang.String str23 = response20.statusMessage();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        boolean boolean26 = response24.hasCookie("hi!");
        java.lang.String str28 = response24.header("");
        org.jsoup.Connection.Method method29 = response24.method();
        org.jsoup.Connection.Response response31 = response24.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL33 = response32.url();
        java.net.URL uRL34 = response32.url();
        org.jsoup.Connection.Response response36 = response32.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response40 = response37.header("hi!", "hi!");
        java.util.Map map41 = response37.cookies();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map41);
        int int43 = response32.statusCode();
        java.lang.String str45 = response32.header("");
        java.lang.String str47 = response32.getHeaderCaseInsensitive("");
        java.lang.String str48 = response32.contentType();
        java.util.Map map49 = response32.cookies();
        int int50 = response32.statusCode();
        boolean boolean52 = response32.hasHeader("hi!");
        java.util.Map map53 = response32.headers();
        response24.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map53);
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test23455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23455");
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
        org.jsoup.Connection.Method method19 = response0.method();
        org.jsoup.Connection.Response response21 = response0.removeHeader("hi!");
        java.util.Map.Entry entry23 = response0.scanHeaders("hi!");
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
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(entry23);
    }

    @Test
    public void test23456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23456");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        boolean boolean7 = response0.hasCookie("hi!");
        java.lang.String str9 = response0.getHeaderCaseInsensitive("");
        java.lang.String str10 = response0.statusMessage();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response14 = response0.header("hi!", "");
        java.net.URL uRL15 = response0.url();
        java.lang.String str17 = response0.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test23457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23457");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL10 = response9.url();
        java.lang.String str11 = response9.statusMessage();
        java.util.Map map12 = response9.cookies();
        java.lang.String str14 = response9.header("hi!");
        java.lang.String str16 = response9.getHeaderCaseInsensitive("hi!");
        java.lang.String str17 = response9.charset();
        java.lang.String str18 = response9.charset();
        java.util.Map map19 = response9.headers();
        org.jsoup.Connection.Response response21 = response9.removeHeader("hi!");
        org.jsoup.Connection.Response response24 = response9.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL26 = response25.url();
        java.lang.String str28 = response25.header("hi!");
        org.jsoup.Connection.Response response30 = response25.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL32 = response31.url();
        java.lang.String str33 = response31.statusMessage();
        java.util.Map map34 = response31.cookies();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.lang.String str38 = response0.contentType();
        java.lang.String str40 = response0.header("");
        java.lang.String str41 = response0.contentType();
        org.jsoup.Connection.Response response44 = response0.header("hi!", "");
        org.jsoup.Connection.Method method45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response46 = response0.method(method45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response44);
    }

    @Test
    public void test23458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23458");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response9 = response0.removeHeader("hi!");
        java.net.URL uRL10 = response0.url();
        boolean boolean12 = response0.hasCookie("");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test23459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23459");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str12 = response0.header("hi!");
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test23460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23460");
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
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean16 = response12.hasCookie("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23461");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        java.lang.String str6 = response0.header("hi!");
        int int7 = response0.statusCode();
        boolean boolean9 = response0.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry12 = response10.scanHeaders("hi!");
        int int13 = response10.statusCode();
        java.lang.String str15 = response10.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23462");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        java.util.Map map3 = response0.cookies();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str7 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.charset();
        java.util.Map map10 = response0.headers();
        java.net.URL uRL11 = response0.url();
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        org.jsoup.Connection.Response response15 = response0.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response16.body();
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test23463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23463");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.cookie("hi!");
        boolean boolean10 = response0.hasHeader("hi!");
        org.jsoup.Connection.Response response12 = response0.removeCookie("");
        org.jsoup.Connection.Response response14 = response0.removeCookie("");
        java.util.Map.Entry entry16 = response0.scanHeaders("");
        int int17 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test23464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23464");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.net.URL uRL3 = response0.url();
        org.jsoup.Connection.Method method4 = response0.method();
        java.lang.String str5 = response0.statusMessage();
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        boolean boolean9 = response0.hasCookie("");
        java.lang.String str10 = response0.statusMessage();
        org.jsoup.Connection.Response response12 = response0.removeHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23465");
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
        org.jsoup.Connection.Response response17 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL19 = response18.url();
        org.jsoup.Connection.Response response21 = response18.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response18.cookie("", "");
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test23466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23466");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.util.Map.Entry entry5 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeHeader("hi!");
        java.lang.String str10 = response0.header("hi!");
        boolean boolean12 = response0.hasHeader("hi!");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response0.header("hi!");
        java.util.Map map17 = response0.headers();
        int int18 = response0.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test23467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23467");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.header("hi!");
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.util.Map map8 = response1.headers();
        java.util.Map map9 = response1.cookies();
        java.util.Map map10 = response1.cookies();
        java.lang.String str12 = response1.cookie("");
        java.util.Map map13 = response1.headers();
        java.lang.String str15 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test23468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23468");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str4 = response0.contentType();
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean10 = response0.hasCookie("hi!");
        java.lang.String str11 = response0.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23469");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Response response6 = response0.cookie("hi!", "");
        java.lang.String str7 = response0.charset();
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry11 = response0.scanHeaders("");
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
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test23470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23470");
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
        java.util.Map map20 = response0.headers();
        java.lang.String str22 = response0.cookie("hi!");
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response0.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test23471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23471");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.cookie("hi!");
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map.Entry entry8 = response0.scanHeaders("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.Connection.Method method11 = response0.method();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL14 = response13.url();
        java.lang.String str16 = response13.header("hi!");
        org.jsoup.Connection.Response response18 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str22 = response21.charset();
        java.lang.String str24 = response21.header("");
        boolean boolean26 = response21.hasCookie("hi!");
        org.jsoup.Connection.Response response28 = response21.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test23472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23472");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str3 = response0.header("hi!");
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response6.hasHeader("hi!");
        java.lang.String str11 = response6.header("");
        java.util.Map.Entry entry13 = response6.scanHeaders("hi!");
        org.jsoup.Connection.Response response16 = response6.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response18 = response6.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response6.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test23473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23473");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("hi!");
        org.jsoup.Connection.Method method9 = response0.method();
        org.jsoup.Connection.Response response12 = response0.header("hi!", "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test23474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23474");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method4 = response3.method();
        boolean boolean6 = response3.hasCookie("hi!");
        java.lang.String str7 = response3.statusMessage();
        java.lang.String str8 = response3.contentType();
        java.util.Map map9 = response3.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.Connection.Method method12 = response10.method();
        java.lang.String str14 = response10.cookie("hi!");
        boolean boolean16 = response10.hasCookie("hi!");
        int int17 = response10.statusCode();
        org.jsoup.Connection.Method method18 = response10.method();
        org.jsoup.Connection.Response response21 = response10.cookie("hi!", "hi!");
        java.lang.String str23 = response10.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map25 = response10.cookies();
        org.jsoup.Connection.Response response27 = response10.removeCookie("hi!");
        java.util.Map map28 = response10.cookies();
        java.util.Map.Entry entry30 = response10.scanHeaders("");
        java.util.Map map31 = response10.cookies();
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test23475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23475");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasCookie("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "");
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        java.util.Map map10 = response0.cookies();
        boolean boolean12 = response0.hasCookie("hi!");
        java.util.Map map13 = response0.headers();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test23476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23476");
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
        int int14 = response0.statusCode();
        org.jsoup.Connection.Method method15 = response0.method();
        org.jsoup.Connection.Response response18 = response0.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test23477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23477");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str5 = response0.header("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map11 = response10.cookies();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test23478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23478");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeCookie("");
        java.util.Map map9 = response6.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map9);
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test23479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23479");
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
        java.lang.String str28 = response0.cookie("hi!");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test23480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.net.URL uRL2 = response0.url();
        org.jsoup.Connection.Response response4 = response0.removeCookie("");
        org.jsoup.Connection.Response response7 = response0.cookie("hi!", "hi!");
        org.jsoup.Connection.Method method8 = response0.method();
        int int9 = response0.statusCode();
        java.lang.String str10 = response0.statusMessage();
        java.lang.String str11 = response0.contentType();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response13.cookie("");
        java.net.URL uRL16 = response13.url();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response20 = response13.removeCookie("");
        java.util.Map map21 = response13.headers();
        java.lang.String str22 = response13.statusMessage();
        java.lang.String str24 = response13.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method25 = response13.method();
        int int26 = response13.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test23481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map1 = response0.headers();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.contentType();
        java.lang.String str7 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry9 = response0.scanHeaders("");
        java.lang.String str10 = response0.charset();
        org.junit.Assert.assertNotNull(map1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test23482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23482");
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
        org.jsoup.Connection.Method method18 = response0.method();
        org.jsoup.Connection.Response response21 = response0.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str24 = response22.cookie("");
        org.jsoup.Connection.Response response26 = response22.removeHeader("hi!");
        int int27 = response22.statusCode();
        boolean boolean29 = response22.hasHeader("hi!");
        org.jsoup.Connection.Response response31 = response22.removeHeader("hi!");
        java.util.Map map32 = response22.cookies();
        org.jsoup.Connection.Method method33 = response22.method();
        java.lang.String str35 = response22.getHeaderCaseInsensitive("");
        java.lang.String str36 = response22.charset();
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL38 = response37.url();
        java.lang.String str40 = response37.header("hi!");
        org.jsoup.Connection.Response response42 = response37.removeHeader("hi!");
        java.lang.String str43 = response37.contentType();
        org.jsoup.Connection.Response response45 = response37.removeCookie("");
        java.util.Map map46 = response37.cookies();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map46);
        java.lang.String str50 = response0.cookie("hi!");
        java.net.URL uRL51 = response0.url();
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
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(uRL38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(response45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNull(uRL51);
    }

    @Test
    public void test23483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str4 = response1.charset();
        java.net.URL uRL5 = response1.url();
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Response response17 = response12.cookie("hi!", "");
        java.util.Map map18 = response12.cookies();
        java.lang.String str20 = response12.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test23484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23484");
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
        int int19 = response13.statusCode();
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response13.url(uRL20);
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
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test23485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23485");
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
        java.net.URL uRL26 = response0.url();
        java.util.Map.Entry entry28 = response0.scanHeaders("");
        java.net.URL uRL29 = response0.url();
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
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNull(entry28);
        org.junit.Assert.assertNull(uRL29);
    }

    @Test
    public void test23486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23486");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.Connection.Response response6 = response0.header("hi!", "hi!");
        java.net.URL uRL7 = response0.url();
        java.util.Map.Entry entry9 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response10.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map14 = response10.headers();
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
        org.junit.Assert.assertNotNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test23487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23487");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        org.jsoup.Connection.Response response4 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response7 = response0.header("hi!", "hi!");
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "");
        org.jsoup.Connection.Response response13 = response0.removeCookie("hi!");
        java.lang.String str14 = response0.contentType();
        java.lang.String str16 = response0.cookie("hi!");
        java.util.Map.Entry entry18 = response0.scanHeaders("");
        boolean boolean20 = response0.hasHeader("hi!");
        java.lang.String str21 = response0.statusMessage();
        java.util.Map map22 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test23488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23488");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        java.util.Map map6 = response0.cookies();
        java.util.Map map7 = response0.cookies();
        java.util.Map map8 = response0.cookies();
        org.jsoup.Connection.Response response11 = response0.header("hi!", "hi!");
        org.jsoup.Connection.Response response13 = response0.removeCookie("");
        int int14 = response0.statusCode();
        java.util.Map.Entry entry16 = response0.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test23489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23489");
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
        java.lang.String str13 = response9.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean16 = response9.hasCookie("");
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test23490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23490");
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
        java.lang.String str25 = response0.cookie("hi!");
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test23491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23491");
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
        int int34 = response0.statusCode();
        java.net.URL uRL35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response36 = response0.url(uRL35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test23492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23492");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "hi!");
        java.lang.String str12 = response0.header("hi!");
        org.jsoup.Connection.Response response15 = response0.cookie("hi!", "");
        org.jsoup.Connection.Response response17 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test23493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23493");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("");
        java.lang.String str3 = response0.contentType();
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Response response10 = response0.header("hi!", "");
        int int11 = response0.statusCode();
        java.util.Map.Entry entry13 = response0.scanHeaders("");
        java.lang.String str14 = response0.statusMessage();
        java.util.Map.Entry entry16 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Response response19 = response0.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(entry16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test23494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23494");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method3 = response1.method();
        java.util.Map map4 = response1.headers();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response1.cookies();
        boolean boolean11 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test23495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23495");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.Connection.Method method2 = response0.method();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map map5 = response0.headers();
        boolean boolean7 = response0.hasCookie("hi!");
        int int8 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL10 = response9.url();
        java.net.URL uRL11 = response9.url();
        org.jsoup.Connection.Response response14 = response9.header("hi!", "");
        java.lang.Class<?> wildcardClass15 = response9.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test23496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23496");
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
        org.jsoup.Connection.Response response16 = response13.header("hi!", "hi!");
        org.jsoup.Connection.Response response19 = response13.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test23497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23497");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str6 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str8 = response7.statusMessage();
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test23498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23498");
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
        java.util.Map map25 = response0.cookies();
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
    }

    @Test
    public void test23499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23499");
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
        java.lang.String str16 = response15.statusMessage();
        java.util.Map map17 = response15.headers();
        java.net.URL uRL18 = response15.url();
        int int19 = response15.statusCode();
        java.lang.String str21 = response15.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response24 = response15.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test23500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest46.test23500");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map18 = response17.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        java.util.Map map21 = response20.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        java.util.Map.Entry entry24 = response0.scanHeaders("");
        java.lang.String str25 = response0.charset();
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
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(str25);
    }
}

