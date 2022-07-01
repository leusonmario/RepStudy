import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Request request12 = response1.req;
        response1.statusMessage = "hi!";
        boolean boolean16 = response1.hasCookie("hi!");
        boolean boolean18 = response1.hasHeader("hi!");
        response1.statusCode = (byte) 10;
        java.lang.String str21 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean7 = response1.hasCookie("");
        response1.executed = true;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.net.URL uRL15 = response1.url();
        response1.contentType = "";
        response1.statusMessage = "hi!";
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Request request23 = response22.req;
        int int24 = response22.statusCode;
        response22.executed = false;
        response22.statusMessage = "hi!";
        org.jsoup.Connection.Response response30 = response22.removeCookie("");
        response22.charset = "";
        org.jsoup.Connection.Request request33 = null;
        response22.req = request33;
        org.jsoup.Connection.Response response36 = response22.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Request request38 = null;
        response22.req = request38;
        org.jsoup.Connection.Response response42 = response22.cookie("hi!", "hi!");
        response22.executed = false;
        boolean boolean45 = response22.executed;
        java.lang.String str46 = response22.charset();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(request23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNotNull(response36);
        org.junit.Assert.assertNotNull(response42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        java.lang.String str6 = response2.charset();
        org.jsoup.Connection.Method method7 = response2.method();
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response2.cookies();
        java.lang.String str12 = response2.header("");
        java.lang.String str13 = response2.contentType;
        boolean boolean14 = response2.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response2.cookies();
        java.lang.String str17 = response2.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.cookies();
        java.lang.String str6 = response1.getHeaderCaseInsensitive("");
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response1.charset;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str14 = response1.header("hi!");
        response1.contentType = "";
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.String str15 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        int int17 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        boolean boolean6 = response1.hasHeader("hi!");
        int int7 = response1.statusCode();
        java.lang.Class<?> wildcardClass8 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        response1.charset = "hi!";
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        int int24 = response23.numRedirects;
        java.lang.String str25 = response23.contentType;
        response23.executed = false;
        java.nio.ByteBuffer byteBuffer28 = null;
        response23.byteData = byteBuffer28;
        java.lang.String str30 = response23.contentType;
        java.net.URL uRL31 = response23.url();
        int int32 = response23.numRedirects;
        boolean boolean34 = response23.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(uRL31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        response1.numRedirects = 35;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        org.jsoup.Connection.Request request21 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.headers();
        java.nio.ByteBuffer byteBuffer23 = response1.byteData;
        org.jsoup.Connection.Method method24 = response1.method();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response1.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(byteBuffer23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str11 = response1.statusMessage();
        int int12 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        java.lang.String str17 = response1.charset;
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Response response17 = response1.removeCookie("");
        response1.executed = true;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage();
        response1.charset = "hi!";
        java.lang.String str14 = response1.contentType();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        response1.charset = "hi!";
        response1.charset = "";
        org.jsoup.Connection.Response response9 = response1.removeHeader("hi!");
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.header("");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Request request14 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.contentType;
        java.lang.String str17 = response1.cookie("");
        boolean boolean18 = response1.executed;
        org.jsoup.Connection.Request request19 = response1.req;
        org.jsoup.Connection.Request request20 = response1.req;
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer23 = null;
        response1.byteData = byteBuffer23;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(request20);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        java.lang.String str18 = response1.contentType();
        org.jsoup.Connection.Response response21 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response1.cookie("hi!", "");
        boolean boolean13 = response1.hasCookie("hi!");
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.statusCode();
        boolean boolean17 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        java.lang.String str15 = response1.contentType;
        java.lang.String str16 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str13 = response1.cookie("hi!");
        boolean boolean14 = response1.executed;
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.lang.String str17 = response1.contentType;
        org.jsoup.Connection.Method method18 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.contentType;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.jsoup.Connection.Response response18 = response1.cookie("hi!", "");
        java.lang.String str19 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        int int17 = response1.statusCode;
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.contentType();
        response1.statusCode = (byte) 1;
        response1.statusCode = (-1);
        org.jsoup.Connection.Request request21 = null;
        response1.req = request21;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.net.URL uRL13 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        int int7 = response1.numRedirects;
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Request request9 = response1.req;
        int int10 = response1.statusCode();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response1.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        java.nio.ByteBuffer byteBuffer5 = response1.byteData;
        java.lang.String str6 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(byteBuffer5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "hi!";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.header("");
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        response1.statusCode = (byte) 100;
        java.lang.String str10 = response1.contentType;
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        boolean boolean15 = response1.hasCookie("");
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        int int19 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.jsoup.Connection.Method method21 = response1.method();
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.executed = true;
        org.jsoup.Connection.Method method18 = response1.method();
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode;
        response1.statusMessage = "";
        int int8 = response1.statusCode();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.contentType;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        java.lang.String str17 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document18 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.lang.Class<?> wildcardClass8 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        int int4 = response2.statusCode;
        response2.executed = false;
        response2.statusMessage = "hi!";
        java.lang.String str9 = response2.charset();
        java.lang.String str11 = response2.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response14 = response2.cookie("hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.charset;
        response1.statusMessage = "hi!";
        java.lang.String str11 = response1.statusMessage();
        response1.statusCode = 97;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str17 = response1.charset;
        java.lang.String str18 = response1.contentType();
        java.lang.String str19 = response1.statusMessage;
        java.lang.Class<?> wildcardClass20 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        response1.statusCode = 'a';
        boolean boolean11 = response1.executed;
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.statusCode = (short) 100;
        java.lang.String str18 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        java.lang.String str21 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("hi!");
        response1.numRedirects = '4';
        response1.statusMessage = "";
        org.jsoup.Connection.Request request25 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.numRedirects = (byte) 0;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str7 = response1.cookie("");
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str10 = response1.header("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        org.jsoup.Connection.Request request4 = response1.req;
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(request4);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int20 = response19.statusCode();
        java.lang.String str21 = response19.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response19.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        org.jsoup.Connection.Method method7 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Request request9 = response1.req;
        response1.numRedirects = 2;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.contentType;
        response1.contentType = "hi!";
        java.lang.String str16 = response1.charset();
        response1.contentType = "";
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        response1.statusCode = (short) -1;
        java.lang.String str12 = response1.contentType();
        int int13 = response1.numRedirects;
        response1.executed = true;
        org.jsoup.Connection.Request request16 = response1.req;
        boolean boolean18 = response1.hasCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        org.jsoup.Connection.Request request7 = response1.req;
        response1.charset = "";
        boolean boolean11 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str14 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response12.statusCode;
        java.lang.String str14 = response12.contentType;
        response12.executed = false;
        java.lang.Class<?> wildcardClass17 = response12.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        boolean boolean12 = response9.executed;
        int int13 = response9.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        response1.contentType = "hi!";
        int int6 = response1.statusCode();
        response1.executed = true;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.contentType;
        java.lang.String str10 = response1.statusMessage;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.statusMessage();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request18 = response1.req;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(request18);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        response1.executed = true;
        java.net.HttpURLConnection httpURLConnection21 = null;
        org.jsoup.helper.HttpConnection.Response response22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        response23.statusMessage = "";
        org.jsoup.Connection.Method method26 = response23.method();
        java.nio.ByteBuffer byteBuffer27 = null;
        response23.byteData = byteBuffer27;
        java.lang.String str30 = response23.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry32 = response23.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap33 = response23.headers();
        java.lang.String str34 = response23.charset;
        java.lang.String str35 = response23.charset;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection21, (org.jsoup.Connection.Response) response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(strEntry32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.numRedirects = (short) 10;
        response1.charset = "hi!";
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        int int22 = response1.statusCode();
        int int23 = response1.statusCode;
        org.jsoup.Connection.Method method24 = response1.method();
        response1.statusCode = (-1);
        boolean boolean27 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        response1.executed = false;
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Method method12 = response1.method();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "");
        org.jsoup.Connection.Method method20 = response1.method();
        java.lang.String str21 = response1.charset;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request24 = null;
        response1.req = request24;
        java.lang.String str26 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        java.lang.String str15 = response1.charset;
        int int16 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        response1.charset = "hi!";
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        response1.charset = "hi!";
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage();
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.contentType();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        boolean boolean14 = response1.hasCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.charset();
        java.lang.String str19 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        response1.executed = true;
        int int18 = response1.statusCode;
        java.net.URL uRL19 = response1.url();
        response1.contentType = "hi!";
        boolean boolean23 = response1.hasCookie("");
        org.jsoup.Connection.Response response25 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        response1.statusCode = (byte) 100;
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        boolean boolean8 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        java.net.URL uRL10 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = uRL10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.contentType = "hi!";
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Method method17 = response1.method();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("hi!");
        response1.charset = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        java.lang.String str24 = response1.charset();
        boolean boolean26 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.statusMessage;
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        org.jsoup.Connection.Request request22 = response1.req;
        java.lang.String str23 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(request22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        response1.statusCode = 100;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        response18.statusMessage = "";
        org.jsoup.Connection.Method method21 = response18.method();
        java.nio.ByteBuffer byteBuffer22 = null;
        response18.byteData = byteBuffer22;
        org.jsoup.Connection.Request request24 = null;
        response18.req = request24;
        java.net.URL uRL26 = response18.url();
        org.jsoup.Connection.Response response28 = response18.removeCookie("");
        java.lang.String str29 = response18.charset();
        java.lang.String str31 = response18.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response18.headers();
        org.jsoup.Connection.Request request33 = response18.req;
        java.nio.ByteBuffer byteBuffer34 = null;
        response18.byteData = byteBuffer34;
        int int36 = response18.numRedirects;
        java.lang.String str37 = response18.contentType();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(request33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response11.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response11.cookies();
        java.nio.ByteBuffer byteBuffer15 = null;
        response11.byteData = byteBuffer15;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str16 = response1.contentType();
        response1.executed = true;
        int int19 = response1.statusCode();
        java.lang.String str20 = response1.charset();
        response1.executed = false;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "hi!";
        java.lang.String str13 = response1.statusMessage();
        int int14 = response1.statusCode;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        response1.executed = false;
        boolean boolean11 = response1.executed;
        response1.contentType = "hi!";
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response14.numRedirects = 100;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.contentType();
        response1.statusCode = (-1);
        java.lang.String str17 = response1.header("hi!");
        org.jsoup.Connection.Method method18 = response1.method();
        boolean boolean20 = response1.hasCookie("hi!");
        java.lang.String str21 = response1.charset;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method24 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        boolean boolean11 = response1.hasCookie("");
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str18 = response1.cookie("hi!");
        response1.statusCode = (short) -1;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        response1.executed = false;
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response9.cookies();
        java.lang.String str11 = response9.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str10 = response1.header("hi!");
        int int11 = response1.numRedirects;
        response1.statusCode = '#';
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request16 = response1.req;
        response1.numRedirects = (byte) 0;
        response1.numRedirects = (byte) 100;
        java.lang.String str21 = response1.charset();
        int int22 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset;
        response1.numRedirects = 32;
        response1.statusCode = (byte) 10;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.jsoup.Connection.Method method8 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.statusMessage;
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage;
        response1.statusMessage = "";
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.jsoup.Connection.Method method8 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.charset();
        java.lang.String str16 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strEntry18);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        int int8 = response1.numRedirects;
        response1.statusCode = 10;
        response1.statusMessage = "";
        response1.statusCode = 97;
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        boolean boolean10 = response1.hasCookie("");
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.Connection.Request request12 = response1.req;
        response1.executed = true;
        int int15 = response1.statusCode();
        response1.charset = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        boolean boolean18 = response1.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int20 = response19.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.header("");
        java.lang.String str15 = response1.statusMessage;
        java.lang.String str16 = response1.contentType();
        response1.contentType = "hi!";
        response1.statusMessage = "hi!";
        int int21 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        int int14 = response1.numRedirects;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request17 = response1.req;
        java.lang.String str18 = response1.statusMessage;
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(request17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.contentType();
        response1.charset = "";
        java.lang.String str18 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str10 = response1.cookie("hi!");
        java.lang.String str12 = response1.cookie("hi!");
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response11.numRedirects;
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        java.lang.String str16 = response11.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean16 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        int int17 = response1.statusCode();
        org.jsoup.Connection.Request request18 = response1.req;
        java.lang.String str19 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        org.jsoup.Connection.Request request14 = response1.req;
        java.lang.String str16 = response1.cookie("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response21 = response1.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        java.lang.String str19 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        response1.executed = false;
        java.lang.String str10 = response1.contentType;
        int int11 = response1.statusCode();
        boolean boolean13 = response1.hasCookie("hi!");
        java.lang.String str14 = response1.contentType();
        int int15 = response1.statusCode();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.charset;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.lang.String str13 = response1.statusMessage;
        java.lang.String str14 = response1.contentType();
        response1.contentType = "";
        java.lang.String str17 = response1.contentType;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        response1.executed = true;
        java.lang.String str18 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.statusCode();
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        boolean boolean18 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response7 = response1.removeCookie("");
        java.lang.String str9 = response1.header("hi!");
        boolean boolean11 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        int int15 = response1.statusCode;
        java.lang.String str16 = response1.contentType;
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        int int8 = response2.statusCode();
        response2.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.headers();
        java.lang.String str13 = response2.getHeaderCaseInsensitive("hi!");
        response2.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.statusMessage = "";
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        boolean boolean22 = response1.hasHeader("hi!");
        java.lang.String str23 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        response1.statusMessage = "";
        response1.statusMessage = "hi!";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        boolean boolean10 = response1.hasCookie("");
        java.lang.String str11 = response1.statusMessage();
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "hi!");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.numRedirects = 1;
        java.net.URL uRL13 = response1.url();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        response1.charset = "hi!";
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Response response19 = response1.removeCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method11 = response1.method();
        java.net.URL uRL12 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        response1.statusMessage = "";
        java.net.URL uRL5 = response1.url();
        java.lang.String str6 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        int int8 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        java.net.URL uRL12 = response1.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int14 = response13.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        response1.contentType = "";
        response1.statusMessage = "";
        int int10 = response1.statusCode();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        int int15 = response1.numRedirects;
        boolean boolean17 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int19 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "");
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = response1.req;
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Request request11 = response1.req;
        int int12 = response1.numRedirects;
        response1.statusCode = (short) 1;
        java.lang.String str16 = response1.cookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        response1.statusCode = 'a';
        java.lang.String str19 = response1.cookie("");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        boolean boolean22 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        int int14 = response1.numRedirects;
        int int15 = response1.statusCode;
        response1.numRedirects = ' ';
        boolean boolean19 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str10 = response1.cookie("hi!");
        response1.executed = false;
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        response1.contentType = "";
        int int14 = response1.numRedirects;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        java.lang.String str10 = response1.cookie("hi!");
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        response1.numRedirects = (short) 0;
        java.lang.String str16 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.cookie("");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = 35;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.contentType();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        int int13 = response1.statusCode();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.statusCode();
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str24 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray28 = response27.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(strEntry26);
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.statusMessage();
        int int10 = response1.statusCode();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.charset();
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Request request16 = response15.req;
        java.lang.String str18 = response15.cookie("hi!");
        java.lang.String str19 = response15.charset();
        int int20 = response15.statusCode;
        java.nio.ByteBuffer byteBuffer21 = response15.byteData;
        org.jsoup.Connection.Method method22 = response15.method();
        java.lang.String str23 = response15.statusMessage();
        response15.executed = false;
        org.jsoup.Connection.Method method26 = response15.method();
        int int27 = response15.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(byteBuffer21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer11);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str20 = response1.charset();
        int int21 = response1.numRedirects;
        boolean boolean22 = response1.executed;
        response1.charset = "";
        int int25 = response1.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Request request13 = response1.req;
        response1.contentType = "";
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        boolean boolean11 = response1.hasCookie("");
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "");
        response1.statusMessage = "hi!";
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        response1.statusCode = (byte) 100;
        int int19 = response1.numRedirects;
        org.jsoup.Connection.Request request20 = response1.req;
        java.net.URL uRL21 = response1.url();
        java.net.HttpURLConnection httpURLConnection22 = null;
        org.jsoup.helper.HttpConnection.Response response23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        response24.statusMessage = "";
        java.net.URL uRL27 = response24.url();
        org.jsoup.Connection.Response response29 = response24.removeCookie("");
        response24.statusCode = 100;
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response24.headers();
        org.jsoup.Connection.Response response34 = response24.removeCookie("");
        int int35 = response24.numRedirects;
        response24.numRedirects = (short) 10;
        java.lang.String str38 = response24.contentType;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection22, (org.jsoup.Connection.Response) response24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(uRL27);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        java.lang.String str7 = response1.cookie("hi!");
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str11 = response1.header("");
        java.lang.String str12 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        boolean boolean20 = response1.hasHeader("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response25 = response1.cookie("hi!", "");
        int int26 = response1.statusCode();
        java.lang.String str27 = response1.statusMessage;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        response1.statusCode = (short) -1;
        int int12 = response1.statusCode();
        response1.executed = false;
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Request request20 = response19.req;
        java.lang.String str22 = response19.cookie("hi!");
        org.jsoup.Connection.Response response24 = response19.removeHeader("hi!");
        int int25 = response19.statusCode;
        java.nio.ByteBuffer byteBuffer26 = response19.byteData;
        org.jsoup.Connection.Response response29 = response19.header("hi!", "hi!");
        java.lang.String str30 = response19.charset;
        org.jsoup.Connection.Request request31 = response19.req;
        java.lang.String str32 = response19.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response16.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(byteBuffer26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(request31);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str15 = response1.charset();
        java.net.URL uRL16 = response1.url();
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        int int18 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str9 = response1.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Request request14 = response13.req;
        java.nio.ByteBuffer byteBuffer15 = response13.byteData;
        int int16 = response13.numRedirects;
        java.lang.String str18 = response13.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response13.cookies();
        org.jsoup.Connection.Method method20 = response13.method();
        java.lang.String str21 = response13.contentType;
        org.jsoup.Connection.Method method22 = response13.method();
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        boolean boolean9 = response2.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer10 = response2.byteData;
        java.lang.String str12 = response2.cookie("");
        int int13 = response2.statusCode;
        java.lang.String str14 = response2.contentType();
        java.lang.String str15 = response2.contentType();
        boolean boolean16 = response2.executed;
        java.net.URL uRL17 = response2.url();
        org.jsoup.Connection.Request request18 = response2.req;
        java.lang.String str19 = response2.contentType();
        java.lang.String str21 = response2.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        int int16 = response1.statusCode();
        java.lang.String str18 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        java.lang.String str20 = response1.header("");
        java.lang.String str22 = response1.cookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.numRedirects;
        boolean boolean7 = response1.executed;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strEntry9);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str5 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        int int7 = response1.numRedirects;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        response1.executed = true;
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry12);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.net.URL uRL7 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        int int18 = response1.statusCode;
        boolean boolean20 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = response1.cookies();
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        java.lang.String str25 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str26 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        response1.executed = true;
        int int15 = response1.statusCode();
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = null;
        response1.byteData = byteBuffer17;
        response1.numRedirects = (short) 1;
        response1.statusCode = 97;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasHeader("hi!");
        java.lang.String str9 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.cookie("");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer18 = response1.byteData;
        org.jsoup.Connection.Response response20 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        boolean boolean8 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str10 = response1.statusMessage();
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.statusMessage;
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        response1.statusCode = (short) -1;
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str24 = response1.charset();
        response1.statusCode = (short) -1;
        org.jsoup.Connection.Request request27 = null;
        response1.req = request27;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        int int5 = response1.statusCode;
        org.jsoup.Connection.Response response8 = response1.cookie("hi!", "");
        boolean boolean10 = response1.hasCookie("");
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        response1.executed = false;
        java.lang.String str15 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        java.lang.String str20 = response1.charset();
        int int21 = response1.numRedirects;
        boolean boolean22 = response1.executed;
        response1.charset = "";
        java.lang.String str26 = response1.cookie("");
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.lang.String str8 = response1.charset;
        response1.charset = "hi!";
        java.lang.String str11 = response1.statusMessage;
        java.lang.String str12 = response1.statusMessage;
        java.lang.String str13 = response1.charset();
        java.lang.String str14 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str5 = response1.contentType;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Response response12 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = 0;
        java.lang.String str16 = response1.contentType;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str16 = response1.statusMessage();
        java.lang.String str18 = response1.cookie("");
        int int19 = response1.statusCode;
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType;
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.lang.String str14 = response1.cookie("hi!");
        java.lang.String str15 = response1.statusMessage;
        int int16 = response1.statusCode;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.numRedirects;
        response1.statusCode = 52;
        java.lang.String str16 = response1.cookie("");
        java.lang.String str17 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        int int18 = response1.statusCode();
        response1.statusMessage = "";
        int int21 = response1.statusCode;
        org.jsoup.Connection.Response response23 = response1.removeCookie("hi!");
        response1.statusCode = (short) 1;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        response1.numRedirects = (byte) -1;
        response1.statusMessage = "";
        java.lang.String str13 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusCode = 1;
        int int16 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        org.jsoup.Connection.Response response19 = response1.removeCookie("");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        int int6 = response1.numRedirects;
        org.jsoup.Connection.Response response9 = response1.header("hi!", "");
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        response1.executed = false;
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.lang.String str9 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.charset();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.net.URL uRL18 = response1.url();
        java.lang.String str19 = response1.statusMessage();
        response1.contentType = "";
        java.net.URL uRL22 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray23 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(uRL22);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.charset;
        org.jsoup.Connection.Request request5 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.headers();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        boolean boolean10 = response1.executed;
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        java.lang.String str14 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(request5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.statusMessage;
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.contentType;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Response response17 = response1.removeCookie("");
        int int18 = response1.statusCode();
        response1.statusMessage = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.numRedirects = (byte) 1;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.charset();
        org.jsoup.Connection.Response response17 = response1.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.String str9 = response1.contentType();
        java.lang.String str10 = response1.contentType;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method11 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        int int20 = response1.statusCode();
        org.jsoup.Connection.Response response22 = response1.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.charset = "hi!";
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int18 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        java.net.URL uRL11 = response1.url();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.statusMessage;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("hi!");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        response1.executed = true;
        java.lang.String str10 = response1.cookie("");
        response1.executed = false;
        boolean boolean14 = response1.hasCookie("hi!");
        java.lang.Class<?> wildcardClass15 = response1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        int int14 = response1.numRedirects;
        int int15 = response1.statusCode;
        org.jsoup.Connection.Request request16 = response1.req;
        int int17 = response1.numRedirects;
        java.lang.String str18 = response1.contentType;
        org.jsoup.Connection.Response response21 = response1.cookie("hi!", "");
        java.lang.String str22 = response1.statusMessage;
        java.lang.String str23 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        org.jsoup.Connection.Request request8 = null;
        response2.req = request8;
        java.net.URL uRL10 = response2.url();
        org.jsoup.Connection.Response response12 = response2.removeCookie("");
        java.lang.String str13 = response2.contentType;
        org.jsoup.Connection.Request request14 = response2.req;
        java.lang.String str16 = response2.header("hi!");
        boolean boolean18 = response2.hasHeader("hi!");
        java.lang.String str19 = response2.charset();
        boolean boolean21 = response2.hasHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response2);
        org.jsoup.Connection.Response response24 = response2.removeCookie("");
        java.net.URL uRL25 = response2.url();
        java.lang.String str26 = response2.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.contentType = "hi!";
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Method method17 = response1.method();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.jsoup.Connection.Response response21 = response1.removeCookie("");
        response1.statusMessage = "hi!";
        response1.charset = "";
        java.util.Map<java.lang.String, java.lang.String> strMap26 = response1.headers();
        java.lang.Class<?> wildcardClass27 = strMap26.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "hi!";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = (byte) -1;
        boolean boolean8 = response1.executed;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        response1.executed = true;
        boolean boolean19 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        response1.numRedirects = (short) 0;
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        int int19 = response1.statusCode();
        boolean boolean20 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        java.lang.String str12 = response1.cookie("");
        int int13 = response1.statusCode();
        java.lang.String str14 = response1.statusMessage;
        java.lang.String str15 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.jsoup.Connection.Response response18 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response19.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        java.nio.ByteBuffer byteBuffer8 = null;
        response2.byteData = byteBuffer8;
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Response response13 = response2.cookie("hi!", "");
        response2.numRedirects = 1;
        java.lang.String str16 = response2.contentType();
        java.lang.String str17 = response2.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response2.cookies();
        org.jsoup.Connection.Request request19 = null;
        response2.req = request19;
        java.lang.String str22 = response2.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL23 = response2.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response24 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(uRL23);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        boolean boolean4 = response1.executed;
        int int5 = response1.numRedirects;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method8 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        response1.numRedirects = 0;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        java.lang.String str22 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean24 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        org.jsoup.Connection.Request request9 = response1.req;
        java.nio.ByteBuffer byteBuffer10 = null;
        response1.byteData = byteBuffer10;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        response1.contentType = "hi!";
        java.lang.String str17 = response1.contentType();
        java.lang.String str18 = response1.contentType;
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.jsoup.Connection.Response response23 = response1.header("hi!", "hi!");
        response1.statusMessage = "";
        response1.charset = "";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.numRedirects = (short) 10;
        response1.charset = "hi!";
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        boolean boolean22 = response1.executed;
        java.lang.String str23 = response1.statusMessage();
        java.lang.String str24 = response1.contentType;
        boolean boolean26 = response1.hasCookie("hi!");
        response1.charset = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Request request13 = response1.req;
        response1.contentType = "";
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.method(method16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str18 = response1.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        boolean boolean21 = response1.executed;
        int int22 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        int int18 = response1.statusCode;
        java.lang.String str20 = response1.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str13 = response1.contentType;
        int int14 = response1.numRedirects;
        response1.numRedirects = (byte) 100;
        java.lang.String str17 = response1.charset;
        java.lang.String str19 = response1.header("hi!");
        response1.contentType = "hi!";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry23 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry23);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.net.URL uRL8 = response1.url();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.url(uRL9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        java.lang.String str10 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage;
        boolean boolean14 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        response1.statusMessage = "";
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request14);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        response1.numRedirects = 10;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.statusMessage = "";
        int int10 = response1.statusCode;
        response1.charset = "";
        java.lang.String str13 = response1.contentType();
        java.net.URL uRL14 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        int int11 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.net.URL uRL16 = response1.url();
        java.lang.String str17 = response1.statusMessage;
        response1.contentType = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.jsoup.Connection.Response response24 = response1.header("hi!", "");
        java.nio.ByteBuffer byteBuffer25 = response1.byteData;
        int int26 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(byteBuffer25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Method method15 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        boolean boolean14 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.header("hi!");
        java.lang.String str18 = response1.contentType();
        response1.charset = "hi!";
        org.jsoup.Connection.Request request21 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request21);
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        response15.charset = "hi!";
        org.jsoup.Connection.Response response20 = response15.header("hi!", "hi!");
        org.jsoup.Connection.Response response22 = response15.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset();
        boolean boolean9 = response1.hasHeader("hi!");
        java.lang.String str10 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response14 = response11.cookie("hi!", "");
        java.lang.String str15 = response11.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response11.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        int int15 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer18 = response17.byteData;
        response17.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(byteBuffer16);
        org.junit.Assert.assertNull(byteBuffer18);
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str10 = response1.contentType();
        java.lang.String str12 = response1.header("");
        int int13 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.statusMessage;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        int int14 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        int int16 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL10 = response1.url();
        boolean boolean12 = response1.hasCookie("hi!");
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode;
        java.lang.String str15 = response1.statusMessage;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = response1.cookies();
        boolean boolean8 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        boolean boolean12 = response1.hasHeader("hi!");
        response1.executed = false;
        boolean boolean15 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.statusCode();
        int int17 = response1.statusCode;
        java.lang.String str19 = response1.header("");
        int int20 = response1.numRedirects;
        int int21 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Request request23 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document24 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNull(request23);
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        int int10 = response1.numRedirects;
        java.lang.String str11 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response12.headers();
        response12.statusCode = 32;
        org.jsoup.Connection.Response response18 = response12.header("hi!", "");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Request request12 = response1.req;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        boolean boolean14 = response1.executed;
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        org.jsoup.Connection.Response response4 = response1.removeCookie("hi!");
        java.lang.String str6 = response1.header("");
        int int7 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        response1.statusMessage = "";
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method14 = response1.method();
        java.lang.String str15 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.net.URL uRL17 = response1.url();
        java.lang.String str18 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        java.lang.String str14 = response1.contentType;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        java.lang.String str17 = response1.contentType();
        int int18 = response1.statusCode();
        java.net.URL uRL19 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(uRL19);
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        response1.statusCode = (short) 0;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.lang.String str12 = response1.contentType();
        boolean boolean13 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        response1.contentType = "hi!";
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.lang.String str15 = response1.contentType;
        response1.numRedirects = (short) 10;
        response1.charset = "hi!";
        java.lang.String str20 = response1.charset();
        response1.contentType = "";
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.jsoup.Connection.Request request25 = response1.req;
        int int26 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(request25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Request request15 = response1.req;
        response1.charset = "hi!";
        java.lang.String str18 = response1.statusMessage();
        java.lang.String str19 = response1.statusMessage;
        response1.statusMessage = "";
        java.lang.String str22 = response1.statusMessage();
        boolean boolean23 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request6 = response1.req;
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        int int13 = response1.statusCode;
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(request6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode;
        java.lang.String str14 = response1.charset;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        java.lang.String str19 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "hi!";
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.charset;
        java.lang.String str16 = response1.statusMessage();
        org.jsoup.Connection.Response response18 = response1.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        int int10 = response1.statusCode();
        int int11 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = 'a';
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        boolean boolean12 = response1.hasHeader("hi!");
        boolean boolean14 = response1.hasHeader("hi!");
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.charset;
        java.lang.String str18 = response1.header("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        boolean boolean6 = response1.hasCookie("");
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.net.URL uRL15 = response1.url();
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.contentType();
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.contentType;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        int int7 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        boolean boolean9 = response1.executed;
        org.jsoup.Connection.Method method10 = response1.method();
        java.lang.String str11 = response1.statusMessage();
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response9 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.getHeaderCaseInsensitive("");
        response1.numRedirects = (byte) -1;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        int int13 = response1.statusCode();
        int int14 = response1.numRedirects;
        boolean boolean16 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.contentType();
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.contentType;
        org.jsoup.Connection.Response response17 = response1.removeCookie("");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        int int10 = response1.statusCode;
        int int11 = response1.statusCode();
        int int12 = response1.numRedirects;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.statusCode();
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage();
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        response1.statusMessage = "";
        boolean boolean24 = response1.hasCookie("");
        java.lang.String str26 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str27 = response1.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        response1.charset = "hi!";
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.charset;
        boolean boolean17 = response1.hasCookie("hi!");
        int int18 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        java.lang.String str21 = response1.statusMessage();
        java.lang.String str22 = response1.statusMessage;
        response1.numRedirects = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        int int13 = response1.numRedirects;
        int int14 = response1.numRedirects;
        response1.contentType = "";
        java.lang.String str17 = response1.statusMessage();
        org.jsoup.Connection.Method method18 = response1.method();
        java.lang.String str19 = response1.contentType();
        java.lang.String str20 = response1.charset();
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str17 = response1.header("");
        java.lang.String str18 = response1.contentType();
        boolean boolean20 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str21 = response19.header("hi!");
        java.net.URL uRL22 = response19.url();
        java.lang.String str24 = response19.header("");
        response19.numRedirects = 35;
        org.jsoup.Connection.Response response29 = response19.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response29);
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = null;
        response1.byteData = byteBuffer15;
        boolean boolean18 = response1.hasCookie("hi!");
        response1.executed = true;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("hi!");
        java.lang.String str15 = response1.cookie("");
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.Connection.Response response19 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.Connection.Response response13 = response1.cookie("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry7 = response1.scanHeaders("");
        java.lang.String str8 = response1.charset;
        response1.charset = "hi!";
        java.lang.String str11 = response1.charset;
        int int12 = response1.statusCode;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(strEntry7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.statusMessage;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        response1.numRedirects = (short) -1;
        java.lang.String str13 = response1.contentType;
        response1.charset = "";
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str12 = response1.header("");
        java.net.URL uRL13 = response1.url();
        org.jsoup.Connection.Method method14 = response1.method();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        response17.statusMessage = "";
        org.jsoup.Connection.Method method20 = response17.method();
        java.nio.ByteBuffer byteBuffer21 = null;
        response17.byteData = byteBuffer21;
        java.lang.String str24 = response17.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry26 = response17.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap27 = response17.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response17.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry30 = response17.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = response17.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strEntry26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(strEntry30);
        org.junit.Assert.assertNotNull(strMap32);
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Method method12 = response1.method();
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.charset();
        int int15 = response1.numRedirects;
        response1.numRedirects = (-1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Response response12 = response1.removeHeader("hi!");
        response1.numRedirects = (short) 1;
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        response1.contentType = "hi!";
        int int19 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.cookie("");
        java.lang.String str15 = response1.header("hi!");
        int int16 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.jsoup.Connection.Method method18 = response1.method();
        int int19 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        java.lang.String str16 = response1.charset();
        java.lang.String str18 = response1.cookie("");
        org.jsoup.Connection.Request request19 = response1.req;
        java.lang.String str21 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(request19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        response1.numRedirects = (byte) -1;
        boolean boolean13 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Response response13 = response1.removeHeader("hi!");
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request16 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(request16);
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        boolean boolean15 = response1.executed;
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        java.lang.String str18 = response1.statusMessage();
        java.net.URL uRL19 = response1.url();
        org.jsoup.Connection.Response response22 = response1.cookie("hi!", "hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = response1.req;
        response1.contentType = "";
        response1.statusMessage = "";
        response1.statusCode = 32;
        java.lang.String str15 = response1.contentType;
        boolean boolean16 = response1.executed;
        int int17 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response10 = response8.removeCookie("hi!");
        java.lang.String str12 = response8.cookie("");
        boolean boolean14 = response8.hasCookie("hi!");
        response8.executed = false;
        java.nio.ByteBuffer byteBuffer17 = response8.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(byteBuffer17);
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.lang.String str17 = response1.statusMessage;
        response1.numRedirects = (-1);
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        org.jsoup.Connection.Method method5 = response2.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response2.byteData = byteBuffer6;
        int int8 = response2.statusCode();
        org.jsoup.Connection.Response response11 = response2.cookie("hi!", "hi!");
        java.lang.String str12 = response2.charset;
        boolean boolean13 = response2.executed;
        int int14 = response2.statusCode;
        boolean boolean15 = response2.executed;
        response2.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.charset = "hi!";
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        response1.numRedirects = (short) 0;
        java.net.URL uRL12 = response1.url();
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        boolean boolean17 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response19 = response1.removeCookie("");
        java.lang.String str20 = response1.statusMessage();
        boolean boolean22 = response1.hasCookie("");
        org.jsoup.Connection.Request request23 = null;
        response1.req = request23;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        boolean boolean16 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        org.jsoup.Connection.Request request11 = response1.req;
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.statusMessage();
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        response1.contentType = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        response1.charset = "";
        java.lang.String str17 = response1.contentType();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Request request21 = response20.req;
        int int22 = response20.statusCode;
        response20.executed = false;
        java.lang.String str26 = response20.getHeaderCaseInsensitive("");
        org.jsoup.Connection.Method method27 = response20.method();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = response20.cookies();
        java.lang.String str29 = response20.contentType();
        org.jsoup.Connection.Response response31 = response20.removeCookie("hi!");
        java.lang.String str32 = response20.contentType();
        java.lang.String str33 = response20.statusMessage;
        response20.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(request21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        response1.statusCode = (byte) 100;
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        java.lang.String str20 = response1.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        boolean boolean13 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.charset();
        boolean boolean11 = response1.executed;
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "hi!");
        response1.charset = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        int int20 = response1.numRedirects;
        org.jsoup.Connection.Method method21 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("hi!");
        int int17 = response1.numRedirects;
        int int18 = response1.statusCode();
        response1.contentType = "";
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int22 = response21.statusCode;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        int int11 = response1.numRedirects;
        response1.executed = false;
        response1.executed = false;
        boolean boolean16 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str19 = response17.cookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response17.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str7 = response1.cookie("");
        java.lang.String str9 = response1.cookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.lang.String str11 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        int int13 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.headers();
        response1.contentType = "";
        java.lang.String str8 = response1.contentType();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.Class<?> wildcardClass13 = strMap12.getClass();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        org.jsoup.Connection.Response response7 = response2.removeHeader("hi!");
        java.lang.String str8 = response2.statusMessage;
        java.lang.String str10 = response2.getHeaderCaseInsensitive("hi!");
        java.lang.String str12 = response2.header("hi!");
        java.net.URL uRL13 = response2.url();
        org.jsoup.Connection.Response response15 = response2.removeCookie("");
        java.lang.String str16 = response2.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.charset = "";
        response1.charset = "";
        java.lang.String str16 = response1.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.charset();
        response1.charset = "";
        java.lang.String str12 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.url(uRL14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        int int14 = response1.statusCode;
        response1.contentType = "hi!";
        int int17 = response1.numRedirects;
        org.jsoup.Connection.Response response20 = response1.header("hi!", "hi!");
        java.lang.String str22 = response1.header("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str9 = response1.contentType();
        boolean boolean10 = response1.executed;
        response1.contentType = "hi!";
        response1.numRedirects = '#';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        boolean boolean18 = response1.hasCookie("");
        response1.statusCode = 0;
        java.net.URL uRL21 = response1.url();
        response1.statusCode = (short) -1;
        response1.numRedirects = (-1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean12 = response1.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.header("");
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL21 = response1.url();
        java.lang.String str22 = response1.contentType();
        org.jsoup.Connection.Method method23 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry25 = response1.scanHeaders("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(strEntry25);
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        int int16 = response1.statusCode;
        java.lang.String str18 = response1.header("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        response19.charset = "";
        java.lang.String str22 = response19.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer15 = null;
        response14.byteData = byteBuffer15;
        boolean boolean17 = response14.executed;
        int int18 = response14.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test15283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15283");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        java.lang.String str6 = response1.header("");
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.contentType();
        java.lang.Class<?> wildcardClass9 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15284");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        response1.numRedirects = (short) 0;
        java.lang.String str17 = response1.statusMessage;
        org.jsoup.Connection.Response response20 = response1.cookie("hi!", "");
        response1.contentType = "";
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test15285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15285");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        boolean boolean11 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        int int13 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test15286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15286");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        java.lang.String str12 = response1.cookie("");
        int int13 = response1.statusCode();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str17 = response1.cookie("hi!");
        int int18 = response1.statusCode();
        int int19 = response1.statusCode();
        response1.charset = "";
        java.lang.String str23 = response1.cookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15287");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        org.jsoup.Connection.Method method19 = response1.method();
        java.nio.ByteBuffer byteBuffer20 = null;
        response1.byteData = byteBuffer20;
        response1.statusCode = 0;
        response1.statusCode = '4';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method19);
    }

    @Test
    public void test15288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15288");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        response1.charset = "hi!";
        java.lang.String str15 = response1.statusMessage();
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test15289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15289");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        response1.statusCode = (short) 10;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.lang.String str12 = response1.statusMessage();
        response1.statusMessage = "";
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15290");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        org.jsoup.Connection.Request request11 = response1.req;
        java.lang.String str13 = response1.cookie("hi!");
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        response1.statusCode = 'a';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15291");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str15 = response1.charset();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        boolean boolean19 = response1.hasCookie("");
        java.net.URL uRL20 = response1.url();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test15292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15292");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        response1.numRedirects = (byte) -1;
        response1.executed = true;
        int int9 = response1.statusCode();
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test15293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15293");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response1.scanHeaders("");
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        java.lang.String str22 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15294");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean22 = response1.hasHeader("hi!");
        response1.charset = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document25 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test15295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15295");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        boolean boolean11 = response1.executed;
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "");
        response1.charset = "";
        org.jsoup.Connection.Request request20 = response1.req;
        response1.executed = false;
        boolean boolean23 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(request20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15296");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        response1.executed = false;
        java.lang.String str10 = response1.contentType;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15297");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        int int16 = response1.statusCode();
        int int17 = response1.statusCode;
        java.lang.String str18 = response1.statusMessage();
        java.lang.String str19 = response1.charset();
        org.jsoup.Connection.Method method20 = response1.method();
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        org.jsoup.Connection.Response response25 = response1.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response28 = response1.cookie("hi!", "");
        java.lang.String str30 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test15298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15298");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.contentType;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test15299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15299");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage;
        java.lang.String str10 = response1.statusMessage();
        response1.executed = false;
        org.jsoup.Connection.Request request13 = null;
        response1.req = request13;
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Request request16 = null;
        response1.req = request16;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15300");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.net.URL uRL16 = response1.url();
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        boolean boolean22 = response1.hasCookie("");
        java.lang.String str23 = response1.statusMessage();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(strEntry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test15301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15301");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = response1.req;
        response1.contentType = "";
        response1.statusMessage = "";
        response1.statusCode = 32;
        org.jsoup.Connection.Method method15 = response1.method();
        response1.statusMessage = "";
        boolean boolean18 = response1.executed;
        java.lang.String str19 = response1.contentType();
        java.nio.ByteBuffer byteBuffer20 = response1.byteData;
        java.nio.ByteBuffer byteBuffer21 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(byteBuffer20);
        org.junit.Assert.assertNull(byteBuffer21);
    }

    @Test
    public void test15302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15302");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        boolean boolean4 = response1.executed;
        response1.numRedirects = 32;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test15303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15303");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        response1.executed = true;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test15304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15304");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.contentType;
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response12.statusCode = 35;
        java.lang.String str16 = response12.cookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response12.cookies();
        boolean boolean19 = response12.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response12.cookies();
        response12.numRedirects = '#';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15305");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.statusMessage;
        int int5 = response1.statusCode();
        org.jsoup.Connection.Method method6 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.cookies();
        response1.statusCode = (byte) 100;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test15306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15306");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        boolean boolean13 = response1.hasHeader("hi!");
        response1.numRedirects = (short) -1;
        java.lang.String str17 = response1.cookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15307");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        response1.numRedirects = (short) 10;
        boolean boolean7 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
// flaky:             org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Too many redirects occurred trying to load URL null");
        } catch (java.io.IOException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test15308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15308");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        boolean boolean15 = response1.executed;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test15309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15309");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        response1.numRedirects = 1;
        java.lang.String str13 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        java.lang.String str16 = response1.charset();
        int int17 = response1.statusCode;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str20 = response1.cookie("hi!");
        java.lang.String str22 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15310");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str3 = response1.contentType();
        boolean boolean5 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method6 = response1.method();
        int int7 = response1.numRedirects;
        java.lang.String str8 = response1.charset();
        response1.charset = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15311");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.Connection.Request request11 = null;
        response1.req = request11;
        response1.executed = false;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test15312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15312");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.contentType();
        response1.statusCode = (byte) 10;
        int int16 = response1.numRedirects;
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15313");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        int int18 = response1.statusCode();
        org.jsoup.Connection.Response response20 = response1.removeCookie("");
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        response1.charset = "";
        java.lang.String str25 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("");
        org.jsoup.Connection.Request request28 = null;
        response1.req = request28;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strEntry27);
    }

    @Test
    public void test15314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15314");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        int int17 = response1.statusCode();
        org.jsoup.Connection.Request request18 = response1.req;
        java.lang.String str19 = response1.charset;
        org.jsoup.Connection.Method method20 = response1.method();
        java.lang.String str21 = response1.statusMessage();
        java.lang.String str22 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap23 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
    }

    @Test
    public void test15315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15315");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        java.net.URL uRL16 = response1.url();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.charset = "";
        java.lang.String str20 = response1.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test15316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15316");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str9 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Request request12 = response1.req;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(request12);
    }

    @Test
    public void test15317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15317");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        boolean boolean15 = response1.executed;
        response1.executed = true;
        boolean boolean19 = response1.hasHeader("hi!");
        boolean boolean21 = response1.hasHeader("hi!");
        int int22 = response1.statusCode;
        response1.statusCode = (byte) 1;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15318");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        boolean boolean12 = response1.hasCookie("hi!");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15319");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        java.lang.String str7 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response1.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test15320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15320");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.nio.ByteBuffer byteBuffer7 = null;
        response1.byteData = byteBuffer7;
        java.lang.String str9 = response1.statusMessage();
        response1.statusCode = (short) 100;
        response1.statusMessage = "";
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15321");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str7 = response1.charset();
        boolean boolean8 = response1.executed;
        int int9 = response1.numRedirects;
        java.lang.String str10 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.String str14 = response1.header("");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
    }

    @Test
    public void test15322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15322");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap4 = response1.headers();
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Request request8 = response7.req;
        java.nio.ByteBuffer byteBuffer9 = response7.byteData;
        int int10 = response7.numRedirects;
        java.lang.String str12 = response7.header("");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response7.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response7.scanHeaders("hi!");
        int int16 = response7.statusCode;
        org.jsoup.Connection.Method method17 = response7.method();
        response7.charset = "";
        java.lang.String str20 = response7.charset();
        org.jsoup.Connection.Response response22 = response7.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection5, response22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test15323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15323");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        java.net.URL uRL14 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15324");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str5 = response1.contentType();
        response1.contentType = "hi!";
        int int8 = response1.statusCode;
        boolean boolean10 = response1.hasHeader("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test15325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15325");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.statusMessage();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method13 = response1.method();
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str17 = response1.header("");
        java.lang.String str18 = response1.contentType();
        boolean boolean20 = response1.hasCookie("");
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        boolean boolean24 = response1.hasCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15326");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        java.lang.Class<?> wildcardClass13 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test15327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15327");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        boolean boolean11 = response1.executed;
        org.jsoup.Connection.Method method12 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        int int16 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15328");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.headers();
        response1.statusCode = 0;
        java.lang.String str21 = response1.charset();
        java.nio.ByteBuffer byteBuffer22 = null;
        response1.byteData = byteBuffer22;
        java.lang.String str24 = response1.statusMessage();
        boolean boolean26 = response1.hasCookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15329");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.headers();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test15330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15330");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.cookie("hi!");
        response1.executed = false;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response1.charset;
        org.jsoup.Connection.Method method16 = response1.method();
        java.lang.String str17 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15331");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.header("");
        org.jsoup.Connection.Method method9 = response1.method();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        int int11 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15332");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        java.lang.String str15 = response1.cookie("hi!");
        org.jsoup.Connection.Method method16 = response1.method();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test15333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15333");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.statusMessage;
        response1.statusMessage = "hi!";
        java.lang.String str7 = response1.charset;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test15334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15334");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str8 = response1.header("hi!");
        int int9 = response1.numRedirects;
        java.net.URL uRL10 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test15335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15335");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        int int11 = response1.statusCode();
        boolean boolean13 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        java.lang.String str15 = response1.contentType;
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response1.url(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15336");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        response1.numRedirects = (byte) 100;
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        org.jsoup.Connection.Method method11 = response1.method();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test15337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15337");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.numRedirects = '#';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15338");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        int int17 = response1.statusCode;
        response1.statusMessage = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test15339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15339");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        java.lang.String str11 = response1.contentType();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.lang.String str13 = response1.contentType();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15340");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request18 = response1.req;
        java.lang.String str19 = response1.statusMessage();
        boolean boolean21 = response1.hasCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        response1.statusCode = '#';
        java.lang.String str28 = response1.cookie("");
        org.jsoup.Connection.Response response30 = response1.removeCookie("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(request18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test15341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15341");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean22 = response1.hasHeader("hi!");
        int int23 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test15342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15342");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        org.jsoup.Connection.Response response12 = response1.header("hi!", "");
        java.lang.String str13 = response1.statusMessage;
        int int14 = response1.statusCode();
        java.lang.String str15 = response1.contentType();
        int int16 = response1.numRedirects;
        int int17 = response1.statusCode;
        response1.executed = false;
        java.lang.String str20 = response1.contentType;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15343");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.net.URL uRL9 = response1.url();
        response1.statusCode = (short) -1;
        java.lang.String str12 = response1.contentType();
        int int13 = response1.numRedirects;
        response1.executed = true;
        boolean boolean17 = response1.hasCookie("");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response1.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15344");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str16 = response1.contentType();
        response1.executed = true;
        java.lang.String str20 = response1.cookie("");
        java.lang.String str21 = response1.charset();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15345");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.statusMessage();
        java.lang.String str8 = response1.charset;
        java.lang.String str10 = response1.header("");
        java.lang.String str11 = response1.charset;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15346");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        java.nio.ByteBuffer byteBuffer4 = response1.byteData;
        java.lang.String str6 = response1.header("");
        int int7 = response1.statusCode;
        boolean boolean8 = response1.executed;
        java.lang.String str9 = response1.statusMessage;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(byteBuffer4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test15347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15347");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        int int13 = response1.statusCode;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean16 = response14.hasCookie("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response14.headers();
        java.nio.ByteBuffer byteBuffer18 = response14.byteData;
        boolean boolean20 = response14.hasCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(byteBuffer18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test15348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15348");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        response1.numRedirects = (short) 0;
        java.lang.String str16 = response1.cookie("hi!");
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str20 = response1.contentType();
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry24 = response1.scanHeaders("");
        java.lang.String str25 = response1.contentType();
        response1.numRedirects = '#';
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(strEntry24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test15349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15349");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.contentType;
        java.net.URL uRL10 = response1.url();
        int int11 = response1.statusCode();
        response1.statusCode = (-1);
        java.lang.String str14 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15350");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        int int4 = response1.numRedirects;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        int int7 = response1.statusCode();
        response1.executed = true;
        int int10 = response1.statusCode;
        response1.executed = true;
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response1.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15351");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        response1.statusCode = 32;
        java.lang.String str14 = response1.cookie("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15352");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.contentType();
        int int11 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test15353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15353");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.statusMessage();
        org.jsoup.Connection.Response response18 = response1.header("hi!", "");
        int int19 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL21 = response20.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(uRL21);
    }

    @Test
    public void test15354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15354");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        java.net.URL uRL18 = response1.url();
        java.lang.String str19 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test15355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15355");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        response1.contentType = "hi!";
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.charset;
        response1.executed = false;
        int int14 = response1.statusCode;
        response1.statusCode = 10;
        int int17 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test15356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15356");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        java.lang.String str11 = response1.charset;
        java.nio.ByteBuffer byteBuffer12 = null;
        response1.byteData = byteBuffer12;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test15357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15357");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.contentType;
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str14 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15358");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response10.statusMessage = "hi!";
        java.lang.String str13 = response10.statusMessage;
        java.lang.String str15 = response10.header("");
        java.lang.String str16 = response10.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response10.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15359");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        org.jsoup.Connection.Method method19 = response1.method();
        boolean boolean20 = response1.executed;
        java.net.URL uRL21 = response1.url();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response25 = response22.cookie("hi!", "");
        response22.numRedirects = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = response22.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test15360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15360");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        org.jsoup.Connection.Request request11 = response1.req;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15361");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.numRedirects = (short) 0;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.lang.String str17 = response1.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap18 = response1.cookies();
        java.lang.String str19 = response1.contentType;
        java.lang.String str21 = response1.cookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15362");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        org.jsoup.Connection.Request request12 = response1.req;
        java.lang.String str13 = response1.charset();
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.charset;
        boolean boolean16 = response1.executed;
        org.jsoup.Connection.Response response19 = response1.cookie("hi!", "");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response1.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(request12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15363");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.contentType();
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        org.jsoup.Connection.Response response17 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.Class<?> wildcardClass19 = response18.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test15364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15364");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        response1.statusMessage = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.numRedirects = (-1);
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer19 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(byteBuffer19);
    }

    @Test
    public void test15365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15365");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset();
        java.lang.String str13 = response1.charset;
        response1.statusCode = 'a';
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15366");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        java.lang.String str4 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("");
        java.lang.String str7 = response1.charset();
        boolean boolean9 = response1.hasCookie("");
        int int10 = response1.numRedirects;
        response1.charset = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test15367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15367");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        response1.statusCode = (short) 0;
        int int10 = response1.statusCode();
        java.lang.String str11 = response1.charset;
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.statusMessage;
        boolean boolean14 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15368");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        java.lang.String str6 = response1.header("hi!");
        boolean boolean8 = response1.hasCookie("");
        org.jsoup.Connection.Request request9 = response1.req;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
    }

    @Test
    public void test15369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15369");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.contentType = "hi!";
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean16 = response1.executed;
        java.lang.String str17 = response1.contentType;
        java.lang.String str18 = response1.contentType;
        java.lang.String str20 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15370");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        int int15 = response1.numRedirects;
        java.lang.String str16 = response1.contentType;
        response1.statusMessage = "";
        java.lang.String str19 = response1.contentType;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry21 = response1.scanHeaders("");
        response1.numRedirects = ' ';
        org.jsoup.Connection.Request request24 = response1.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(strEntry21);
        org.junit.Assert.assertNull(request24);
    }

    @Test
    public void test15371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15371");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        boolean boolean12 = response1.hasCookie("hi!");
        int int13 = response1.statusCode;
        boolean boolean14 = response1.executed;
        java.lang.String str15 = response1.statusMessage();
        java.lang.String str17 = response1.cookie("hi!");
        org.jsoup.Connection.Request request18 = null;
        response1.req = request18;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15372");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        org.jsoup.Connection.Request request3 = response1.req;
        boolean boolean5 = response1.hasCookie("hi!");
        java.lang.String str6 = response1.charset;
        response1.charset = "";
        java.lang.String str9 = response1.charset;
        org.jsoup.Connection.Request request10 = response1.req;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(request10);
    }

    @Test
    public void test15373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15373");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.contentType = "hi!";
        boolean boolean15 = response1.hasHeader("hi!");
        boolean boolean17 = response1.hasCookie("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("hi!");
        java.lang.String str20 = response1.charset();
        int int21 = response1.numRedirects;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        response24.executed = false;
        org.jsoup.Connection.Request request27 = response24.req;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strEntry19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(request27);
    }

    @Test
    public void test15374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15374");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        int int4 = response1.statusCode;
        boolean boolean6 = response1.hasCookie("hi!");
        boolean boolean8 = response1.hasCookie("hi!");
        boolean boolean10 = response1.hasCookie("hi!");
        java.net.URL uRL11 = response1.url();
        java.lang.String str13 = response1.cookie("");
        org.jsoup.Connection.Request request14 = null;
        response1.req = request14;
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Response response18 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test15375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15375");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        response1.contentType = "";
        java.lang.String str8 = response1.contentType;
        response1.contentType = "";
        java.lang.String str12 = response1.cookie("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15376");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        java.lang.String str13 = response1.contentType();
        java.lang.String str14 = response1.contentType();
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.headers();
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        java.lang.String str23 = response1.contentType();
        response1.charset = "hi!";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15377");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("");
        java.lang.String str14 = response1.cookie("hi!");
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15378");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.net.URL uRL12 = response1.url();
        response1.statusMessage = "";
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.numRedirects = 'a';
        java.lang.String str19 = response1.statusMessage();
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15379");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry12 = response1.scanHeaders("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry14 = response1.scanHeaders("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(strEntry12);
        org.junit.Assert.assertNull(strEntry14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15380");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response1.header("hi!", "");
        boolean boolean12 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.headers();
        java.lang.String str15 = response1.cookie("");
        response1.executed = true;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15381");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str15 = response1.cookie("hi!");
        java.lang.String str16 = response1.charset();
        java.lang.String str17 = response1.statusMessage;
        java.lang.String str19 = response1.header("");
        int int20 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test15382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15382");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        response1.statusMessage = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        org.jsoup.Connection.Request request10 = response1.req;
        org.jsoup.Connection.Response response13 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        java.nio.ByteBuffer byteBuffer16 = response1.byteData;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(byteBuffer16);
    }

    @Test
    public void test15383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15383");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        response1.contentType = "";
        boolean boolean14 = response1.hasHeader("hi!");
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15384");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test15385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15385");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        int int10 = response1.statusCode;
        java.lang.String str12 = response1.header("");
        java.net.URL uRL13 = response1.url();
        java.lang.String str14 = response1.contentType;
        response1.executed = false;
        java.lang.String str18 = response1.getHeaderCaseInsensitive("hi!");
        int int19 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response1.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15386");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.headers();
        response1.charset = "";
        java.lang.String str18 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15387");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        response1.charset = "hi!";
        java.lang.String str13 = response1.contentType();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(byteBuffer10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15388");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        response1.statusCode = 0;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request17 = null;
        response1.req = request17;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str21 = response1.cookie("");
        response1.statusMessage = "";
        org.jsoup.Connection.Request request24 = response1.req;
        int int25 = response1.statusCode();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(request24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test15389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15389");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        response1.executed = true;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test15390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15390");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        org.jsoup.Connection.Response response9 = response1.header("hi!", "");
        java.lang.String str10 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test15391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15391");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        org.jsoup.Connection.Response response16 = response1.removeCookie("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response22 = response1.removeCookie("");
        boolean boolean23 = response1.executed;
        java.lang.Class<?> wildcardClass24 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test15392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15392");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.Connection.Response response11 = response1.removeHeader("hi!");
        boolean boolean13 = response1.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL15 = response14.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test15393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15393");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str10 = response1.charset();
        java.lang.String str11 = response1.charset();
        java.lang.String str13 = response1.cookie("");
        boolean boolean15 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test15394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15394");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.charset;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        org.jsoup.Connection.Response response10 = response1.removeHeader("hi!");
        java.lang.String str11 = response1.contentType();
        java.lang.String str12 = response1.contentType();
        java.lang.String str14 = response1.getHeaderCaseInsensitive("");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strEntry16);
    }

    @Test
    public void test15395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15395");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.charset = "";
        org.jsoup.Connection.Method method4 = response1.method();
        boolean boolean5 = response1.executed;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15396");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        boolean boolean8 = response1.executed;
        java.net.URL uRL9 = response1.url();
        java.lang.String str10 = response1.contentType();
        int int11 = response1.statusCode;
        boolean boolean12 = response1.executed;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15397");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        response1.statusMessage = "";
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int13 = response12.statusCode;
        boolean boolean14 = response12.executed;
        java.lang.String str16 = response12.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15398");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        java.lang.String str6 = response2.charset();
        org.jsoup.Connection.Method method7 = response2.method();
        java.lang.String str9 = response2.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response12 = response2.cookie("hi!", "");
        boolean boolean14 = response2.hasCookie("hi!");
        java.lang.String str15 = response2.charset();
        java.lang.String str16 = response2.charset();
        org.jsoup.Connection.Response response19 = response2.header("hi!", "");
        java.lang.String str21 = response2.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test15399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15399");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        int int7 = response1.statusCode;
        org.jsoup.Connection.Request request8 = response1.req;
        java.lang.String str9 = response1.contentType();
        response1.executed = true;
        boolean boolean13 = response1.hasHeader("hi!");
        response1.charset = "";
        org.jsoup.Connection.Request request16 = response1.req;
        org.jsoup.Connection.Request request17 = response1.req;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(request8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test15400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15400");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        java.lang.String str6 = response2.charset();
        int int7 = response2.statusCode;
        java.nio.ByteBuffer byteBuffer8 = response2.byteData;
        org.jsoup.Connection.Method method9 = response2.method();
        java.lang.String str10 = response2.statusMessage();
        org.jsoup.Connection.Method method11 = response2.method();
        int int12 = response2.statusCode;
        java.net.URL uRL13 = response2.url();
        java.lang.String str15 = response2.header("");
        java.lang.String str16 = response2.statusMessage;
        int int17 = response2.statusCode();
        java.lang.String str18 = response2.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15401");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        response1.contentType = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Response response14 = response1.cookie("hi!", "hi!");
        response1.contentType = "hi!";
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry20 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(strEntry20);
    }

    @Test
    public void test15402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15402");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.lang.String str4 = response1.charset;
        boolean boolean6 = response1.hasHeader("hi!");
        response1.numRedirects = (byte) 10;
        java.lang.String str10 = response1.cookie("");
        java.lang.String str11 = response1.charset();
        response1.executed = false;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.contentType;
        java.net.URL uRL17 = response1.url();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test15403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15403");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response19 = response16.cookie("hi!", "");
        java.lang.String str20 = response16.statusMessage;
        java.lang.String str21 = response16.contentType;
        boolean boolean23 = response16.hasHeader("hi!");
        java.lang.String str24 = response16.contentType;
        java.util.Map<java.lang.String, java.lang.String> strMap25 = response16.headers();
        java.lang.String str26 = response16.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test15404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15404");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.contentType();
        java.lang.String str8 = response1.getHeaderCaseInsensitive("");
        response1.charset = "";
        response1.statusCode = (byte) -1;
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test15405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15405");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType;
        java.lang.String str14 = response1.header("hi!");
        java.lang.String str15 = response1.charset();
        java.nio.ByteBuffer byteBuffer16 = null;
        response1.byteData = byteBuffer16;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response20 = response1.removeHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test15406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15406");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        int int14 = response1.numRedirects;
        java.lang.String str15 = response1.statusMessage;
        boolean boolean16 = response1.executed;
        java.util.Map<java.lang.String, java.lang.String> strMap17 = response1.cookies();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test15407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15407");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.contentType = "hi!";
        java.lang.String str17 = response1.contentType();
        java.lang.String str19 = response1.cookie("");
        org.jsoup.Connection.Request request20 = null;
        response1.req = request20;
        int int22 = response1.statusCode();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test15408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15408");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.statusMessage;
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        response19.statusMessage = "";
        org.jsoup.Connection.Method method22 = response19.method();
        response19.numRedirects = (short) 100;
        boolean boolean26 = response19.hasCookie("");
        org.jsoup.Connection.Method method27 = response19.method();
        org.jsoup.Connection.Request request28 = response19.req;
        response19.statusCode = (-1);
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(request28);
    }

    @Test
    public void test15409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15409");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.lang.String str15 = response1.contentType();
        response1.charset = "";
        java.lang.String str18 = response1.contentType;
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.Connection.Response response20 = null;
        // The following exception was thrown during execution in test generation
        try {
            response1.setupFromConnection(httpURLConnection19, response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test15410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15410");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        org.jsoup.Connection.Method method5 = response1.method();
        response1.contentType = "";
        response1.statusMessage = "hi!";
        response1.executed = false;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test15411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15411");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.charset = "";
        boolean boolean16 = response1.hasHeader("hi!");
        response1.statusMessage = "hi!";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test15412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15412");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Method method8 = response1.method();
        int int9 = response1.numRedirects;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response13 = response1.removeCookie("hi!");
        java.lang.String str14 = response1.statusMessage();
        int int15 = response1.numRedirects;
        int int16 = response1.numRedirects;
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request19 = null;
        response1.req = request19;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15413");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str10 = response1.getHeaderCaseInsensitive("hi!");
        response1.executed = true;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        int int14 = response1.statusCode;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test15414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15414");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        boolean boolean8 = response1.hasHeader("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Response response11 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response15 = response1.cookie("hi!", "");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15415");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = null;
        response1.byteData = byteBuffer9;
        response1.charset = "";
        response1.numRedirects = (-1);
        response1.contentType = "hi!";
        java.lang.String str17 = response1.contentType();
        java.lang.String str19 = response1.cookie("");
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method22 = response1.method();
        boolean boolean24 = response1.hasCookie("hi!");
        java.net.URL uRL25 = response1.url();
        java.lang.String str27 = response1.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass28 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test15416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15416");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        org.jsoup.Connection.Request request4 = null;
        response1.req = request4;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response1.charset;
        response1.contentType = "hi!";
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.headers();
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Request request14 = response1.req;
        org.jsoup.Connection.Method method15 = response1.method();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(request14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test15417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15417");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        response1.numRedirects = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.headers();
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        org.jsoup.Connection.Request request13 = response1.req;
        java.net.URL uRL14 = response1.url();
        response1.contentType = "";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15418");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        java.lang.String str16 = response1.contentType();
        org.jsoup.Connection.Request request17 = response1.req;
        response1.numRedirects = 0;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(request17);
    }

    @Test
    public void test15419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15419");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.lang.String str11 = response1.contentType;
        response1.contentType = "hi!";
        int int14 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        boolean boolean17 = response1.hasHeader("hi!");
        boolean boolean19 = response1.hasCookie("");
        response1.charset = "";
        org.jsoup.Connection.Response response24 = response1.header("hi!", "");
        java.lang.String str25 = response1.statusMessage();
        java.lang.String str27 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test15420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15420");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.cookies();
        java.lang.String str11 = response1.header("");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.lang.String str14 = response1.contentType();
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response1.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15421");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        java.lang.String str14 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test15422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15422");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        response1.executed = true;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry16 = response1.scanHeaders("");
        response1.statusCode = 0;
        boolean boolean20 = response1.hasHeader("hi!");
        int int21 = response1.statusCode;
        java.lang.String str22 = response1.charset();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(strEntry16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15423");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.contentType;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.net.URL uRL15 = response1.url();
        org.jsoup.Connection.Request request16 = response1.req;
        java.lang.String str18 = response1.cookie("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(request16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15424");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        java.lang.String str10 = response1.cookie("");
        java.net.URL uRL11 = response1.url();
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        java.util.Map<java.lang.String, java.lang.String> strMap13 = response1.cookies();
        org.jsoup.Connection.Response response15 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        response16.statusMessage = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(byteBuffer12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15425");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        int int15 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        int int18 = response1.statusCode;
        response1.contentType = "hi!";
        boolean boolean22 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response24 = response1.removeCookie("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test15426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15426");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        boolean boolean5 = response1.executed;
        java.nio.ByteBuffer byteBuffer6 = null;
        response1.byteData = byteBuffer6;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test15427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15427");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        response2.statusMessage = "";
        java.net.URL uRL5 = response2.url();
        org.jsoup.Connection.Response response7 = response2.removeCookie("");
        response2.statusCode = 100;
        int int10 = response2.numRedirects;
        java.net.URL uRL11 = response2.url();
        response2.executed = true;
        java.nio.ByteBuffer byteBuffer14 = null;
        response2.byteData = byteBuffer14;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test15428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15428");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        java.lang.String str7 = response1.statusMessage;
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str11 = response1.header("hi!");
        java.net.URL uRL12 = response1.url();
        org.jsoup.Connection.Response response14 = response1.removeCookie("");
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        response1.executed = false;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15429");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.statusCode = 32;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.charset();
        java.lang.String str10 = response1.contentType;
        response1.charset = "";
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str17 = response1.header("hi!");
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test15430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15430");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.Connection.Response response15 = response1.removeCookie("");
        int int16 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test15431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15431");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        response1.statusCode = '4';
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.headers();
        int int12 = response1.statusCode();
        java.lang.String str13 = response1.contentType;
        boolean boolean15 = response1.hasHeader("hi!");
        java.lang.String str16 = response1.contentType();
        java.lang.String str17 = response1.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15432");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.net.URL uRL7 = response1.url();
        int int8 = response1.numRedirects;
        response1.statusCode = 10;
        java.lang.String str11 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test15433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15433");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        org.jsoup.Connection.Response response8 = response2.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer9 = response2.byteData;
        org.jsoup.Connection.Response response11 = response2.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response2.cookies();
        java.lang.String str13 = response2.charset;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test15434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15434");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        boolean boolean11 = response1.executed;
        int int12 = response1.statusCode;
        response1.executed = false;
        java.lang.String str15 = response1.charset;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test15435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15435");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        boolean boolean10 = response1.hasHeader("hi!");
        org.jsoup.Connection.Method method11 = response1.method();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response15 = response1.header("hi!", "");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test15436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15436");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry4 = response1.scanHeaders("");
        java.lang.String str6 = response1.cookie("");
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        int int9 = response1.statusCode;
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(strEntry4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test15437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15437");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        int int7 = response1.statusCode;
        response1.numRedirects = '#';
        response1.charset = "";
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test15438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15438");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        response1.statusMessage = "";
        boolean boolean8 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        java.lang.String str12 = response1.header("");
        org.jsoup.Connection.Method method13 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("");
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(strEntry15);
    }

    @Test
    public void test15439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15439");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.contentType = "";
        int int11 = response1.numRedirects;
        java.lang.String str12 = response1.contentType;
        response1.numRedirects = 'a';
        response1.statusMessage = "hi!";
        java.lang.String str18 = response1.header("");
        response1.contentType = "hi!";
        org.jsoup.Connection.Method method21 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test15440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15440");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        response1.statusMessage = "";
        int int20 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str24 = response1.header("hi!");
        boolean boolean26 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray27 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15441");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        response1.statusCode = (short) -1;
        java.lang.String str21 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str22 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int24 = response23.statusCode();
        org.jsoup.Connection.Request request25 = response23.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNull(request25);
    }

    @Test
    public void test15442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15442");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage;
        response1.statusMessage = "";
        org.jsoup.Connection.Request request15 = response1.req;
        java.lang.String str16 = response1.charset;
        org.jsoup.Connection.Method method17 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test15443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15443");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.lang.String str8 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        boolean boolean12 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test15444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15444");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(byteBuffer8);
    }

    @Test
    public void test15445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15445");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        response1.statusCode = (short) 0;
        int int10 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.numRedirects = (short) -1;
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry19 = response1.scanHeaders("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertNull(strEntry19);
    }

    @Test
    public void test15446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15446");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        java.lang.String str12 = response1.statusMessage();
        java.lang.String str13 = response1.contentType();
        java.nio.ByteBuffer byteBuffer14 = null;
        response1.byteData = byteBuffer14;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("hi!");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15447");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Request request5 = null;
        response1.req = request5;
        boolean boolean8 = response1.hasCookie("hi!");
        org.jsoup.Connection.Request request9 = response1.req;
        response1.numRedirects = ' ';
        java.util.Map<java.lang.String, java.lang.String> strMap12 = response1.cookies();
        response1.charset = "";
        org.jsoup.Connection.Request request15 = null;
        response1.req = request15;
        java.lang.String str17 = response1.charset;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15448");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        response1.statusMessage = "";
        java.lang.String str15 = response1.charset();
        boolean boolean16 = response1.executed;
        java.net.URL uRL17 = response1.url();
        response1.statusMessage = "";
        int int20 = response1.statusCode;
        response1.contentType = "";
        java.lang.String str24 = response1.header("hi!");
        boolean boolean26 = response1.hasCookie("");
        java.lang.String str28 = response1.header("");
        org.jsoup.Connection.Request request29 = response1.req;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(request29);
    }

    @Test
    public void test15449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15449");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.nio.ByteBuffer byteBuffer3 = response1.byteData;
        java.lang.String str4 = response1.statusMessage;
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        int int7 = response1.statusCode();
        response1.statusCode = 'a';
        response1.numRedirects = 10;
        java.net.URL uRL12 = response1.url();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(byteBuffer3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test15450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15450");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        org.jsoup.Connection.Response response8 = response1.header("hi!", "");
        org.jsoup.Connection.Request request9 = response1.req;
        java.lang.String str10 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response1.cookies();
        org.jsoup.Connection.Response response14 = response1.header("hi!", "");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.charset;
        java.lang.String str18 = response1.header("hi!");
        int int19 = response1.statusCode;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(request9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15451");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "hi!");
        boolean boolean11 = response1.executed;
        java.lang.String str13 = response1.cookie("");
        java.lang.String str15 = response1.header("hi!");
        java.lang.String str16 = response1.contentType;
        response1.contentType = "hi!";
        response1.contentType = "";
        java.net.URL uRL21 = response1.url();
        boolean boolean23 = response1.hasHeader("hi!");
        int int24 = response1.numRedirects;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test15452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15452");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        int int12 = response1.statusCode;
        response1.contentType = "";
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.statusMessage;
        int int17 = response1.statusCode();
        java.lang.Class<?> wildcardClass18 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test15453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15453");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage;
        java.net.URL uRL14 = response1.url();
        org.jsoup.Connection.Method method15 = response1.method();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test15454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15454");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.lang.String str14 = response1.statusMessage;
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.headers();
        java.lang.String str16 = response1.charset;
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response1.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15455");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry6 = response1.scanHeaders("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.charset();
        java.lang.String str9 = response1.contentType;
        response1.charset = "";
        java.lang.Class<?> wildcardClass12 = response1.getClass();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15456");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int2 = response1.numRedirects;
        java.lang.String str3 = response1.contentType;
        response1.executed = false;
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Request request7 = response1.req;
        java.util.Map<java.lang.String, java.lang.String> strMap8 = response1.cookies();
        java.lang.Class<?> wildcardClass9 = response1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(request7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15457");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        org.jsoup.Connection.Method method11 = response1.method();
        int int12 = response1.statusCode();
        response1.statusCode = (-1);
        java.lang.String str15 = response1.charset();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test15458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15458");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        response1.charset = "";
        org.jsoup.Connection.Response response12 = response1.removeCookie("hi!");
        int int13 = response1.statusCode();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry15 = response1.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry18 = response1.scanHeaders("");
        java.lang.String str19 = response1.contentType;
        response1.contentType = "hi!";
        java.lang.String str23 = response1.header("hi!");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strEntry15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(strEntry18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test15459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15459");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        java.net.URL uRL12 = response1.url();
        java.lang.String str14 = response1.header("");
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.header("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("hi!");
        java.net.URL uRL21 = response1.url();
        java.lang.String str22 = response1.contentType();
        org.jsoup.Connection.Method method23 = response1.method();
        boolean boolean25 = response1.hasHeader("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test15460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15460");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.nio.ByteBuffer byteBuffer9 = response1.byteData;
        java.lang.String str11 = response1.cookie("");
        java.lang.String str12 = response1.charset;
        java.lang.String str13 = response1.statusMessage();
        java.net.URL uRL14 = response1.url();
        java.lang.String str15 = response1.charset;
        response1.executed = true;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response21 = response18.cookie("hi!", "hi!");
        boolean boolean23 = response18.hasHeader("hi!");
        response18.statusMessage = "hi!";
        org.jsoup.Connection.Request request26 = response18.req;
        org.jsoup.Connection.Request request27 = null;
        response18.req = request27;
        java.util.Map<java.lang.String, java.lang.String> strMap29 = response18.headers();
        java.net.URL uRL30 = response18.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(byteBuffer9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(request26);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNull(uRL30);
    }

    @Test
    public void test15461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15461");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        response1.contentType = "";
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test15462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15462");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Request request3 = response2.req;
        java.lang.String str5 = response2.cookie("hi!");
        java.lang.String str6 = response2.charset();
        response2.statusMessage = "";
        org.jsoup.Connection.Method method9 = response2.method();
        int int10 = response2.numRedirects;
        java.util.Map<java.lang.String, java.lang.String> strMap11 = response2.cookies();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry13 = response2.scanHeaders("hi!");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response2.cookies();
        org.jsoup.Connection.Request request15 = response2.req;
        java.lang.String str16 = response2.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(strEntry13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(request15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15463");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        org.jsoup.Connection.Method method9 = response1.method();
        org.jsoup.Connection.Request request10 = response1.req;
        response1.statusMessage = "";
        org.jsoup.Connection.Response response14 = response1.removeHeader("hi!");
        java.lang.String str16 = response1.header("");
        java.nio.ByteBuffer byteBuffer17 = response1.byteData;
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.lang.String str20 = response1.statusMessage();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(request10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(byteBuffer17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test15464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15464");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        org.jsoup.Connection.Response response6 = response1.removeCookie("");
        java.lang.String str7 = response1.contentType;
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.Connection.Request request10 = null;
        response1.req = request10;
        java.lang.String str12 = response1.statusMessage();
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test15465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15465");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.contentType;
        org.jsoup.Connection.Response response15 = response1.removeCookie("hi!");
        response1.numRedirects = (short) 10;
        boolean boolean19 = response1.hasCookie("hi!");
        java.net.URL uRL20 = response1.url();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test15466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15466");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasHeader("hi!");
        java.lang.String str7 = response1.contentType;
        java.lang.String str8 = response1.contentType();
        java.lang.String str9 = response1.charset;
        response1.contentType = "hi!";
        java.nio.ByteBuffer byteBuffer12 = response1.byteData;
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(byteBuffer12);
    }

    @Test
    public void test15467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15467");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        org.jsoup.Connection.Request request8 = null;
        response1.req = request8;
        java.lang.String str11 = response1.header("");
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.statusMessage;
        org.jsoup.Connection.Response response17 = response1.header("hi!", "hi!");
        response1.numRedirects = ' ';
        org.jsoup.Connection.Method method20 = response1.method();
        int int21 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test15468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15468");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str11 = response1.charset();
        java.lang.String str12 = response1.charset;
        org.jsoup.Connection.Response response14 = response1.removeCookie("hi!");
        java.lang.String str16 = response1.cookie("");
        response1.statusMessage = "hi!";
        int int19 = response1.numRedirects;
        int int20 = response1.statusCode();
        java.lang.String str21 = response1.charset();
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response1.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15469");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.header("");
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        java.lang.String str15 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry17 = response1.scanHeaders("");
        response1.executed = true;
        java.lang.String str20 = response1.contentType;
        java.lang.String str22 = response1.getHeaderCaseInsensitive("");
        java.net.URL uRL23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response1.url(uRL23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strEntry17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test15470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15470");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusCode = (byte) 1;
        java.lang.String str9 = response1.cookie("");
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode();
        java.lang.String str12 = response1.statusMessage;
        int int13 = response1.numRedirects;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean16 = response1.hasHeader("hi!");
        int int17 = response1.statusCode();
        java.nio.ByteBuffer byteBuffer18 = null;
        response1.byteData = byteBuffer18;
        java.util.Map<java.lang.String, java.lang.String> strMap20 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test15471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15471");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        org.jsoup.Connection.Response response17 = response1.cookie("hi!", "hi!");
        response1.executed = false;
        int int20 = response1.statusCode();
        response1.numRedirects = 100;
        boolean boolean23 = response1.executed;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = response1.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test15472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        java.lang.String str10 = response1.contentType;
        java.nio.ByteBuffer byteBuffer11 = response1.byteData;
        response1.statusCode = (byte) 10;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(byteBuffer11);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test15473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15473");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        boolean boolean15 = response1.executed;
        java.lang.String str17 = response1.getHeaderCaseInsensitive("");
        response1.statusCode = (short) 100;
        java.lang.String str21 = response1.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15474");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int12 = response1.numRedirects;
        java.lang.String str13 = response1.statusMessage();
        org.jsoup.Connection.Response response16 = response1.cookie("hi!", "");
        response1.statusMessage = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test15475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15475");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusMessage = "";
        org.jsoup.Connection.Response response10 = response1.cookie("hi!", "");
        int int11 = response1.numRedirects;
        response1.executed = false;
        int int14 = response1.statusCode();
        boolean boolean16 = response1.hasHeader("hi!");
        java.lang.String str18 = response1.cookie("");
        java.lang.String str20 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test15476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15476");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = response1.cookies();
        java.lang.String str6 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response1.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test15477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15477");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.lang.String str16 = response1.cookie("");
        java.lang.String str17 = response1.contentType();
        org.jsoup.Connection.Response response19 = response1.removeHeader("hi!");
        response1.executed = false;
        org.jsoup.Connection.Request request22 = null;
        response1.req = request22;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test15478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15478");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        java.lang.String str13 = response1.charset;
        java.net.URL uRL14 = response1.url();
        response1.statusMessage = "hi!";
        java.net.URL uRL17 = response1.url();
        response1.contentType = "";
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test15479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15479");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("hi!");
        boolean boolean12 = response1.hasHeader("hi!");
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        org.jsoup.Connection.Response response16 = response1.removeHeader("hi!");
        java.net.URL uRL17 = response1.url();
        response1.executed = true;
        response1.statusCode = '4';
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL17);
    }

    @Test
    public void test15480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15480");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        boolean boolean6 = response1.hasCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = response1.headers();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("hi!");
        response1.numRedirects = (byte) -1;
        boolean boolean13 = response1.hasHeader("hi!");
        boolean boolean15 = response1.hasCookie("hi!");
        org.jsoup.Connection.Response response18 = response1.header("hi!", "hi!");
        java.net.URL uRL19 = response1.url();
        java.net.URL uRL20 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response1.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(uRL20);
    }

    @Test
    public void test15481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15481");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.nio.ByteBuffer byteBuffer14 = response1.byteData;
        java.nio.ByteBuffer byteBuffer15 = response1.byteData;
        java.lang.String str16 = response1.statusMessage();
        response1.charset = "";
        java.nio.ByteBuffer byteBuffer19 = null;
        response1.byteData = byteBuffer19;
        response1.contentType = "hi!";
        java.lang.String str23 = response1.charset();
        org.jsoup.Connection.Method method24 = response1.method();
        org.jsoup.Connection.Response response26 = response1.removeCookie("hi!");
        java.lang.String str27 = response1.statusMessage();
        java.lang.String str29 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str31 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(byteBuffer14);
        org.junit.Assert.assertNull(byteBuffer15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test15482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15482");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.util.Map<java.lang.String, java.lang.String> strMap9 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response1.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test15483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15483");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        response1.statusMessage = "hi!";
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        response1.charset = "";
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        org.jsoup.Connection.Response response16 = response1.removeCookie("hi!");
        response1.charset = "hi!";
        java.util.Map<java.lang.String, java.lang.String> strMap19 = response1.cookies();
        int int20 = response1.numRedirects;
        java.lang.String str21 = response1.statusMessage();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = response1.cookies();
        org.jsoup.Connection.Response response25 = response1.cookie("hi!", "");
        int int26 = response1.numRedirects;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test15484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15484");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        org.jsoup.Connection.Response response8 = response1.header("hi!", "hi!");
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Method method10 = response1.method();
        int int11 = response1.statusCode;
        response1.statusMessage = "hi!";
        java.lang.Class<?> wildcardClass14 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15485");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        response1.numRedirects = 100;
        java.lang.String str12 = response1.header("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test15486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15486");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.lang.String str9 = response1.statusMessage();
        java.lang.String str10 = response1.statusMessage();
        java.net.URL uRL11 = response1.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.nio.ByteBuffer byteBuffer13 = null;
        response1.byteData = byteBuffer13;
        java.lang.String str16 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15487");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        response1.executed = false;
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("hi!");
        int int10 = response1.statusCode;
        int int11 = response1.numRedirects;
        org.jsoup.Connection.Request request12 = null;
        response1.req = request12;
        java.net.URL uRL14 = response1.url();
        response1.numRedirects = 52;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response1.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test15488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15488");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        int int5 = response1.statusCode();
        response1.charset = "hi!";
        int int8 = response1.statusCode;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test15489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15489");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        response1.numRedirects = (short) 100;
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode;
        int int10 = response1.numRedirects;
        int int11 = response1.statusCode();
        org.jsoup.Connection.Response response13 = response1.removeCookie("");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = response1.cookies();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test15490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15490");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        boolean boolean8 = response1.hasCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        response10.statusMessage = "hi!";
        java.net.URL uRL13 = response10.url();
        response10.executed = true;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test15491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15491");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.contentType;
        org.jsoup.Connection.Request request13 = response1.req;
        java.lang.String str15 = response1.header("hi!");
        boolean boolean17 = response1.hasHeader("hi!");
        int int18 = response1.statusCode();
        org.jsoup.Connection.Response response20 = response1.removeCookie("");
        org.jsoup.Connection.Response response22 = response1.removeHeader("hi!");
        response1.charset = "";
        java.lang.String str25 = response1.contentType();
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry27 = response1.scanHeaders("");
        java.lang.String str28 = response1.statusMessage;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(request13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(strEntry27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test15492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15492");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        org.jsoup.Connection.Request request7 = null;
        response1.req = request7;
        java.net.URL uRL9 = response1.url();
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        response1.charset = "";
        java.net.URL uRL14 = response1.url();
        java.lang.String str16 = response1.header("");
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test15493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15493");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        java.lang.String str8 = response1.header("hi!");
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry10 = response1.scanHeaders("");
        java.lang.String str12 = response1.getHeaderCaseInsensitive("hi!");
        java.lang.String str14 = response1.cookie("");
        java.lang.String str15 = response1.contentType();
        java.net.URL uRL16 = response1.url();
        response1.contentType = "";
        int int19 = response1.statusCode;
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strEntry10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test15494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15494");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        org.jsoup.Connection.Response response7 = response1.header("hi!", "hi!");
        java.nio.ByteBuffer byteBuffer8 = response1.byteData;
        org.jsoup.Connection.Response response10 = response1.removeCookie("");
        int int11 = response1.numRedirects;
        response1.statusMessage = "hi!";
        java.lang.String str14 = response1.statusMessage();
        java.lang.String str16 = response1.header("");
        response1.contentType = "hi!";
        response1.numRedirects = 0;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry22 = response1.scanHeaders("hi!");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(byteBuffer8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strEntry22);
    }

    @Test
    public void test15495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15495");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.net.URL uRL4 = response1.url();
        response1.executed = false;
        response1.contentType = "hi!";
        java.lang.String str9 = response1.statusMessage;
        java.net.URL uRL10 = response1.url();
        org.jsoup.Connection.Request request11 = response1.req;
        int int12 = response1.statusCode;
        response1.statusCode = 2;
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNull(request11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test15496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15496");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        int int3 = response1.statusCode;
        java.lang.String str4 = response1.contentType;
        java.lang.String str5 = response1.charset;
        java.lang.String str6 = response1.charset;
        java.lang.String str7 = response1.charset();
        response1.statusCode = (short) -1;
        java.nio.ByteBuffer byteBuffer10 = response1.byteData;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(byteBuffer10);
    }

    @Test
    public void test15497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15497");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        response1.statusCode = (byte) 100;
        java.util.Map.Entry<java.lang.String, java.lang.String> strEntry9 = response1.scanHeaders("");
        org.jsoup.Connection.Response response12 = response1.header("hi!", "hi!");
        response1.statusMessage = "";
        response1.statusMessage = "";
        java.lang.String str17 = response1.statusMessage();
        java.lang.String str19 = response1.getHeaderCaseInsensitive("");
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strEntry9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test15498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15498");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.executed;
        java.lang.String str11 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        response1.statusMessage = "";
        int int15 = response1.statusCode;
        boolean boolean16 = response1.executed;
        java.lang.Class<?> wildcardClass17 = response1.getClass();
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15499");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Request request2 = response1.req;
        java.lang.String str4 = response1.cookie("hi!");
        java.lang.String str5 = response1.charset();
        int int6 = response1.statusCode;
        java.nio.ByteBuffer byteBuffer7 = response1.byteData;
        org.jsoup.Connection.Method method8 = response1.method();
        org.jsoup.Connection.Request request9 = null;
        response1.req = request9;
        response1.numRedirects = 0;
        java.nio.ByteBuffer byteBuffer13 = response1.byteData;
        org.jsoup.Connection.Response response16 = response1.header("hi!", "");
        boolean boolean18 = response1.hasCookie("");
        response1.executed = false;
        java.lang.String str21 = response1.charset;
        org.junit.Assert.assertNull(request2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(byteBuffer7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(byteBuffer13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test15500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15500");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        response1.statusMessage = "";
        org.jsoup.Connection.Method method4 = response1.method();
        java.nio.ByteBuffer byteBuffer5 = null;
        response1.byteData = byteBuffer5;
        int int7 = response1.statusCode();
        response1.statusCode = (byte) 0;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = response1.headers();
        java.nio.ByteBuffer byteBuffer11 = null;
        response1.byteData = byteBuffer11;
        java.lang.String str13 = response1.statusMessage;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = response1.cookies();
        boolean boolean17 = response1.hasCookie("hi!");
        java.lang.String str18 = response1.contentType();
        org.jsoup.Connection.Response response20 = response1.removeCookie("");
        java.nio.ByteBuffer byteBuffer21 = null;
        response1.byteData = byteBuffer21;
        response1.statusCode = 1;
        response1.statusMessage = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document27 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }
}
