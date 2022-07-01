import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test18501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18501");
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
        int int15 = response1.statusCode();
        response1.numRedirects = 32;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str20 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode();
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test18503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        boolean boolean11 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test18504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18504");
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
        java.lang.String str26 = response1.charset;
        java.net.HttpURLConnection httpURLConnection27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = null;
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        int int30 = response29.numRedirects;
        org.jsoup.Connection.Response response32 = response29.removeHeader("hi!");
        int int33 = response29.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry35 = response29.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap36 = response29.cookies();
        java.lang.String str38 = response29.header("");
        org.jsoup.Connection.Method method39 = response29.method();
        java.lang.String str40 = response29.statusMessage;
        java.lang.String str41 = response29.charset();
        java.lang.String str42 = response29.statusMessage();
        org.jsoup.Connection.Response response45 = response29.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection27, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNull(strEntry35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(response45);
    }

    @Test
    public void test18505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18505");
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
        response1.numRedirects = 35;
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
    }

    @Test
    public void test18506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18506");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.numRedirects = (short) 0;
        response1.statusMessage = "hi!";
        java.lang.String str13 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18507");
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
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test18508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18508");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18509");
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
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
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
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test18510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18510");
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
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        int int16 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test18511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18511");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode();
        response1.executed = false;
        boolean boolean13 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test18513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18513");
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
        java.lang.String str14 = response1.statusMessage;
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test18514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18514");
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
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test18515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18515");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18516");
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
        java.lang.String str15 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean19 = response16.hasHeaderWithValue("hi!", "");
        java.lang.String str20 = response16.statusMessage;
        java.lang.String str21 = response16.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response16.scanHeaders("");
        response16.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test18517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18517");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.contentType = "";
        response1.executed = true;
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str15 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18518");
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
        java.lang.String str16 = response1.contentType();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        response1.executed = true;
        java.lang.String str21 = response1.contentType;
        boolean boolean23 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request24 = response1.req;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        response25.statusMessage = "";
        java.lang.String str28 = response25.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test18519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18519");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.contentType();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18520");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.contentType();
        java.lang.String str11 = response1.statusMessage;
        response1.numRedirects = (byte) 0;
        boolean boolean14 = response1.executed;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeCookie("");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test18521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18521");
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
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.statusMessage;
        java.lang.String str18 = response1.header("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18522");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.numRedirects;
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        int int9 = response1.statusCode();
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18523");
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
        boolean boolean14 = response1.hasCookie("hi!");
        int int15 = response1.numRedirects;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        java.lang.String str20 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18524");
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
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeCookie("");
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test18525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18525");
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
        java.lang.String str17 = response1.cookie("hi!");
        java.lang.String str18 = response1.charset;
        response1.statusCode = (byte) -1;
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18526");
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
        boolean boolean22 = response1.executed;
        java.lang.String str23 = response1.charset;
        java.lang.String str24 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method28 = response1.method();
        response1.statusCode = 100;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test18527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18527");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        boolean boolean9 = response1.hasCookie("hi!");
        response1.charset = "";
        response1.numRedirects = 1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        int int9 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        response1.executed = true;
        boolean boolean14 = response1.executed;
        boolean boolean16 = response1.hasHeader("hi!");
        int int17 = response1.numRedirects;
        int int18 = response1.numRedirects;
        response1.statusCode = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test18529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18529");
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
        java.lang.String str13 = response1.contentType();
        int int14 = response1.statusCode;
        int int15 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18530");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.charset();
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.contentType;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method22 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test18531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18531");
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
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Response response25 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test18532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18532");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.net.URL uRL14 = response1.url();
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        int int18 = response1.statusCode;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18533");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.header("");
        response1.numRedirects = (short) 10;
        java.lang.String str16 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18534");
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
        java.lang.String str11 = response1.charset;
        org.jsoup.Connection.Request request12 = response1.req;
        java.net.URL uRL13 = response1.url();
        int int14 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18535");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        int int18 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18536");
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
        boolean boolean14 = response12.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer15 = response12.byteData;
        response12.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test18537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18537");
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
        java.lang.String str19 = response1.cookie("hi!");
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test18538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18538");
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
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test18539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18539");
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
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        java.lang.String str25 = response1.header("hi!");
        java.lang.String str26 = response1.statusMessage();
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test18540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset;
        int int11 = response1.statusCode;
        boolean boolean13 = response1.hasHeader("hi!");
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18541");
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
        java.lang.String str20 = response1.cookie("hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.statusMessage;
        java.lang.String str24 = response1.header("hi!");
        java.lang.String str25 = response1.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test18542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18542");
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
        java.lang.String str18 = response1.charset;
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test18543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18543");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.executed = true;
        int int14 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response15.numRedirects = (short) 100;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18544");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        int int9 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str13 = response1.contentType();
        java.lang.String str14 = response1.charset;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18545");
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
        int int15 = response1.statusCode();
        int int16 = response1.statusCode();
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
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
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test18546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18546");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.lang.String str11 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Method method13 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test18547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18547");
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
        response1.executed = false;
        response1.charset = "hi!";
        response1.numRedirects = (byte) 1;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test18548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18548");
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
        java.lang.String str15 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        response1.statusMessage = "hi!";
        response1.statusCode = 35;
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(byteBuffer23);
    }

    @Test
    public void test18549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18549");
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
        java.lang.String str16 = response1.charset();
        response1.numRedirects = (byte) 10;
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18550");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.contentType = "hi!";
        java.lang.String str14 = response1.charset;
        java.lang.String str16 = response1.cookie("hi!");
        response1.executed = false;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18551");
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
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18552");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode;
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18553");
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
        response1.statusCode = '#';
        response1.numRedirects = 35;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        org.jsoup.Connection.Response response29 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Request request30 = null;
        response1.req = request30;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test18554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18554");
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
        java.lang.String str17 = response16.contentType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response16.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18555");
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
        java.lang.String str20 = response1.statusMessage();
        response1.contentType = "";
        java.lang.String str23 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test18556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test18557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18557");
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
        int int13 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request15 = response14.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test18558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18558");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.statusCode = '#';
        response1.executed = false;
        java.lang.String str10 = response1.charset;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        response1.numRedirects = 32;
        java.net.URL uRL16 = response1.url();
        int int17 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test18559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18559");
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
            java.lang.String str21 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test18560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18560");
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
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.net.URL uRL19 = response1.url();
        int int20 = response1.statusCode;
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test18561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18561");
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
        response1.contentType = "hi!";
        int int22 = response1.statusCode;
        java.lang.String str23 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test18562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18562");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.charset();
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test18563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18563");
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
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test18564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18564");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        response1.numRedirects = (byte) 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test18565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18565");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "hi!");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test18566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18566");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Method method14 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test18567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18567");
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
        java.lang.String str13 = response1.charset();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = (byte) 10;
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.lang.String str20 = response1.statusMessage;
        java.lang.String str21 = response1.charset;
        org.jsoup.Connection.Response response23 = response1.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test18568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        boolean boolean12 = response1.executed;
        java.lang.String str13 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18569");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        int int9 = response1.numRedirects;
        java.lang.String str11 = response1.header("hi!");
        org.jsoup.Connection.Request request12 = response1.req;
        int int13 = response1.statusCode();
        response1.executed = true;
        boolean boolean18 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18570");
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
        java.lang.String str11 = response1.charset;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = (byte) 100;
        java.lang.String str17 = response1.header("");
        response1.statusMessage = "";
        java.lang.String str20 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18571");
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
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        boolean boolean16 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test18572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18572");
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
        java.lang.String str13 = response1.header("");
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test18573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18573");
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
        int int17 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test18574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18574");
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
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document31 = response1.parse();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18575");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18576");
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
        java.lang.String str19 = response1.contentType;
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18577");
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
        response1.numRedirects = '4';
        org.jsoup.Connection.Method method14 = response1.method();
        response1.numRedirects = (short) -1;
        boolean boolean18 = response1.hasCookie("hi!");
        java.lang.String str19 = response1.contentType;
        int int20 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test18578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18578");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean6 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str11 = response1.statusMessage;
        response1.charset = "hi!";
        int int14 = response1.statusCode;
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18579");
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
        java.lang.String str18 = response1.charset;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18580");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.lang.String str14 = response1.charset;
        int int15 = response1.numRedirects;
        boolean boolean17 = response1.hasHeader("hi!");
        boolean boolean19 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18581");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request14 = response13.req;
        java.lang.String str15 = response13.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response13.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18582");
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
        java.lang.String str13 = response1.header("");
        java.lang.String str14 = response1.statusMessage();
        boolean boolean16 = response1.hasHeader("hi!");
        boolean boolean18 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18583");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.contentType = "";
        response1.executed = true;
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test18585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18585");
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
        response1.numRedirects = (byte) 100;
        response1.executed = false;
        boolean boolean18 = response1.hasHeader("hi!");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18586");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        response1.numRedirects = (byte) 10;
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test18587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18587");
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
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.contentType;
        java.lang.String str23 = response1.contentType;
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.cookies();
        java.lang.String str28 = response1.getHeaderCaseInsensitive("");
        java.lang.String str30 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test18588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18588");
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
        java.lang.String str11 = response1.contentType;
        response1.executed = false;
        java.lang.String str15 = response1.cookie("hi!");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18589");
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
        java.lang.String str15 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18590");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("");
        java.lang.String str16 = response1.cookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test18591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18591");
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
        org.jsoup.Connection.Method method17 = response1.method();
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test18592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18592");
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
        int int13 = response9.statusCode;
        int int14 = response9.statusCode();
        response9.statusCode = 20;
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response9.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18593");
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
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        int int18 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str21 = response1.contentType();
        response1.executed = false;
        boolean boolean25 = response1.hasCookie("hi!");
        response1.executed = false;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test18594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18594");
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
        org.jsoup.Connection.Request request14 = response2.req;
        java.lang.String str15 = response2.contentType;
        response2.statusCode = 20;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
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
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18595");
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
        java.lang.String str16 = response1.charset;
        int int17 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response24 = response22.removeHeader("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test18596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18596");
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
        int int14 = response1.statusCode();
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        response1.statusCode = '4';
        response1.executed = false;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test18597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        response1.executed = true;
        java.lang.String str16 = response1.cookie("hi!");
        response1.numRedirects = 1;
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test18598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18598");
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
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Method method16 = response1.method();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test18599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18599");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.charset;
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Method method12 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test18600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18600");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str6 = response1.charset();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18601");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18602");
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
        java.lang.String str19 = response1.contentType;
        java.lang.String str20 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18603");
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
        java.lang.String str14 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method16 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test18604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18604");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        int int8 = response1.statusCode;
        response1.numRedirects = 100;
        java.lang.String str11 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18605");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response3.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response3.byteData = byteBuffer5;
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response3.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test18606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18606");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusMessage = "";
        response1.contentType = "";
        response1.charset = "";
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response18.numRedirects = 2;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test18607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18607");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str17 = response1.header("");
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "");
        response1.numRedirects = 32;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18608");
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
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test18609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18609");
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
        java.lang.String str13 = response1.statusMessage;
        java.net.URL uRL14 = response1.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response15.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18610");
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
        boolean boolean19 = response1.hasCookie("hi!");
        java.lang.String str20 = response1.charset;
        response1.contentType = "hi!";
        response1.statusCode = (short) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.lang.String str26 = response1.contentType();
        org.jsoup.Connection.Request request27 = null;
        response1.req = request27;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test18611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18611");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        response1.executed = true;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18612");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str10 = response1.contentType;
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str13 = response1.contentType();
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.cookie("hi!");
        java.lang.String str18 = response1.cookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18613");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test18614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18614");
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
        int int19 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.charset;
        int int23 = response1.statusCode;
        java.lang.String str25 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test18615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18615");
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
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test18616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18616");
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
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        response1.executed = false;
        java.lang.String str21 = response1.statusMessage;
        java.lang.String str22 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18617");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        boolean boolean15 = response1.hasHeader("hi!");
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18618");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        response1.numRedirects = '#';
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str11 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18619");
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
        java.lang.String str17 = response1.contentType;
        java.net.URL uRL18 = response1.url();
        response1.numRedirects = (byte) 0;
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test18620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18620");
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
        boolean boolean22 = response1.executed;
        java.lang.String str23 = response1.statusMessage;
        int int24 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test18621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18621");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.statusMessage();
        java.lang.String str12 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18622");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.net.URL uRL10 = response1.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18623");
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
        java.lang.String str23 = response1.charset();
        java.lang.String str24 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test18624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18624");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.statusMessage();
        response1.executed = true;
        int int10 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test18625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18625");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response1.hasHeader("hi!");
        response1.statusMessage = "";
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        int int19 = response1.numRedirects;
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test18626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18626");
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
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        int int16 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test18627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18627");
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
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str20 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18628");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        response1.numRedirects = (short) 0;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request14 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test18629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18629");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method9 = response1.method();
        response1.statusCode = 32;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test18630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18630");
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
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(byteBuffer23);
    }

    @Test
    public void test18631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18631");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        int int8 = response1.statusCode;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test18632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18632");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        int int13 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test18633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.contentType = "";
        response1.executed = true;
        int int14 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response15.statusMessage();
        int int17 = response15.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.Class<?> wildcardClass19 = response18.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18634");
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
        java.lang.String str19 = response18.charset;
        boolean boolean21 = response18.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18635");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        response1.numRedirects = (short) 1;
        response1.numRedirects = (byte) 10;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test18636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18636");
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
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        response22.statusMessage = "";
        java.lang.String str25 = response22.contentType();
        java.lang.String str26 = response22.statusMessage;
        java.lang.String str27 = response22.charset;
        response22.executed = false;
        java.lang.String str31 = response22.header("hi!");
        java.lang.String str32 = response22.charset();
        org.jsoup.Connection.Method method33 = response22.method();
        java.net.URL uRL34 = response22.url();
        org.jsoup.Connection.Method method35 = response22.method();
        org.jsoup.Connection.Response response38 = response22.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, response38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(uRL34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNotNull(response38);
    }

    @Test
    public void test18637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18637");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test18638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18638");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.charset;
        boolean boolean14 = response1.executed;
        int int15 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        response1.contentType = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test18639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18639");
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
        java.lang.String str16 = response1.header("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request19 = response1.req;
        java.lang.String str20 = response1.charset();
        java.net.URL uRL21 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test18640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18640");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        boolean boolean7 = response1.executed;
        response1.contentType = "hi!";
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response12.headers();
        org.jsoup.Connection.Method method16 = response12.method();
        java.nio.ByteBuffer byteBuffer17 = null;
        response12.byteData = byteBuffer17;
        java.lang.String str19 = response12.statusMessage;
        java.lang.String str20 = response12.statusMessage;
        java.lang.String str22 = response12.header("hi!");
        java.lang.String str23 = response12.contentType();
        org.jsoup.Connection.Response response25 = response12.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response29 = response26.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test18641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18641");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.Connection.Method method10 = response2.method();
        int int11 = response2.statusCode;
        java.lang.String str12 = response2.charset();
        org.jsoup.Connection.Response response14 = response2.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        org.jsoup.Connection.Request request16 = response2.req;
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
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test18642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18642");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        java.lang.String str9 = response1.charset;
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        boolean boolean13 = response1.executed;
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.statusCode = 97;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test18643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18643");
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
        java.lang.String str18 = response1.statusMessage;
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "hi!");
        int int22 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strEntry24);
    }

    @Test
    public void test18644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18644");
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
        int int29 = response1.statusCode();
        java.net.URL uRL30 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray31 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNull(uRL30);
    }

    @Test
    public void test18645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18645");
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
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.charset = "hi!";
        java.lang.String str18 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18646");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode();
        response1.executed = true;
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str11 = response1.charset();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18647");
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
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test18648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18648");
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
        org.jsoup.Connection.Request request20 = response1.req;
        org.jsoup.Connection.Method method21 = response1.method();
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
        boolean boolean25 = response1.executed;
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        response28.statusMessage = "";
        java.lang.String str31 = response28.contentType();
        boolean boolean32 = response28.executed;
        org.jsoup.Connection.Response response34 = response28.removeCookie("hi!");
        java.lang.String str35 = response28.charset();
        java.lang.String str36 = response28.statusMessage;
        java.lang.String str37 = response28.charset();
        java.lang.String str38 = response28.contentType();
        java.nio.ByteBuffer byteBuffer39 = null;
        response28.byteData = byteBuffer39;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test18649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18649");
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
        org.jsoup.Connection.Response response24 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test18650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18650");
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
        response1.charset = "";
        response1.numRedirects = (short) 10;
        java.lang.String str16 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test18651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18651");
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
        java.lang.String str14 = response1.contentType;
        int int15 = response1.numRedirects;
        response1.numRedirects = (short) 1;
        response1.statusMessage = "";
        java.lang.String str20 = response1.charset();
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        boolean boolean25 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test18652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18652");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.charset;
        response1.contentType = "";
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18653");
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
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Method method15 = response1.method();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test18654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18654");
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
        boolean boolean13 = response1.executed;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.lang.String str16 = response1.contentType;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18655");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        java.lang.String str8 = response1.charset;
        response1.charset = "";
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        boolean boolean17 = response1.executed;
        java.lang.String str19 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test18656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18656");
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
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        java.lang.String str19 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18657");
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
        boolean boolean13 = response1.executed;
        java.lang.String str14 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18658");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.net.URL uRL10 = response1.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response1.statusCode();
        response1.contentType = "";
        int int15 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18659");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        boolean boolean11 = response1.hasHeader("hi!");
        boolean boolean13 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response14.charset();
        java.lang.String str16 = response14.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response14.cookies();
        boolean boolean18 = response14.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18660");
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
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        boolean boolean26 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response1.headers();
        java.nio.ByteBuffer byteBuffer28 = null;
        response1.byteData = byteBuffer28;
        response1.statusMessage = "hi!";
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test18661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18661");
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
        response1.statusMessage = "";
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.statusCode();
        response1.statusCode = '4';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test18662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18662");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.jsoup.Connection.Method method16 = response1.method();
        int int17 = response1.statusCode;
        int int18 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18663");
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
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test18664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18664");
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
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18665");
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
        response1.numRedirects = (short) 1;
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test18666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18666");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        response1.charset = "hi!";
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test18667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18667");
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
        org.jsoup.Connection.Method method14 = response1.method();
        int int15 = response1.statusCode();
        response1.statusCode = 35;
        java.lang.String str18 = response1.statusMessage();
        int int19 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test18668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18668");
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
        java.lang.String str16 = response1.header("hi!");
        java.lang.String str18 = response1.header("");
        int int19 = response1.statusCode;
        java.net.URL uRL20 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test18669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18669");
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
        java.nio.ByteBuffer byteBuffer16 = response13.byteData;
        int int17 = response13.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test18670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18670");
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
        boolean boolean15 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18671");
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
        response1.numRedirects = (byte) 10;
        java.lang.String str19 = response1.statusMessage;
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        java.lang.String str25 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test18672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18672");
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
        response1.statusMessage = "hi!";
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18673");
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
        response1.numRedirects = (byte) 100;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.net.URL uRL16 = response1.url();
        response1.statusCode = 32;
        response1.statusMessage = "hi!";
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
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test18674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18674");
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
        java.lang.String str17 = response1.statusMessage;
        int int18 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18675");
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
        int int19 = response1.statusCode();
        boolean boolean20 = response1.executed;
        boolean boolean21 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeCookie("");
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
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18676");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL12 = response11.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str14 = response11.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18677");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = response1.req;
        int int18 = response1.numRedirects;
        java.lang.String str19 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18678");
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
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.Connection.Method method19 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test18679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18679");
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
        org.jsoup.Connection.Request request12 = response1.req;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test18680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18680");
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
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test18681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18681");
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
        java.lang.String str16 = response1.contentType();
        response1.statusCode = (byte) 10;
        org.jsoup.Connection.Request request19 = response1.req;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test18682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18682");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.numRedirects;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.contentType = "";
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18683");
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
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test18684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18684");
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
        response1.statusCode = (byte) 10;
        response1.numRedirects = '#';
        java.nio.ByteBuffer byteBuffer26 = null;
        response1.byteData = byteBuffer26;
        java.lang.String str28 = response1.charset;
        java.lang.String str30 = response1.header("hi!");
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test18685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18685");
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
        java.lang.String str11 = response1.charset;
        org.jsoup.Connection.Method method12 = response1.method();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "";
        boolean boolean17 = response1.executed;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18686");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        int int10 = response1.statusCode;
        org.jsoup.Connection.Request request11 = response1.req;
        response1.executed = true;
        boolean boolean15 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18687");
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
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "");
        boolean boolean17 = response1.executed;
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test18688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18688");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.contentType;
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18689");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Request request10 = response1.req;
        int int11 = response1.statusCode;
        int int12 = response1.statusCode();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        response15.statusMessage = "";
        java.lang.String str18 = response15.contentType();
        response15.contentType = "";
        int int21 = response15.statusCode();
        java.lang.String str23 = response15.header("");
        java.lang.String str25 = response15.cookie("hi!");
        java.lang.String str26 = response15.contentType();
        java.lang.String str28 = response15.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry31 = response29.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(strEntry31);
    }

    @Test
    public void test18690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18690");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18691");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.statusMessage = "hi!";
        java.net.URL uRL16 = response13.url();
        java.lang.String str17 = response13.statusMessage();
        int int18 = response13.numRedirects;
        java.lang.String str19 = response13.charset();
        java.lang.String str20 = response13.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18692");
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
        boolean boolean16 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18693");
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
        java.lang.String str24 = response1.statusMessage;
        org.jsoup.Connection.Response response27 = response1.cookie("hi!", "");
        response1.executed = false;
        boolean boolean30 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray31 = response1.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test18694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18694");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        response1.contentType = "hi!";
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.lang.String str26 = response1.statusMessage;
        int int27 = response1.numRedirects;
        response1.statusCode = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray30 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
    }

    @Test
    public void test18695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18695");
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
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response19.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test18696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18696");
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
        java.lang.String str16 = response1.header("hi!");
        int int17 = response1.statusCode;
        int int18 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18697");
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
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response16.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response16.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18698");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        java.lang.String str19 = response1.header("hi!");
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18699");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.executed = false;
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        int int10 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response11.executed;
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response11.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18700");
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
        java.lang.String str11 = response1.statusMessage;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        boolean boolean15 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18701");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.executed = true;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test18702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18702");
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
        response1.statusMessage = "";
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str18 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test18703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18703");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
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
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test18704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18704");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.lang.String str5 = response1.charset;
        java.lang.String str6 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str9 = response1.charset();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18705");
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
        response1.charset = "";
        response1.statusMessage = "";
        response1.contentType = "hi!";
        int int27 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test18706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18706");
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
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        java.net.URL uRL13 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test18707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18707");
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
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test18708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18708");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response18.statusMessage = "";
        java.lang.String str21 = response18.contentType();
        boolean boolean22 = response18.executed;
        org.jsoup.Connection.Response response24 = response18.removeCookie("hi!");
        java.lang.String str25 = response18.charset();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str28 = response18.getHeaderCaseInsensitive("");
        java.lang.String str29 = response18.statusMessage;
        org.jsoup.Connection.Request request30 = response18.req;
        java.lang.String str31 = response18.statusMessage;
        java.net.URL uRL32 = response18.url();
        int int33 = response18.statusCode();
        response18.contentType = "hi!";
        int int36 = response18.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(request30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test18709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18709");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test18710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18710");
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
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.lang.String str22 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18711");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.lang.String str9 = response2.charset();
        org.jsoup.Connection.Method method10 = response2.method();
        int int11 = response2.statusCode;
        response2.statusCode = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test18712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18712");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        int int9 = response1.numRedirects;
        response1.executed = false;
        java.lang.String str12 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18713");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        int int7 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        int int14 = response1.statusCode;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test18714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18714");
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
        response1.numRedirects = 0;
        java.lang.String str20 = response1.contentType;
        boolean boolean22 = response1.hasCookie("hi!");
        response1.contentType = "";
        int int25 = response1.statusCode();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test18715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18715");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.statusMessage;
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.numRedirects;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18716");
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
        java.lang.String str18 = response1.contentType;
        response1.contentType = "";
        org.jsoup.Connection.Request request21 = response1.req;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        response1.numRedirects = '#';
        java.lang.Class<?> wildcardClass26 = response1.getClass();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test18717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18717");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.contentType;
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test18718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18718");
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
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.charset;
        int int18 = response1.statusCode();
        boolean boolean20 = response1.hasCookie("hi!");
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18719");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strEntry17);
    }

    @Test
    public void test18720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18720");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean5 = response1.executed;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test18721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18721");
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
        int int22 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        java.lang.Class<?> wildcardClass24 = strMap23.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test18722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18722");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        response1.statusMessage = "";
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        response1.executed = true;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test18723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18723");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        java.lang.String str12 = response1.statusMessage();
        response1.statusMessage = "";
        boolean boolean15 = response1.executed;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18724");
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
        java.lang.String str19 = response1.charset();
        response1.statusMessage = "";
        int int22 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL28 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL28);
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test18725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18725");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test18726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18726");
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
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test18727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18727");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.contentType;
        java.lang.String str19 = response1.statusMessage;
        response1.statusMessage = "hi!";
        java.lang.String str22 = response1.charset;
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18728");
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
        response1.statusCode = 1;
        int int17 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test18729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18729");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        response1.contentType = "hi!";
        java.lang.String str15 = response1.header("");
        java.lang.String str17 = response1.header("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18730");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Request request9 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test18731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18731");
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
        boolean boolean13 = response1.hasHeader("hi!");
        response1.statusMessage = "";
        response1.numRedirects = (byte) 10;
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18732");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        response1.statusCode = '#';
        response1.numRedirects = 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.contentType;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test18733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18733");
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
        int int13 = response1.statusCode();
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.header("");
        response1.statusCode = 10;
        org.jsoup.Connection.Response response21 = response1.header("hi!", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test18734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18734");
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
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18735");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.net.URL uRL6 = response1.url();
        response1.statusCode = 20;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test18736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18736");
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
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        response19.contentType = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response19.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test18737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18737");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.statusMessage();
        boolean boolean11 = response1.hasCookie("hi!");
        int int12 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test18738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18738");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        response1.executed = false;
        response1.contentType = "";
        response1.executed = true;
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test18739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18739");
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
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test18740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18740");
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
        java.lang.String str16 = response1.charset;
        response1.contentType = "hi!";
        java.lang.String str19 = response1.contentType;
        response1.charset = "hi!";
        java.lang.String str22 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18741");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.header("");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("hi!");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        int int18 = response17.numRedirects;
        org.jsoup.Connection.Response response20 = response17.removeHeader("hi!");
        int int21 = response17.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response17.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response17.cookies();
        org.jsoup.Connection.Response response27 = response17.header("hi!", "hi!");
        response17.executed = false;
        boolean boolean31 = response17.hasCookie("hi!");
        response17.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test18742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18742");
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
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        response1.contentType = "hi!";
        response1.numRedirects = '#';
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18743");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset;
        int int11 = response1.statusCode;
        boolean boolean13 = response1.hasHeader("hi!");
        int int14 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        int int18 = response15.statusCode;
        boolean boolean19 = response15.executed;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18744");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.charset();
        java.lang.String str14 = response1.header("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.contentType;
        java.lang.String str19 = response1.header("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18745");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        response1.statusCode = 20;
        int int10 = response1.numRedirects;
        response1.contentType = "hi!";
        response1.statusCode = 20;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test18746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18746");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        boolean boolean8 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        java.lang.String str11 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test18747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18747");
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
        int int16 = response1.statusCode();
        java.lang.String str18 = response1.header("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18748");
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
        java.lang.String str16 = response1.charset();
        boolean boolean18 = response1.hasHeader("hi!");
        java.net.URL uRL19 = response1.url();
        response1.statusCode = (byte) 1;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test18749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18749");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str13 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18750");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        java.lang.String str6 = response2.statusMessage;
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        response2.contentType = "";
        int int12 = response2.numRedirects;
        java.lang.String str13 = response2.contentType();
        java.lang.String str14 = response2.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18751");
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
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = '#';
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test18752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18752");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response2.headers();
        org.jsoup.Connection.Method method6 = response2.method();
        java.nio.ByteBuffer byteBuffer7 = null;
        response2.byteData = byteBuffer7;
        java.lang.String str10 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response2.statusMessage();
        org.jsoup.Connection.Response response13 = response2.removeHeader("hi!");
        java.net.URL uRL14 = response2.url();
        org.jsoup.Connection.Method method15 = response2.method();
        response2.statusMessage = "";
        boolean boolean20 = response2.hasHeaderWithValue("hi!", "");
        java.net.URL uRL21 = response2.url();
        int int22 = response2.statusCode;
        int int23 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test18753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18753");
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
        response1.statusMessage = "hi!";
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test18754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18754");
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
        int int18 = response1.statusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test18755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18755");
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
        boolean boolean19 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.net.URL uRL22 = response1.url();
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test18756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18756");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.Connection.Method method9 = response1.method();
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        boolean boolean14 = response1.executed;
        response1.executed = false;
        response1.executed = true;
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        response21.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response21.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response21.cookies();
        org.jsoup.Connection.Request request26 = response21.req;
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response21.headers();
        org.jsoup.Connection.Response response30 = response21.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request31 = null;
        response21.req = request31;
        java.lang.String str33 = response21.charset();
        org.jsoup.Connection.Response response35 = response21.removeCookie("hi!");
        org.jsoup.Connection.Response response37 = response21.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, response37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(request26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNotNull(response37);
    }

    @Test
    public void test18757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18757");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        boolean boolean15 = response1.hasHeader("hi!");
        java.lang.String str17 = response1.cookie("hi!");
        response1.charset = "hi!";
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        response22.statusMessage = "";
        java.lang.String str25 = response22.contentType();
        response22.contentType = "";
        java.lang.String str28 = response22.contentType();
        response22.statusCode = 20;
        java.net.URL uRL31 = response22.url();
        java.nio.ByteBuffer byteBuffer32 = null;
        response22.byteData = byteBuffer32;
        java.util.Map<java.lang.String, java.lang.String> strMap34 = response22.cookies();
        java.net.URL uRL35 = response22.url();
        boolean boolean36 = response22.executed;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertNull(uRL35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test18758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18758");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        response1.statusCode = 10;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Method method14 = response1.method();
        int int15 = response1.statusCode();
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        int int23 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test18759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18759");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request21 = response20.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test18760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18760");
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
        int int17 = response1.statusCode;
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        boolean boolean21 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test18761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18761");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response14.header("");
        boolean boolean17 = response14.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18762");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.contentType();
        int int15 = response1.statusCode();
        boolean boolean16 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18763");
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
        response1.numRedirects = (byte) 100;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage();
        java.lang.String str20 = response1.header("hi!");
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18764");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test18765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18765");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        java.net.URL uRL10 = response1.url();
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18766");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Response response9 = response1.removeCookie("hi!");
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.statusCode = 35;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        boolean boolean17 = response1.executed;
        boolean boolean19 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18767");
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
        int int13 = response9.statusCode();
        org.jsoup.Connection.Method method14 = response9.method();
        int int15 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str17 = response9.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18768");
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
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "");
        boolean boolean22 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18769");
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
        java.lang.String str18 = response1.header("hi!");
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response23 = response1.header("hi!", "hi!");
        response1.executed = false;
        java.lang.String str27 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test18770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18770");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        boolean boolean18 = response1.hasHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test18771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18771");
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
        java.lang.String str14 = response1.statusMessage;
        boolean boolean16 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        boolean boolean19 = response1.executed;
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test18772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18772");
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
        response1.statusMessage = "hi!";
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.statusMessage;
        java.lang.String str20 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18773");
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
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.charset;
        response1.statusCode = (short) 1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18774");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test18775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18775");
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
        response1.statusCode = (short) 100;
        java.net.URL uRL20 = response1.url();
        int int21 = response1.numRedirects;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test18776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18776");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int6 = response1.statusCode();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        int int9 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test18777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18777");
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
        java.lang.String str19 = response1.charset();
        response1.statusMessage = "";
        int int22 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        java.lang.String str26 = response1.charset;
        java.net.URL uRL27 = response1.url();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL27);
    }

    @Test
    public void test18778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18778");
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
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.contentType;
        response1.charset = "";
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "hi!";
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18779");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18780");
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
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        java.lang.String str19 = response1.charset;
        java.lang.String str21 = response1.header("hi!");
        boolean boolean24 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18781");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.lang.String str19 = response1.statusMessage();
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test18782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18782");
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
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Request request15 = response1.req;
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test18783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18783");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage;
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test18784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18784");
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
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        response1.executed = true;
        boolean boolean22 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18785");
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
        int int17 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        boolean boolean20 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18786");
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
        int int19 = response1.numRedirects;
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        java.lang.String str23 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18787");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        response1.statusCode = '#';
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str10 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test18788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18788");
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
        response1.contentType = "";
        java.net.URL uRL22 = response1.url();
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response27 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test18789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18789");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test18790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18790");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str15 = response1.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18791");
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
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request24 = response1.req;
        java.lang.String str25 = response1.statusMessage();
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
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test18792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18792");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        boolean boolean18 = response1.hasHeader("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test18793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18793");
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
        response1.executed = true;
        java.lang.String str21 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        response1.contentType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test18794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18794");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        java.lang.String str9 = response1.statusMessage;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response12.headers();
        org.jsoup.Connection.Method method16 = response12.method();
        java.nio.ByteBuffer byteBuffer17 = null;
        response12.byteData = byteBuffer17;
        java.lang.String str19 = response12.statusMessage;
        int int20 = response12.statusCode;
        java.lang.String str21 = response12.statusMessage();
        boolean boolean23 = response12.hasHeader("hi!");
        response12.executed = false;
        org.jsoup.Connection.Method method26 = response12.method();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response12.cookies();
        org.jsoup.Connection.Response response30 = response12.header("hi!", "");
        response12.contentType = "";
        org.jsoup.Connection.Request request33 = null;
        response12.req = request33;
        response12.numRedirects = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test18795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18795");
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
        java.lang.String str16 = response1.header("hi!");
        java.lang.String str18 = response1.header("");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18796");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        int int9 = response1.statusCode();
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        boolean boolean13 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18797");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.statusMessage;
        java.lang.Class<?> wildcardClass11 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test18798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18798");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.statusMessage;
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Request request18 = response1.req;
        response1.executed = false;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("hi!");
        int int23 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNotNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test18799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18799");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        boolean boolean16 = response1.executed;
        int int17 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test18800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18800");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Response response4 = response1.removeHeader("hi!");
        int int5 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Response response11 = response1.header("hi!", "hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.contentType;
        java.lang.String str18 = response1.header("hi!");
        java.lang.String str19 = response1.contentType;
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test18801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18801");
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
        java.lang.String str14 = response1.header("");
        java.net.URL uRL15 = response1.url();
        response1.contentType = "hi!";
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.lang.String str21 = response1.cookie("hi!");
        java.lang.String str23 = response1.header("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test18802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18802");
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
        response1.statusMessage = "";
        boolean boolean19 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test18803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18803");
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
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18804");
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
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        boolean boolean22 = response1.hasCookie("hi!");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test18805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18805");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18806");
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
        java.net.URL uRL22 = response1.url();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test18807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18807");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        boolean boolean6 = response2.executed;
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response2.scanHeaders("");
        java.lang.String str11 = response2.contentType;
        java.lang.String str12 = response2.contentType;
        org.jsoup.Connection.Response response14 = response2.removeHeader("hi!");
        response2.statusCode = (short) 0;
        int int17 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        boolean boolean20 = response2.hasHeader("hi!");
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response2);
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
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18808");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test18809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18809");
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
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.charset;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.Connection.Response response19 = response1.header("hi!", "");
        java.net.URL uRL20 = response1.url();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test18810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18810");
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
        response11.statusMessage = "";
        response11.contentType = "hi!";
        response11.statusCode = (short) 100;
        java.lang.String str18 = response11.contentType;
        response11.statusMessage = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test18811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18811");
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
        response1.statusMessage = "";
        java.lang.String str14 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18812");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        java.lang.String str4 = response1.cookie("hi!");
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.Connection.Response response12 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18813");
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
        response1.statusMessage = "";
        org.jsoup.Connection.Request request22 = response1.req;
        org.jsoup.Connection.Response response25 = response1.cookie("hi!", "");
        java.lang.String str26 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = response1.parse();
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
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test18814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18814");
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
        java.lang.String str16 = response1.contentType;
        java.lang.String str18 = response1.header("");
        response1.statusCode = (short) 10;
        java.net.URL uRL21 = response1.url();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test18815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18815");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(byteBuffer9);
    }

    @Test
    public void test18816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18816");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        int int8 = response1.numRedirects;
        java.lang.String str9 = response1.charset;
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test18817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18817");
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
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Method method15 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18818");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method9 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test18819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18819");
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
        response1.executed = true;
        int int21 = response1.numRedirects;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test18820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18820");
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
        response1.charset = "hi!";
        response1.contentType = "hi!";
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
    }

    @Test
    public void test18821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18821");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str6 = response1.header("");
        response1.statusMessage = "";
        response1.numRedirects = 0;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test18822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18822");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        boolean boolean8 = response1.executed;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.charset;
        response1.contentType = "";
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18823");
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
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18824");
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
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        boolean boolean19 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.lang.String str22 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test18825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18825");
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
        response1.numRedirects = (byte) 100;
        response1.executed = false;
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test18826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18826");
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
        response1.numRedirects = (byte) 10;
        java.lang.String str20 = response1.header("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18827");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response20.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test18828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18828");
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
        response1.contentType = "";
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18829");
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
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        response1.statusMessage = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18830");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.charset = "hi!";
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18831");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response1.contentType();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response17.charset = "";
        java.nio.ByteBuffer byteBuffer20 = response17.byteData;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test18832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18832");
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
        boolean boolean21 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        java.lang.String str26 = response1.getHeaderCaseInsensitive("");
        java.lang.String str27 = response1.contentType();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(byteBuffer24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test18833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18833");
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
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str17 = response1.header("");
        response1.numRedirects = (byte) -1;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18834");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("");
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test18835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18835");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.header("hi!");
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "hi!");
        response1.charset = "hi!";
        boolean boolean11 = response1.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18836");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        response1.numRedirects = 20;
        java.lang.String str14 = response1.contentType();
        int int15 = response1.statusCode();
        boolean boolean17 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18837");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.statusMessage();
        boolean boolean9 = response1.executed;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test18838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18838");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test18839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18839");
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
        boolean boolean19 = response1.hasHeader("hi!");
        int int20 = response1.statusCode();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test18840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18840");
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
        response1.statusMessage = "hi!";
        int int15 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18841");
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
        int int16 = response15.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test18842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18842");
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
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test18843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18843");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        int int7 = response1.statusCode;
        response1.numRedirects = 10;
        response1.contentType = "";
        java.lang.String str12 = response1.contentType();
        response1.contentType = "";
        org.jsoup.Connection.Method method15 = response1.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test18844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18844");
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
        java.lang.String str16 = response1.charset;
        response1.numRedirects = 35;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        org.jsoup.Connection.Method method20 = response1.method();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test18845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18845");
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
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18846");
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
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        response1.executed = true;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test18847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18847");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.cookie("hi!");
        java.lang.String str10 = response1.contentType();
        response1.numRedirects = (byte) 100;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        boolean boolean16 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test18848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18848");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.lang.String str11 = response7.getHeaderCaseInsensitive("");
        boolean boolean12 = response7.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test18849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18849");
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
        response1.contentType = "hi!";
        java.net.URL uRL18 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test18850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18850");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method23);
    }

    @Test
    public void test18851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18851");
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
        int int17 = response1.statusCode();
        org.jsoup.Connection.Method method18 = response1.method();
        response1.statusCode = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.cookie("");
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
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test18852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18852");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.charset = "";
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.charset;
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18853");
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
        java.lang.String str24 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response25.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test18854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18854");
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
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer21 = response20.byteData;
        java.lang.String str22 = response20.statusMessage();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test18855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18855");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        boolean boolean12 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response13.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response13.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test18856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18856");
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
        response1.contentType = "";
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer20 = response19.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test18857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18857");
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
        java.lang.Class<?> wildcardClass26 = response25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test18858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18858");
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
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.contentType();
        org.jsoup.Connection.Request request16 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test18859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18859");
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
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18860");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        response1.statusCode = (short) 0;
        int int16 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response17.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response17.headers();
        java.lang.String str20 = response17.contentType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18861");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        java.net.URL uRL21 = response1.url();
        int int22 = response1.statusCode();
        org.jsoup.Connection.Response response24 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response1.cookie("");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test18862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18862");
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
        response1.charset = "";
        response1.numRedirects = 97;
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test18863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18863");
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
        response1.statusMessage = "hi!";
        int int15 = response1.numRedirects;
        java.lang.String str17 = response1.header("hi!");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18864");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str8 = response1.charset();
        java.lang.String str10 = response1.header("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18865");
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
        org.jsoup.Connection.Request request22 = response1.req;
        response1.charset = "hi!";
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(request22);
    }

    @Test
    public void test18866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18866");
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
        org.jsoup.Connection.Response response21 = response1.removeCookie("hi!");
        boolean boolean23 = response1.hasCookie("hi!");
        boolean boolean24 = response1.executed;
        org.jsoup.Connection.Request request25 = null;
        response1.req = request25;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18867");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.charset;
        java.lang.String str13 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        response1.contentType = "hi!";
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test18868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18868");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.lang.String str11 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        int int13 = response1.statusCode();
        int int14 = response1.numRedirects;
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.Connection.Method method19 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test18869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18869");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = false;
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.charset();
        boolean boolean13 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test18870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18870");
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
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        boolean boolean17 = response1.executed;
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response22.cookies();
        response22.executed = false;
        java.nio.ByteBuffer byteBuffer26 = null;
        response22.byteData = byteBuffer26;
        java.lang.String str29 = response22.getHeaderCaseInsensitive("hi!");
        response22.statusCode = ' ';
        boolean boolean32 = response22.executed;
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test18871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18871");
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
        java.lang.String str26 = response1.header("hi!");
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
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test18872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18872");
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
        java.lang.String str20 = response1.contentType();
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
    }

    @Test
    public void test18873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18873");
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
        int int17 = response1.statusCode;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test18874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18874");
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
        int int16 = response1.statusCode;
        int int17 = response1.statusCode;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test18875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18875");
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
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test18876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18876");
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
        boolean boolean20 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        boolean boolean23 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer24 = null;
        response1.byteData = byteBuffer24;
        org.jsoup.Connection.Request request26 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(request26);
    }

    @Test
    public void test18877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18877");
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
        java.lang.String str13 = response1.statusMessage;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18878");
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
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 2;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test18879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18879");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        java.lang.String str6 = response2.statusMessage;
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage;
        response2.statusMessage = "";
        java.net.URL uRL13 = response2.url();
        boolean boolean15 = response2.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer17 = null;
        response2.byteData = byteBuffer17;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test18880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18880");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.contentType;
        java.lang.String str7 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test18881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18881");
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
        java.lang.String str19 = response1.header("");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18882");
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
        response1.executed = true;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        java.lang.String str19 = response1.contentType();
        int int20 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeader("");
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
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test18883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18883");
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
        int int20 = response15.statusCode();
        java.lang.String str21 = response15.charset;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test18884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18884");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType();
        boolean boolean10 = response1.executed;
        response1.executed = false;
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test18885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18885");
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
        int int16 = response1.statusCode();
        java.lang.String str17 = response1.charset();
        java.lang.String str18 = response1.charset();
        java.lang.String str19 = response1.charset();
        response1.charset = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18886");
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
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "");
        response1.statusMessage = "hi!";
        java.lang.String str20 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18887");
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
        response1.statusMessage = "";
        java.lang.String str17 = response1.cookie("hi!");
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Method method19 = response1.method();
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test18888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18888");
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
        response1.statusCode = 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test18889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18889");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test18890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18890");
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
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        java.lang.String str22 = response1.cookie("hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        java.lang.String str24 = response1.contentType();
        org.jsoup.Connection.Response response26 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test18891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18891");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test18892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18892");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        int int10 = response1.statusCode;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test18893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18893");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        response1.charset = "";
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        response1.contentType = "hi!";
        response1.charset = "";
        java.lang.String str21 = response1.header("hi!");
        java.lang.String str22 = response1.statusMessage();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18894");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode();
        java.lang.String str13 = response1.header("");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18895");
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
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        int int17 = response1.numRedirects;
        response1.statusCode = 20;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test18896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18896");
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
        java.lang.String str17 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18897");
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
        int int14 = response1.numRedirects;
        response1.contentType = "";
        org.jsoup.Connection.Request request17 = response1.req;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.removeHeader("");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test18898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18898");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test18899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18899");
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
        response1.statusMessage = "";
        java.lang.String str22 = response1.statusMessage();
        java.lang.String str24 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test18900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18900");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Method method6 = response1.method();
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test18901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18901");
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
        java.lang.String str21 = response1.contentType;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test18902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18902");
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
        org.jsoup.Connection.Method method18 = response1.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response22 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test18903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18903");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        boolean boolean12 = response1.executed;
        response1.numRedirects = 10;
        int int15 = response1.statusCode;
        boolean boolean17 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18904");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.lang.String str8 = response1.statusMessage();
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.contentType;
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test18905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18905");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.executed = false;
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.numRedirects;
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
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test18906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18906");
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
        java.lang.String str12 = response1.charset();
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "hi!");
        int int16 = response1.numRedirects;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test18907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18907");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test18908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18908");
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
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.lang.String str19 = response1.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test18909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18909");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.cookies();
        java.lang.String str4 = response1.header("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        java.lang.String str6 = response1.contentType;
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test18910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18910");
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
        org.jsoup.Connection.Response response14 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test18911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18911");
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
        response1.charset = "hi!";
        boolean boolean24 = response1.executed;
        java.lang.String str25 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(strEntry27);
    }

    @Test
    public void test18912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18912");
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
        java.lang.String str15 = response1.statusMessage();
        boolean boolean17 = response1.hasCookie("hi!");
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str19 = response1.contentType;
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test18913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18913");
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
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        boolean boolean18 = response1.hasCookie("hi!");
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test18914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18914");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response12.hasHeader("hi!");
        int int15 = response12.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response12.headers();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test18915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18915");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
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
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test18916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18916");
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
        java.lang.String str15 = response1.statusMessage;
        int int16 = response1.numRedirects;
        java.net.URL uRL17 = response1.url();
        response1.charset = "";
        org.jsoup.Connection.Method method20 = response1.method();
        java.lang.String str21 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response1.bodyAsBytes();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test18917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18917");
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
        java.lang.String str17 = response1.contentType;
        java.lang.String str18 = response1.charset();
        int int19 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test18918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18918");
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
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test18919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18919");
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
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18920");
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
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = (short) 100;
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
    public void test18921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18921");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        int int7 = response1.statusCode();
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage();
        int int13 = response1.statusCode;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test18922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18922");
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
        java.lang.String str20 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test18923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18923");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test18924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18924");
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
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        response1.statusMessage = "";
        java.lang.String str18 = response1.statusMessage();
        boolean boolean20 = response1.hasHeader("hi!");
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test18925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18925");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18926");
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
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "");
        boolean boolean22 = response1.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test18927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18927");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType;
        org.jsoup.Connection.Method method9 = response1.method();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test18928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18928");
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
        java.lang.String str15 = response13.cookie("hi!");
        java.lang.String str16 = response13.charset();
        java.lang.String str17 = response13.charset;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test18929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18929");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test18930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18930");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.charset = "";
        java.lang.String str9 = response1.contentType;
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Request request14 = response1.req;
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test18931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18931");
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
        java.lang.String str16 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response17.charset = "";
        java.lang.String str20 = response17.contentType();
        response17.numRedirects = 10;
        org.jsoup.Connection.Request request23 = null;
        response17.req = request23;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test18932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18932");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method9 = response1.method();
        response1.contentType = "";
        response1.statusCode = (-1);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test18933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18933");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.charset;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18934");
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
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18935");
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
        org.jsoup.Connection.Method method19 = response1.method();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test18936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18936");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test18937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18937");
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
        int int13 = response1.statusCode;
        response1.statusMessage = "";
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.Connection.Request request19 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test18938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18938");
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
        java.lang.String str22 = response1.header("");
        int int23 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("hi!");
        response1.numRedirects = 20;
        java.nio.ByteBuffer byteBuffer28 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry30 = response1.scanHeaders("");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertNull(strEntry30);
    }

    @Test
    public void test18939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18939");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        java.lang.String str19 = response1.cookie("hi!");
        java.lang.String str21 = response1.cookie("hi!");
        java.lang.String str23 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request24 = response1.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(request24);
    }

    @Test
    public void test18940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18940");
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
        java.lang.String str22 = response1.charset;
        boolean boolean24 = response1.hasHeader("hi!");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test18941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18941");
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
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    }

    @Test
    public void test18942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18942");
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
        response1.charset = "";
        org.jsoup.Connection.Request request17 = response1.req;
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18943");
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
        java.lang.String str13 = response1.contentType();
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean17 = response1.executed;
        java.lang.String str18 = response1.contentType;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test18944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18944");
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
        int int19 = response1.numRedirects;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response22.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test18945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18945");
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
        java.lang.String str15 = response1.charset;
        boolean boolean16 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test18946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18946");
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
        java.lang.String str16 = response1.statusMessage;
        java.lang.String str18 = response1.header("hi!");
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test18947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18947");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test18948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18948");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.contentType = "hi!";
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = null;
        response13.req = request15;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test18949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18949");
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
        boolean boolean12 = response1.executed;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test18950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18950");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test18951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18951");
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
        org.jsoup.Connection.Request request18 = response1.req;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.lang.String str22 = response1.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test18952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18952");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        java.lang.String str6 = response1.charset;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        int int10 = response1.numRedirects;
        boolean boolean13 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        response1.executed = true;
        response1.numRedirects = (short) 10;
        boolean boolean21 = response1.executed;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test18953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18953");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str10 = response1.header("");
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test18954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18954");
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
        boolean boolean17 = response1.hasHeaderWithValue("hi!", "hi!");
        int int18 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str21 = response1.charset();
        java.lang.String str22 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response23.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test18955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18955");
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
        org.jsoup.Connection.Method method12 = response1.method();
        java.lang.String str14 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response15.headers();
        org.jsoup.Connection.Request request17 = response15.req;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test18956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18956");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.executed = true;
        int int7 = response1.statusCode;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.lang.String str10 = response1.contentType;
        java.lang.String str11 = response1.charset();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18957");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        int int6 = response1.statusCode();
        response1.numRedirects = 2;
        org.jsoup.Connection.Request request9 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test18958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18958");
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
        int int17 = response1.statusCode();
        java.net.URL uRL18 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test18959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18959");
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
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test18960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18960");
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
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test18961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18961");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        int int17 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeaderWithValue("", "");
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
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test18962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18962");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        java.lang.String str7 = response1.charset;
        java.lang.String str8 = response1.charset;
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test18963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18963");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.statusMessage = "";
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test18964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18964");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.statusMessage();
        response1.executed = true;
        response1.statusCode = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test18965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18965");
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
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.contentType;
        response1.executed = false;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test18966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18966");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        response1.contentType = "";
        java.lang.String str7 = response1.contentType();
        response1.statusCode = 20;
        java.lang.String str10 = response1.statusMessage();
        response1.contentType = "hi!";
        java.lang.String str13 = response1.contentType;
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test18967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18967");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.charset();
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.contentType;
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test18968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18968");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        response1.contentType = "hi!";
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response1.cookies();
        java.lang.String str27 = response1.cookie("hi!");
        boolean boolean29 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer30 = response1.byteData;
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
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(byteBuffer30);
    }

    @Test
    public void test18969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18969");
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
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test18970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18970");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Method method8 = response1.method();
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response12 = response1.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test18971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18971");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType;
        int int3 = response1.statusCode;
        java.lang.String str5 = response1.header("");
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test18972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18972");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.lang.String str5 = response2.contentType();
        java.lang.String str6 = response2.statusMessage;
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        boolean boolean12 = response2.hasHeaderWithValue("hi!", "");
        java.lang.String str13 = response2.contentType;
        int int14 = response2.statusCode;
        java.lang.String str15 = response2.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test18973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18973");
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
        boolean boolean15 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "hi!");
        response1.numRedirects = (byte) 0;
        org.jsoup.Connection.Method method21 = response1.method();
        java.lang.String str22 = response1.contentType;
        java.lang.String str23 = response1.statusMessage;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test18974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18974");
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
        java.lang.String str16 = response1.contentType();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Response response22 = response1.header("hi!", "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test18975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18975");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.statusMessage;
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test18976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18976");
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
        boolean boolean12 = response10.hasCookie("hi!");
        java.lang.String str13 = response10.statusMessage();
        boolean boolean15 = response10.hasHeader("hi!");
        org.jsoup.Connection.Method method16 = response10.method();
        response10.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test18977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18977");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        int int10 = response1.statusCode;
        java.lang.String str11 = response1.statusMessage();
        response1.executed = false;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test18978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18978");
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
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18979");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.lang.String str10 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test18980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18980");
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
        java.lang.String str31 = response1.contentType();
        response1.statusCode = 1;
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
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test18981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18981");
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
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strEntry16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test18982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18982");
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
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test18983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18983");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL12 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str16 = response1.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test18984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18984");
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
        java.lang.String str14 = response1.contentType;
        int int15 = response1.statusCode();
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        boolean boolean20 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response23 = response1.header("hi!", "");
        java.lang.String str25 = response1.header("hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test18985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18985");
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
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.contentType();
        response1.executed = false;
        response1.numRedirects = 52;
        int int22 = response1.statusCode();
        int int23 = response1.statusCode();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test18986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18986");
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
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test18987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18987");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test18988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18988");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        boolean boolean8 = response1.executed;
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.charset = "";
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.String str18 = response1.header("hi!");
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        response21.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response21.headers();
        org.jsoup.Connection.Method method25 = response21.method();
        java.nio.ByteBuffer byteBuffer26 = null;
        response21.byteData = byteBuffer26;
        java.lang.String str29 = response21.getHeaderCaseInsensitive("hi!");
        java.lang.String str30 = response21.statusMessage();
        response21.statusCode = (short) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry34 = response21.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = response21.cookies();
        java.nio.ByteBuffer byteBuffer36 = null;
        response21.byteData = byteBuffer36;
        int int38 = response21.statusCode();
        org.jsoup.Connection.Request request39 = null;
        response21.req = request39;
        java.lang.String str41 = response21.charset();
        org.jsoup.Connection.Request request42 = null;
        response21.req = request42;
        org.jsoup.Connection.Response response46 = response21.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, response46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(strEntry34);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response46);
    }

    @Test
    public void test18989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18989");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        response1.contentType = "";
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.charset();
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.contentType;
        java.lang.String str17 = response1.contentType;
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test18990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18990");
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
        response1.executed = false;
        java.lang.String str21 = response1.contentType();
        java.lang.String str22 = response1.contentType();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test18991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18991");
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
        java.lang.String str28 = response1.statusMessage();
        java.lang.String str29 = response1.charset;
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test18992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18992");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        response1.statusMessage = "";
        java.lang.String str9 = response1.statusMessage;
        int int10 = response1.statusCode;
        java.net.URL uRL11 = response1.url();
        response1.numRedirects = '#';
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test18993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18993");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str20 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test18994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18994");
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
        java.lang.String str14 = response1.statusMessage;
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test18995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18995");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test18996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18996");
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
        java.util.Map<java.lang.String, java.lang.String> strMap24 = response1.cookies();
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
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test18997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18997");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        int int8 = response1.statusCode;
        org.jsoup.Connection.Method method9 = response1.method();
        response1.statusCode = 0;
        response1.contentType = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test18998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18998");
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
        int int17 = response16.statusCode();
        response16.statusMessage = "";
        org.jsoup.Connection.Method method20 = response16.method();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test18999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test18999");
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
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test19000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test19000");
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
        int int17 = response1.statusCode;
        boolean boolean19 = response1.hasHeader("hi!");
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }
}

