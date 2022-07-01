import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        int int0 = java.util.regex.Pattern.UNIX_LINES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.regex.Pattern.LITERAL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.regex.Pattern.CANON_EQ;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.regex.Pattern.COMMENTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.regex.Pattern.UNICODE_CASE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray2 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.serialiseRequestUrl(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str1 = java.util.regex.Pattern.quote("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Qhi!\\E" + "'", str1, "\\Qhi!\\E");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.regex.Pattern.DOTALL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.cookie("", "\\Qhi!\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.regex.Pattern pattern0 = null;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response14 = response7.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response2 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = strStream10.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        java.lang.Class<?> wildcardClass6 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.net.HttpURLConnection httpURLConnection1 = org.jsoup.helper.HttpConnection.Response.createConnection(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.jsoup.Connection.KeyVal[] keyValArray0 = new org.jsoup.Connection.KeyVal[] {};
        java.util.ArrayList<org.jsoup.Connection.KeyVal> keyValList1 = new java.util.ArrayList<org.jsoup.Connection.KeyVal>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList1, keyValArray0);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost((java.util.Collection<org.jsoup.Connection.KeyVal>) keyValList1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(keyValArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass7 = response6.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.regex.Pattern.MULTILINE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response1 = org.jsoup.helper.HttpConnection.Response.execute(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = java.util.regex.Pattern.UNICODE_CHARACTER_CLASS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 256 + "'", int0 == 256);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.regex.Pattern.CASE_INSENSITIVE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response6.parse();
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
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.jsoup.Connection.Request request0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.jsoup.helper.HttpConnection.Response.getRequestCookieString(request0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response0.method(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap2 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        int int14 = response10.statusCode();
        java.lang.String str16 = response10.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map8 = response1.headers();
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
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response0.url(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method10 = response9.method();
        java.lang.String str12 = response9.getHeaderCaseInsensitive("");
        int int13 = response9.statusCode();
        java.lang.String str15 = response9.getHeaderCaseInsensitive("");
        boolean boolean17 = response9.hasCookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = pattern2.split(charSequence5, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
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
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str1 = java.util.regex.Pattern.quote("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\E" + "'", str1, "\\Q\\E");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean8 = response1.hasCookie("");
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
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Qhi!\\E");
        java.lang.String str2 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Qhi!\\E" + "'", str2, "\\Qhi!\\E");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
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
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response7.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response10 = response3.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection2, (org.jsoup.Connection.Response) response3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.net.URL uRL6 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response2.header("", "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method5 = response4.method();
        java.lang.String str7 = response4.getHeaderCaseInsensitive("");
        int int8 = response4.statusCode();
        java.util.Map.Entry entry10 = response4.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection3, (org.jsoup.Connection.Response) response4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.CharSequence charSequence2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream3 = pattern1.splitAsStream(charSequence2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response5.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Qhi!\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Qhi!\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Qhi!\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.cookie("", "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.method(method10);
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
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.Class<?> wildcardClass3 = response2.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.method(method12);
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
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.net.URL uRL3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response0.url(uRL3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.cookie("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.Connection.Method method8 = response3.method();
        org.jsoup.Connection.Method method9 = response3.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map map11 = response10.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection2, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNull(entry7);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.Class<?> wildcardClass10 = response7.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.Class<?> wildcardClass6 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.String[] strArray3 = pattern1.split((java.lang.CharSequence) "\\Q\\E");
        java.lang.String str4 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
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
        boolean boolean12 = response8.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response2 = response0.url(uRL1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str10 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry8 = response0.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass3 = response2.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
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
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher11 = pattern2.matcher(charSequence10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response2 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str16 = response15.charset();
        boolean boolean18 = response15.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.lang.Class<?> wildcardClass8 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
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
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.url(uRL17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str12 = response10.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.charset();
        boolean boolean9 = response6.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass8 = response7.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response10.cookie("", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        java.lang.String str4 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str10 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response3 = response0.url(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        java.lang.Class<?> wildcardClass4 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        boolean boolean13 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String str5 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate6 = pattern2.asPredicate();
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream(charSequence11);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String[] strArray12 = pattern2.split((java.lang.CharSequence) "");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response7.contentType();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response7 = response5.removeHeader("hi!");
        java.lang.String str8 = response5.contentType();
        org.jsoup.Connection.Method method9 = response5.method();
        org.jsoup.Connection.Method method10 = response5.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Response response13 = response5.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response5);
        java.lang.String str16 = response5.header("\\Qhi!\\E");
        java.lang.String str17 = response5.charset();
        java.util.Map map18 = response5.cookies();
        boolean boolean20 = response5.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection4, (org.jsoup.Connection.Response) response5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.lang.CharSequence charSequence4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray5 = pattern2.split(charSequence4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        int int12 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass15 = strArray14.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method8 = response7.method();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        int int11 = response7.statusCode();
        java.util.Map.Entry entry13 = response7.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method15 = response14.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response19 = response14.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map20 = response14.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
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
            java.lang.Class<?> wildcardClass13 = method12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response13.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response5 = response1.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response15 = response13.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 128);
        java.util.function.Predicate<java.lang.String> strPredicate15 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate16 = pattern2.asPredicate();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(strPredicate16);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response8.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
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
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.Class<?> wildcardClass14 = response12.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.url(uRL5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.lang.CharSequence charSequence12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = pattern2.split(charSequence12);
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
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 128);
        java.util.function.Predicate<java.lang.String> strPredicate15 = pattern2.asPredicate();
        java.lang.String str16 = pattern2.toString();
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
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
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
        java.util.Map.Entry entry12 = response8.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
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
        java.util.Map map14 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
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
        java.lang.String str14 = response12.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response12.getHeaderCaseInsensitive("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response11.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("");
        java.lang.CharSequence charSequence2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream3 = pattern1.splitAsStream(charSequence2);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass8 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\E");
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response7.statusMessage();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response7.method(method11);
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
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map13 = response6.headers();
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str4 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\Q\\E" + "'", str4, "\\Q\\E");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
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
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
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
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.Connection.Method method3 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry5 = response1.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry5);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response12 = response6.header("\\Qhi!\\E", "");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str15 = response14.contentType();
        int int16 = response14.statusCode();
        java.lang.String str17 = response14.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.lang.CharSequence charSequence5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher6 = pattern2.matcher(charSequence5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int6 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        org.jsoup.Connection.Method method17 = response12.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        boolean boolean20 = response18.hasCookie("");
        java.util.Map map21 = response18.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response8.method(method11);
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
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.String[] strArray12 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = pattern2.toString();
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
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response0.bodyAsBytes();
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
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response5 = response1.removeCookie("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.cookie("\\Q\\E");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.lang.String str11 = response8.statusMessage();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        int int17 = response13.statusCode();
        java.lang.String str18 = response13.charset();
        java.net.URL uRL19 = response13.url();
        java.lang.String str20 = response13.contentType();
        org.jsoup.Connection.Response response23 = response13.cookie("hi!", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection12, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection5 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
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
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.lang.Class<?> wildcardClass5 = strPredicate4.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.charset();
        boolean boolean9 = response6.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int10 = response6.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        int int2 = pattern1.flags();
        java.lang.String str3 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str11 = response9.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int8 = response1.statusCode();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response10.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response10.body();
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
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.cookie("\\Qhi!\\E", "");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL11 = response10.url();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate9 = pattern2.asPredicate();
        java.lang.String str10 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strPredicate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.cookie("\\Q\\E");
        java.lang.String str13 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
        boolean boolean15 = response1.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map21 = response14.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map21);
        org.jsoup.Connection.Response response25 = response13.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection7, response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
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
        java.lang.String str12 = response10.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
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
        org.jsoup.Connection.Response response16 = response7.header("\\Q\\E", "\\Q\\E");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response7.method(method17);
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map13 = response6.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass2 = pattern1.getClass();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        int int2 = pattern0.flags();
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher4 = pattern0.matcher(charSequence3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response0.hasHeader("");
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
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        org.jsoup.Connection.Method method2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response3 = response0.method(method2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response6.bodyAsBytes();
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
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method6 = response5.method();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        int int9 = response5.statusCode();
        java.util.Map.Entry entry11 = response5.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response17 = response12.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map18 = response12.cookies();
        java.util.Map map19 = response12.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document21 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.Class<?> wildcardClass3 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        boolean boolean8 = response5.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int9 = response5.statusCode();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        int int11 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.cookie("", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response0.body();
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
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass5 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response7.body();
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
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
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
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
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
        java.lang.String str17 = response7.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry5 = response1.scanHeaders("");
        java.net.URL uRL6 = response1.url();
        org.jsoup.Connection.Response response9 = response1.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(entry5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
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
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        java.lang.String str19 = response16.getHeaderCaseInsensitive("");
        int int20 = response16.statusCode();
        java.lang.String str22 = response16.getHeaderCaseInsensitive("");
        boolean boolean24 = response16.hasCookie("\\Qhi!\\E");
        java.util.Map map25 = response16.headers();
        org.jsoup.Connection.Method method26 = response16.method();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response16);
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
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        int int11 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response7.body();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        java.lang.String str11 = response0.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.regex.Matcher matcher11 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray13 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass14 = strArray13.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(matcher11);
        org.junit.Assert.assertEquals(matcher11.toString(), "java.util.regex.Matcher[pattern= region=0,74 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
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
        org.jsoup.Connection.Method method23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response24 = response7.method(method23);
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(uRL20);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
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
        java.lang.String str13 = response1.contentType();
        java.lang.String str15 = response1.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
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
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        java.net.URL uRL2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response3 = response0.url(uRL2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass11 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response7 = response5.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map15 = response8.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map15);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method19 = response18.method();
        java.lang.String str21 = response18.getHeaderCaseInsensitive("");
        int int22 = response18.statusCode();
        java.util.Map.Entry entry24 = response18.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map28 = response27.cookies();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.util.Map map30 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response31 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            response7.processResponseHeaders(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\E" + "'", str5, "\\Q\\E");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
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
        java.lang.String str17 = pattern2.toString();
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response7.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        int int21 = response17.statusCode();
        java.lang.String str22 = response17.charset();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response17);
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
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
        java.lang.String str12 = response9.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
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
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
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
        boolean boolean15 = response1.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map17 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        java.lang.String str4 = response1.charset();
        java.lang.String str6 = response1.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
        org.junit.Assert.assertNotNull(strPredicate19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response8.bodyAsBytes();
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
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.String[] strArray3 = pattern1.split((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher5 = pattern1.matcher((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(matcher5);
        org.junit.Assert.assertEquals(matcher5.toString(), "java.util.regex.Matcher[pattern=hi! region=0,13 lastmatch=]");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str17 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.method(method5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
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
        java.lang.String str12 = response9.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response14 = response9.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str16 = response9.charset();
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response7.statusMessage();
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean8 = response1.hasCookie("");
        org.jsoup.Connection.Method method9 = response1.method();
        java.lang.String str11 = response1.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.url(uRL12);
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
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = method4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.regex.Matcher matcher8 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(matcher8);
        org.junit.Assert.assertEquals(matcher8.toString(), "java.util.regex.Matcher[pattern= region=0,32 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,3 lastmatch=]");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.contentType();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        org.jsoup.Connection.Method method17 = response12.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str20 = response19.statusMessage();
        java.util.Map.Entry entry22 = response19.scanHeaders("\\Qhi!\\E");
        int int23 = response19.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(entry22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response16.body();
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
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
        boolean boolean14 = response8.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Method method15 = response10.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str18 = response17.statusMessage();
        java.util.Map.Entry entry20 = response17.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.Connection.Method method26 = response21.method();
        org.jsoup.Connection.Method method27 = response21.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.util.Map map29 = response28.headers();
        java.net.URL uRL30 = response28.url();
        java.util.Map map31 = response28.cookies();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str9 = response0.charset();
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response11.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 1);
        java.lang.String str15 = pattern2.pattern();
        java.lang.Class<?> wildcardClass16 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        boolean boolean5 = response1.hasHeader("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean12 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response8.body();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        java.util.Map map10 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 32);
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = pattern2.split(charSequence3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response7.hasHeader("\\Q\\E");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        java.util.Map map7 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
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
        boolean boolean19 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
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
        java.lang.String str17 = response11.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass18 = response11.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
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
        java.util.Map.Entry entry14 = response9.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.Connection.Response response16 = null;
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection15, response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(entry14);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
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
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response13.method(method14);
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
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        boolean boolean8 = response5.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int9 = response5.statusCode();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response5.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
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
        java.util.Map map16 = response0.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response0.parse();
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
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        java.lang.String str20 = response17.contentType();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map24 = response17.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response4 = response2.removeHeader("hi!");
        java.lang.String str5 = response2.contentType();
        org.jsoup.Connection.Method method6 = response2.method();
        org.jsoup.Connection.Method method7 = response2.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response2);
        boolean boolean10 = response8.hasCookie("");
        java.util.Map map11 = response8.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map11);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map13 = response6.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        org.jsoup.Connection.Response response17 = response5.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response5.url(uRL18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str2 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Qhi!\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Qhi!\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
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
        java.util.Map map14 = response7.headers();
        java.net.URL uRL15 = response7.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
        org.jsoup.Connection.Response response13 = response7.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response8 = response0.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.header("", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
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
        org.jsoup.Connection.Response response13 = response8.removeCookie("hi!");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response8.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        int int8 = response0.statusCode();
        java.util.Map.Entry entry10 = response0.scanHeaders("");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        java.lang.String str1 = pattern0.pattern();
        java.lang.String str2 = pattern0.toString();
        org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.Connection.Method method20 = response14.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map22 = response21.headers();
        java.util.Map map23 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray25 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response0.parse();
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
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
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
        java.lang.Class<?> wildcardClass16 = response8.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.charset();
        boolean boolean9 = response6.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map10 = response6.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response3.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        boolean boolean8 = response5.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map9 = response5.headers();
        java.lang.Class<?> wildcardClass10 = response5.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response8.bodyAsBytes();
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
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection4 = null;
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response7 = response5.removeHeader("hi!");
        java.lang.String str8 = response5.contentType();
        org.jsoup.Connection.Method method9 = response5.method();
        org.jsoup.Connection.Method method10 = response5.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response5);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.lang.String str13 = response12.statusMessage();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry entry16 = response12.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str17 = response12.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection4, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Method method15 = response10.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response18 = response10.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response22 = response10.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response22);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        boolean boolean11 = response8.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map12 = response8.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
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
        java.util.Map.Entry entry16 = response14.scanHeaders("\\Qhi!\\E");
        int int17 = response14.statusCode();
        org.jsoup.Connection.Method method18 = response14.method();
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
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(method18);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
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
        java.util.Map map14 = response8.headers();
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
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response8 = response0.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        org.jsoup.Connection.Response response18 = response12.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        java.lang.String str11 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.String str9 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.CharSequence charSequence14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher15 = pattern2.matcher(charSequence14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strStream13);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "\\Qhi!\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response10.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.util.Map map9 = response6.headers();
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
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
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
        java.util.Map.Entry entry16 = response14.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response14.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
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
        java.util.Map.Entry entry16 = response14.scanHeaders("\\Qhi!\\E");
        java.util.Map.Entry entry18 = response14.scanHeaders("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass19 = response14.getClass();
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
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document3 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
            response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map26);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        java.lang.String str20 = response17.contentType();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map24 = response17.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        int int26 = response14.statusCode();
        boolean boolean28 = response14.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.util.Map map30 = response14.cookies();
        org.jsoup.Connection.Response response32 = response14.removeCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
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
        java.lang.String str14 = response9.statusMessage();
        int int15 = response9.statusCode();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map.Entry entry11 = response7.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        boolean boolean8 = response5.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int9 = response5.statusCode();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeCookie("\\Qhi!\\E");
        java.lang.String str14 = response11.charset();
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response13.url(uRL15);
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str11 = response9.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass12 = response9.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        java.lang.Class<?> wildcardClass9 = response5.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        java.lang.String[] strArray4 = pattern0.split((java.lang.CharSequence) "\\Qhi!\\E", 100);
        java.lang.String[] strArray6 = pattern0.split((java.lang.CharSequence) "hi!");
        java.util.stream.Stream<java.lang.String> strStream8 = pattern0.splitAsStream((java.lang.CharSequence) "");
        java.util.stream.Stream<java.lang.String> strStream10 = pattern0.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str11 = pattern0.toString();
        org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strStream10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
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
        java.util.Map map13 = response8.cookies();
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response8.url(uRL14);
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
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("\\Qhi!\\E");
        java.util.Map map10 = response1.headers();
        org.jsoup.Connection.Method method11 = response1.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map.Entry entry11 = response7.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response0.method(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
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
        java.lang.Class<?> wildcardClass12 = map11.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response0.cookie("\\Q\\E");
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
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
        java.lang.String str17 = response11.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response11.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.regex.Matcher matcher6 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.Class<?> wildcardClass7 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(matcher6);
        org.junit.Assert.assertEquals(matcher6.toString(), "java.util.regex.Matcher[pattern= region=0,7 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
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
        java.lang.String str15 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response7.parse();
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
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
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str14 = response13.contentType();
        int int15 = response13.statusCode();
        java.lang.String str17 = response13.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response19 = response13.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.header("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response7.method(method16);
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
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response8.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str7, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        int int8 = response0.statusCode();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL9 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response12 = response0.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str14 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int7 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method10 = response9.method();
        java.lang.String str12 = response9.getHeaderCaseInsensitive("");
        java.lang.String str14 = response9.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response16 = response9.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map.Entry entry19 = response9.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(entry19);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response19.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response24 = response22.removeHeader("hi!");
        java.lang.String str25 = response22.contentType();
        org.jsoup.Connection.Method method26 = response22.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.util.Map map29 = response22.headers();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.net.HttpURLConnection httpURLConnection32 = null;
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response35 = response33.removeCookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection32, (org.jsoup.Connection.Response) response33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(response35);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        java.util.Map map9 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.header("", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.Class<?> wildcardClass5 = response4.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response7.hasHeader("\\Q\\E");
        java.lang.Class<?> wildcardClass10 = response7.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response4.header("", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean13 = response1.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        java.util.Map map8 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
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
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response9.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        java.lang.String str9 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
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
        org.jsoup.Connection.Method method16 = response14.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response14.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.Connection.Method method3 = response1.method();
        org.jsoup.Connection.Response response5 = response1.removeHeader("\\Q\\E");
        java.lang.String str7 = response1.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL8 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        int int11 = response7.statusCode();
        boolean boolean13 = response7.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response7.url(uRL14);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response6 = response1.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = response1.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E", 8);
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = pattern2.split(charSequence3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        boolean boolean11 = response3.hasCookie("");
        org.jsoup.Connection.Response response13 = response3.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str16 = response14.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map17 = response14.headers();
        response2.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        java.lang.String str19 = response2.charset();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
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
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher15 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertNotNull(matcher15);
        org.junit.Assert.assertEquals(matcher15.toString(), "java.util.regex.Matcher[pattern= region=0,71 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        java.lang.String str1 = pattern0.toString();
        org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map13 = response6.headers();
        response5.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map13);
        org.jsoup.Connection.Response response17 = response5.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response5.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map.Entry entry11 = response7.scanHeaders("");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response16.body();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response9 = response1.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
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
        org.jsoup.Connection.Response response14 = response12.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response12.method(method15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
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
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.url(uRL16);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response9.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        int int17 = response13.statusCode();
        java.util.Map.Entry entry19 = response13.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method21 = response20.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.Connection.Response response25 = response20.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response28 = response20.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection12, response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response28);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str16 = response15.statusMessage();
        java.util.Map.Entry entry18 = response15.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL19 = response15.url();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str21 = response15.contentType();
        java.util.Map map22 = response15.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\E" + "'", str5, "\\Q\\E");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
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
        java.util.Map map16 = response9.headers();
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
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str2 = pattern1.pattern();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
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
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response6.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map10 = response0.cookies();
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response8.statusMessage();
        java.lang.Class<?> wildcardClass10 = response8.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str10 = response8.statusMessage();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        java.util.Map map26 = response7.cookies();
        java.lang.Class<?> wildcardClass27 = map26.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response15.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
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
        org.jsoup.Connection.Response response14 = response12.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = response12.method();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("\\Qhi!\\E");
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
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry9 = response7.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        int int12 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = pattern2.pattern();
        java.lang.String[] strArray17 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
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
        java.lang.String str12 = response9.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response14 = response9.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "");
        java.util.regex.Matcher matcher6 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher6);
        org.junit.Assert.assertEquals(matcher6.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,74 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Qhi!\\E" + "'", str7, "\\Qhi!\\E");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.Connection.Response response11 = response7.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
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
        java.lang.String str46 = response0.statusMessage();
        java.net.HttpURLConnection httpURLConnection47 = null;
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL49 = response48.url();
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response48);
        org.jsoup.Connection.Response response52 = response48.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean54 = response48.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection47, (org.jsoup.Connection.Response) response48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(uRL49);
        org.junit.Assert.assertNotNull(response52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream11 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str13 = pattern2.pattern();
        int int14 = pattern2.flags();
        java.lang.String str15 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        java.net.URL uRL5 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
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
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL19 = response18.url();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response22 = response18.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean24 = response18.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method25 = response18.method();
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int19 = pattern2.flags();
        java.util.regex.Matcher matcher21 = pattern2.matcher((java.lang.CharSequence) "\\Q\\E");
        java.lang.CharSequence charSequence22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream23 = pattern2.splitAsStream(charSequence22);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(matcher21);
        org.junit.Assert.assertEquals(matcher21.toString(), "java.util.regex.Matcher[pattern= region=0,4 lastmatch=]");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        org.jsoup.Connection.Response response10 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.util.Map.Entry entry16 = response12.scanHeaders("");
        java.net.URL uRL17 = response12.url();
        org.jsoup.Connection.Response response20 = response12.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str21 = response12.contentType();
        java.lang.String str23 = response12.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map24 = response12.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = response11.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
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
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        java.lang.String str22 = response17.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response24 = response17.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map26 = response25.headers();
        org.jsoup.Connection.Method method27 = response25.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response25);
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(method27);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response7.bodyAsBytes();
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
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str2 = pattern1.pattern();
        java.lang.String str3 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.util.Map map10 = response7.cookies();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = response7.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.util.Map map8 = response1.headers();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate11 = pattern2.asPredicate();
        java.lang.String str12 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response11.body();
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
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.regex.Matcher matcher11 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray13 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(matcher11);
        org.junit.Assert.assertEquals(matcher11.toString(), "java.util.regex.Matcher[pattern= region=0,74 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 8);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,150 lastmatch=]");
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Qhi!\\E" + "'", str7, "\\Qhi!\\E");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
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
        org.jsoup.Connection.Response response18 = response0.header("\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate14 = pattern2.asPredicate();
        java.lang.Class<?> wildcardClass15 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        int int1 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection2 = null;
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response5 = response3.removeHeader("hi!");
        java.lang.String str6 = response3.contentType();
        org.jsoup.Connection.Method method7 = response3.method();
        org.jsoup.Connection.Method method8 = response3.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response11 = response3.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.lang.String str14 = response3.header("\\Qhi!\\E");
        java.lang.String str15 = response3.charset();
        java.util.Map map16 = response3.cookies();
        boolean boolean18 = response3.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection2, (org.jsoup.Connection.Response) response3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response8.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response7.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
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
            byte[] byteArray11 = response0.bodyAsBytes();
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
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeHeader("hi!");
        java.lang.String str18 = response15.contentType();
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.Connection.Method method20 = response15.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str23 = response22.statusMessage();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response27 = response22.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection14, response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response8.parse();
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
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response9.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        int int17 = response13.statusCode();
        java.lang.String str18 = response13.charset();
        java.net.URL uRL19 = response13.url();
        java.lang.String str21 = response13.cookie("\\Q\\E");
        java.util.Map map22 = response13.headers();
        java.lang.String str23 = response13.charset();
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(uRL19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL8 = response1.url();
        java.lang.String str10 = response1.cookie("hi!");
        org.jsoup.Connection.Method method11 = response1.method();
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
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response7.statusMessage();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        org.jsoup.Connection.Method method17 = response12.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response20 = response12.removeCookie("");
        int int21 = response12.statusCode();
        java.lang.String str23 = response12.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response12 = response1.removeHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(entry16);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
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
        org.jsoup.Connection.Response response24 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response26 = response0.url(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertNotNull(response24);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.Connection.Method method3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response4 = response0.method(method3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str7 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        java.lang.String str10 = response8.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "hi!", (int) ' ');
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass14 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.Connection.Response response12 = response8.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response14 = response8.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(entry9);
    }
}
