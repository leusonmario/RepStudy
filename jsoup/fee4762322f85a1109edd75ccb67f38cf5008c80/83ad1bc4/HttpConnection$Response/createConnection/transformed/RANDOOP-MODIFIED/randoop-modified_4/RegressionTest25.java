import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12501");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response18.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12502");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "hi!";
        boolean boolean13 = response3.executed;
        response3.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request17 = null;
        response3.req = request17;
        int int19 = response3.numRedirects;
        int int20 = response3.statusCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12503");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response12 = response2.cookie("hi!", "hi!");
        java.net.URL uRL13 = response2.url();
        org.jsoup.Connection.Method method14 = response2.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        response15.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Request request19 = null;
        response18.req = request19;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12504");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        boolean boolean16 = response12.hasHeader("hi!");
        org.jsoup.Connection.Request request17 = null;
        response12.req = request17;
        java.nio.ByteBuffer byteBuffer19 = response12.byteData;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int21 = response12.statusCode;
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response12.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 202 + "'", int21 == 202);
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12505");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.header("hi!", "hi!");
        java.lang.String str12 = response7.contentType();
        response7.contentType = "";
        java.lang.String str15 = response7.statusMessage();
        int int16 = response7.numRedirects;
        java.lang.String str18 = response7.header("hi!");
        java.lang.String str20 = response7.header("hi!");
        response7.statusMessage = "";
        response7.contentType = "";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12506");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Response response7 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        boolean boolean10 = response1.hasHeader("hi!");
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response13.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12507");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.contentType();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response5.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response5.headers();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12508");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = true;
        org.jsoup.Connection.Request request26 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request26);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12509");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12510");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request12 = null;
        response11.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response11.headers();
        java.lang.String str15 = response11.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12511");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response4.headers();
        boolean boolean9 = response4.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response4.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response4.cookies();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12512");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean10 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response14 = response3.cookie("hi!", "");
        java.lang.String str15 = response3.charset;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12513");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.numRedirects;
        java.lang.String str9 = response1.header("");
        java.lang.String str11 = response1.header("hi!");
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12514");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        response5.executed = false;
        java.nio.ByteBuffer byteBuffer10 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response11.cookies();
        int int13 = response11.statusCode;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int15 = response11.numRedirects;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12515");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int10 = response9.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12516");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.cookie("hi!");
        java.lang.String str12 = response1.charset;
        java.lang.String str14 = response1.cookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12517");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response1.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12518");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusMessage = "";
        int int15 = response12.numRedirects;
        java.lang.String str16 = response12.statusMessage;
        org.jsoup.Connection.Response response19 = response12.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int21 = response20.statusCode;
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str28 = response26.header("");
        java.lang.String str29 = response26.charset();
        int int30 = response26.numRedirects;
        org.jsoup.Connection.Method method31 = response26.method();
        java.lang.String str32 = response26.charset;
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response26);
        response26.charset = "hi!";
        java.lang.String str36 = response26.statusMessage;
        response26.executed = true;
        java.lang.String str39 = response26.charset;
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response26);
        int int41 = response26.statusCode;
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response26);
        // The following exception was thrown during execution in test generation
        try {
            response20.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12519");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int9 = response8.numRedirects;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str12 = response11.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12520");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        response1.numRedirects = 501;
        java.lang.String str7 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12521");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12522");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.statusMessage();
        java.lang.String str10 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12523");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response10.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12524");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.charset();
        boolean boolean14 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12525");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12526");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.statusMessage();
        java.lang.String str11 = response9.charset();
        java.lang.String str12 = response9.charset;
        org.jsoup.Connection.Response response15 = response9.cookie("hi!", "hi!");
        boolean boolean17 = response9.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response19.scanHeaders("");
        java.lang.String str22 = response19.statusMessage;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12527");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12528");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response13.contentType();
        java.lang.String str17 = response13.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response13.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12529");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int8 = response3.statusCode();
        java.lang.String str9 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int11 = response3.numRedirects;
        int int12 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response3.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12530");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        boolean boolean8 = response1.executed;
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.Class<?> wildcardClass14 = response12.getClass();
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12531");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.net.URL uRL8 = response1.url();
        java.lang.String str10 = response1.header("hi!");
        response1.numRedirects = 404;
        java.lang.String str13 = response1.charset();
        boolean boolean16 = response1.hasHeaderWithValue("hi!", "");
        boolean boolean18 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12532");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean10 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response11.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str16 = response11.cookie("hi!");
        response11.charset = "hi!";
        int int19 = response11.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response11.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12533");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean10 = response9.executed;
        int int11 = response9.statusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12534");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str18 = response17.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12535");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12536");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "hi!";
        boolean boolean13 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response14.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response14.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12537");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int7 = response6.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response6.byteData;
        java.lang.String str10 = response6.cookie("hi!");
        java.lang.String str11 = response6.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response14.scanHeaders("hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12538");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        java.lang.String str9 = response3.getHeaderCaseInsensitive("");
        java.lang.String str10 = response3.contentType();
        org.jsoup.Connection.Request request11 = response3.req;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response13.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12539");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.statusCode = 205;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean12 = response9.hasHeaderWithValue("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12540");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Method method13 = response9.method();
        response9.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12541");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean3 = response2.executed;
        org.jsoup.Connection.Method method4 = response2.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12542");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.nio.ByteBuffer byteBuffer4 = response2.byteData;
        java.lang.String str5 = response2.charset();
        boolean boolean6 = response2.executed;
        java.lang.String str7 = response2.charset();
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "hi!");
        boolean boolean11 = response2.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response2.scanHeaders("hi!");
        java.lang.String str15 = response2.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response2.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12543");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12544");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        int int3 = response1.statusCode;
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request6 = null;
        response1.req = request6;
        java.lang.String str9 = response1.header("");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean15 = response14.executed;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12545");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        int int11 = response3.statusCode;
        java.lang.String str13 = response3.header("hi!");
        org.jsoup.Connection.Response response16 = response3.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response3.headers();
        org.jsoup.Connection.Method method20 = response3.method();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(method20);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12546");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.nio.ByteBuffer byteBuffer4 = response2.byteData;
        java.lang.String str5 = response2.charset();
        boolean boolean6 = response2.executed;
        java.lang.String str7 = response2.charset();
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "hi!");
        boolean boolean11 = response2.executed;
        java.lang.String str12 = response2.statusMessage();
        response2.charset = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str16 = response15.contentType;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response18.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12547");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int5 = response4.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response6.cookies();
        java.lang.String str9 = response6.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response6.headers();
        org.jsoup.Connection.Request request11 = response6.req;
        java.lang.String str13 = response6.getHeaderCaseInsensitive("");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12548");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        java.lang.String str5 = response1.charset();
        java.lang.String str7 = response1.header("");
        java.lang.String str8 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12549");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusCode = 402;
        int int5 = response1.numRedirects;
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 0;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.charset = "";
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12550");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response5.charset();
        java.lang.String str8 = response5.statusMessage;
        java.net.URL uRL9 = response5.url();
        java.lang.String str10 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response16 = response5.cookie("hi!", "hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12551");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean10 = response5.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12552");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        boolean boolean16 = response12.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method18 = response12.method();
        boolean boolean19 = response12.executed;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response12.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12553");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        java.lang.String str9 = response7.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12554");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response5.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response5.scanHeaders("");
        org.jsoup.Connection.Response response12 = response5.cookie("hi!", "");
        java.nio.ByteBuffer byteBuffer13 = response5.byteData;
        java.lang.String str15 = response5.header("hi!");
        java.net.URL uRL16 = response5.url();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12555");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.contentType();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str11 = response5.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12556");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response5.header("hi!");
        org.jsoup.Connection.Response response10 = response5.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        boolean boolean12 = response11.executed;
        java.lang.String str13 = response11.charset();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response11.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12557");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str14 = response12.header("hi!");
        boolean boolean17 = response12.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusMessage = "";
        java.nio.ByteBuffer byteBuffer22 = null;
        response12.byteData = byteBuffer22;
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12558");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.contentType = "hi!";
        java.net.URL uRL5 = response1.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int8 = response6.numRedirects;
        response6.statusMessage = "hi!";
        response6.statusCode = (byte) 10;
        response6.contentType = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12559");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        response1.charset = "";
        int int11 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12560");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str3 = response2.statusMessage;
        response2.executed = false;
        org.jsoup.Connection.Method method6 = response2.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response2.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12561");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response14.statusCode;
        java.lang.String str17 = response14.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response14.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12562");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.charset();
        response1.executed = true;
        java.net.URL uRL13 = response1.url();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.statusCode;
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12563");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response6.executed = true;
        java.lang.String str9 = response6.charset();
        response6.statusMessage = "hi!";
        java.lang.String str13 = response6.cookie("hi!");
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12564");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response7.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12565");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int13 = response12.statusCode;
        java.lang.String str15 = response12.cookie("hi!");
        java.lang.Class<?> wildcardClass16 = response12.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12566");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response1.statusCode;
        response1.charset = "hi!";
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Request request17 = response16.req;
        response16.contentType = "hi!";
        org.jsoup.Connection.Request request20 = null;
        response16.req = request20;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response22);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 301 + "'", int11 == 301);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12567");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = response9.url();
        int int13 = response9.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12568");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.charset = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request13 = response9.req;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12569");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response14 = response8.header("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12570");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response8.scanHeaders("");
        boolean boolean11 = response8.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response8.cookies();
        java.nio.ByteBuffer byteBuffer13 = response8.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response8.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12571");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer14 = null;
        response13.byteData = byteBuffer14;
        int int16 = response13.statusCode();
        int int17 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        response18.charset = "hi!";
        java.nio.ByteBuffer byteBuffer21 = response18.byteData;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12572");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        java.lang.String str12 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request16 = response15.req;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.nio.ByteBuffer byteBuffer18 = response15.byteData;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response19.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12573");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL11 = response10.url();
        boolean boolean13 = response10.hasHeader("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12574");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer9 = null;
        response7.byteData = byteBuffer9;
        response7.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Request request14 = response7.req;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12575");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response15.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12576");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean11 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int14 = response12.numRedirects;
        java.nio.ByteBuffer byteBuffer15 = response12.byteData;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12577");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        response1.charset = "";
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12578");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response7.hasHeaderWithValue("hi!", "");
        java.lang.String str12 = response7.getHeaderCaseInsensitive("");
        response7.charset = "hi!";
        response7.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response7);
        response17.statusCode = (short) 10;
        java.lang.Class<?> wildcardClass20 = response17.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12579");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        boolean boolean7 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response8.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str13 = response12.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12580");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode();
        boolean boolean7 = response3.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer8 = response3.byteData;
        java.lang.String str9 = response3.contentType();
        java.lang.String str10 = response3.contentType;
        java.lang.String str11 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.statusMessage;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12581");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        response11.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response11.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12582");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str8 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12583");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.headers();
        java.lang.String str14 = response4.header("hi!");
        org.jsoup.Connection.Response response16 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response4.cookies();
        java.lang.String str19 = response4.charset();
        org.jsoup.Connection.Response response22 = response4.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response4.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12584");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer12 = null;
        response7.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean17 = response7.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str19 = response7.statusMessage;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response7.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12585");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str7 = response6.statusMessage;
        org.jsoup.Connection.Response response10 = response6.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str12 = response6.statusMessage;
        java.lang.String str13 = response6.contentType();
        java.nio.ByteBuffer byteBuffer14 = response6.byteData;
        response6.statusCode = 98;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12586");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.contentType();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        java.lang.String str11 = response1.charset;
        java.net.URL uRL12 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12587");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.charset();
        java.lang.String str11 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response9.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12588");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response16 = response3.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        response19.executed = false;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response19);
        boolean boolean25 = response23.hasHeader("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12589");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        java.lang.String str13 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 505;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12590");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusMessage = "";
        int int15 = response12.numRedirects;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        response18.contentType = "hi!";
        java.lang.String str21 = response18.charset;
        int int22 = response18.statusCode();
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12591");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str13 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.executed = false;
        response14.numRedirects = 10;
        response14.charset = "";
        response14.charset = "";
        java.nio.ByteBuffer byteBuffer23 = response14.byteData;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer23);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12592");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        int int11 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL13 = response12.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response12.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int17 = response16.statusCode;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str19 = response16.statusMessage;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12593");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request9 = response8.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12594");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response8 = response5.removeHeader("hi!");
        int int9 = response5.numRedirects;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer12 = null;
        response11.byteData = byteBuffer12;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12595");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response13.contentType();
        java.net.URL uRL16 = response13.url();
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response13.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12596");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusCode = 402;
        java.lang.String str5 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer9 = response8.byteData;
        int int10 = response8.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        response8.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12597");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        boolean boolean7 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL9 = response8.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request11 = null;
        response8.req = request11;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12598");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode();
        boolean boolean7 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response9.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.contentType();
        int int16 = response14.numRedirects;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        int int20 = response17.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12599");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusCode = 402;
        java.lang.String str6 = response1.header("hi!");
        boolean boolean7 = response1.executed;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response13.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        response13.statusMessage = "hi!";
        java.lang.String str19 = response13.charset;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response20.headers();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.net.URL uRL24 = response22.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(uRL24);
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12600");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.executed = true;
        java.lang.String str9 = response4.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response4.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12601");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer9 = response5.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response5.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str13 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        java.lang.String str18 = response15.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.nio.ByteBuffer byteBuffer20 = null;
        response15.byteData = byteBuffer20;
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12602");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        response10.contentType = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12603");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12604");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response8.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        response16.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str24 = response23.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response23.cookies();
        response23.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12605");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12606");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer6 = null;
        response5.byteData = byteBuffer6;
        java.nio.ByteBuffer byteBuffer8 = null;
        response5.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str12 = response10.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12607");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int9 = response7.statusCode();
        org.jsoup.Connection.Response response12 = response7.header("hi!", "hi!");
        response7.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response7.cookies();
        response7.numRedirects = 204;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12608");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        response1.executed = false;
        response1.numRedirects = 'a';
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12609");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response3.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer8 = response7.byteData;
        java.lang.Class<?> wildcardClass9 = response7.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12610");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int10 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request12 = null;
        response9.req = request12;
        java.nio.ByteBuffer byteBuffer14 = null;
        response9.byteData = byteBuffer14;
        int int16 = response9.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12611");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusCode = 402;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response7.charset();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12612");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.charset();
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            response16.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12613");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str12 = response10.header("");
        java.net.URL uRL13 = response10.url();
        java.lang.String str14 = response10.contentType;
        int int15 = response10.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12614");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response14.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12615");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        java.lang.String str12 = response2.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        response13.executed = true;
        java.lang.String str17 = response13.header("");
        org.jsoup.Connection.Request request18 = response13.req;
        boolean boolean19 = response13.executed;
        org.jsoup.Connection.Method method20 = response13.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.Class<?> wildcardClass22 = response13.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12616");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.charset();
        response9.statusCode = 501;
        response9.contentType = "";
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12617");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str8 = response6.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request9 = response6.req;
        response6.charset = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12618");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response5.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.executed = true;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str13 = response11.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response11.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12619");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        response3.charset = "hi!";
        java.lang.String str9 = response3.statusMessage;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response10.charset();
        response10.executed = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response10.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12620");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        response7.contentType = "";
        response7.contentType = "hi!";
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12621");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response2.headers();
        org.jsoup.Connection.Response response6 = response2.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response8 = response2.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response2.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12622");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response13.contentType = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12623");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response8.headers();
        boolean boolean14 = response8.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str17 = response15.cookie("hi!");
        java.nio.ByteBuffer byteBuffer18 = null;
        response15.byteData = byteBuffer18;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12624");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str17 = response15.header("hi!");
        java.lang.String str18 = response15.statusMessage;
        java.lang.String str20 = response15.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Request request21 = null;
        response15.req = request21;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12625");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int13 = response7.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer16 = response7.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response7.scanHeaders("hi!");
        response7.statusCode = (-1);
        response7.contentType = "hi!";
        java.lang.String str23 = response7.contentType();
        org.jsoup.Connection.Response response26 = response7.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response7.cookies();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNotNull(strEntry18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12626");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.contentType = "hi!";
        java.lang.String str5 = response1.statusMessage;
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12627");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        java.lang.String str11 = response9.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str14 = response9.charset();
        java.lang.Class<?> wildcardClass15 = response9.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12628");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int16 = response15.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response15.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12629");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response11 = response4.removeCookie("hi!");
        org.jsoup.Connection.Request request12 = null;
        response4.req = request12;
        response4.statusCode = 300;
        java.lang.String str16 = response4.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response4.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12630");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        int int12 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str14 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response18 = response15.header("hi!", "");
        java.lang.Class<?> wildcardClass19 = response18.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12631");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.statusCode = (byte) -1;
        org.jsoup.Connection.Request request12 = response7.req;
        boolean boolean14 = response7.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12632");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response9.charset();
        java.lang.String str11 = response9.contentType;
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12633");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int13 = response12.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response12.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response16.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12634");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response6.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response6.cookies();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12635");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer12 = null;
        response7.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int16 = response14.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response18.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12636");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str14 = response13.contentType();
        java.lang.String str15 = response13.contentType;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        response13.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response13.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12637");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        boolean boolean7 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.statusMessage();
        int int11 = response1.statusCode;
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12638");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response12 = response9.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer13 = response9.byteData;
        response9.executed = true;
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12639");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        java.lang.String str12 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean15 = response14.executed;
        int int16 = response14.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response14.headers();
        java.lang.String str18 = response14.charset;
        java.lang.String str20 = response14.header("hi!");
        response14.numRedirects = 504;
        response14.contentType = "";
        org.jsoup.Connection.Request request25 = response14.req;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12640");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("");
        response13.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response13.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str22 = response21.contentType;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12641");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.charset = "";
        org.jsoup.Connection.Response response16 = response2.cookie("hi!", "");
        int int17 = response2.statusCode;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12642");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        int int10 = response8.statusCode();
        response8.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        boolean boolean15 = response14.executed;
        java.nio.ByteBuffer byteBuffer16 = null;
        response14.byteData = byteBuffer16;
        boolean boolean19 = response14.hasHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12643");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.Connection.Method method7 = response1.method();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Method method10 = response1.method();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType();
        int int15 = response13.numRedirects;
        org.jsoup.Connection.Method method16 = response13.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str18 = response17.charset;
        java.net.URL uRL19 = response17.url();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response22 = response17.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection11, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12644");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        response3.statusCode = 411;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        response12.executed = false;
        int int15 = response12.statusCode();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean19 = response16.hasHeaderWithValue("hi!", "");
        boolean boolean22 = response16.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Response response24 = response16.removeHeader("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12645");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean10 = response3.hasHeaderWithValue("hi!", "");
        java.lang.String str11 = response3.charset();
        java.lang.String str12 = response3.statusMessage;
        java.lang.String str13 = response3.charset;
        response3.charset = "hi!";
        java.nio.ByteBuffer byteBuffer16 = null;
        response3.byteData = byteBuffer16;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response3.scanHeaders("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12646");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        response3.numRedirects = 0;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer12 = response3.byteData;
        java.lang.String str13 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer15 = null;
        response14.byteData = byteBuffer15;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12647");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        response1.statusCode = 410;
        int int13 = response1.statusCode();
        java.net.URL uRL14 = response1.url();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response17.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 410 + "'", int13 == 410);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12648");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        java.net.URL uRL15 = response1.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str21 = response1.charset();
        int int22 = response1.statusCode;
        response1.contentType = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12649");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusMessage = "";
        response12.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.junit.Assert.assertNull(strEntry11);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12650");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int7 = response3.statusCode();
        response3.contentType = "hi!";
        java.lang.String str10 = response3.statusMessage;
        java.lang.String str11 = response3.charset;
        int int12 = response3.statusCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12651");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.executed;
        int int8 = response1.statusCode;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12652");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response12 = response9.header("hi!", "");
        java.lang.String str13 = response9.statusMessage();
        java.lang.String str14 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.contentType = "hi!";
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12653");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int8 = response3.statusCode();
        java.nio.ByteBuffer byteBuffer9 = null;
        response3.byteData = byteBuffer9;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean12 = response11.executed;
        response11.executed = false;
        java.nio.ByteBuffer byteBuffer15 = null;
        response11.byteData = byteBuffer15;
        java.lang.String str17 = response11.statusMessage();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12654");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int11 = response7.statusCode;
        java.lang.String str12 = response7.statusMessage;
        response7.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response7.scanHeaders("");
        org.jsoup.Connection.Method method17 = response7.method();
        org.jsoup.Connection.Response response20 = response7.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Request request25 = response24.req;
        java.nio.ByteBuffer byteBuffer26 = response24.byteData;
        java.lang.String str27 = response24.charset();
        boolean boolean28 = response24.executed;
        java.lang.String str29 = response24.charset();
        org.jsoup.Connection.Response response32 = response24.cookie("hi!", "hi!");
        boolean boolean33 = response24.executed;
        java.lang.String str34 = response24.statusMessage();
        response24.charset = "";
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.Connection.Request request38 = null;
        response37.req = request38;
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response37);
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response37);
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response41);
        java.lang.String str44 = response41.header("");
        org.jsoup.helper.HttpConnection.Response response45 = new org.jsoup.helper.HttpConnection.Response(response41);
        // The following exception was thrown during execution in test generation
        try {
            response21.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertNull(byteBuffer26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12655");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response12.contentType;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12656");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.headers();
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request13 = null;
        response9.req = request13;
        java.nio.ByteBuffer byteBuffer15 = null;
        response9.byteData = byteBuffer15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12657");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int7 = response4.statusCode();
        org.jsoup.Connection.Response response9 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL11 = response10.url();
        response10.statusCode = 305;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12658");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean11 = response6.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.contentType = "";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str17 = response16.contentType;
        java.lang.String str18 = response16.charset;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12659");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response7.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response12.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12660");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request10 = response1.req;
        boolean boolean11 = response1.executed;
        response1.statusMessage = "";
        int int14 = response1.statusCode();
        boolean boolean15 = response1.executed;
        boolean boolean17 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12661");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str15 = response9.getHeaderCaseInsensitive("");
        int int16 = response9.statusCode;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        response17.statusCode = (short) 100;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12662");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean3 = response2.executed;
        java.lang.String str4 = response2.charset();
        org.jsoup.Connection.Request request5 = response2.req;
        boolean boolean6 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response2.headers();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12663");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry4);
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12664");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        response12.executed = true;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean16 = response15.executed;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12665");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = response11.method();
        java.lang.String str14 = response11.contentType;
        java.nio.ByteBuffer byteBuffer15 = null;
        response11.byteData = byteBuffer15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int18 = response17.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12666");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        java.lang.String str21 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        int int23 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12667");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response16 = response3.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.statusMessage = "";
        java.lang.String str21 = response3.getHeaderCaseInsensitive("");
        java.lang.String str22 = response3.statusMessage;
        org.jsoup.Connection.Request request23 = response3.req;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12668");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL9 = response8.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response8.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12669");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        response1.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = response13.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12670");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode();
        int int6 = response3.statusCode;
        int int7 = response3.statusCode;
        java.lang.String str8 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str10 = response3.contentType;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12671");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = response9.req;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response9.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean13 = response9.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12672");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int7 = response1.statusCode();
        response1.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12673");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.nio.ByteBuffer byteBuffer13 = null;
        response11.byteData = byteBuffer13;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12674");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        java.net.URL uRL15 = response1.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int21 = response20.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12675");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response14.statusCode();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int17 = response16.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12676");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.numRedirects = 408;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response12.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12677");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12678");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.Connection.Response response5 = response1.cookie("hi!", "hi!");
        response1.contentType = "hi!";
        response1.numRedirects = 408;
        response1.numRedirects = 404;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12679");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        org.jsoup.Connection.Request request9 = null;
        response7.req = request9;
        response7.contentType = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str15 = response7.cookie("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12680");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        response3.charset = "hi!";
        response3.numRedirects = 500;
        java.nio.ByteBuffer byteBuffer11 = response3.byteData;
        response3.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response3.headers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12681");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response11.scanHeaders("");
        org.jsoup.Connection.Response response16 = response11.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12682");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int11 = response7.statusCode;
        java.lang.String str12 = response7.statusMessage;
        response7.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int17 = response16.statusCode();
        response16.statusMessage = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12683");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        java.lang.String str10 = response6.contentType();
        org.jsoup.Connection.Method method11 = response6.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response6.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL15 = response6.url();
        java.lang.String str16 = response6.statusMessage;
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12684");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.statusCode = 501;
        response7.numRedirects = 404;
        java.lang.String str15 = response7.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response7.cookies();
        boolean boolean17 = response7.executed;
        java.lang.String str18 = response7.charset;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12685");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = null;
        response12.byteData = byteBuffer13;
        java.lang.String str15 = response12.statusMessage();
        java.lang.String str17 = response12.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response19 = response12.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12686");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        int int11 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL13 = response12.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12687");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response10.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str18 = response17.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12688");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.headers();
        java.lang.String str14 = response4.header("hi!");
        org.jsoup.Connection.Response response16 = response4.removeHeader("hi!");
        java.lang.String str17 = response4.charset();
        java.lang.String str19 = response4.getHeaderCaseInsensitive("");
        boolean boolean21 = response4.hasHeader("hi!");
        java.lang.String str22 = response4.charset();
        org.jsoup.Connection.Request request23 = null;
        response4.req = request23;
        java.nio.ByteBuffer byteBuffer25 = response4.byteData;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(byteBuffer25);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12689");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int8 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str12 = response10.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        response13.executed = false;
        java.lang.String str17 = response13.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12690");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response13 = response10.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12691");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean18 = response14.executed;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.nio.ByteBuffer byteBuffer21 = null;
        response14.byteData = byteBuffer21;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12692");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.contentType = "hi!";
        java.lang.String str5 = response1.statusMessage;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12693");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        org.jsoup.Connection.Method method12 = response9.method();
        org.jsoup.Connection.Request request13 = response9.req;
        org.jsoup.Connection.Response response15 = response9.removeCookie("hi!");
        boolean boolean16 = response9.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response9.headers();
        java.lang.String str18 = response9.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12694");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response7 = response1.removeHeader("hi!");
        java.lang.String str9 = response1.cookie("hi!");
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        java.lang.Class<?> wildcardClass12 = response11.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12695");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int8 = response3.statusCode();
        java.lang.String str9 = response3.charset();
        boolean boolean10 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean12 = response11.executed;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12696");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean10 = response7.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12697");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        response8.statusCode = (-1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.numRedirects = 414;
        org.jsoup.Connection.Method method15 = response12.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12698");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        response9.statusMessage = "hi!";
        org.jsoup.Connection.Request request12 = response9.req;
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12699");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        int int11 = response3.statusCode;
        java.lang.String str13 = response3.header("hi!");
        org.jsoup.Connection.Response response16 = response3.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str19 = response3.statusMessage;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12700");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response5.header("hi!");
        org.jsoup.Connection.Response response10 = response5.header("hi!", "hi!");
        int int11 = response5.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response5.headers();
        java.lang.String str13 = response5.statusMessage;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12701");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.contentType();
        response5.executed = true;
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.contentType();
        int int15 = response13.numRedirects;
        org.jsoup.Connection.Method method16 = response13.method();
        boolean boolean18 = response13.hasCookie("hi!");
        boolean boolean21 = response13.hasHeaderWithValue("hi!", "");
        int int22 = response13.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12702");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 10;
        java.lang.String str5 = response1.contentType;
        response1.statusCode = 505;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12703");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response13.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response13.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        response17.contentType = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12704");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        int int11 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.statusMessage();
        java.lang.String str14 = response3.contentType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12705");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response7 = response1.header("hi!", "");
        int int8 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method13 = response12.method();
        response12.statusCode = 'a';
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12706");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        java.lang.String str12 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean15 = response14.executed;
        int int16 = response14.statusCode();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12707");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.headers();
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("hi!");
        java.lang.String str15 = response12.charset();
        java.net.URL uRL16 = response12.url();
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12708");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.header("hi!", "hi!");
        java.lang.String str12 = response7.contentType();
        response7.contentType = "";
        java.lang.String str15 = response7.statusMessage();
        int int16 = response7.numRedirects;
        java.lang.String str18 = response7.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int20 = response7.statusCode();
        java.lang.String str21 = response7.contentType;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12709");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str4 = response2.charset();
        org.jsoup.Connection.Method method5 = response2.method();
        java.lang.String str7 = response2.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12710");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str5 = response4.charset();
        java.lang.String str7 = response4.getHeaderCaseInsensitive("");
        java.net.URL uRL8 = response4.url();
        response4.numRedirects = '#';
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response4.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12711");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12712");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response5.charset = "hi!";
        boolean boolean9 = response5.hasCookie("hi!");
        int int10 = response5.statusCode;
        org.jsoup.Connection.Method method11 = response5.method();
        response5.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12713");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        java.lang.String str4 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.numRedirects = 205;
        org.jsoup.Connection.Response response9 = response5.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12714");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        int int3 = response1.statusCode;
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        java.net.URL uRL6 = response1.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response7.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12715");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        boolean boolean7 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL13 = response12.url();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str16 = response14.header("hi!");
        boolean boolean19 = response14.hasHeaderWithValue("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer20 = response14.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(byteBuffer20);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12716");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.contentType();
        java.lang.String str11 = response9.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int13 = response12.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12717");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        response7.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12718");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.header("hi!", "hi!");
        java.lang.String str12 = response7.contentType();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response16 = response7.header("hi!", "");
        java.lang.String str17 = response7.statusMessage;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12719");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int11 = response7.statusCode;
        boolean boolean14 = response7.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str16 = response15.contentType;
        java.lang.String str17 = response15.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response15.headers();
        response15.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response21.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12720");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response10.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12721");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusCode = 402;
        int int5 = response1.numRedirects;
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 0;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "hi!");
        java.lang.String str15 = response1.statusMessage();
        response1.executed = true;
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12722");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12723");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response6.statusMessage();
        java.lang.String str10 = response6.getHeaderCaseInsensitive("hi!");
        boolean boolean12 = response6.hasCookie("hi!");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12724");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.headers();
        java.lang.String str14 = response4.header("hi!");
        org.jsoup.Connection.Response response16 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer18 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response4);
        response4.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = response4.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12725");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request5 = response1.req;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        int int9 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12726");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response5.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response5.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12727");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.header("hi!");
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        response1.numRedirects = 200;
        response1.contentType = "hi!";
        java.lang.String str18 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12728");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer11 = response10.byteData;
        boolean boolean12 = response10.executed;
        org.jsoup.Connection.Response response15 = response10.header("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12729");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        int int16 = response15.numRedirects;
        java.net.URL uRL17 = response15.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12730");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        java.lang.String str4 = response1.contentType;
        org.jsoup.Connection.Request request5 = response1.req;
        java.net.URL uRL6 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response1.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12731");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer6 = null;
        response5.byteData = byteBuffer6;
        java.nio.ByteBuffer byteBuffer8 = null;
        response5.byteData = byteBuffer8;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response5.cookies();
        java.lang.String str11 = response5.statusMessage;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.numRedirects = (short) 100;
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12732");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean10 = response8.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12733");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Method method7 = response6.method();
        java.nio.ByteBuffer byteBuffer8 = response6.byteData;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12734");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        response9.executed = false;
        java.lang.String str15 = response9.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response9.scanHeaders("");
        response9.statusCode = (byte) 10;
        java.lang.String str20 = response9.statusMessage;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12735");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = null;
        response12.byteData = byteBuffer16;
        int int18 = response12.statusCode();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str20 = response12.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response12.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12736");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str21 = response18.header("");
        java.lang.String str22 = response18.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12737");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = null;
        response12.byteData = byteBuffer16;
        int int18 = response12.statusCode();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int20 = response19.statusCode();
        response19.numRedirects = (byte) 0;
        org.jsoup.Connection.Method method23 = response19.method();
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = null;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Request request27 = response26.req;
        java.nio.ByteBuffer byteBuffer28 = response26.byteData;
        java.lang.String str29 = response26.charset();
        boolean boolean30 = response26.executed;
        java.lang.String str31 = response26.charset;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response(response34);
        java.lang.String str37 = response35.header("");
        org.jsoup.Connection.Method method38 = response35.method();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = response35.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response19.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(request27);
        org.junit.Assert.assertNull(byteBuffer28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(method38);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12738");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response6.scanHeaders("");
        java.lang.String str11 = response6.charset;
        org.jsoup.Connection.Request request12 = null;
        response6.req = request12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str16 = response14.header("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response20 = response14.header("hi!", "");
        response14.contentType = "hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12739");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        response9.statusCode = 305;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 408;
        java.lang.String str15 = response12.charset();
        java.nio.ByteBuffer byteBuffer16 = response12.byteData;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12740");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response10.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12741");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = null;
        response12.byteData = byteBuffer16;
        response12.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int21 = response12.numRedirects;
        response12.statusCode = 303;
        java.lang.String str24 = response12.charset();
        org.jsoup.Connection.Response response26 = response12.removeCookie("hi!");
        org.jsoup.Connection.Response response29 = response12.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12742");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        boolean boolean14 = response9.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.nio.ByteBuffer byteBuffer17 = null;
        response16.byteData = byteBuffer17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.Class<?> wildcardClass21 = response19.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12743");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.net.URL uRL13 = response11.url();
        int int14 = response11.statusCode();
        org.jsoup.Connection.Response response16 = response11.removeHeader("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12744");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        java.nio.ByteBuffer byteBuffer8 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        response9.contentType = "hi!";
        java.lang.String str12 = response9.contentType;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12745");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer8 = null;
        response1.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response1.statusCode;
        response1.charset = "hi!";
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12746");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int13 = response12.numRedirects;
        int int14 = response12.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        response15.statusMessage = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12747");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int11 = response10.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request14 = response13.req;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12748");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int8 = response7.statusCode();
        java.nio.ByteBuffer byteBuffer9 = response7.byteData;
        org.jsoup.Connection.Response response11 = response7.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12749");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Response response12 = response10.removeCookie("hi!");
        java.lang.String str14 = response10.header("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12750");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.header("hi!", "hi!");
        response7.contentType = "";
        java.net.URL uRL14 = response7.url();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response7.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12751");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response4.charset = "hi!";
        boolean boolean8 = response4.hasCookie("hi!");
        int int9 = response4.statusCode;
        response4.contentType = "hi!";
        boolean boolean12 = response4.executed;
        java.lang.String str14 = response4.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response17.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12752");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        response3.numRedirects = 0;
        org.jsoup.Connection.Request request10 = response3.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.executed = true;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12753");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response7.header("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response7.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Request request13 = response7.req;
        java.net.URL uRL14 = response7.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12754");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusMessage = "";
        int int15 = response12.numRedirects;
        java.lang.String str16 = response12.statusMessage;
        org.jsoup.Connection.Request request17 = response12.req;
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response12.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12755");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.statusMessage();
        java.lang.String str11 = response9.charset();
        java.lang.String str12 = response9.charset;
        java.lang.String str13 = response9.statusMessage;
        java.lang.String str14 = response9.contentType;
        org.jsoup.Connection.Request request15 = response9.req;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response17.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(request15);
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12756");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request7 = response6.req;
        java.lang.String str8 = response6.contentType;
        java.lang.String str10 = response6.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12757");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = response11.url();
        int int13 = response11.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12758");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int7 = response4.statusCode();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response9.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12759");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer11 = response4.byteData;
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str18 = response16.header("");
        java.lang.String str19 = response16.charset();
        int int20 = response16.numRedirects;
        org.jsoup.Connection.Method method21 = response16.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str23 = response22.charset();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response28 = response25.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Method method30 = response25.method();
        int int31 = response25.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response4.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12760");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int10 = response1.statusCode;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "");
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Method method15 = response1.method();
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12761");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str7 = response1.contentType();
        response1.executed = false;
        java.lang.String str10 = response1.charset();
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12762");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response9.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12763");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        java.lang.String str4 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        java.net.URL uRL10 = response1.url();
        response1.contentType = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12764");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.lang.String str8 = response1.cookie("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.charset();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        response1.charset = "hi!";
        java.lang.String str18 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.nio.charset.IllegalCharsetNameException; message: hi!");
        } catch (java.nio.charset.IllegalCharsetNameException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12765");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        response3.charset = "hi!";
        java.lang.String str9 = response3.statusMessage;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response10.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response10.scanHeaders("hi!");
        response10.statusCode = 302;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12766");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.charset;
        org.jsoup.Connection.Request request3 = null;
        response1.req = request3;
        int int5 = response1.statusCode();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12767");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response7.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        response11.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response14.statusMessage();
        response14.statusCode = 410;
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response14.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12768");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.headers();
        java.lang.String str14 = response4.header("hi!");
        org.jsoup.Connection.Response response16 = response4.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.nio.ByteBuffer byteBuffer18 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12769");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str14 = response12.statusMessage();
        java.lang.String str16 = response12.cookie("hi!");
        response12.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        response20.statusMessage = "hi!";
        java.lang.String str24 = response20.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12770");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.nio.ByteBuffer byteBuffer4 = response2.byteData;
        java.lang.String str5 = response2.charset();
        boolean boolean6 = response2.executed;
        java.lang.String str7 = response2.charset();
        boolean boolean8 = response2.executed;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer11 = null;
        response10.byteData = byteBuffer11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int14 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12771");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean15 = response13.hasCookie("hi!");
        int int16 = response13.statusCode;
        response13.contentType = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.nio.ByteBuffer byteBuffer20 = response13.byteData;
        org.jsoup.Connection.Response response22 = response13.removeCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12772");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.nio.ByteBuffer byteBuffer4 = response2.byteData;
        java.lang.String str5 = response2.charset();
        boolean boolean6 = response2.executed;
        java.lang.String str7 = response2.charset();
        org.jsoup.Connection.Response response10 = response2.cookie("hi!", "hi!");
        boolean boolean11 = response2.executed;
        java.lang.String str12 = response2.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str14 = response13.statusMessage();
        java.lang.String str15 = response13.statusMessage();
        java.lang.String str17 = response13.cookie("hi!");
        response13.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12773");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        int int8 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response11.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12774");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer13 = response12.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request15 = response12.req;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response12.cookies();
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12775");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        java.lang.String str9 = response2.getHeaderCaseInsensitive("");
        java.net.URL uRL10 = response2.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str12 = response2.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12776");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response12.contentType = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.contentType = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12777");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request5 = response4.req;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNull(request5);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12778");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request11 = response9.req;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.statusMessage;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request16 = null;
        response15.req = request16;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response15.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12779");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str7 = response5.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response5.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str12 = response11.charset;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12780");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.Connection.Response response5 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response8.contentType;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response12 = response8.removeHeader("hi!");
        java.net.URL uRL13 = response8.url();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.nio.ByteBuffer byteBuffer18 = null;
        response17.byteData = byteBuffer18;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str23 = response21.header("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12781");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int17 = response16.numRedirects;
        org.jsoup.Connection.Response response20 = response16.cookie("hi!", "");
        java.lang.Class<?> wildcardClass21 = response20.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12782");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        java.lang.String str7 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response8.executed = false;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12783");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        org.jsoup.Connection.Request request11 = response7.req;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response12.scanHeaders("hi!");
        java.nio.ByteBuffer byteBuffer16 = response12.byteData;
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12784");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response1.cookie("hi!");
        response1.executed = false;
        int int19 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        java.lang.String str23 = response1.contentType;
        boolean boolean25 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        java.net.URL uRL29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response26.url(uRL29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12785");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        java.lang.String str5 = response1.contentType;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12786");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str14 = response12.statusMessage();
        java.lang.String str16 = response12.cookie("hi!");
        response12.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response12.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12787");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        response11.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        response15.charset = "hi!";
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12788");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int6 = response5.statusCode();
        boolean boolean8 = response5.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12789");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        response8.executed = true;
        boolean boolean13 = response8.executed;
        org.jsoup.Connection.Request request14 = response8.req;
        int int15 = response8.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12790");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        int int11 = response1.numRedirects;
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.statusMessage();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        response15.numRedirects = (short) 0;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12791");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str7 = response3.contentType;
        org.jsoup.Connection.Response response9 = response3.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response11.charset = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12792");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str17 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response15.headers();
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12793");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("");
        java.lang.String str16 = response13.statusMessage;
        int int17 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        response18.executed = false;
        org.jsoup.Connection.Request request21 = null;
        response18.req = request21;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12794");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.contentType();
        java.lang.String str8 = response6.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12795");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        response12.contentType = "";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str19 = response18.statusMessage;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12796");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        int int20 = response19.statusCode;
        response19.executed = false;
        java.lang.String str23 = response19.contentType;
        boolean boolean25 = response19.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12797");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str6 = response4.statusMessage;
        java.lang.String str7 = response4.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        int int9 = response8.statusCode();
        java.lang.String str10 = response8.contentType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12798");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        org.jsoup.Connection.Request request9 = response1.req;
        int int10 = response1.statusCode;
        response1.numRedirects = 3;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response13.scanHeaders("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12799");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer8 = null;
        response7.byteData = byteBuffer8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12800");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        int int3 = response1.statusCode;
        org.jsoup.Connection.Response response5 = response1.removeHeader("hi!");
        java.net.URL uRL6 = response1.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int8 = response1.statusCode;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response10.scanHeaders("");
        java.lang.String str13 = response10.charset;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12801");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.statusCode = (byte) -1;
        org.jsoup.Connection.Request request12 = response7.req;
        java.lang.String str14 = response7.header("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str16 = response15.contentType();
        java.nio.ByteBuffer byteBuffer17 = response15.byteData;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12802");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.charset;
        java.lang.String str4 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        response6.statusCode = 10;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response6.cookies();
        response6.statusMessage = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12803");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response11.statusMessage;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.nio.ByteBuffer byteBuffer14 = null;
        response11.byteData = byteBuffer14;
        java.lang.String str16 = response11.contentType();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response20 = response17.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12804");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean6 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int8 = response7.statusCode();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        response10.charset = "hi!";
        boolean boolean13 = response10.executed;
        java.lang.Class<?> wildcardClass14 = response10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12805");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.statusMessage;
        boolean boolean15 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer17 = null;
        response3.byteData = byteBuffer17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        response20.statusCode = 305;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12806");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        response1.statusMessage = "hi!";
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response17.numRedirects = (-1);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12807");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12808");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        response7.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12809");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        response12.contentType = "";
        java.lang.String str18 = response12.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusMessage = "";
        org.jsoup.Connection.Response response23 = response12.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response12);
        response24.statusMessage = "";
        response24.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response24);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response32 = response29.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12810");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        java.lang.String str12 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean15 = response14.executed;
        response14.executed = true;
        java.nio.ByteBuffer byteBuffer18 = response14.byteData;
        java.nio.ByteBuffer byteBuffer19 = response14.byteData;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12811");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer14 = null;
        response13.byteData = byteBuffer14;
        int int16 = response13.statusCode();
        int int17 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        response18.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12812");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer9 = null;
        response7.byteData = byteBuffer9;
        response7.statusCode = 202;
        boolean boolean14 = response7.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12813");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response11.charset;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str14 = response13.statusMessage;
        response13.numRedirects = 410;
        org.jsoup.Connection.Method method17 = response13.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12814");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str6 = response4.header("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str8 = response4.contentType;
        java.nio.ByteBuffer byteBuffer9 = response4.byteData;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response12 = response4.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        response13.statusCode = 305;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12815");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.executed = true;
        java.lang.String str18 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12816");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean15 = response13.hasCookie("hi!");
        org.jsoup.Connection.Method method16 = response13.method();
        java.lang.String str17 = response13.contentType();
        java.lang.Class<?> wildcardClass18 = response13.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12817");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        int int15 = response12.statusCode();
        int int16 = response12.numRedirects;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response12.scanHeaders("");
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 202 + "'", int15 == 202);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12818");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL13 = response7.url();
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Request request17 = response16.req;
        boolean boolean19 = response16.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response16.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response16.headers();
        java.lang.String str23 = response16.contentType;
        java.lang.String str24 = response16.charset();
        java.lang.String str25 = response16.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12819");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 408;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12820");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response11.statusMessage();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12821");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        response16.statusCode = 400;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12822");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        int int15 = response12.statusCode();
        int int16 = response12.numRedirects;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL18 = response17.url();
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 202 + "'", int15 == 202);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12823");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode();
        boolean boolean7 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Request request10 = response9.req;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        response12.executed = true;
        java.lang.String str15 = response12.statusMessage();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12824");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str6 = response4.statusMessage;
        java.lang.String str7 = response4.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL9 = response4.url();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12825");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int5 = response3.statusCode();
        int int6 = response3.statusCode;
        response3.contentType = "hi!";
        response3.numRedirects = 415;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12826");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12827");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str5 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str11 = response7.header("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12828");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12829");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("");
        response13.contentType = "hi!";
        response13.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str21 = response20.contentType();
        int int22 = response20.statusCode();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response23.scanHeaders("hi!");
        java.lang.String str26 = response23.statusMessage();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(strEntry25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12830");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer6 = null;
        response5.byteData = byteBuffer6;
        java.lang.String str8 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.contentType;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str13 = response12.charset;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12831");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("");
        response1.charset = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12832");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12833");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str14 = response13.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        response16.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12834");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request11 = response8.req;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12835");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusCode = 304;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int9 = response8.statusCode;
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.header("");
        java.lang.String str17 = response14.charset();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response18.header("hi!", "hi!");
        java.lang.String str23 = response18.contentType();
        response18.contentType = "";
        java.lang.String str26 = response18.statusMessage();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response18);
        response18.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer30 = response18.byteData;
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(byteBuffer30);
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12836");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        java.lang.String str5 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        boolean boolean7 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12837");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        response12.contentType = "";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer19 = response18.byteData;
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response18.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12838");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12839");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str10 = response9.statusMessage();
        int int11 = response9.statusCode;
        response9.executed = false;
        java.lang.String str14 = response9.contentType;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12840");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response11.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response11.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12841");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Request request19 = response18.req;
        java.lang.String str20 = response18.charset();
        boolean boolean22 = response18.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12842");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int13 = response12.numRedirects;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12843");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int11 = response7.statusCode;
        response7.numRedirects = 'a';
        java.nio.ByteBuffer byteBuffer14 = response7.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response7.scanHeaders("");
        boolean boolean18 = response7.hasHeader("hi!");
        org.jsoup.Connection.Method method19 = response7.method();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12844");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 0;
        boolean boolean10 = response1.executed;
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        response1.executed = false;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12845");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        boolean boolean14 = response9.hasHeaderWithValue("hi!", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str16 = response9.statusMessage;
        java.nio.ByteBuffer byteBuffer17 = response9.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12846");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12847");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        response7.charset = "";
        org.jsoup.Connection.Request request11 = response7.req;
        java.lang.String str12 = response7.statusMessage;
        java.lang.String str14 = response7.header("hi!");
        response7.executed = true;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12848");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str12 = response7.statusMessage();
        java.lang.String str13 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.charset;
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12849");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12850");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str11 = response9.statusMessage();
        response9.numRedirects = 303;
        org.jsoup.Connection.Request request14 = null;
        response9.req = request14;
        java.nio.ByteBuffer byteBuffer16 = response9.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12851");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int15 = response1.statusCode();
        java.lang.String str16 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean19 = response18.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response18.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12852");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.contentType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12853");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str14 = response12.statusMessage();
        java.lang.String str16 = response12.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response12.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12854");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        response7.statusCode = 501;
        org.jsoup.Connection.Method method13 = response7.method();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12855");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        response1.statusCode = 301;
        java.lang.String str6 = response1.charset;
        org.jsoup.Connection.Method method7 = response1.method();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12856");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str11 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response13.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response13.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12857");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        java.lang.String str5 = response1.contentType;
        response1.numRedirects = (byte) 0;
        java.lang.String str8 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response9.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response9.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12858");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        java.lang.String str11 = response6.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer13 = response6.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12859");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.headers();
        java.lang.String str11 = response9.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request13 = null;
        response9.req = request13;
        java.net.URL uRL15 = response9.url();
        org.jsoup.Connection.Response response18 = response9.cookie("hi!", "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12860");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response3.byteData = byteBuffer10;
        java.lang.String str12 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response3.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.nio.ByteBuffer byteBuffer19 = null;
        response17.byteData = byteBuffer19;
        org.jsoup.Connection.Response response23 = response17.header("hi!", "hi!");
        int int24 = response17.statusCode();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12861");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusMessage = "";
        int int15 = response12.numRedirects;
        java.lang.String str16 = response12.statusMessage;
        org.jsoup.Connection.Response response19 = response12.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int21 = response12.statusCode;
        int int22 = response12.numRedirects;
        boolean boolean25 = response12.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        int int29 = response28.statusCode;
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12862");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response6.contentType = "";
        org.jsoup.Connection.Request request9 = null;
        response6.req = request9;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12863");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str18 = response16.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method19 = response16.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response16.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response16.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12864");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL6 = response1.url();
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12865");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12866");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str16 = response14.cookie("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12867");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str5 = response1.charset();
        java.net.URL uRL6 = response1.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12868");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.charset;
        java.net.URL uRL7 = response5.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer9 = null;
        response8.byteData = byteBuffer9;
        java.lang.String str11 = response8.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response8.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12869");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.charset = "";
        response5.numRedirects = (short) -1;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response5.cookies();
        int int11 = response5.statusCode();
        java.lang.String str12 = response5.statusMessage();
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12870");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.nio.ByteBuffer byteBuffer7 = response6.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12871");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        java.lang.String str5 = response1.contentType;
        response1.contentType = "";
        java.lang.String str8 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12872");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        boolean boolean11 = response6.hasHeader("hi!");
        response6.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response16 = response14.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        response14.statusCode = 20;
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12873");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        java.lang.String str4 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        org.jsoup.Connection.Response response7 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response8.scanHeaders("");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response8.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(strEntry10);
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12874");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        response3.charset = "hi!";
        java.lang.String str9 = response3.statusMessage;
        java.lang.String str10 = response3.contentType;
        org.jsoup.Connection.Request request11 = null;
        response3.req = request11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response3.cookies();
        java.lang.String str14 = response3.contentType;
        response3.statusCode = 0;
        org.jsoup.Connection.Response response19 = response3.cookie("hi!", "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12875");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        java.lang.String str11 = response6.header("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer13 = response6.byteData;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str15 = response14.statusMessage();
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12876");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean10 = response1.hasHeaderWithValue("hi!", "");
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response13.cookie("hi!");
        java.nio.ByteBuffer byteBuffer16 = null;
        response13.byteData = byteBuffer16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12877");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = true;
        int int11 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12878");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.statusMessage;
        boolean boolean15 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response3.headers();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        int int21 = response20.statusCode();
        java.lang.String str22 = response20.charset;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12879");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = response2.headers();
        int int4 = response2.statusCode;
        org.jsoup.Connection.Response response6 = response2.removeHeader("hi!");
        java.net.URL uRL7 = response2.url();
        java.lang.String str8 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str11 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response2.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request14 = null;
        response2.req = request14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12880");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = null;
        response12.byteData = byteBuffer16;
        response12.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        int int21 = response12.numRedirects;
        response12.statusCode = 303;
        java.lang.String str24 = response12.charset();
        response12.statusMessage = "";
        response12.executed = false;
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12881");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.contentType;
        boolean boolean11 = response1.hasHeaderWithValue("hi!", "hi!");
        boolean boolean14 = response1.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str15 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12882");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.charset();
        boolean boolean11 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12883");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.nio.ByteBuffer byteBuffer16 = null;
        response12.byteData = byteBuffer16;
        int int18 = response12.statusCode();
        int int19 = response12.statusCode;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        response20.statusCode = 204;
        response20.executed = false;
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 202 + "'", int18 == 202);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 202 + "'", int19 == 202);
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12884");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.numRedirects = 2;
        response5.executed = true;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12885");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response2.contentType;
        java.lang.String str4 = response2.contentType;
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.String str7 = response2.charset();
        boolean boolean9 = response2.hasCookie("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12886");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Request request7 = response6.req;
        java.lang.String str8 = response6.contentType;
        java.lang.String str10 = response6.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean12 = response6.executed;
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12887");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int11 = response7.statusCode;
        java.lang.String str12 = response7.statusMessage;
        response7.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response7.scanHeaders("");
        org.jsoup.Connection.Method method17 = response7.method();
        org.jsoup.Connection.Response response20 = response7.cookie("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response7.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12888");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response5.headers();
        response5.executed = false;
        java.nio.ByteBuffer byteBuffer10 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str13 = response11.getHeaderCaseInsensitive("hi!");
        response11.statusMessage = "hi!";
        int int16 = response11.statusCode;
        int int17 = response11.numRedirects;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12889");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        org.jsoup.Connection.Response response5 = response1.cookie("hi!", "hi!");
        response1.contentType = "hi!";
        response1.numRedirects = 408;
        response1.numRedirects = 404;
        java.lang.String str13 = response1.header("");
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        int int16 = response1.statusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12890");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12891");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int13 = response11.statusCode;
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12892");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        java.lang.String str11 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response12.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12893");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = response6.req;
        org.jsoup.Connection.Request request8 = null;
        response6.req = request8;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response6.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request7);
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12894");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        boolean boolean23 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request25 = response24.req;
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response24);
        response27.charset = "";
        java.net.HttpURLConnection httpURLConnection30 = null;
        org.jsoup.helper.HttpConnection.Response response31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response31);
        org.jsoup.Connection.Request request33 = response32.req;
        java.lang.String str34 = response32.charset();
        boolean boolean36 = response32.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response39);
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response40);
        // The following exception was thrown during execution in test generation
        try {
            response27.setupFromConnection(httpURLConnection30, (org.jsoup.Connection.Response) response40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertNull(request33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12895");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        response9.executed = true;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str15 = response9.getHeaderCaseInsensitive("hi!");
        response9.charset = "";
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str21 = response20.statusMessage();
        org.jsoup.Connection.Method method22 = response20.method();
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12896");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response1.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response14.statusMessage;
        int int16 = response14.statusCode();
        response14.executed = false;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = response19.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12897");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.statusMessage;
        java.nio.ByteBuffer byteBuffer7 = response5.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(byteBuffer7);
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12898");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        response1.statusCode = '#';
        java.lang.String str9 = response1.contentType;
        response1.executed = true;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12899");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        java.lang.String str11 = response2.statusMessage();
        java.lang.String str12 = response2.contentType;
        org.jsoup.Connection.Request request13 = null;
        response2.req = request13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str16 = response15.contentType();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12900");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response8 = response5.removeHeader("hi!");
        int int9 = response5.numRedirects;
        boolean boolean11 = response5.hasCookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12901");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        org.jsoup.Connection.Response response11 = response4.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response4.headers();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response4.headers();
        java.nio.ByteBuffer byteBuffer15 = null;
        response4.byteData = byteBuffer15;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12902");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str14 = response11.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12903");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.cookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean14 = response13.executed;
        int int15 = response13.numRedirects;
        java.lang.String str16 = response13.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12904");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean10 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response11.executed = true;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        response14.contentType = "";
        java.lang.String str17 = response14.statusMessage();
        int int18 = response14.numRedirects;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12905");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        int int5 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        response7.charset = "";
        int int10 = response7.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response7.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12906");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        java.lang.String str5 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer8 = response7.byteData;
        int int9 = response7.statusCode();
        response7.numRedirects = 301;
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12907");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response5.cookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry4);
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12908");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "");
        org.jsoup.Connection.Request request11 = response7.req;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        response13.statusCode = 'a';
        java.nio.ByteBuffer byteBuffer16 = null;
        response13.byteData = byteBuffer16;
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12909");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        int int6 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        response9.charset = "";
        java.lang.String str12 = response9.statusMessage();
        java.lang.String str14 = response9.cookie("hi!");
        response9.numRedirects = (short) 1;
        org.jsoup.Connection.Request request17 = null;
        response9.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int20 = response9.numRedirects;
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12910");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method9 = response3.method();
        response3.charset = "";
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response3.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12911");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response3.cookies();
        boolean boolean12 = response3.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response3.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12912");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Response response6 = response1.header("hi!", "");
        int int7 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = response9.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.Connection.Request request12 = null;
        response9.req = request12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response9.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12913");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        response12.contentType = "";
        java.lang.String str18 = response12.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        response12.statusMessage = "";
        org.jsoup.Connection.Response response23 = response12.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response12);
        response24.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.nio.ByteBuffer byteBuffer28 = response27.byteData;
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(byteBuffer28);
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12914");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response4.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Request request12 = response11.req;
        response11.statusCode = 401;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str16 = response11.charset;
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12915");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("");
        java.lang.String str16 = response13.statusMessage;
        int int17 = response13.statusCode();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.nio.ByteBuffer byteBuffer19 = null;
        response18.byteData = byteBuffer19;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12916");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        int int10 = response9.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL12 = response11.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Method method14 = response11.method();
        java.lang.String str15 = response11.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12917");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        java.lang.String str3 = response1.charset;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.net.URL uRL5 = response1.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.statusMessage();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12918");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("hi!");
        java.lang.String str9 = response1.header("hi!");
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response1.contentType;
        int int13 = response1.statusCode;
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12919");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int8 = response7.numRedirects;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Request request10 = null;
        response9.req = request10;
        java.lang.String str12 = response9.statusMessage();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response9.scanHeaders("hi!");
        int int15 = response9.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response9.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12920");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.contentType;
        boolean boolean7 = response5.executed;
        org.jsoup.Connection.Response response10 = response5.header("hi!", "hi!");
        org.jsoup.Connection.Response response13 = response5.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response5.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12921");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response16 = response3.removeCookie("hi!");
        java.lang.String str17 = response3.contentType();
        org.jsoup.Connection.Request request18 = null;
        response3.req = request18;
        java.lang.String str20 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str23 = response3.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12922");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        boolean boolean14 = response9.hasHeaderWithValue("hi!", "");
        java.lang.String str15 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Request request18 = null;
        response17.req = request18;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response20.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12923");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        boolean boolean12 = response8.hasHeaderWithValue("hi!", "");
        java.lang.String str13 = response8.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response15.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12924");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str7 = response3.contentType;
        response3.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str11 = response3.statusMessage;
        org.jsoup.Connection.Response response13 = response3.removeHeader("hi!");
        response3.statusCode = 401;
        java.lang.String str17 = response3.header("");
        response3.charset = "hi!";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12925");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = ' ';
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType;
        java.lang.String str11 = response7.contentType();
        int int12 = response7.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response7.scanHeaders("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(strEntry14);
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12926");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        response4.charset = "hi!";
        boolean boolean8 = response4.hasCookie("hi!");
        int int9 = response4.statusCode;
        org.jsoup.Connection.Method method10 = response4.method();
        response4.contentType = "hi!";
        int int13 = response4.statusCode;
        int int14 = response4.statusCode;
        boolean boolean15 = response4.executed;
        java.lang.String str16 = response4.statusMessage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12927");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        response3.statusCode = 411;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response3.headers();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = response14.req;
        java.nio.ByteBuffer byteBuffer16 = response14.byteData;
        java.lang.String str17 = response14.charset();
        boolean boolean18 = response14.executed;
        java.lang.String str19 = response14.charset();
        org.jsoup.Connection.Response response22 = response14.cookie("hi!", "hi!");
        java.lang.String str24 = response14.cookie("hi!");
        java.lang.String str25 = response14.charset;
        boolean boolean26 = response14.executed;
        java.lang.String str27 = response14.charset;
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int30 = response14.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12928");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str9 = response8.contentType;
        java.nio.ByteBuffer byteBuffer10 = null;
        response8.byteData = byteBuffer10;
        java.lang.String str12 = response8.charset();
        java.lang.String str13 = response8.statusMessage();
        java.lang.String str14 = response8.charset();
        java.lang.String str15 = response8.charset;
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12929");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response7.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response11.header("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str16 = response15.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12930");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusMessage = "";
        java.lang.String str6 = response1.header("hi!");
        int int7 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12931");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method9 = response7.method();
        java.net.URL uRL10 = response7.url();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response7.cookies();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str13 = response12.statusMessage;
        java.net.URL uRL14 = response12.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response12.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12932");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        boolean boolean16 = response12.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method18 = response12.method();
        boolean boolean19 = response12.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response12.hasHeaderWithValue("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12933");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        response1.executed = false;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12934");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str14 = response13.contentType;
        int int15 = response13.statusCode();
        boolean boolean16 = response13.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response13.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12935");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12936");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int10 = response6.numRedirects;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int12 = response6.numRedirects;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        response13.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.nio.ByteBuffer byteBuffer18 = null;
        response17.byteData = byteBuffer18;
        response17.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12937");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Request request7 = null;
        response6.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        boolean boolean11 = response6.hasCookie("hi!");
        java.lang.String str12 = response6.charset();
        boolean boolean13 = response6.executed;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response6.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12938");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.Connection.Response response11 = response7.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12939");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        boolean boolean12 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Request request15 = null;
        response14.req = request15;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str19 = response14.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = response14.hasHeaderWithValue("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12940");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        response6.numRedirects = 409;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response6.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12941");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response7.header("hi!", "hi!");
        java.lang.String str12 = response7.contentType();
        response7.contentType = "";
        java.lang.String str15 = response7.statusMessage();
        int int16 = response7.numRedirects;
        java.lang.String str18 = response7.header("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int20 = response7.statusCode();
        boolean boolean21 = response7.executed;
        org.jsoup.Connection.Method method22 = response7.method();
        java.lang.String str23 = response7.statusMessage;
        boolean boolean26 = response7.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Method method27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response28 = response7.method(method27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12942");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        boolean boolean4 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        response6.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean10 = response9.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12943");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        response7.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response7.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean16 = response13.hasHeaderWithValue("hi!", "");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response13.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.net.URL uRL20 = response19.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response19.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12944");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.nio.ByteBuffer byteBuffer10 = null;
        response9.byteData = byteBuffer10;
        java.lang.String str12 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str15 = response9.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response9.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12945");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.lang.String str14 = response12.statusMessage();
        org.jsoup.Connection.Response response16 = response12.removeHeader("hi!");
        java.net.URL uRL17 = response12.url();
        response12.charset = "";
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean21 = response20.executed;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = response20.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12946");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response2.contentType;
        java.lang.String str4 = response2.contentType;
        org.jsoup.Connection.Response response6 = response2.removeCookie("hi!");
        java.lang.Class<?> wildcardClass7 = response2.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12947");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int9 = response8.statusCode();
        boolean boolean12 = response8.hasHeaderWithValue("hi!", "");
        org.jsoup.Connection.Request request13 = response8.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        response15.statusMessage = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12948");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response2.scanHeaders("");
        java.lang.String str6 = response2.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry8 = response2.scanHeaders("hi!");
        java.lang.String str10 = response2.header("hi!");
        java.lang.String str12 = response2.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strEntry8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12949");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str9 = response8.charset();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12950");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response3.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean9 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer11 = null;
        response3.byteData = byteBuffer11;
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response3.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12951");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12952");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str12 = response10.header("");
        org.jsoup.Connection.Method method13 = response10.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12953");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str7 = response3.contentType;
        java.nio.ByteBuffer byteBuffer8 = response3.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response11 = response3.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.contentType;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12954");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        response1.statusCode = 0;
        java.lang.String str14 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response1.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12955");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.header("hi!");
        org.jsoup.Connection.Method method12 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12956");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.net.URL uRL6 = response5.url();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.statusMessage();
        response5.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response5.removeCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12957");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 0;
        response1.statusMessage = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.net.URL uRL14 = response1.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12958");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str15 = response13.header("");
        java.lang.String str16 = response13.statusMessage;
        boolean boolean19 = response13.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.Connection.Method method20 = response13.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response22.headers();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12959");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean8 = response7.executed;
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        java.lang.String str11 = response7.statusMessage();
        java.lang.String str12 = response7.contentType;
        java.nio.ByteBuffer byteBuffer13 = response7.byteData;
        response7.charset = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12960");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        java.nio.ByteBuffer byteBuffer12 = null;
        response3.byteData = byteBuffer12;
        int int14 = response3.numRedirects;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12961");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL2 = response1.url();
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        response5.charset = "";
        response5.numRedirects = (short) -1;
        java.lang.String str10 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = response5.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12962");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "hi!";
        boolean boolean13 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = response15.hasCookie("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12963");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer6 = null;
        response5.byteData = byteBuffer6;
        java.lang.String str8 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response5.cookies();
        boolean boolean13 = response5.executed;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12964");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response3.cookies();
        int int11 = response3.statusCode;
        java.lang.String str13 = response3.header("hi!");
        org.jsoup.Connection.Response response16 = response3.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer18 = null;
        response3.byteData = byteBuffer18;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12965");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage;
        int int6 = response4.statusCode;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12966");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean15 = response12.hasHeaderWithValue("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response16.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12967");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str13 = response3.statusMessage;
        boolean boolean15 = response3.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer17 = null;
        response3.byteData = byteBuffer17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response3);
        int int20 = response19.statusCode;
        int int21 = response19.numRedirects;
        org.jsoup.Connection.Method method22 = response19.method();
        java.lang.String str23 = response19.contentType;
        java.lang.String str24 = response19.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response19.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str29 = response27.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = response27.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12968");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method14 = response3.method();
        org.jsoup.Connection.Response response17 = response3.cookie("hi!", "hi!");
        java.lang.String str18 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response19.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12969");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        int int6 = response1.statusCode;
        response1.statusCode = 405;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response9.hasHeaderWithValue("hi!", "hi!");
        int int13 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int15 = response9.numRedirects;
        boolean boolean18 = response9.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12970");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean6 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        response9.statusCode = 100;
        java.lang.String str12 = response9.contentType;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12971");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry5 = response1.scanHeaders("hi!");
        int int6 = response1.statusCode;
        java.lang.String str7 = response1.contentType();
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.contentType();
        org.junit.Assert.assertNull(strEntry5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12972");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.nio.ByteBuffer byteBuffer9 = response5.byteData;
        int int10 = response5.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str12 = response5.statusMessage;
        response5.statusMessage = "";
        java.nio.ByteBuffer byteBuffer15 = response5.byteData;
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12973");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.contentType();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str8 = response5.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response13.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        response18.executed = false;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12974");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str10 = response2.contentType;
        boolean boolean12 = response2.hasCookie("hi!");
        org.jsoup.Connection.Response response14 = response2.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12975");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        org.jsoup.Connection.Request request9 = response1.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request11 = null;
        response10.req = request11;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12976");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        java.lang.String str12 = response1.charset();
        java.lang.String str13 = response1.statusMessage;
        response1.executed = false;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12977");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response6.statusMessage();
        java.lang.String str8 = response6.charset;
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12978");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        java.lang.String str9 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "hi!";
        boolean boolean13 = response3.executed;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "";
        java.nio.ByteBuffer byteBuffer17 = response3.byteData;
        response3.contentType = "";
        boolean boolean22 = response3.hasHeaderWithValue("hi!", "hi!");
        java.lang.String str23 = response3.statusMessage;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12979");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response6.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        boolean boolean13 = response9.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str15 = response9.contentType;
        response9.executed = true;
        boolean boolean18 = response9.executed;
        java.lang.String str19 = response9.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12980");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.charset();
        org.jsoup.Connection.Method method4 = response1.method();
        response1.statusCode = ' ';
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response7.scanHeaders("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12981");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry11 = response9.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        response12.statusCode = 202;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str17 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        boolean boolean22 = response15.hasHeaderWithValue("hi!", "");
        org.junit.Assert.assertNull(strEntry11);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12982");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "hi!";
        java.lang.String str15 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12983");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL9 = response1.url();
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str13 = response12.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response12.byteData;
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12984");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        response9.statusMessage = "hi!";
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean15 = response13.hasCookie("hi!");
        int int16 = response13.statusCode;
        response13.contentType = "";
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response22 = response13.header("hi!", "");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.nio.ByteBuffer byteBuffer25 = response23.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(byteBuffer25);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12985");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        org.jsoup.Connection.Method method8 = response3.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str10 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        response11.contentType = "";
        org.jsoup.Connection.Method method14 = response11.method();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12986");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.statusMessage = "hi!";
        java.lang.String str8 = response2.charset;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response2);
        int int10 = response2.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response2);
        response2.charset = "";
        org.jsoup.Connection.Response response16 = response2.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response2.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12987");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        response7.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        int int12 = response7.statusCode;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.nio.ByteBuffer byteBuffer14 = response7.byteData;
        int int15 = response7.statusCode();
        int int16 = response7.numRedirects;
        java.lang.String str17 = response7.contentType;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12988");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        boolean boolean9 = response3.hasHeader("hi!");
        response3.statusCode = 201;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response3);
        response13.statusCode = 405;
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12989");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response7.contentType();
        int int9 = response7.statusCode;
        java.net.URL uRL10 = response7.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response11.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(strEntry13);
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12990");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str7 = response6.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str10 = response6.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response12 = response6.removeCookie("hi!");
        org.jsoup.Connection.Method method13 = response6.method();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12991");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL13 = response7.url();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response7.cookies();
        java.lang.String str15 = response7.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = null;
        response7.byteData = byteBuffer16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response21 = response18.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12992");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response7.headers();
        response7.contentType = "";
        java.nio.ByteBuffer byteBuffer11 = response7.byteData;
        org.jsoup.Connection.Request request12 = null;
        response7.req = request12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        response14.numRedirects = 402;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12993");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response5.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        response5.contentType = "";
        org.jsoup.Connection.Response response12 = response5.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12994");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Request request10 = response9.req;
        response9.statusMessage = "hi!";
        boolean boolean13 = response9.executed;
        response9.statusMessage = "";
        org.jsoup.Connection.Request request16 = response9.req;
        java.lang.Class<?> wildcardClass17 = response9.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12995");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean10 = response7.hasHeaderWithValue("hi!", "hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response7.scanHeaders("");
        org.jsoup.Connection.Request request13 = null;
        response7.req = request13;
        org.jsoup.Connection.Response response17 = response7.cookie("hi!", "");
        response7.statusCode = 401;
        response7.charset = "";
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12996");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        response3.numRedirects = 0;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.nio.ByteBuffer byteBuffer12 = response3.byteData;
        java.lang.String str13 = response3.charset;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Method method17 = response3.method();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12997");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str2 = response1.contentType();
        int int3 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("hi!");
        response4.statusMessage = "";
        boolean boolean10 = response4.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str12 = response11.contentType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12998");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset();
        boolean boolean5 = response1.executed;
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        boolean boolean10 = response1.executed;
        java.lang.String str11 = response1.statusMessage();
        response1.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        int int16 = response15.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response15.headers();
        org.jsoup.Connection.Method method18 = response15.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test12999");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        java.lang.String str5 = response3.header("");
        java.lang.String str6 = response3.charset();
        int int7 = response3.numRedirects;
        response3.numRedirects = 0;
        int int10 = response3.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        response3.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str19 = response3.header("");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test13000");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.lang.String> strMap2 = response1.headers();
        response1.executed = false;
        java.lang.String str5 = response1.contentType;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        response6.charset = "";
        org.jsoup.Connection.Request request9 = response6.req;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        response6.numRedirects = (byte) 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response6.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str19 = response16.cookie("hi!");
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str19);
    }
}
