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
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean14 = response7.hasCookie("");
        java.lang.String str16 = response7.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response7.body();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        int int10 = response1.statusCode();
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map18 = response17.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
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
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.util.Map map9 = response7.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response7.parse();
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
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.charset();
        java.lang.String str9 = response6.getHeaderCaseInsensitive("");
        java.lang.String str10 = response6.statusMessage();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int6 = response0.statusCode();
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map8 = response1.headers();
        boolean boolean10 = response1.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int11 = response1.statusCode();
        boolean boolean13 = response1.hasCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray10 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        int int2 = pattern0.flags();
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray4 = pattern0.split(charSequence3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 32);
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        int int5 = pattern2.flags();
        java.util.regex.Matcher matcher7 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertNotNull(matcher7);
        org.junit.Assert.assertEquals(matcher7.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,35 lastmatch=]");
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        java.util.Map map5 = response3.cookies();
        org.jsoup.Connection.Method method6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response3.method(method6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.pattern();
        java.lang.String str9 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response5.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "\\Qhi!\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.cookie("", "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str7 = response1.statusMessage();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeHeader("hi!");
        java.lang.String str18 = response15.contentType();
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.Connection.Method method20 = response15.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str24 = response23.statusMessage();
        java.lang.String str26 = response23.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.lang.String str29 = response27.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response32 = response27.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response27);
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
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
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
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
        org.jsoup.Connection.Response response14 = response0.removeCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass15 = response14.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map12 = response7.cookies();
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.url(uRL13);
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
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        int int19 = response15.statusCode();
        java.lang.String str21 = response15.getHeaderCaseInsensitive("");
        boolean boolean23 = response15.hasCookie("\\Qhi!\\E");
        java.util.Map map24 = response15.headers();
        org.jsoup.Connection.Method method25 = response15.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method25);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray10 = pattern2.split((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray13 = pattern2.split(charSequence11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.cookie("\\Qhi!\\E", "");
        java.lang.String str11 = response1.getHeaderCaseInsensitive("\\Q\\E");
        java.util.Map.Entry entry13 = response1.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
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
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method15 = response14.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        java.lang.String str20 = response17.contentType();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean25 = response17.hasCookie("");
        org.jsoup.Connection.Response response27 = response17.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str30 = response28.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map31 = response28.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        boolean boolean34 = response16.hasCookie("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method36 = response35.method();
        java.lang.String str38 = response35.getHeaderCaseInsensitive("");
        int int39 = response35.statusCode();
        java.lang.String str40 = response35.charset();
        java.net.URL uRL41 = response35.url();
        java.lang.String str42 = response35.contentType();
        org.jsoup.Connection.Response response44 = response35.removeCookie("hi!");
        org.jsoup.Connection.Response response46 = response35.removeHeader("\\Qhi!\\E");
        int int47 = response35.statusCode();
        java.util.Map map48 = response35.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map48);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(uRL41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.cookie("\\Q\\E");
        boolean boolean13 = response1.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response2);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document4 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
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
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        int int8 = response0.statusCode();
        java.util.Map map9 = response0.headers();
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.pattern();
        java.lang.Class<?> wildcardClass9 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
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
        org.jsoup.Connection.Response response16 = response1.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str18 = response1.cookie("\\Qhi!\\E");
        java.util.Map map19 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
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
        java.net.HttpURLConnection httpURLConnection23 = null;
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response26 = response24.removeHeader("hi!");
        java.lang.String str27 = response24.contentType();
        org.jsoup.Connection.Method method28 = response24.method();
        org.jsoup.Connection.Method method29 = response24.method();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.lang.String str32 = response30.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection23, (org.jsoup.Connection.Response) response30);
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
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.contentType();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
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
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str19 = response18.charset();
        java.lang.String str21 = response18.getHeaderCaseInsensitive("");
        java.lang.String str22 = response18.charset();
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response18);
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response13.method(method14);
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
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response2.contentType();
        java.lang.String str5 = response2.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 1);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        java.lang.String str9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str6 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str19 = response17.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
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
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.regex.Matcher matcher11 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray13 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass14 = pattern2.getClass();
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
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "hi!");
        int int8 = pattern2.flags();
        int int9 = pattern2.flags();
        java.lang.String str10 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 16 + "'", int8 == 16);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass4 = response0.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        java.lang.String[] strArray4 = pattern0.split((java.lang.CharSequence) "\\Qhi!\\E", 100);
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern0;
        java.lang.String str6 = pattern0.toString();
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
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
        org.jsoup.Connection.Response response14 = response0.removeHeader("\\Qhi!\\E");
        java.util.Map map15 = response0.headers();
        java.lang.Class<?> wildcardClass16 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate11 = pattern2.asPredicate();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E", 2);
        java.util.function.Predicate<java.lang.String> strPredicate15 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream17 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str18 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(strStream17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean8 = response1.hasCookie("");
        org.jsoup.Connection.Response response10 = response1.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String str9 = pattern2.pattern();
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
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "\\Q\\E");
        java.lang.Class<?> wildcardClass19 = pattern2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response5.body();
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
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
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
        java.util.function.Predicate<java.lang.String> strPredicate16 = pattern2.asPredicate();
        java.util.regex.Matcher matcher18 = pattern2.matcher((java.lang.CharSequence) "hi!");
        java.lang.String str19 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strPredicate16);
        org.junit.Assert.assertNotNull(matcher18);
        org.junit.Assert.assertEquals(matcher18.toString(), "java.util.regex.Matcher[pattern= region=0,3 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean10 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.Connection.Method method14 = response12.method();
        org.jsoup.Connection.Method method15 = response12.method();
        java.util.Map map16 = response12.cookies();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response7.statusMessage();
        java.lang.String str11 = response7.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method12 = response7.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        int int17 = response13.statusCode();
        java.util.Map.Entry entry19 = response13.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Method method21 = response20.method();
        boolean boolean23 = response20.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map24 = response20.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Method method26 = response7.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
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
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(entry19);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method26);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 97);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String str4 = pattern2.pattern();
        java.lang.String str5 = pattern2.pattern();
        java.lang.String str6 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
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
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response11.url(uRL16);
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str17 = response9.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str19 = response18.charset();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
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
        java.lang.String str13 = response7.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
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
        java.net.HttpURLConnection httpURLConnection12 = null;
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
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response20);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response25);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean7 = response1.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate18 = pattern2.asPredicate();
        java.lang.CharSequence charSequence19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray20 = pattern2.split(charSequence19);
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
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertNotNull(strPredicate18);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
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
        org.jsoup.Connection.Response response15 = response7.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass16 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map9 = response0.cookies();
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.cookie("", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
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
        java.net.URL uRL12 = response8.url();
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
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL12);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response7.body();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
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
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
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
            org.jsoup.Connection.Response response17 = response0.cookie("", "\\Qhi!\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
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
        org.jsoup.Connection.Response response15 = response9.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.String[] strArray3 = pattern1.split((java.lang.CharSequence) "\\Q\\E");
        int int4 = pattern1.flags();
        java.lang.String[] strArray7 = pattern1.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 1);
        java.lang.String[] strArray9 = pattern1.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream11 = pattern1.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass12 = strStream11.getClass();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
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
        java.lang.String[] strArray20 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str21 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
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
        java.lang.String str14 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = response0.method();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
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
        java.lang.String str15 = response8.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL18 = response17.url();
        java.util.Map map19 = response17.cookies();
        java.lang.String str20 = response17.charset();
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response17);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String str5 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate6 = pattern2.asPredicate();
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass9 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
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
        java.lang.String str13 = response9.cookie("\\Q\\E");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response9.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
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
        java.lang.String str14 = response11.charset();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        java.lang.String str19 = response16.getHeaderCaseInsensitive("");
        int int20 = response16.statusCode();
        java.lang.String str21 = response16.charset();
        java.net.URL uRL22 = response16.url();
        java.lang.String str23 = response16.contentType();
        org.jsoup.Connection.Response response25 = response16.removeCookie("hi!");
        org.jsoup.Connection.Response response28 = response16.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response31 = response16.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
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
        java.net.URL uRL30 = response1.url();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response32 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(uRL30);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
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
        java.lang.String str15 = response13.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response18 = response13.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document22 = response2.parse();
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
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str7, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
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
        java.lang.String str18 = response16.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass19 = response16.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        java.util.Map map2 = response0.cookies();
        java.lang.String str3 = response0.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response6 = response0.header("", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(map2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        int int19 = response15.statusCode();
        java.lang.String str21 = response15.getHeaderCaseInsensitive("");
        boolean boolean23 = response15.hasCookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response15);
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.util.Map.Entry entry10 = response7.scanHeaders("\\Qhi!\\E");
        org.jsoup.Connection.Response response12 = response7.removeHeader("\\Q\\E");
        org.jsoup.Connection.Response response14 = response7.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response7.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        java.lang.String str18 = pattern2.pattern();
        java.lang.String str19 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str21 = pattern2.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
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
        java.util.Map map14 = response1.cookies();
        java.lang.String str16 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response18 = response1.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean20 = response1.hasCookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.lang.String str9 = response0.cookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response12 = response6.header("\\Qhi!\\E", "");
        java.lang.Class<?> wildcardClass13 = response12.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("hi!");
        java.lang.String[] strArray3 = pattern1.split((java.lang.CharSequence) "\\Q\\E");
        int int4 = pattern1.flags();
        java.lang.String[] strArray7 = pattern1.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 1);
        java.lang.String[] strArray9 = pattern1.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String str10 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
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
        boolean boolean17 = response1.hasCookie("\\Q\\E");
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
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
        org.jsoup.Connection.Response response16 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.url(uRL17);
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
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response10 = response7.header("hi!", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response16.removeHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
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
        org.jsoup.Connection.Response response12 = response6.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response10.method(method11);
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
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
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
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
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
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
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
        java.util.Map map15 = response8.headers();
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
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
        org.jsoup.Connection.Method method12 = response6.method();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
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
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response0.url(uRL16);
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        int int8 = response0.statusCode();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        int int14 = response10.statusCode();
        java.util.Map.Entry entry16 = response10.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str18 = response10.statusMessage();
        java.util.Map.Entry entry20 = response10.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str22 = response10.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(entry20);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response16 = response0.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int17 = response0.statusCode();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.method(method18);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode();
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray16 = response0.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
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
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
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
        boolean boolean14 = response12.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response16 = response12.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response12.method(method17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("");
        int int12 = response8.statusCode();
        java.lang.String str13 = response8.charset();
        org.jsoup.Connection.Response response15 = response8.removeCookie("hi!");
        java.net.URL uRL16 = response8.url();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response12 = response0.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response3.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response3.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E", 8);
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.cookie("\\Qhi!\\E", "");
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
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
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
        org.jsoup.Connection.Method method14 = response7.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response7.body();
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
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
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        int int21 = pattern2.flags();
        java.lang.Class<?> wildcardClass22 = pattern2.getClass();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str9 = response7.charset();
        org.jsoup.Connection.Response response11 = response7.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass12 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
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
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str10 = response9.charset();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean14 = response0.hasCookie("");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
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
        java.lang.String str14 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response0.header("\\Q\\E");
        int int17 = response0.statusCode();
        java.lang.String str19 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response0.url(uRL20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("\\Qhi!\\E");
        java.util.Map map10 = response1.headers();
        java.lang.String str11 = response1.contentType();
        org.jsoup.Connection.Response response13 = response1.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str15 = response1.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
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
        org.jsoup.Connection.Response response14 = response7.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.net.URL uRL15 = response7.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
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
        java.lang.String str22 = pattern2.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        int int16 = response12.statusCode();
        java.lang.String str17 = response12.charset();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response21 = response18.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response24 = response22.removeHeader("hi!");
        java.lang.String str25 = response22.contentType();
        org.jsoup.Connection.Method method26 = response22.method();
        org.jsoup.Connection.Method method27 = response22.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.lang.String str30 = response29.statusMessage();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response29);
        boolean boolean33 = response29.hasCookie("\\Qhi!\\E");
        java.util.Map map34 = response29.cookies();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.lang.Class<?> wildcardClass37 = map34.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
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
        java.lang.Class<?> wildcardClass13 = response12.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response7.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response7.statusMessage();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
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
        java.net.URL uRL12 = response8.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response16 = response8.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
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
        java.net.URL uRL16 = response8.url();
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response8.url(uRL17);
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
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
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
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        java.lang.String str20 = response15.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str21 = response15.statusMessage();
        java.util.Map map22 = response15.headers();
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = response14.body();
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
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(map22);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 10);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response7.bodyAsBytes();
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
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response2.parse();
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
        org.junit.Assert.assertNull(entry22);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int10 = response0.statusCode();
        java.net.URL uRL11 = response0.url();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String str12 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response8.url();
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response0.hasCookie("");
        java.lang.String str8 = response0.charset();
        java.lang.String str9 = response0.statusMessage();
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
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
            byte[] byteArray13 = response10.bodyAsBytes();
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
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate10 = pattern2.asPredicate();
        java.lang.Class<?> wildcardClass11 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strPredicate10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        int int12 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream16 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.CharSequence charSequence17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream(charSequence17);
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
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strStream16);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL5 = response0.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str14 = response13.statusMessage();
        java.util.Map.Entry entry16 = response13.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL17 = response13.url();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.util.Map map19 = response13.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
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
        boolean boolean14 = response12.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response12.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response12.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
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
        java.lang.String str16 = response7.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.Connection.Method method24 = response18.method();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response18);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        org.jsoup.Connection.Method method10 = response8.method();
        int int11 = response8.statusCode();
        boolean boolean13 = response8.hasHeader("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response8.body();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response9.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
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
            byte[] byteArray16 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
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
        java.util.Map map14 = response1.cookies();
        int int15 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response8.header("hi!", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
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
        java.util.Map.Entry entry16 = response12.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map17 = response12.headers();
        java.lang.String str19 = response12.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
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
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response5 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.contentType();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
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
        java.lang.String str16 = response14.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass17 = response14.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method8 = response6.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.Class<?> wildcardClass10 = response6.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response5 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.cookie("", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        java.lang.String str1 = java.util.regex.Pattern.quote("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str1, "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response7.url(uRL13);
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
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response8.header("", "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response6.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response12 = response6.header("\\Qhi!\\E", "");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response6.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str12 = response10.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL15 = response14.url();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        // The following exception was thrown during execution in test generation
        try {
            response10.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response1.cookies();
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
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map.Entry entry12 = response10.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(entry12);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response8 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.Connection.Response response11 = null;
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection10, response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str9 = response8.statusMessage();
        java.lang.String str10 = response8.charset();
        java.lang.String str12 = response8.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
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
        java.net.URL uRL12 = response8.url();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str14 = response8.contentType();
        java.util.Map map15 = response8.headers();
        java.util.Map.Entry entry17 = response8.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(entry17);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String str12 = pattern2.pattern();
        int int13 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method10 = response9.method();
        java.lang.String str12 = response9.getHeaderCaseInsensitive("");
        int int13 = response9.statusCode();
        java.lang.String str14 = response9.charset();
        java.net.URL uRL15 = response9.url();
        java.util.Map map16 = response9.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.Connection.Method method23 = response18.method();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.lang.String str27 = response26.statusMessage();
        java.lang.String str29 = response26.header("\\Qhi!\\E");
        java.lang.String str30 = response26.charset();
        org.jsoup.Connection.Response response32 = response26.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map33 = response26.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = response7.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method11 = response0.method();
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response0.url(uRL12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method11);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
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
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response6.url(uRL14);
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
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str10 = response9.statusMessage();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
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
        boolean boolean12 = response6.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method15 = response14.method();
        java.lang.String str17 = response14.getHeaderCaseInsensitive("");
        int int18 = response14.statusCode();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        java.net.URL uRL9 = response1.url();
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
        org.junit.Assert.assertNull(uRL9);
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
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
        java.lang.String str14 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method15 = response0.method();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        int int21 = response17.statusCode();
        java.util.Map.Entry entry23 = response17.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method25 = response24.method();
        org.jsoup.Connection.Response response28 = response24.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response30 = response24.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response24);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeCookie("\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str10 = response9.contentType();
        org.jsoup.Connection.Response response13 = response9.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map.Entry entry15 = response9.scanHeaders("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strStream13);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass10 = strStream9.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        org.jsoup.Connection.Response response8 = response5.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        boolean boolean10 = response5.hasCookie("");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
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
        java.lang.Class<?> wildcardClass48 = response0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "");
        int int5 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate6 = pattern2.asPredicate();
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(strPredicate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Qhi!\\E" + "'", str7, "\\Qhi!\\E");
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response0.method(method9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
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
        int int16 = response7.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response7.parse();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
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
        java.lang.String str14 = response11.charset();
        org.jsoup.Connection.Response response16 = response11.removeCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response11.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean7 = response1.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response10 = response0.removeCookie("\\Q\\E");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method8 = response0.method();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        java.lang.String str15 = response10.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response17 = response10.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map19 = response18.headers();
        org.jsoup.Connection.Method method20 = response18.method();
        java.lang.String str21 = response18.statusMessage();
        java.lang.String str23 = response18.header("\\Qhi!\\E");
        org.jsoup.Connection.Response response26 = response18.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray4 = pattern1.split((java.lang.CharSequence) "\\Qhi!\\E", (int) '#');
        java.lang.String[] strArray7 = pattern1.split((java.lang.CharSequence) "hi!", 0);
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        org.jsoup.Connection.Method method2 = response0.method();
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL5 = response4.url();
        java.util.Map map6 = response4.cookies();
        java.lang.String str7 = response4.charset();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection3, (org.jsoup.Connection.Response) response4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        boolean boolean12 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document13 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int2 = pattern1.flags();
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream4 = pattern1.splitAsStream(charSequence3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
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
        org.jsoup.Connection.Method method17 = response16.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
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
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
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
        java.lang.String str15 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response0.header("", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.cookie("", "");
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
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response7.hasCookie("");
        org.jsoup.Connection.Method method10 = response7.method();
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.net.URL uRL7 = response0.url();
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
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response10 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response3.contentType();
        java.lang.String str6 = response3.cookie("");
        int int7 = response3.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
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
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
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
        java.net.URL uRL15 = response0.url();
        java.lang.String str16 = response0.statusMessage();
        boolean boolean18 = response0.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        java.lang.String str22 = response19.getHeaderCaseInsensitive("");
        int int23 = response19.statusCode();
        java.lang.String str24 = response19.charset();
        java.net.URL uRL25 = response19.url();
        java.lang.String str26 = response19.contentType();
        org.jsoup.Connection.Response response28 = response19.removeCookie("hi!");
        java.lang.String str30 = response19.cookie("hi!");
        java.util.Map map31 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map31);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray33 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str20 = response19.statusMessage();
        java.lang.String str22 = response19.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response24 = response19.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str26 = response19.charset();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response19);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
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
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method28 = response27.method();
        java.lang.String str30 = response27.getHeaderCaseInsensitive("");
        int int31 = response27.statusCode();
        java.lang.String str32 = response27.charset();
        java.net.URL uRL33 = response27.url();
        java.lang.String str35 = response27.cookie("\\Q\\E");
        boolean boolean37 = response27.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map38 = response27.headers();
        boolean boolean40 = response27.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Method method42 = response27.method();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response27);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(uRL33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNull(method42);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response0.body();
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
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        java.lang.String str18 = pattern2.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 8);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Qhi!\\E region=0,150 lastmatch=]");
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Qhi!\\E" + "'", str7, "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(strPredicate8);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
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
        boolean boolean12 = response9.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method4 = response3.method();
        java.lang.String str5 = response3.statusMessage();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.URL uRL7 = response6.url();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response8.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.util.Map map12 = response8.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
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
            byte[] byteArray13 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\E");
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.Connection.Method method18 = response13.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str22 = response21.statusMessage();
        java.lang.String str24 = response21.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response26 = response21.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response26);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
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
            org.jsoup.nodes.Document document11 = response0.parse();
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
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
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
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method8 = response7.method();
        java.lang.String str9 = response7.statusMessage();
        java.lang.String str10 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
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
            org.jsoup.Connection.Response response24 = response0.header("", "\\Q\\Q\\E\\\\E\\Q\\E");
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
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method8 = response6.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.net.URL uRL10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response9.url(uRL10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response10.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
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
        java.lang.Class<?> wildcardClass15 = response7.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate11 = pattern2.asPredicate();
        int int12 = pattern2.flags();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(strPredicate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
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
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.Class<?> wildcardClass4 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        boolean boolean4 = response0.hasHeader("hi!");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str7 = response6.contentType();
        int int8 = response6.statusCode();
        java.lang.String str9 = response6.statusMessage();
        org.jsoup.Connection.Response response12 = response6.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response6.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String str12 = pattern2.pattern();
        java.util.stream.Stream<java.lang.String> strStream14 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str16 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strStream14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray19 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream21 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
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
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(strStream21);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
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
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response16.url(uRL17);
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response13.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method9 = response8.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
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
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str10 = response8.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.Class<?> wildcardClass18 = response17.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
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
        java.lang.Class<?> wildcardClass13 = response12.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response9 = response7.removeHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
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
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        int int12 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,309 lastmatch=]");
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        int int17 = response13.statusCode();
        java.lang.String str18 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.Connection.Response response22 = response19.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response25 = response23.removeHeader("hi!");
        java.lang.String str26 = response23.contentType();
        org.jsoup.Connection.Method method27 = response23.method();
        org.jsoup.Connection.Method method28 = response23.method();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response29);
        java.lang.String str31 = response30.statusMessage();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response30);
        boolean boolean34 = response30.hasCookie("\\Qhi!\\E");
        java.util.Map map35 = response30.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        response12.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response12);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response39 = org.jsoup.helper.HttpConnection.Response.execute(request0, response38);
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
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method9 = response0.method();
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method9);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
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
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response27 = response25.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response30 = response28.removeHeader("hi!");
        java.lang.String str31 = response28.contentType();
        org.jsoup.Connection.Method method32 = response28.method();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response28);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response28);
        java.util.Map map35 = response28.headers();
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        int int37 = response25.statusCode();
        boolean boolean39 = response25.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map41 = response25.cookies();
        java.util.Map map42 = response25.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response23.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response25);
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
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        org.jsoup.Connection.Response response6 = response3.removeCookie("\\Qhi!\\E");
        java.net.URL uRL7 = response3.url();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response3.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
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
        java.lang.String[] strArray17 = pattern2.split((java.lang.CharSequence) "", 97);
        java.lang.Class<?> wildcardClass18 = strArray17.getClass();
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
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        java.lang.String str9 = response1.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map10 = response1.cookies();
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
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
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
        boolean boolean20 = response17.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response17.url(uRL21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response10 = response7.cookie("hi!", "hi!");
        org.jsoup.Connection.Response response12 = response7.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response14 = response7.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        java.lang.String str9 = response5.charset();
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
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
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        int int21 = response17.statusCode();
        java.lang.String str22 = response17.charset();
        org.jsoup.Connection.Response response24 = response17.removeCookie("hi!");
        java.net.URL uRL25 = response17.url();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response17);
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
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(uRL25);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response0.hasCookie("");
        org.jsoup.Connection.Response response9 = response0.removeHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
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
        java.lang.String str17 = response7.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response7.body();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response10);
        int int14 = response13.statusCode();
        java.lang.String str15 = response13.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
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
        org.jsoup.Connection.Response response15 = response8.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.net.URL uRL16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response8.url(uRL16);
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
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
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
        java.lang.String str13 = response7.statusMessage();
        java.util.Map map14 = response7.cookies();
        java.lang.String str16 = response7.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
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
        java.lang.String str12 = response0.charset();
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
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int10 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.Class<?> wildcardClass12 = response11.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
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
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.Connection.Response response22 = response14.removeCookie("");
        int int23 = response14.statusCode();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response14);
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
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
        java.lang.String str14 = response8.charset();
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response8.url(uRL15);
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
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
        java.net.URL uRL14 = response1.url();
        int int15 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
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
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.lang.String str12 = pattern2.pattern();
        int int13 = pattern2.flags();
        java.lang.String[] strArray15 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = pattern2.pattern();
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
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
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strStream18);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray11 = response9.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray15 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E", 0);
        int int16 = pattern2.flags();
        java.lang.String str17 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
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
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response15.method(method16);
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
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response8 = response0.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map12 = response0.cookies();
        java.lang.Class<?> wildcardClass13 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.util.Map.Entry entry4 = response0.scanHeaders("\\Qhi!\\E");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(entry4);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream19 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray21 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str22 = pattern2.pattern();
        java.lang.String str23 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String str12 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.cookie("\\Q\\E");
        org.jsoup.Connection.Response response15 = response1.cookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.util.regex.Matcher matcher4 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher7 = pattern2.matcher(charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(matcher4);
        org.junit.Assert.assertEquals(matcher4.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,35 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
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
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        int int10 = response9.statusCode();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.Connection.Response response20 = response13.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str21 = response13.statusMessage();
        org.jsoup.Connection.Response response23 = response13.removeCookie("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection12, response23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        java.lang.String str4 = response1.statusMessage();
        org.jsoup.Connection.Response response7 = response1.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
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
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response20 = response18.removeHeader("hi!");
        java.lang.String str21 = response18.contentType();
        org.jsoup.Connection.Method method22 = response18.method();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.net.URL uRL25 = response18.url();
        java.net.URL uRL26 = response18.url();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response29 = response27.removeHeader("hi!");
        java.lang.String str30 = response27.contentType();
        org.jsoup.Connection.Method method31 = response27.method();
        org.jsoup.Connection.Method method32 = response27.method();
        org.jsoup.Connection.Method method33 = response27.method();
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.util.Map map35 = response34.headers();
        response18.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map35);
        java.lang.String str37 = response18.statusMessage();
        java.lang.String str39 = response18.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str40 = response18.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response15.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response18);
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(uRL26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.util.Map.Entry entry8 = response0.scanHeaders("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.lang.String str11 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
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
        boolean boolean12 = response6.hasCookie("hi!");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean22 = response20.hasCookie("");
        java.lang.String str23 = response20.contentType();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 100);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
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
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = null;
        // The following exception was thrown during execution in test generation
        try {
            response14.processResponseHeaders(strMap15);
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
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
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
            org.jsoup.nodes.Document document10 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL5 = response0.url();
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method8 = response7.method();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        java.lang.String str12 = response7.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response14 = response7.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map.Entry entry17 = response7.scanHeaders("");
        java.lang.String str18 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        java.lang.String str22 = response19.getHeaderCaseInsensitive("");
        int int23 = response19.statusCode();
        java.util.Map.Entry entry25 = response19.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Method method27 = response26.method();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.Connection.Response response31 = response26.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map32 = response26.cookies();
        java.util.Map map33 = response26.headers();
        java.util.Map map34 = response26.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map34);
        java.lang.String str37 = response7.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection6, (org.jsoup.Connection.Response) response7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(entry25);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
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
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        java.lang.String str22 = response17.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str23 = response17.charset();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.util.Map map25 = response24.headers();
        java.lang.String str26 = response24.charset();
        boolean boolean28 = response24.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response24);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response7.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
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
        java.util.Map map12 = response7.cookies();
        java.lang.String str13 = response7.statusMessage();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeHeader("hi!");
        java.lang.String str11 = response8.contentType();
        org.jsoup.Connection.Method method12 = response8.method();
        org.jsoup.Connection.Method method13 = response8.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response14);
        java.lang.String str17 = response16.statusMessage();
        java.lang.String str19 = response16.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response21 = response16.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str23 = response16.charset();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map.Entry entry29 = response25.scanHeaders("");
        java.net.URL uRL30 = response25.url();
        org.jsoup.Connection.Response response33 = response25.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str34 = response25.contentType();
        java.lang.String str36 = response25.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map37 = response25.cookies();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map37);
        java.net.HttpURLConnection httpURLConnection40 = null;
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method42 = response41.method();
        java.lang.String str44 = response41.getHeaderCaseInsensitive("");
        int int45 = response41.statusCode();
        java.lang.String str46 = response41.charset();
        java.net.URL uRL47 = response41.url();
        java.lang.String str48 = response41.contentType();
        boolean boolean50 = response41.hasHeader("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response41);
        java.util.Map.Entry entry53 = response41.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response54 = new org.jsoup.helper.HttpConnection.Response(response41);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection40, (org.jsoup.Connection.Response) response54);
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNull(uRL30);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(method42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(uRL47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(entry53);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Response response11 = response9.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response9.getHeaderCaseInsensitive("\\Q\\E");
        java.net.URL uRL14 = response9.url();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
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
            java.lang.String str19 = response0.body();
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
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
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
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response33 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
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
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNotNull(response25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        java.util.Map map6 = response0.cookies();
        int int7 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document8 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
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
        java.net.URL uRL15 = response0.url();
        java.lang.String str16 = response0.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass15 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean13 = response9.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response9.cookie("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str9 = response7.charset();
        boolean boolean11 = response7.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response8 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean10 = response0.hasHeader("\\Q\\E");
        java.util.Map.Entry entry12 = response0.scanHeaders("hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.net.URL uRL9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response10 = response7.url(uRL9);
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
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response12.url(uRL14);
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
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
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
        org.jsoup.Connection.Response response15 = response1.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.net.URL uRL16 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
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
        java.util.Map.Entry entry15 = response11.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map16 = response11.headers();
        java.lang.String str17 = response11.statusMessage();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        java.util.Map.Entry entry9 = response0.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean11 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response2.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map map4 = response0.cookies();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.method(method7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response3.statusMessage();
        boolean boolean6 = response3.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response3.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        java.util.Collection<org.jsoup.Connection.KeyVal> keyValCollection0 = null;
        java.io.OutputStream outputStream1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response.writePost(keyValCollection0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", (int) (short) 100);
        java.util.function.Predicate<java.lang.String> strPredicate3 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        int int7 = pattern2.flags();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.CharSequence charSequence9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream(charSequence9);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str9 = response7.charset();
        org.jsoup.Connection.Response response11 = response7.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response12.url(uRL13);
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
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response9.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response9.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
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
        java.lang.String str18 = response15.header("");
        java.lang.String str19 = response15.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = response15.body();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
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
        java.lang.Class<?> wildcardClass12 = response10.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
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
            org.jsoup.nodes.Document document11 = response10.parse();
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
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
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
        java.lang.String str16 = response15.contentType();
        java.lang.String str17 = response15.charset();
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response15.method(method18);
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = response2.body();
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
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
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
        boolean boolean16 = response1.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method8 = response6.method();
        java.util.Map map9 = response6.headers();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response6.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", (int) (short) 10);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream19 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str20 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strStream19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
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
        boolean boolean12 = response6.hasCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        java.lang.String str11 = response0.cookie("\\Q\\E");
        org.jsoup.Connection.Method method12 = response0.method();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.statusMessage();
        boolean boolean10 = response7.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response7.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.Class<?> wildcardClass5 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Method method15 = response10.method();
        org.jsoup.Connection.Method method16 = response10.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
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
            java.lang.String str15 = response0.body();
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
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
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
            org.jsoup.Connection.Response response11 = response8.url(uRL10);
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
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str3 = response0.charset();
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
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
        java.lang.String str13 = response8.statusMessage();
        int int14 = response8.statusCode();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str2 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Method method10 = response0.method();
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.net.URL uRL18 = response17.url();
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.url(uRL19);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(uRL18);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            response13.processResponseHeaders(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response8.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean7 = response1.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Method method4 = response1.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
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
        java.net.URL uRL22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response23 = response5.url(uRL22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
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
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map11 = response7.cookies();
        java.lang.Class<?> wildcardClass12 = response7.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.pattern();
        java.lang.String str9 = pattern2.pattern();
        java.lang.String str10 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int12 = response8.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray13 = response8.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        java.lang.String[] strArray4 = pattern0.split((java.lang.CharSequence) "\\Qhi!\\E", 100);
        java.lang.String[] strArray6 = pattern0.split((java.lang.CharSequence) "hi!");
        java.util.stream.Stream<java.lang.String> strStream8 = pattern0.splitAsStream((java.lang.CharSequence) "");
        java.util.stream.Stream<java.lang.String> strStream10 = pattern0.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher12 = pattern0.matcher((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = pattern0.toString();
        org.junit.Assert.assertNotNull(pattern0);
// flaky:         org.junit.Assert.assertEquals(pattern0.toString(), "");
// flaky:         org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertNotNull(matcher12);
// flaky:         org.junit.Assert.assertEquals(matcher12.toString(), "java.util.regex.Matcher[pattern= region=0,35 lastmatch=]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
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
        java.lang.String str15 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response0.url();
        java.util.Map map10 = response0.headers();
        boolean boolean12 = response0.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.charset();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        int int14 = response10.statusCode();
        java.util.Map.Entry entry16 = response10.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Method method18 = response17.method();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str22 = response20.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        java.lang.String str8 = response0.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response11 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str14 = response12.getHeaderCaseInsensitive("\\Qhi!\\E");
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
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response9.parse();
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
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
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
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        org.jsoup.Connection.Response response5 = response1.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str7 = response1.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        java.util.Map.Entry entry5 = response1.scanHeaders("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(entry5);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.Connection.Response response19 = response11.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response11);
        boolean boolean23 = response21.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str25 = response21.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
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
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
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
        org.jsoup.Connection.Response response16 = response7.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
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
        java.lang.Class<?> wildcardClass17 = response16.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 0);
        java.lang.String str3 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
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
        org.jsoup.Connection.Response response17 = response1.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int18 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response19 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
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
        java.lang.String str17 = pattern2.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str19 = pattern2.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response6.parse();
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
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
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
        java.lang.String str13 = response12.contentType();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response12);
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
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        boolean boolean19 = response17.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response19);
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
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
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
        java.util.Map map14 = response11.headers();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response17 = response15.removeHeader("hi!");
        java.lang.String str18 = response15.contentType();
        org.jsoup.Connection.Method method19 = response15.method();
        org.jsoup.Connection.Method method20 = response15.method();
        org.jsoup.Connection.Method method21 = response15.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map map23 = response22.headers();
        java.util.Map map24 = response22.cookies();
        response11.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = response11.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response0.getHeaderCaseInsensitive("\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
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
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
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
        org.jsoup.Connection.Response response14 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response17 = response0.cookie("\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response7.hasCookie("");
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
        int int22 = response10.statusCode();
        boolean boolean24 = response10.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map26 = response10.cookies();
        java.util.Map map27 = response10.cookies();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        java.net.URL uRL10 = response8.url();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map map12 = response11.cookies();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response11);
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
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(uRL10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
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
        boolean boolean18 = response0.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.url(uRL19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document9 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response8 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
        org.jsoup.Connection.Response response12 = response0.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response12 = response7.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean14 = response7.hasCookie("");
        java.lang.String str16 = response7.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str17 = response7.contentType();
        java.lang.String str18 = response7.charset();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method7 = response1.method();
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
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str2 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
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
        org.jsoup.Connection.Response response17 = response9.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
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
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        int int19 = response15.statusCode();
        java.lang.String str20 = response15.charset();
        java.net.URL uRL21 = response15.url();
        java.lang.String str22 = response15.contentType();
        org.jsoup.Connection.Response response24 = response15.removeCookie("hi!");
        org.jsoup.Connection.Response response26 = response15.removeHeader("\\Qhi!\\E");
        int int27 = response15.statusCode();
        java.util.Map map28 = response15.headers();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.util.Map.Entry entry31 = response29.scanHeaders("\\Qhi!\\E");
        java.util.Map.Entry entry33 = response29.scanHeaders("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response29);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(entry31);
        org.junit.Assert.assertNull(entry33);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response16 = response7.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response18 = response7.method(method17);
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
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean10 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        java.lang.String str4 = response0.contentType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = response0.body();
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
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
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
        java.lang.String str15 = response7.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.statusMessage();
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
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        org.jsoup.Connection.Method method17 = response12.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.lang.String str20 = response19.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        boolean boolean23 = response19.hasCookie("\\Qhi!\\E");
        java.util.Map map24 = response19.cookies();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response28 = response25.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map29 = response25.headers();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
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
        boolean boolean19 = response0.hasCookie("\\Qhi!\\E");
        java.lang.Class<?> wildcardClass20 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document23 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
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
        org.jsoup.Connection.Response response14 = response0.removeHeader("\\Qhi!\\E");
        java.lang.String str15 = response0.statusMessage();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response14.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
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
        java.lang.String str16 = response7.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str18 = response7.cookie("\\Q\\E");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response7.method(method19);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response1.charset();
        java.util.Map.Entry entry7 = response1.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean9 = response1.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.cookie("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean14 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", 10);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 52);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.String str11 = response9.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response9.method(method12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
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
        org.jsoup.Connection.Response response17 = response0.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray18 = response0.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.Connection.Response response6 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response10.bodyAsBytes();
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
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
        org.jsoup.Connection.Response response14 = response0.removeHeader("\\Qhi!\\E");
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        org.jsoup.Connection.Method method21 = response16.method();
        org.jsoup.Connection.Method method22 = response16.method();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map map24 = response23.headers();
        java.lang.String str26 = response23.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response23);
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response19 = response17.removeHeader("hi!");
        java.lang.String str20 = response17.contentType();
        org.jsoup.Connection.Method method21 = response17.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response24 = response17.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str27 = response17.cookie("\\Q\\E");
        java.lang.String str29 = response17.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map30 = response17.headers();
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        java.lang.String str32 = response9.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response33 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
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
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
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
        java.net.URL uRL17 = response8.url();
        org.jsoup.Connection.Response response19 = response8.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        java.lang.String str6 = response0.contentType();
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
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
        int int26 = response6.statusCode();
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str5 = response0.statusMessage();
        boolean boolean7 = response0.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean13 = response9.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int15 = response9.statusCode();
        org.jsoup.Connection.Response response18 = response9.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str20 = response9.cookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
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
            org.jsoup.nodes.Document document17 = response16.parse();
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
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str16 = pattern2.pattern();
        java.lang.String str17 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.String[] strArray12 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate15 = pattern2.asPredicate();
        java.lang.Class<?> wildcardClass16 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strPredicate15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
        java.util.Map map9 = response0.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response10.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
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
        java.net.URL uRL16 = response14.url();
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
        org.junit.Assert.assertNull(uRL16);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
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
        java.util.Map map14 = response1.cookies();
        boolean boolean16 = response1.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean18 = response1.hasHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean20 = response1.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        int int12 = pattern2.flags();
        java.lang.Class<?> wildcardClass13 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
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
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response8.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", 100);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 100);
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray8 = pattern2.split(charSequence6, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
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
            byte[] byteArray11 = response10.bodyAsBytes();
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
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
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
        java.lang.String str14 = response0.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = response0.header("\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = response6.body();
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
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Method method8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.method(method8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response10.body();
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
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        java.util.Map.Entry entry10 = response7.scanHeaders("hi!");
        java.lang.String str11 = response7.statusMessage();
        boolean boolean13 = response7.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        java.lang.String str11 = response1.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        java.lang.String str1 = pattern0.pattern();
        java.util.stream.Stream<java.lang.String> strStream3 = pattern0.splitAsStream((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = pattern0.getClass();
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(strStream3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response0.bodyAsBytes();
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
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.header("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
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
        boolean boolean19 = response11.hasCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document20 = response11.parse();
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
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate12 = pattern2.asPredicate();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strPredicate12);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream11 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E", 64);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str17 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
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
        org.jsoup.Connection.Method method13 = response1.method();
        java.lang.String str14 = response1.statusMessage();
        org.jsoup.Connection.Response response17 = response1.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response17);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
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
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response17.method(method18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        java.util.regex.Pattern pattern0 = org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp;
        int int1 = pattern0.flags();
        int int2 = pattern0.flags();
        java.lang.String[] strArray4 = pattern0.split((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate5 = pattern0.asPredicate();
        java.lang.String str6 = pattern0.toString();
        org.junit.Assert.assertNotNull(pattern0);
        org.junit.Assert.assertEquals(pattern0.toString(), "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 16 + "'", int1 == 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strPredicate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
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
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response14.url(uRL18);
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
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int11 = response10.statusCode();
        java.lang.String str12 = response10.statusMessage();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        java.util.Map.Entry entry8 = response0.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
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
        java.lang.String str13 = response7.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response7.cookie("", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate19 = pattern2.asPredicate();
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
        org.junit.Assert.assertNotNull(strPredicate19);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "hi!", (int) ' ');
        java.lang.Class<?> wildcardClass12 = strArray11.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}
