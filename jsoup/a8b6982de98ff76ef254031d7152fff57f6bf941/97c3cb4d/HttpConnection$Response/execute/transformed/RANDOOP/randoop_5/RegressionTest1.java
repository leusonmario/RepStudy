import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        java.lang.String str16 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Request request12 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response10 = response1.header("Location", "Location");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "Location";
        response1.statusCode = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.charset();
        boolean boolean15 = response1.executed;
        response1.numRedirects = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.cookie("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean23 = response1.hasHeaderWithValue("Location", "");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 10;
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        int int18 = response1.statusCode();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.hasCookie("Location");
        boolean boolean14 = response1.hasCookie("Location");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Request request17 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = request17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Method method17 = response1.method();
        response1.statusCode = 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.lang.String str5 = response1.contentType;
        java.lang.Class<?> wildcardClass6 = response1.getClass();
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Request request10 = response1.req;
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        response1.statusCode = (byte) 100;
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        response20.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response20.scanHeaders("hi!");
        response20.charset = "hi!";
        java.lang.String str30 = response20.statusMessage;
        response20.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(strEntry27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        boolean boolean7 = response2.hasCookie("hi!");
        response2.charset = "Location";
        java.lang.String str10 = response2.contentType;
        java.lang.String str11 = response2.contentType();
        boolean boolean12 = response2.executed;
        java.lang.String str14 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        boolean boolean20 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str21 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        java.lang.String str11 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response14 = response1.header("Location", "");
        boolean boolean15 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.statusMessage;
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.statusCode = ' ';
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        boolean boolean12 = response1.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        boolean boolean9 = response1.executed;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response15 = response12.header("hi!", "");
        java.lang.String str17 = response12.getHeaderCaseInsensitive("");
        response12.executed = false;
        boolean boolean20 = response12.executed;
        int int21 = response12.statusCode();
        java.lang.String str22 = response12.contentType;
        response12.statusMessage = "Location";
        java.lang.String str26 = response12.cookie("hi!");
        java.lang.String str28 = response12.getHeaderCaseInsensitive("");
        java.lang.String str29 = response12.statusMessage();
        java.lang.String str30 = response12.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Location" + "'", str29, "Location");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.statusCode = 0;
        response1.numRedirects = 10;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (-1);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response14 = response1.header("Location", "");
        boolean boolean15 = response1.executed;
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode;
        java.lang.String str14 = response2.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.headers();
        java.lang.String str16 = response2.contentType();
        java.lang.String str17 = response2.contentType;
        response2.contentType = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        int int14 = response1.statusCode();
        response1.numRedirects = '#';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.cookie("Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str11 = response1.cookie("Location");
        boolean boolean12 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.lang.String str15 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        java.lang.String str16 = response1.statusMessage();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.cookie("Location");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.statusMessage;
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        response1.statusMessage = "hi!";
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response18 = response15.header("hi!", "");
        response15.charset = "";
        response15.statusMessage = "";
        java.lang.String str24 = response15.getHeaderCaseInsensitive("");
        response15.charset = "hi!";
        int int27 = response15.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.contentType;
        boolean boolean15 = response1.executed;
        boolean boolean17 = response1.hasHeader("hi!");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.statusCode = (byte) 10;
        java.lang.String str14 = response1.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.header("");
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        int int10 = response1.numRedirects;
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str8 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        response1.contentType = "Location";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        boolean boolean19 = response1.executed;
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response15 = response12.header("hi!", "");
        java.lang.String str17 = response12.getHeaderCaseInsensitive("");
        java.lang.String str18 = response12.contentType();
        java.lang.String str19 = response12.contentType();
        org.jsoup.Connection.Response response21 = response12.removeHeader("Location");
        java.lang.String str22 = response12.contentType;
        java.lang.String str24 = response12.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response12.headers();
        java.net.URL uRL26 = response12.url();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(uRL26);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.cookies();
        java.lang.Class<?> wildcardClass17 = strMap16.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.contentType;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        java.lang.String str8 = response1.cookie("hi!");
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        response1.executed = false;
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        boolean boolean9 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.net.URL uRL9 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        response1.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset;
        boolean boolean21 = response1.hasHeaderWithValue("Location", "hi!");
        boolean boolean22 = response1.executed;
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        response1.contentType = "hi!";
        boolean boolean18 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        response1.statusCode = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.lang.String str19 = response1.charset;
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean24 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str15 = response1.contentType;
        java.net.URL uRL16 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.charset = "Location";
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str13 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        int int15 = response1.numRedirects;
        java.lang.Class<?> wildcardClass16 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str21 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str10 = response1.header("hi!");
        response1.contentType = "Location";
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusCode = (short) -1;
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.charset();
        response1.statusMessage = "Location";
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Request request22 = null;
        response21.req = request22;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response21.scanHeaders("hi!");
        org.jsoup.Connection.Response response28 = response21.cookie("hi!", "");
        org.jsoup.Connection.Response response31 = response21.cookie("Location", "");
        java.lang.String str32 = response21.statusMessage();
        org.jsoup.Connection.Response response35 = response21.header("Location", "hi!");
        java.lang.String str36 = response21.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.header("hi!");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response1.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.lang.String str16 = response1.cookie("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        int int19 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response25 = response22.header("hi!", "");
        java.nio.ByteBuffer byteBuffer26 = response22.byteData;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(byteBuffer26);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.charset;
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        java.lang.String str12 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response18 = response15.header("hi!", "");
        org.jsoup.Connection.Request request19 = null;
        response15.req = request19;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response15.scanHeaders("Location");
        java.lang.String str23 = response15.contentType;
        java.lang.String str25 = response15.cookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        int int13 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        int int12 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.charset;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        int int18 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        org.jsoup.Connection.Request request5 = null;
        response2.req = request5;
        java.lang.String str7 = response2.charset;
        java.lang.String str9 = response2.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.nio.ByteBuffer byteBuffer13 = null;
        response2.byteData = byteBuffer13;
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        org.jsoup.Connection.Method method18 = response2.method();
        java.lang.String str20 = response2.header("hi!");
        java.lang.String str21 = response2.contentType();
        java.nio.ByteBuffer byteBuffer22 = response2.byteData;
        java.nio.ByteBuffer byteBuffer23 = null;
        response2.byteData = byteBuffer23;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        java.lang.String str17 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.Connection.Request request12 = response1.req;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response15.scanHeaders("hi!");
        response15.charset = "hi!";
        int int22 = response15.numRedirects;
        response15.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer25 = response15.byteData;
        java.nio.ByteBuffer byteBuffer26 = null;
        response15.byteData = byteBuffer26;
        java.lang.String str28 = response15.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.lang.String str11 = response2.header("");
        org.jsoup.Connection.Request request12 = null;
        response2.req = request12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        int int19 = response1.numRedirects;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        boolean boolean12 = response1.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str16 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        int int18 = response1.statusCode;
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.cookie("hi!");
        java.lang.String str17 = response1.contentType();
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response14 = response11.header("hi!", "");
        java.nio.ByteBuffer byteBuffer15 = null;
        response11.byteData = byteBuffer15;
        org.jsoup.Connection.Response response18 = response11.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection9, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.Class<?> wildcardClass8 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.net.URL uRL9 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response14.scanHeaders("hi!");
        org.jsoup.Connection.Response response21 = response14.cookie("hi!", "");
        java.net.URL uRL22 = response14.url();
        java.nio.ByteBuffer byteBuffer23 = null;
        response14.byteData = byteBuffer23;
        java.lang.String str26 = response14.header("Location");
        java.nio.ByteBuffer byteBuffer27 = response14.byteData;
        org.jsoup.Connection.Request request28 = response14.req;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertNull(request28);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str10 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.net.URL uRL10 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        int int12 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "Location");
        java.lang.String str10 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        boolean boolean10 = response2.executed;
        int int11 = response2.statusCode();
        response2.executed = false;
        org.jsoup.Connection.Method method14 = response2.method();
        java.net.URL uRL15 = response2.url();
        response2.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        java.lang.String str12 = response1.statusMessage();
        response1.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.lang.String str19 = response1.charset;
        response1.executed = false;
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 10;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Request request15 = response1.req;
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response21 = response18.header("hi!", "");
        response18.charset = "";
        response18.statusMessage = "";
        java.lang.String str27 = response18.getHeaderCaseInsensitive("");
        response18.charset = "hi!";
        java.net.URL uRL30 = response18.url();
        java.lang.String str31 = response18.statusMessage;
        org.jsoup.Connection.Response response34 = response18.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        response1.numRedirects = (-1);
        org.jsoup.Connection.Response response17 = response1.header("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Method method7 = response1.method();
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response17.header("hi!", "");
        response17.charset = "";
        response17.statusMessage = "";
        response17.charset = "Location";
        org.jsoup.Connection.Request request27 = null;
        response17.req = request27;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response17.header("hi!", "");
        response17.charset = "";
        response17.statusMessage = "";
        java.lang.String str26 = response17.header("");
        int int27 = response17.statusCode;
        org.jsoup.Connection.Response response29 = response17.removeCookie("hi!");
        boolean boolean31 = response17.hasHeader("Location");
        response17.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        boolean boolean14 = response1.hasHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.contentType();
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request20 = response1.req;
        boolean boolean22 = response1.hasHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = response1.url();
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        int int18 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        java.net.HttpURLConnection httpURLConnection25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.Connection.Request request28 = null;
        response27.req = request28;
        response27.charset = "hi!";
        org.jsoup.Connection.Response response34 = response27.header("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection25, (org.jsoup.Connection.Response) response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(response34);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.contentType;
        java.lang.String str15 = response1.charset();
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str18 = response1.header("");
        boolean boolean19 = response1.executed;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        org.jsoup.Connection.Response response6 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        response1.charset = "";
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response19 = response16.header("hi!", "");
        java.lang.String str21 = response16.getHeaderCaseInsensitive("");
        response16.executed = false;
        org.jsoup.Connection.Response response26 = response16.header("Location", "");
        response16.statusMessage = "";
        response16.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.net.URL uRL10 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Method method11 = response2.method();
        java.nio.ByteBuffer byteBuffer12 = null;
        response2.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = response2.req;
        java.lang.String str15 = response2.statusMessage;
        org.jsoup.Connection.Response response17 = response2.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        boolean boolean19 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method20 = response1.method();
        response1.contentType = "";
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.lang.String str16 = response1.cookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Response response6 = response1.removeCookie("Location");
        response1.statusCode = '#';
        boolean boolean9 = response1.executed;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.statusCode = 0;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response18 = response15.header("hi!", "");
        java.lang.String str20 = response15.getHeaderCaseInsensitive("");
        java.lang.String str21 = response15.contentType();
        java.lang.String str22 = response15.contentType();
        org.jsoup.Connection.Response response24 = response15.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer25 = null;
        response15.byteData = byteBuffer25;
        java.lang.String str27 = response15.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response15.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str14 = response1.charset;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        java.lang.String str10 = response2.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strEntry9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        java.lang.String str15 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str15 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.net.URL uRL20 = response1.url();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean22 = response1.hasCookie("Location");
        int int23 = response1.statusCode();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType();
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.jsoup.Connection.Method method22 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        boolean boolean19 = response1.hasHeader("hi!");
        response1.numRedirects = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.executed = false;
        java.lang.Class<?> wildcardClass7 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        java.lang.String str12 = response1.contentType;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Request request11 = response2.req;
        java.net.URL uRL12 = response2.url();
        java.lang.String str13 = response2.contentType();
        java.nio.ByteBuffer byteBuffer14 = response2.byteData;
        java.lang.String str15 = response2.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        java.lang.String str12 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        java.lang.String str9 = response2.cookie("hi!");
        boolean boolean10 = response2.executed;
        response2.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.headers();
        java.lang.String str14 = response2.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "");
        response1.numRedirects = (short) 10;
        java.lang.String str21 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = pattern0.getClass();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNull(pattern0);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.contentType;
        response1.charset = "hi!";
        int int20 = response1.statusCode();
        boolean boolean23 = response1.hasHeaderWithValue("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray24 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        response1.executed = false;
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        java.lang.Class<?> wildcardClass21 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        response1.executed = false;
        java.lang.String str13 = response1.contentType;
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        java.lang.String str12 = response1.contentType();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        response1.statusCode = (byte) -1;
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean11 = response1.hasHeaderWithValue("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.charset = "Location";
        int int5 = response2.numRedirects;
        java.nio.ByteBuffer byteBuffer6 = response2.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(byteBuffer6);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        boolean boolean9 = response1.hasCookie("hi!");
        response1.statusCode = 1;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str9 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        response1.executed = false;
        boolean boolean16 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.net.URL uRL6 = response1.url();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.cookie("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str20 = response1.statusMessage();
        int int21 = response1.statusCode();
        org.jsoup.Connection.Response response23 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        java.lang.String str16 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray3 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        java.lang.String str13 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.contentType();
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.charset;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.contentType = "";
        response1.numRedirects = 1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        boolean boolean17 = response1.hasHeader("hi!");
        response1.contentType = "Location";
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.Connection.Response response21 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response19.header("hi!", "");
        response19.charset = "";
        response19.statusMessage = "";
        java.lang.String str28 = response19.getHeaderCaseInsensitive("");
        response19.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response19.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(strEntry32);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = (short) 10;
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        int int14 = response1.statusCode();
        boolean boolean17 = response1.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        java.lang.String str16 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response19.header("hi!", "");
        java.lang.String str24 = response19.getHeaderCaseInsensitive("");
        response19.executed = false;
        java.lang.String str27 = response19.charset;
        java.lang.String str28 = response19.charset;
        response19.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        response1.statusCode = (byte) -1;
        java.lang.String str14 = response1.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        java.lang.String str12 = response1.contentType();
        java.lang.String str14 = response1.header("Location");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        org.jsoup.Connection.Request request5 = null;
        response2.req = request5;
        java.net.URL uRL7 = response2.url();
        boolean boolean9 = response2.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.Connection.Method method16 = response1.method();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        java.lang.String str6 = response1.charset();
        java.lang.Class<?> wildcardClass7 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusCode = (short) 0;
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        response1.executed = false;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.cookie("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.charset;
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response13.scanHeaders("hi!");
        response13.charset = "hi!";
        int int20 = response13.numRedirects;
        response13.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer23 = response13.byteData;
        java.lang.String str24 = response13.contentType;
        java.lang.String str26 = response13.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request27 = null;
        response13.req = request27;
        java.lang.String str30 = response13.header("hi!");
        org.jsoup.Connection.Response response32 = response13.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response1.charset();
        response1.contentType = "hi!";
        java.lang.String str19 = response1.cookie("hi!");
        response1.contentType = "";
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Response response19 = response16.header("hi!", "");
        org.jsoup.Connection.Request request20 = null;
        response16.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response16.scanHeaders("Location");
        boolean boolean26 = response16.hasHeaderWithValue("hi!", "");
        response16.statusCode = (short) -1;
        java.net.URL uRL29 = response16.url();
        java.lang.String str30 = response16.contentType;
        int int31 = response16.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        boolean boolean7 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response14 = response1.header("Location", "Location");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response17.header("hi!", "");
        response17.charset = "";
        response17.statusMessage = "";
        java.lang.String str26 = response17.getHeaderCaseInsensitive("");
        boolean boolean27 = response17.executed;
        java.lang.String str29 = response17.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.jsoup.helper.HttpConnection.Response response5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response9 = response6.header("hi!", "");
        java.lang.String str11 = response6.getHeaderCaseInsensitive("");
        java.lang.String str12 = response6.contentType();
        java.lang.String str13 = response6.contentType();
        org.jsoup.Connection.Response response15 = response6.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection4, (org.jsoup.Connection.Response) response6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        java.lang.String str8 = response2.contentType();
        java.lang.String str9 = response2.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response2.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.net.URL uRL14 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        response1.statusCode = (byte) 0;
        org.jsoup.Connection.Response response19 = response1.header("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.lang.String str5 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = byteBuffer13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.charset;
        int int10 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Location" + "'", str9, "Location");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        response1.contentType = "";
        java.lang.String str21 = response1.charset;
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        boolean boolean10 = response2.executed;
        int int11 = response2.statusCode();
        java.lang.String str13 = response2.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        boolean boolean22 = response1.hasHeaderWithValue("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.hasCookie("Location");
        boolean boolean14 = response1.hasCookie("Location");
        java.lang.String str16 = response1.header("");
        org.jsoup.Connection.Request request17 = response1.req;
        response1.statusMessage = "Location";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        boolean boolean16 = response1.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response19.header("hi!", "");
        java.lang.String str24 = response19.getHeaderCaseInsensitive("");
        response19.executed = false;
        boolean boolean27 = response19.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response19.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Request request23 = null;
        response22.req = request23;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response22.scanHeaders("hi!");
        org.jsoup.Connection.Response response29 = response22.cookie("hi!", "");
        java.lang.String str30 = response22.statusMessage();
        org.jsoup.Connection.Request request31 = response22.req;
        java.net.URL uRL32 = response22.url();
        java.lang.String str33 = response22.contentType();
        java.lang.String str34 = response22.charset;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(request31);
        org.junit.Assert.assertNull(uRL32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Location" + "'", str9, "Location");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.Connection.Method method16 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str7 = response1.charset;
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        java.lang.String str8 = response2.statusMessage;
        boolean boolean11 = response2.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        int int23 = response1.statusCode;
        response1.numRedirects = (byte) 0;
        java.lang.String str27 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        response1.statusMessage = "hi!";
        java.lang.String str16 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method13 = response1.method();
        response1.statusCode = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        int int9 = response1.statusCode();
        int int10 = response1.numRedirects;
        response1.numRedirects = (short) 10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        boolean boolean12 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.lang.String str7 = response1.charset();
        int int8 = response1.statusCode();
        java.net.URL uRL9 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        boolean boolean14 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.numRedirects = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.contentType;
        boolean boolean19 = response1.hasCookie("Location");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Response response27 = response24.header("hi!", "");
        response24.charset = "";
        response24.statusMessage = "";
        java.lang.String str33 = response24.getHeaderCaseInsensitive("");
        boolean boolean35 = response24.hasCookie("Location");
        boolean boolean37 = response24.hasCookie("Location");
        java.lang.String str39 = response24.header("");
        org.jsoup.Connection.Request request40 = response24.req;
        response24.statusMessage = "Location";
        boolean boolean44 = response24.hasHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(request40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.charset();
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        org.jsoup.Connection.Request request6 = null;
        response2.req = request6;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("Location");
        boolean boolean12 = response2.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response2.headers();
        java.nio.ByteBuffer byteBuffer14 = response2.byteData;
        int int15 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.contentType;
        response1.charset = "hi!";
        int int20 = response1.statusCode();
        boolean boolean23 = response1.hasHeaderWithValue("hi!", "Location");
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Request request27 = null;
        response26.req = request27;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry30 = response26.scanHeaders("hi!");
        response26.charset = "hi!";
        java.lang.String str33 = response26.contentType();
        java.lang.String str34 = response26.contentType;
        boolean boolean36 = response26.hasHeader("hi!");
        java.net.URL uRL37 = response26.url();
        boolean boolean39 = response26.hasCookie("Location");
        int int40 = response26.numRedirects;
        org.jsoup.Connection.Response response43 = response26.header("hi!", "Location");
        int int44 = response26.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strEntry30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(uRL37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusCode = (short) 0;
        response1.charset = "hi!";
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        java.net.URL uRL9 = response1.url();
        int int10 = response1.statusCode;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        response1.statusCode = 1;
        int int15 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.statusMessage;
        response1.executed = false;
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("Location");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.contentType = "";
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        int int18 = response1.statusCode();
        response1.executed = true;
        java.lang.String str21 = response1.statusMessage();
        java.lang.String str22 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str20 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        boolean boolean9 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        boolean boolean11 = response1.hasHeader("hi!");
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("Location");
        int int15 = response1.numRedirects;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "Location");
        int int19 = response1.numRedirects;
        response1.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.header("Location");
        java.lang.String str14 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.net.URL uRL14 = response1.url();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType;
        java.lang.String str22 = response1.contentType;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        response1.executed = false;
        response1.statusCode = '4';
        java.lang.String str18 = response1.statusMessage;
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str14 = response1.contentType;
        boolean boolean15 = response1.executed;
        boolean boolean17 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.charset();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        java.lang.String str15 = response1.statusMessage;
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request19 = null;
        response18.req = request19;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response18.scanHeaders("hi!");
        response18.charset = "hi!";
        int int25 = response18.numRedirects;
        response18.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer28 = response18.byteData;
        java.lang.String str29 = response18.contentType;
        org.jsoup.Connection.Response response32 = response18.cookie("Location", "Location");
        java.lang.String str34 = response18.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage;
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str10 = response1.cookie("hi!");
        boolean boolean11 = response1.executed;
        response1.contentType = "";
        response1.executed = false;
        boolean boolean17 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        boolean boolean9 = response1.hasHeaderWithValue("hi!", "Location");
        java.lang.String str10 = response1.statusMessage;
        java.lang.Class<?> wildcardClass11 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        org.jsoup.Connection.Method method8 = response2.method();
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.removeHeader("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset;
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = null;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Response response31 = response28.header("hi!", "");
        java.lang.String str33 = response28.getHeaderCaseInsensitive("");
        response28.executed = false;
        java.lang.String str36 = response28.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = response28.cookies();
        org.jsoup.Connection.Response response40 = response28.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(response40);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        int int18 = response1.statusCode();
        java.net.URL uRL19 = response1.url();
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "hi!");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        int int13 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "");
        response1.numRedirects = (short) 10;
        int int21 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Response response27 = response24.header("hi!", "");
        boolean boolean29 = response24.hasCookie("hi!");
        response24.executed = true;
        int int32 = response24.statusCode();
        response24.contentType = "Location";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.net.URL uRL9 = response1.url();
        java.lang.Class<?> wildcardClass10 = response1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.cookie("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        response1.executed = false;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.statusCode = 10;
        int int10 = response2.numRedirects;
        boolean boolean11 = response2.executed;
        java.lang.String str12 = response2.contentType();
        int int13 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        org.jsoup.Connection.Response response11 = response1.cookie("Location", "Location");
        java.lang.String str12 = response1.contentType();
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("Location");
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.contentType;
        int int17 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.Connection.Request request17 = response1.req;
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Request request21 = null;
        response20.req = request21;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response20.scanHeaders("hi!");
        response20.charset = "hi!";
        int int27 = response20.numRedirects;
        response20.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer30 = response20.byteData;
        java.nio.ByteBuffer byteBuffer31 = null;
        response20.byteData = byteBuffer31;
        org.jsoup.Connection.Response response35 = response20.header("hi!", "hi!");
        org.jsoup.Connection.Method method36 = response20.method();
        java.lang.String str38 = response20.header("hi!");
        java.lang.String str39 = response20.contentType();
        java.nio.ByteBuffer byteBuffer40 = response20.byteData;
        java.nio.ByteBuffer byteBuffer41 = null;
        response20.byteData = byteBuffer41;
        response20.statusCode = (short) 100;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry46 = response20.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(byteBuffer30);
        org.junit.Assert.assertNotNull(response35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(byteBuffer40);
        org.junit.Assert.assertNull(strEntry46);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Request request14 = response1.req;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request17 = response1.req;
        int int18 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.lang.String str19 = response1.charset;
        response1.executed = false;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Request request25 = null;
        response24.req = request25;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response24.scanHeaders("hi!");
        response24.charset = "hi!";
        int int31 = response24.numRedirects;
        response24.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer34 = response24.byteData;
        java.lang.String str35 = response24.contentType;
        org.jsoup.Connection.Response response38 = response24.cookie("Location", "Location");
        int int39 = response24.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry41 = response24.scanHeaders("hi!");
        org.jsoup.Connection.Request request42 = null;
        response24.req = request42;
        java.lang.String str44 = response24.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(byteBuffer34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(response38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(strEntry41);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.statusMessage;
        org.jsoup.Connection.Request request16 = response1.req;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response19.header("hi!", "");
        response19.charset = "";
        response19.statusMessage = "";
        java.lang.String str28 = response19.getHeaderCaseInsensitive("");
        boolean boolean29 = response19.executed;
        java.nio.ByteBuffer byteBuffer30 = response19.byteData;
        java.lang.String str32 = response19.header("Location");
        java.lang.String str33 = response19.charset;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location" + "'", str15, "Location");
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(byteBuffer30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Method method12 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        response1.statusCode = (short) 100;
        response1.executed = true;
        java.net.HttpURLConnection httpURLConnection28 = null;
        org.jsoup.helper.HttpConnection.Response response29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        org.jsoup.Connection.Response response33 = response30.header("hi!", "");
        java.lang.String str35 = response30.getHeaderCaseInsensitive("");
        java.lang.String str36 = response30.contentType();
        java.lang.String str37 = response30.contentType();
        org.jsoup.Connection.Response response39 = response30.removeHeader("Location");
        java.nio.ByteBuffer byteBuffer40 = null;
        response30.byteData = byteBuffer40;
        response30.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection28, (org.jsoup.Connection.Response) response30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(response39);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.header("hi!");
        java.lang.String str19 = response1.charset;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request14 = null;
        response13.req = request14;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response13.scanHeaders("hi!");
        org.jsoup.Connection.Response response20 = response13.cookie("hi!", "");
        java.lang.String str21 = response13.statusMessage();
        org.jsoup.Connection.Request request22 = response13.req;
        response13.numRedirects = (short) -1;
        boolean boolean26 = response13.hasCookie("hi!");
        java.lang.String str27 = response13.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        java.net.URL uRL21 = response1.url();
        response1.statusCode = (byte) 10;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Method method11 = response2.method();
        response2.numRedirects = ' ';
        boolean boolean15 = response2.hasHeader("hi!");
        org.jsoup.Connection.Response response17 = response2.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response2.cookies();
        org.jsoup.Connection.Request request19 = null;
        response2.req = request19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.jsoup.helper.HttpConnection.Response.MAX_REDIRECTS = 32;
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        boolean boolean6 = response1.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.lang.String str9 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        response2.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response2.headers();
        int int15 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strEntry9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response2.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.cookies();
        java.nio.ByteBuffer byteBuffer11 = response2.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response2.byteData = byteBuffer12;
        java.lang.String str14 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(strEntry9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        response1.charset = "Location";
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str21 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Method method19 = response1.method();
        boolean boolean21 = response1.hasHeader("Location");
        org.jsoup.Connection.Method method22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.method(method22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.Class<?> wildcardClass8 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode();
        boolean boolean16 = response2.hasHeaderWithValue("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Method method14 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.contentType = "Location";
        int int14 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.statusCode = ' ';
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        response1.contentType = "Location";
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.lang.String str13 = response2.contentType;
        java.lang.String str14 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        org.jsoup.Connection.Request request6 = response1.req;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.charset();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location" + "'", str14, "Location");
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        java.lang.String str17 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        int int12 = response1.statusCode();
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str17 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.nio.ByteBuffer byteBuffer13 = null;
        response2.byteData = byteBuffer13;
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = response1.method();
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Request request25 = null;
        response24.req = request25;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response24.scanHeaders("hi!");
        response24.charset = "hi!";
        response24.statusMessage = "hi!";
        boolean boolean34 = response24.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response24);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.contentType;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str9 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        response2.statusMessage = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.nio.ByteBuffer byteBuffer13 = null;
        response2.byteData = byteBuffer13;
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        org.jsoup.Connection.Method method18 = response2.method();
        java.lang.String str20 = response2.header("hi!");
        java.lang.String str21 = response2.contentType();
        java.nio.ByteBuffer byteBuffer22 = response2.byteData;
        java.nio.ByteBuffer byteBuffer23 = null;
        response2.byteData = byteBuffer23;
        response2.statusCode = (short) 100;
        response2.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response29 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(byteBuffer22);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray26 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method13 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        java.lang.String str16 = response1.charset;
        java.lang.String str17 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        response1.statusMessage = "Location";
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        boolean boolean7 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = response1.req;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass21 = byteBuffer20.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.net.URL uRL9 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean14 = response1.hasCookie("hi!");
        response1.executed = false;
        boolean boolean19 = response1.hasHeaderWithValue("hi!", "hi!");
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response25 = response22.header("hi!", "");
        java.lang.String str27 = response22.getHeaderCaseInsensitive("");
        response22.executed = false;
        org.jsoup.Connection.Response response32 = response22.header("Location", "");
        int int33 = response22.statusCode;
        boolean boolean34 = response22.executed;
        org.jsoup.Connection.Request request35 = null;
        response22.req = request35;
        java.lang.String str37 = response22.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str7 = response1.charset;
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response11 = response1.removeCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        int int12 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.charset;
        response1.numRedirects = '4';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        boolean boolean25 = response1.hasHeaderWithValue("hi!", "Location");
        response1.executed = true;
        java.net.URL uRL28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response29 = response1.url(uRL28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        response1.executed = true;
        response1.statusMessage = "";
        java.lang.String str18 = response1.statusMessage;
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        response1.statusCode = (byte) 100;
        java.lang.String str18 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        java.lang.Class<?> wildcardClass20 = strMap19.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str16 = response1.statusMessage();
        response1.executed = true;
        org.jsoup.Connection.Response response20 = response1.removeHeader("Location");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Method method11 = response2.method();
        response2.numRedirects = ' ';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        response1.statusMessage = "Location";
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.nio.ByteBuffer byteBuffer4 = null;
        response1.byteData = byteBuffer4;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        java.lang.String str8 = response2.contentType();
        java.lang.String str9 = response2.contentType();
        org.jsoup.Connection.Response response11 = response2.removeHeader("Location");
        java.lang.String str12 = response2.contentType;
        java.lang.String str14 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.headers();
        org.jsoup.Connection.Response response18 = response2.header("hi!", "Location");
        int int19 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        response1.numRedirects = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        int int11 = response1.numRedirects;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str16 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode;
        java.lang.String str14 = response2.charset();
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        response2.contentType = "Location";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Request request15 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        response2.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response2.byteData;
        java.nio.ByteBuffer byteBuffer13 = null;
        response2.byteData = byteBuffer13;
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        org.jsoup.Connection.Method method18 = response2.method();
        java.lang.String str20 = response2.getHeaderCaseInsensitive("Location");
        java.lang.String str22 = response2.getHeaderCaseInsensitive("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response23 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        org.jsoup.Connection.Response response12 = response2.cookie("Location", "");
        boolean boolean15 = response2.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response2.cookies();
        org.jsoup.Connection.Response response19 = response2.cookie("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        int int7 = response1.statusCode;
        response1.charset = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        boolean boolean16 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.numRedirects;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response15.scanHeaders("hi!");
        org.jsoup.Connection.Response response22 = response15.cookie("hi!", "");
        java.lang.String str23 = response15.statusMessage();
        org.jsoup.Connection.Request request24 = response15.req;
        java.net.URL uRL25 = response15.url();
        java.lang.String str26 = response15.contentType();
        response15.contentType = "hi!";
        java.net.URL uRL29 = response15.url();
        java.nio.ByteBuffer byteBuffer30 = response15.byteData;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(byteBuffer30);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str18 = response1.cookie("Location");
        response1.contentType = "hi!";
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Location" + "'", str18, "Location");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        int int12 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        boolean boolean13 = response1.hasHeaderWithValue("Location", "Location");
        org.jsoup.Connection.Method method14 = response1.method();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response18.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response18.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.charset = "Location";
        java.lang.String str9 = response1.contentType;
        java.lang.String str10 = response1.contentType();
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.contentType;
        java.lang.Class<?> wildcardClass11 = response1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode();
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.contentType();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.charset;
        java.lang.String str10 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        response1.numRedirects = 0;
        response1.statusMessage = "Location";
        boolean boolean18 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.charset();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.jsoup.Connection.Method method15 = response1.method();
        java.lang.String str16 = response1.statusMessage();
        java.lang.String str17 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        response20.charset = "";
        response20.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response20.headers();
        int int29 = response20.numRedirects;
        response20.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        response1.statusMessage = "";
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.statusMessage();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        org.jsoup.Connection.Response response26 = response19.cookie("hi!", "");
        java.lang.String str27 = response19.statusMessage();
        org.jsoup.Connection.Request request28 = response19.req;
        java.net.URL uRL29 = response19.url();
        java.lang.String str30 = response19.contentType();
        response19.contentType = "hi!";
        java.net.URL uRL33 = response19.url();
        response19.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(request28);
        org.junit.Assert.assertNull(uRL29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        java.lang.String str9 = response2.contentType();
        response2.charset = "hi!";
        org.jsoup.Connection.Response response13 = response2.removeHeader("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response2.headers();
        java.lang.String str15 = response2.charset;
        org.jsoup.Connection.Response response18 = response2.cookie("hi!", "Location");
        int int19 = response2.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeHeader("Location");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        response1.numRedirects = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        response1.numRedirects = ' ';
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "");
        java.lang.String str13 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        boolean boolean13 = response1.executed;
        java.lang.String str14 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response17.header("hi!", "");
        java.lang.String str22 = response17.getHeaderCaseInsensitive("");
        response17.executed = false;
        boolean boolean25 = response17.executed;
        int int26 = response17.statusCode();
        java.lang.String str27 = response17.contentType;
        response17.statusMessage = "Location";
        java.net.URL uRL30 = response17.url();
        response17.contentType = "hi!";
        java.lang.String str34 = response17.header("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        int int9 = response2.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Method method17 = response1.method();
        response1.statusCode = 0;
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.net.URL uRL9 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeHeader("Location");
        java.lang.String str11 = response1.contentType;
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Response response17 = response1.header("hi!", "Location");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        boolean boolean14 = response1.hasHeader("Location");
        int int15 = response1.numRedirects;
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Method method17 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        boolean boolean8 = response1.hasHeaderWithValue("Location", "hi!");
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        org.jsoup.Connection.Request request11 = response1.req;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.charset();
        org.jsoup.Connection.Response response16 = response1.header("Location", "hi!");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response7.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        int int18 = response1.statusCode();
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        org.jsoup.Connection.Response response23 = response1.removeHeader("Location");
        boolean boolean25 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.header("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response17 = response1.header("Location", "hi!");
        boolean boolean20 = response1.hasHeaderWithValue("Location", "hi!");
        response1.numRedirects = (byte) -1;
        boolean boolean23 = response1.executed;
        java.lang.String str24 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        java.lang.String str4 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        boolean boolean7 = response1.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response13 = response10.header("hi!", "");
        java.lang.String str15 = response10.getHeaderCaseInsensitive("");
        response10.executed = false;
        boolean boolean18 = response10.executed;
        int int19 = response10.statusCode();
        response10.executed = false;
        org.jsoup.Connection.Response response24 = response10.cookie("Location", "Location");
        int int25 = response10.numRedirects;
        java.lang.String str26 = response10.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response10.scanHeaders("Location");
        boolean boolean31 = response10.hasHeaderWithValue("Location", "");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        java.lang.String str17 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("Location");
        boolean boolean22 = response1.hasHeaderWithValue("Location", "");
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Request request26 = null;
        response25.req = request26;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response25.scanHeaders("hi!");
        response25.charset = "hi!";
        java.lang.String str32 = response25.contentType();
        java.lang.String str33 = response25.contentType;
        response25.statusMessage = "hi!";
        org.jsoup.Connection.Response response37 = response25.removeHeader("Location");
        org.jsoup.Connection.Response response39 = response25.removeCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection23, response39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNotNull(response39);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response26 = response23.header("hi!", "");
        java.lang.String str28 = response23.getHeaderCaseInsensitive("");
        response23.executed = false;
        response23.statusCode = 100;
        boolean boolean34 = response23.hasHeader("Location");
        response23.numRedirects = (-1);
        org.jsoup.Connection.Response response39 = response23.header("Location", "");
        java.nio.ByteBuffer byteBuffer40 = response23.byteData;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(response39);
        org.junit.Assert.assertNull(byteBuffer40);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        org.jsoup.Connection.Response response13 = response1.cookie("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        java.lang.String str16 = response1.statusMessage();
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        java.lang.String str8 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        int int12 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str15 = response1.header("Location");
        int int16 = response1.statusCode();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request19 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request19);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        boolean boolean10 = response2.executed;
        int int11 = response2.statusCode();
        java.lang.String str12 = response2.contentType;
        int int13 = response2.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response15 = response12.header("hi!", "");
        response12.charset = "";
        response12.statusMessage = "";
        java.lang.String str21 = response12.getHeaderCaseInsensitive("");
        boolean boolean22 = response12.executed;
        int int23 = response12.numRedirects;
        response12.charset = "Location";
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response12.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.contentType();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.Connection.Response response12 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        response1.numRedirects = (short) 0;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        response19.charset = "hi!";
        java.lang.String str26 = response19.contentType();
        response19.charset = "hi!";
        org.jsoup.Connection.Response response30 = response19.removeHeader("Location");
        int int31 = response19.statusCode();
        int int32 = response19.numRedirects;
        java.net.URL uRL33 = response19.url();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNull(uRL33);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        java.lang.String str6 = response1.statusMessage;
        java.lang.String str7 = response1.charset;
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response13 = response10.header("hi!", "");
        response10.charset = "";
        response10.statusMessage = "";
        java.lang.String str19 = response10.getHeaderCaseInsensitive("");
        boolean boolean20 = response10.executed;
        java.nio.ByteBuffer byteBuffer21 = response10.byteData;
        java.lang.String str23 = response10.header("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        response2.executed = false;
        org.jsoup.Connection.Response response12 = response2.header("Location", "");
        int int13 = response2.statusCode;
        java.lang.String str14 = response2.charset();
        org.jsoup.Connection.Response response17 = response2.header("hi!", "hi!");
        java.lang.String str18 = response2.statusMessage;
        response2.numRedirects = 100;
        int int21 = response2.statusCode;
        org.jsoup.Connection.Response response24 = response2.cookie("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str21 = response1.getHeaderCaseInsensitive("Location");
        java.lang.String str23 = response1.getHeaderCaseInsensitive("Location");
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response1.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        boolean boolean14 = response1.hasHeader("Location");
        java.lang.String str15 = response1.contentType();
        java.lang.String str16 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("");
        response1.statusMessage = "";
        java.lang.String str16 = response1.cookie("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.lang.String str18 = response1.statusMessage;
        int int19 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.numRedirects = 10;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        int int14 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str14 = response1.charset;
        java.lang.String str15 = response1.statusMessage();
        java.net.URL uRL16 = response1.url();
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = null;
        response19.req = request20;
        org.jsoup.Connection.Request request22 = null;
        response19.req = request22;
        java.lang.String str24 = response19.statusMessage;
        java.lang.String str26 = response19.header("");
        response19.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        response2.charset = "hi!";
        java.lang.String str9 = response2.contentType();
        response2.charset = "hi!";
        int int12 = response2.numRedirects;
        java.lang.String str14 = response2.getHeaderCaseInsensitive("");
        java.lang.String str16 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response2.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer19 = response2.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        boolean boolean10 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("Location");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        response1.charset = "Location";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        java.net.URL uRL11 = response1.url();
        java.lang.String str12 = response1.contentType();
        java.lang.String str13 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response5 = response2.header("hi!", "");
        response2.charset = "";
        response2.statusMessage = "";
        java.lang.String str11 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response2.cookie("Location", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        java.net.URL uRL16 = response2.url();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.executed;
        int int12 = response1.numRedirects;
        response1.charset = "Location";
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        java.lang.Class<?> wildcardClass19 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Method method9 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str9 = response1.statusMessage();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        boolean boolean16 = response1.hasHeader("Location");
        java.net.URL uRL17 = response1.url();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        java.lang.String str25 = response20.getHeaderCaseInsensitive("");
        response20.executed = false;
        org.jsoup.Connection.Response response30 = response20.header("Location", "");
        int int31 = response20.statusCode;
        java.lang.String str32 = response20.charset();
        java.lang.String str33 = response20.statusMessage();
        org.jsoup.Connection.Request request34 = null;
        response20.req = request34;
        int int36 = response20.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry38 = response20.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(strEntry38);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        boolean boolean16 = response1.hasHeaderWithValue("Location", "Location");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response23 = response20.header("hi!", "");
        boolean boolean25 = response20.hasCookie("hi!");
        org.jsoup.Connection.Response response28 = response20.header("Location", "");
        int int29 = response20.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.header("");
        int int11 = response1.statusCode;
        java.lang.String str12 = response1.contentType;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.header("hi!");
        java.lang.String str20 = response1.contentType();
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        org.jsoup.Connection.Response response25 = response1.removeHeader("Location");
        int int26 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = response1.hasHeaderWithValue("", "Location");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Request request5 = response1.req;
        boolean boolean8 = response1.hasHeaderWithValue("Location", "hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusMessage = "hi!";
        boolean boolean11 = response1.hasHeader("hi!");
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        java.lang.String str11 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        response1.contentType = "Location";
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request19 = null;
        response18.req = request19;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response18.scanHeaders("hi!");
        response18.charset = "hi!";
        int int25 = response18.numRedirects;
        response18.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer28 = response18.byteData;
        java.lang.String str29 = response18.contentType;
        java.lang.String str31 = response18.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request32 = null;
        response18.req = request32;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(strEntry22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method17 = response1.method();
        response1.numRedirects = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request23 = response1.req;
        java.nio.ByteBuffer byteBuffer24 = response1.byteData;
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertNull(byteBuffer24);
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Method method14 = response1.method();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request18 = null;
        response17.req = request18;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response17.scanHeaders("hi!");
        response17.charset = "hi!";
        int int24 = response17.numRedirects;
        response17.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer27 = response17.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry29 = response17.scanHeaders("");
        java.lang.String str30 = response17.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap31 = response17.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response17.headers();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(byteBuffer27);
        org.junit.Assert.assertNull(strEntry29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        java.lang.Class<?> wildcardClass22 = response1.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.numRedirects = 0;
        response1.numRedirects = (byte) 1;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.statusCode = ' ';
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response12 = response9.header("hi!", "");
        java.lang.String str14 = response9.getHeaderCaseInsensitive("");
        response9.executed = false;
        org.jsoup.Connection.Response response19 = response9.header("Location", "");
        int int20 = response9.statusCode;
        java.lang.String str21 = response9.charset();
        int int22 = response9.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        java.lang.String str9 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.numRedirects = 0;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        response1.statusMessage = "";
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean13 = response1.hasHeaderWithValue("Location", "");
        java.lang.String str15 = response1.cookie("Location");
        response1.numRedirects = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response13 = response1.removeHeader("Location");
        org.jsoup.Connection.Response response15 = response1.removeCookie("Location");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Request request11 = response2.req;
        java.net.URL uRL12 = response2.url();
        java.lang.String str13 = response2.contentType();
        response2.contentType = "hi!";
        java.net.URL uRL16 = response2.url();
        org.jsoup.Connection.Response response18 = response2.removeHeader("hi!");
        org.jsoup.Connection.Response response20 = response2.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response2.scanHeaders("Location");
        java.nio.ByteBuffer byteBuffer23 = null;
        response2.byteData = byteBuffer23;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(strEntry22);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Request request20 = response1.req;
        java.lang.String str21 = response1.contentType;
        java.lang.String str22 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("Location");
        java.lang.String str26 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        response1.statusCode = (short) -1;
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.contentType;
        boolean boolean17 = response1.hasCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Response response15 = response1.removeHeader("Location");
        response1.numRedirects = '#';
        int int18 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        int int9 = response1.statusCode;
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("Location");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        response1.contentType = "Location";
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response20 = response17.header("hi!", "");
        java.lang.String str22 = response17.getHeaderCaseInsensitive("");
        response17.executed = false;
        boolean boolean25 = response17.executed;
        int int26 = response17.statusCode();
        response17.executed = false;
        org.jsoup.Connection.Request request29 = response17.req;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(request29);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str10 = response1.header("");
        java.net.URL uRL11 = response1.url();
        response1.executed = true;
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL3 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response2.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL3);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.executed = true;
        org.jsoup.Connection.Response response12 = response1.removeHeader("Location");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = null;
        response2.req = request3;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response2.scanHeaders("hi!");
        org.jsoup.Connection.Response response9 = response2.cookie("hi!", "");
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Request request11 = response2.req;
        java.net.URL uRL12 = response2.url();
        java.lang.String str13 = response2.contentType();
        java.lang.String str14 = response2.charset;
        boolean boolean16 = response2.hasHeader("hi!");
        java.net.URL uRL17 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        boolean boolean6 = response1.hasCookie("hi!");
        response1.executed = true;
        boolean boolean9 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.numRedirects = (byte) -1;
        int int4 = response1.statusCode;
        response1.statusMessage = "";
        java.lang.String str7 = response1.charset;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = request10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        response1.numRedirects = 100;
        org.jsoup.Connection.Response response17 = response1.cookie("Location", "Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("Location");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response1.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.numRedirects = '4';
        java.lang.String str11 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.net.URL uRL14 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        java.lang.String str25 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        org.jsoup.Connection.Method method27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response1.method(method27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.charset();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "Location";
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response1.method(method19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        int int10 = response1.statusCode();
        response1.executed = false;
        org.jsoup.Connection.Request request13 = response1.req;
        response1.statusCode = (byte) 0;
        java.lang.String str16 = response1.charset;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.nio.ByteBuffer byteBuffer2 = null;
        response1.byteData = byteBuffer2;
        java.lang.String str5 = response1.cookie("hi!");
        org.jsoup.Connection.Response response8 = response1.header("Location", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.header("Location");
        org.jsoup.Connection.Response response17 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.lang.String str7 = response1.contentType();
        int int8 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("Location");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "Location";
        int int4 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.nio.ByteBuffer byteBuffer6 = response1.byteData;
        boolean boolean7 = response1.executed;
        java.lang.String str8 = response1.contentType;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("Location");
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response15.scanHeaders("hi!");
        org.jsoup.Connection.Response response22 = response15.cookie("hi!", "");
        java.lang.String str23 = response15.statusMessage();
        org.jsoup.Connection.Request request24 = response15.req;
        java.net.URL uRL25 = response15.url();
        java.lang.String str26 = response15.contentType();
        boolean boolean28 = response15.hasHeader("Location");
        org.jsoup.Connection.Response response30 = response15.removeCookie("Location");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(byteBuffer6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        response1.statusCode = 100;
        boolean boolean12 = response1.hasHeader("Location");
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "Location");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        int int9 = response1.statusCode();
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        int int8 = response1.numRedirects;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("Location", "Location");
        int int16 = response1.numRedirects;
        int int17 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Request request25 = null;
        response24.req = request25;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry28 = response24.scanHeaders("hi!");
        response24.charset = "hi!";
        int int31 = response24.numRedirects;
        response24.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer34 = response24.byteData;
        java.nio.ByteBuffer byteBuffer35 = null;
        response24.byteData = byteBuffer35;
        java.lang.String str38 = response24.header("Location");
        java.lang.String str40 = response24.getHeaderCaseInsensitive("");
        java.lang.String str41 = response24.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(strEntry28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(byteBuffer34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = null;
        response1.req = request2;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.contentType;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        boolean boolean16 = response1.hasHeaderWithValue("Location", "Location");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        int int18 = response1.statusCode;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        java.lang.String str10 = response1.contentType;
        response1.statusCode = (short) 1;
        response1.charset = "Location";
        boolean boolean16 = response1.hasCookie("hi!");
        response1.numRedirects = '4';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        response1.statusCode = (byte) 0;
        boolean boolean15 = response1.hasHeaderWithValue("Location", "Location");
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        response1.numRedirects = '#';
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.method(method23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(strEntry8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response18 = response1.cookie("Location", "");
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        boolean boolean9 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.Class<?> wildcardClass11 = strMap10.getClass();
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str8 = response1.cookie("hi!");
        boolean boolean9 = response1.executed;
        response1.statusMessage = "Location";
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location" + "'", str12, "Location");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response1.header("hi!", "");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Response response11 = response1.header("Location", "");
        int int12 = response1.statusCode;
        boolean boolean13 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        response1.executed = true;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str20);
    }
}
