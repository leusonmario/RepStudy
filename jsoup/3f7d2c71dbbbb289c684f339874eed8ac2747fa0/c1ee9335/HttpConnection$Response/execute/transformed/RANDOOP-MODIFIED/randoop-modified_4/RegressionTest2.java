import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01001");
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
        org.jsoup.Connection.Response response16 = response13.header("\\Q\\Q\\E\\\\E\\Q\\E", "");
        boolean boolean18 = response13.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response13.url(uRL19);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01002");
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
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray21 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray24 = pattern2.split((java.lang.CharSequence) "", 1);
        java.lang.String str25 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01003");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry11 = response1.scanHeaders("");
        java.lang.String str12 = response1.charset();
        boolean boolean14 = response1.hasCookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01004");
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
        int int11 = response8.statusCode();
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01005");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01006");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        boolean boolean9 = response1.hasCookie("\\Qhi!\\E");
        java.lang.String str11 = response1.header("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01007");
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
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01008");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01009");
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
        boolean boolean18 = response7.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01010");
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
        org.jsoup.Connection.Response response18 = response11.cookie("hi!", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response21 = response11.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.Connection.Response response23 = response11.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response11.method(method24);
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
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01011");
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
        java.net.URL uRL16 = response15.url();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01012");
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
        java.lang.String[] strArray20 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) '4');
        java.lang.CharSequence charSequence21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher22 = pattern2.matcher(charSequence21);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray20);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01013");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", (int) (short) 1);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01014");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        int int21 = response17.statusCode();
        java.util.Map.Entry entry23 = response17.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method25 = response24.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.util.Map map27 = response26.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.String str30 = response0.header("\\Q\\E");
        java.net.URL uRL31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response32 = response0.url(uRL31);
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
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01015");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        org.jsoup.Connection.Response response12 = response0.removeHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response0.url(uRL14);
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
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01016");
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
        int int31 = response8.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = response8.body();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01017");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response1.cookie("\\Q\\E");
        java.util.Map map13 = response1.cookies();
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
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01018");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str8 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map11 = response10.headers();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response10);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01019");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01020");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01021");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map9 = response8.headers();
        java.lang.String str11 = response8.cookie("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response8.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01022");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01023");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str9 = response7.cookie("hi!");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01024");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.stream.Stream<java.lang.String> strStream20 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String[] strArray22 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(strStream20);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01025");
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
        org.jsoup.Connection.Method method48 = response0.method();
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
        org.junit.Assert.assertNull(method48);
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01026");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        java.net.URL uRL4 = response0.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection6 = null;
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method8 = response7.method();
        java.lang.String str10 = response7.getHeaderCaseInsensitive("");
        int int11 = response7.statusCode();
        java.lang.String str12 = response7.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response16 = response13.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response18 = response13.removeHeader("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response5.setupFromConnection(httpURLConnection6, response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01027");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01028");
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
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str20 = pattern2.pattern();
        java.lang.CharSequence charSequence21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.regex.Matcher matcher22 = pattern2.matcher(charSequence21);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01029");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 100);
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = pattern2.pattern();
        java.lang.String str6 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str6, "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01030");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 128);
        java.lang.String str15 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01031");
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
        java.lang.Class<?> wildcardClass16 = map15.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01032");
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
        java.net.HttpURLConnection httpURLConnection37 = null;
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL39 = response38.url();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response38);
        java.lang.String str41 = response38.statusMessage();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response38);
        org.jsoup.Connection.Response response44 = response38.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response47 = response38.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection37, response47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNull(uRL39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNotNull(response47);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01033");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String str12 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        java.lang.Class<?> wildcardClass14 = strPredicate13.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01034");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response9 = response6.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Method method15 = response10.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.Connection.Response response18 = response10.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.lang.String str21 = response10.header("\\Qhi!\\E");
        java.lang.String str22 = response10.charset();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response10);
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
        int int36 = response24.statusCode();
        java.lang.String str38 = response24.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry40 = response24.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response24);
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response44 = response42.removeHeader("hi!");
        java.lang.String str45 = response42.contentType();
        org.jsoup.Connection.Method method46 = response42.method();
        org.jsoup.Connection.Method method47 = response42.method();
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response(response42);
        org.jsoup.Connection.Response response50 = response42.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response42);
        org.jsoup.Connection.Response response53 = response42.removeHeader("\\Q\\E");
        org.jsoup.Connection.Method method54 = response42.method();
        org.jsoup.Connection.Response response56 = response42.removeHeader("\\Qhi!\\E");
        java.util.Map map57 = response42.headers();
        response41.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map57);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response61 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(entry40);
        org.junit.Assert.assertNotNull(response44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(method46);
        org.junit.Assert.assertNull(method47);
        org.junit.Assert.assertNotNull(response50);
        org.junit.Assert.assertNotNull(response53);
        org.junit.Assert.assertNull(method54);
        org.junit.Assert.assertNotNull(response56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01035");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String str3 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01036");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Method method3 = response0.method();
        java.util.Map map4 = response0.cookies();
        java.net.HttpURLConnection httpURLConnection5 = null;
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response8 = response6.removeHeader("hi!");
        java.lang.String str9 = response6.contentType();
        org.jsoup.Connection.Method method10 = response6.method();
        org.jsoup.Connection.Method method11 = response6.method();
        org.jsoup.Connection.Method method12 = response6.method();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection5, (org.jsoup.Connection.Response) response6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01037");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method10 = response9.method();
        java.lang.String str11 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map map23 = response16.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map map27 = response8.cookies();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response29 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01038");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        int int3 = response1.statusCode();
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response1.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean11 = response1.hasHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01039");
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
        org.jsoup.Connection.Response response19 = response5.removeCookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray20 = response5.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01040");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01041");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = response0.cookie("\\Qhi!\\E");
        java.lang.Class<?> wildcardClass6 = response0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01042");
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
            org.jsoup.nodes.Document document12 = response8.parse();
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
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01043");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.lang.String str8 = pattern2.pattern();
        java.lang.String str9 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate10 = pattern2.asPredicate();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strPredicate10);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01044");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01045");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01046");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01047");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response5 = response1.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL6 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(uRL6);
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01048");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01049");
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
        java.lang.String str13 = response10.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01050");
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
        java.util.Map map19 = response14.headers();
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        java.util.Map.Entry entry27 = response21.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response21);
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response21);
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
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(entry27);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01051");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate4 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream6 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str9 = pattern2.pattern();
        java.lang.String str10 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(strPredicate4);
        org.junit.Assert.assertNotNull(strStream6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01052");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01053");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response3);
        java.util.Map.Entry entry7 = response3.scanHeaders("hi!");
        java.lang.String str8 = response3.charset();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01054");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = response0.body();
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01055");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01056");
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
            org.jsoup.helper.HttpConnection.Response response14 = org.jsoup.helper.HttpConnection.Response.execute(request0, response13);
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
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01057");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01058");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str11 = response8.getHeaderCaseInsensitive("");
        int int12 = response8.statusCode();
        java.lang.String str14 = response8.getHeaderCaseInsensitive("");
        java.lang.String str15 = response8.charset();
        java.util.Map map16 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        int int21 = response17.statusCode();
        java.util.Map.Entry entry23 = response17.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method25 = response24.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.util.Map map27 = response26.cookies();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response7.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01059");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Response response7 = response1.removeHeader("\\Qhi!\\E");
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
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01060");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str17 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
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
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method33 = response32.method();
        java.lang.String str35 = response32.getHeaderCaseInsensitive("");
        int int36 = response32.statusCode();
        java.util.Map.Entry entry38 = response32.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Method method40 = response39.method();
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response39);
        java.util.Map map42 = response41.cookies();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        java.lang.String str45 = response15.header("\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(entry38);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01061");
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
        boolean boolean20 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response22 = response0.method(method21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01062");
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
        java.net.URL uRL12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response8.url(uRL12);
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
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01063");
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
        java.lang.Class<?> wildcardClass20 = pattern2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01064");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method8 = response6.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.Class<?> wildcardClass10 = response9.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01065");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document17 = response15.parse();
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01066");
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
        java.lang.String str13 = response7.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean15 = response7.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str17 = response7.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response19.removeHeader("hi!");
        java.lang.String str22 = response19.contentType();
        org.jsoup.Connection.Method method23 = response19.method();
        org.jsoup.Connection.Method method24 = response19.method();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str27 = response26.statusMessage();
        java.util.Map.Entry entry29 = response26.scanHeaders("\\Qhi!\\E");
        org.jsoup.Connection.Response response31 = response26.removeHeader("\\Q\\E");
        org.jsoup.Connection.Response response33 = response26.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str35 = response26.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response26);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(entry29);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(response33);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01067");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        java.util.regex.Matcher matcher15 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass16 = matcher15.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(matcher15);
        org.junit.Assert.assertEquals(matcher15.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01068");
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
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        int int16 = response12.statusCode();
        java.lang.String str17 = response12.charset();
        java.net.URL uRL18 = response12.url();
        java.lang.String str20 = response12.cookie("\\Q\\E");
        boolean boolean22 = response12.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map23 = response12.headers();
        boolean boolean25 = response12.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            response6.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01069");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response8.body();
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
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01070");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 32);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "", (int) (byte) -1);
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01071");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response0.header("", "\\Qhi!\\E");
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
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01072");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01073");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.Connection.Response response7 = response0.removeCookie("hi!");
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.lang.String str14 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01074");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Method method15 = response10.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response10);
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str19 = response18.statusMessage();
        java.lang.String str21 = response18.header("\\Qhi!\\E");
        java.lang.String str22 = response18.charset();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01075");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01076");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response0.charset();
        java.lang.Class<?> wildcardClass5 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01077");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String str12 = pattern2.pattern();
        java.lang.CharSequence charSequence13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream14 = pattern2.splitAsStream(charSequence13);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01078");
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
        org.jsoup.Connection.Response response16 = response7.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response18 = response7.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        java.lang.String str22 = response19.getHeaderCaseInsensitive("");
        java.lang.String str24 = response19.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str25 = response19.charset();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.util.Map map27 = response26.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        org.jsoup.Connection.Method method29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response30 = response7.method(method29);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01079");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01080");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.util.Map map12 = response9.headers();
        java.util.Map.Entry entry14 = response9.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map15 = response9.cookies();
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(entry14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01081");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        int int17 = pattern2.flags();
        java.lang.String str18 = pattern2.pattern();
        java.lang.Class<?> wildcardClass19 = pattern2.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01082");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean8 = response0.hasCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.cookie("", "\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01083");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray15 = response0.bodyAsBytes();
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
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01084");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str11 = pattern2.pattern();
        java.util.regex.Matcher matcher13 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str14 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(matcher13);
        org.junit.Assert.assertEquals(matcher13.toString(), "java.util.regex.Matcher[pattern= region=0,71 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01085");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01086");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasHeader("\\Qhi!\\E");
        java.util.Map map12 = response0.cookies();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap13);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01087");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = null;
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response3 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01088");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        java.lang.String str4 = response1.charset();
        org.jsoup.Connection.Response response6 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map8 = response1.cookies();
        java.lang.String str9 = response1.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01089");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        java.util.Map.Entry entry10 = response1.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01090");
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
        java.util.Map.Entry entry15 = response13.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(entry15);
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01091");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response7.body();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01092");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 0);
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream(charSequence3);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01093");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.Connection.Method method10 = response7.method();
        java.lang.String str11 = response7.contentType();
        org.jsoup.Connection.Response response14 = response7.header("\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method17 = response16.method();
        java.lang.String str19 = response16.getHeaderCaseInsensitive("");
        java.lang.String str21 = response16.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str22 = response16.statusMessage();
        java.util.Map map23 = response16.headers();
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.util.Map.Entry entry26 = response15.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(entry26);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01094");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.getHeaderCaseInsensitive("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response11);
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01095");
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
        org.jsoup.Connection.Response response16 = response1.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01096");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str7 = response6.charset();
        java.util.Map map8 = response6.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01097");
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
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.Connection.Response response17 = null;
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection16, response17);
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
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01098");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        java.util.Map map5 = response3.cookies();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response3.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01099");
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
        java.lang.Class<?> wildcardClass16 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01100");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", (int) ' ');
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        int int6 = pattern2.flags();
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Q\\E" + "'", str7, "\\Q\\E");
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01101");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
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
        java.util.Map map27 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.String str30 = response0.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01102");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
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
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01103");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01104");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.contentType();
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
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01105");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01106");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass6 = response5.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01107");
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
        org.jsoup.Connection.Method method13 = response12.method();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response12.parse();
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
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01108");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.cookie("\\Qhi!\\E", "");
        org.jsoup.Connection.Response response11 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response14 = response0.cookie("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01109");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response17.cookie("", "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01110");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response17.bodyAsBytes();
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
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01111");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        java.util.stream.Stream<java.lang.String> strStream4 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int5 = pattern2.flags();
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 10);
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01112");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str12 = response10.header("");
        org.jsoup.Connection.Response response14 = response10.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01113");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 100);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01114");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
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
        java.util.Map map27 = response19.headers();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.lang.String str30 = response0.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection31 = null;
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method33 = response32.method();
        java.lang.String str34 = response32.statusMessage();
        java.lang.String str35 = response32.charset();
        org.jsoup.Connection.Response response37 = response32.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Method method39 = response32.method();
        org.jsoup.Connection.Method method40 = response32.method();
        java.util.Map map41 = response32.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection31, (org.jsoup.Connection.Response) response32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNull(method40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01115");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 2);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01116");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        int int7 = response0.statusCode();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01117");
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
        java.lang.Class<?> wildcardClass13 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01118");
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
        java.lang.String str14 = response12.charset();
        java.lang.Class<?> wildcardClass15 = response12.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01119");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Response response13 = response0.cookie("\\Qhi!\\E", "hi!");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders(strMap14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01120");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response10 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01121");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
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
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01122");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map.Entry entry11 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response13.header("", "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01123");
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
        java.lang.String str16 = response9.charset();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.URL uRL18 = response9.url();
        java.util.Map map19 = response9.headers();
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
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL18);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01124");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        boolean boolean9 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str11 = response0.cookie("\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01125");
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
        java.lang.String str13 = response7.header("\\Qhi!\\E");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response7.method(method14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01126");
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01127");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        int int11 = pattern2.flags();
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) '#');
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01128");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response8.header("", "\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01129");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01130");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map7 = response0.headers();
        java.lang.Class<?> wildcardClass8 = map7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01131");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.lang.String str9 = response6.contentType();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.Class<?> wildcardClass11 = response6.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01132");
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
        java.net.URL uRL14 = response11.url();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
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
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01133");
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
        java.util.Map map17 = response16.headers();
        boolean boolean19 = response16.hasCookie("hi!");
        java.lang.String str20 = response16.contentType();
        java.lang.String str21 = response16.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response16);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01134");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01135");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.Class<?> wildcardClass11 = response10.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01136");
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
        java.util.Map.Entry entry49 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL50 = response0.url();
        java.net.HttpURLConnection httpURLConnection51 = null;
        org.jsoup.helper.HttpConnection.Response response52 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response54 = response52.removeHeader("hi!");
        java.lang.String str55 = response52.contentType();
        java.net.URL uRL56 = response52.url();
        org.jsoup.helper.HttpConnection.Response response57 = new org.jsoup.helper.HttpConnection.Response(response52);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection51, (org.jsoup.Connection.Response) response57);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(entry49);
        org.junit.Assert.assertNull(uRL50);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(uRL56);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01137");
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
        org.jsoup.Connection.Response response14 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        int int15 = response0.statusCode();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01138");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        java.util.function.Predicate<java.lang.String> strPredicate17 = pattern2.asPredicate();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
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
        org.junit.Assert.assertNotNull(strPredicate17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01139");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method10 = response9.method();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01140");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.cookie("", "\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01141");
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
        java.net.URL uRL13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response11.url(uRL13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
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
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01142");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "");
        int int17 = pattern2.flags();
        java.lang.String str18 = pattern2.pattern();
        int int19 = pattern2.flags();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01143");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01144");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01145");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.stream.Stream<java.lang.String> strStream8 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\E");
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "hi!", (int) ' ');
        java.util.stream.Stream<java.lang.String> strStream13 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray15 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strStream8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strStream13);
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01146");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01147");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str18 = pattern2.pattern();
        java.lang.String str19 = pattern2.pattern();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01148");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01149");
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
        java.util.Map map16 = response6.headers();
        java.lang.Class<?> wildcardClass17 = map16.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01150");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean3 = response1.hasHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response5 = response1.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document6 = response1.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(response5);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01151");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response7.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01152");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response26 = response18.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response29 = response18.removeHeader("\\Q\\E");
        org.jsoup.Connection.Method method30 = response18.method();
        org.jsoup.Connection.Response response32 = response18.removeHeader("\\Qhi!\\E");
        java.util.Map map33 = response18.headers();
        response17.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray35 = response17.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNotNull(response26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01153");
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
        boolean boolean14 = response11.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass15 = response11.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01154");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry4 = response0.scanHeaders("");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response8 = response0.header("\\Qhi!\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.lang.String str17 = response11.getHeaderCaseInsensitive("");
        boolean boolean19 = response11.hasCookie("\\Qhi!\\E");
        java.util.Map map20 = response11.headers();
        java.lang.String str21 = response11.contentType();
        boolean boolean23 = response11.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map24 = response11.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.net.HttpURLConnection httpURLConnection26 = null;
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response29 = response27.removeHeader("hi!");
        java.lang.String str30 = response27.contentType();
        org.jsoup.Connection.Method method31 = response27.method();
        org.jsoup.Connection.Method method32 = response27.method();
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response33);
        java.lang.String str35 = response34.statusMessage();
        java.util.Map.Entry entry37 = response34.scanHeaders("\\Qhi!\\E");
        int int38 = response34.statusCode();
        java.lang.String str40 = response34.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map41 = response34.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection26, (org.jsoup.Connection.Response) response34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(entry4);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(method32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(entry37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01155");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        boolean boolean20 = response18.hasCookie("");
        org.jsoup.Connection.Method method21 = response18.method();
        org.jsoup.Connection.Response response23 = response18.removeCookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01156");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str5 = response4.statusMessage();
        org.jsoup.Connection.Response response7 = response4.removeCookie("\\Qhi!\\E");
        java.net.URL uRL8 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(uRL8);
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01157");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01158");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        org.jsoup.Connection.Response response10 = response1.removeCookie("hi!");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response11);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
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
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01159");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.contentType();
        boolean boolean12 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection13 = null;
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str22 = response21.statusMessage();
        java.lang.String str23 = response21.charset();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01160");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str6 = response1.statusMessage();
        boolean boolean8 = response1.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01161");
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
            org.jsoup.Connection.Response response18 = response8.header("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01162");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass5 = response4.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01163");
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
        org.jsoup.Connection.Response response16 = response14.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map17 = response14.headers();
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        java.lang.String str22 = response19.getHeaderCaseInsensitive("");
        int int23 = response19.statusCode();
        java.lang.String str24 = response19.charset();
        java.net.URL uRL25 = response19.url();
        java.lang.String str26 = response19.contentType();
        org.jsoup.Connection.Response response28 = response19.removeCookie("hi!");
        org.jsoup.Connection.Response response30 = response19.removeHeader("\\Qhi!\\E");
        int int31 = response19.statusCode();
        boolean boolean33 = response19.hasHeader("\\Qhi!\\E");
        java.lang.String str34 = response19.charset();
        java.lang.String str36 = response19.header("\\Qhi!\\E");
        int int37 = response19.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            response14.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response19);
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
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01164");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01165");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.net.URL uRL9 = response7.url();
        java.lang.String str10 = response7.statusMessage();
        java.lang.String str12 = response7.header("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response7.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response7.cookie("", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01166");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01167");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 100);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 128);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01168");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.cookie("\\Qhi!\\E", "");
        org.jsoup.Connection.Response response11 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str27 = response25.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response30 = response25.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response30);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01169");
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
        java.util.Map map15 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.Connection.Response response23 = response16.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.lang.String str26 = response16.cookie("\\Q\\E");
        java.lang.String str28 = response16.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map29 = response16.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        java.lang.String str32 = response8.cookie("");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01170");
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
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        org.jsoup.Connection.Method method21 = response16.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response22);
        java.lang.String str24 = response23.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.Connection.Response response28 = response23.header("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.util.Map map29 = response23.headers();
        java.lang.String str31 = response23.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response23);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response32);
        java.lang.String str34 = response33.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response33);
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01171");
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
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document12 = response11.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response7.body();
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
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01173");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        java.net.URL uRL7 = response1.url();
        java.lang.String str8 = response1.contentType();
        boolean boolean10 = response1.hasHeader("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map.Entry entry13 = response1.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(entry13);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01174");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        boolean boolean10 = response0.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
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
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01175");
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
        boolean boolean17 = response8.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response8.method(method18);
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
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01176");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray20 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass21 = pattern2.getClass();
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01177");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01178");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str2 = pattern1.pattern();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern1;
        java.lang.String[] strArray5 = pattern1.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate6 = pattern1.asPredicate();
        java.lang.CharSequence charSequence7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.stream.Stream<java.lang.String> strStream8 = pattern1.splitAsStream(charSequence7);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str2, "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strPredicate6);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01179");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern1;
        java.util.stream.Stream<java.lang.String> strStream4 = pattern1.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate5 = pattern1.asPredicate();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strStream4);
        org.junit.Assert.assertNotNull(strPredicate5);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01180");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        java.lang.String str10 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01181");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01182");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = response15.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
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
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01183");
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
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01184");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01185");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = response0.statusMessage();
        org.jsoup.Connection.Response response10 = response0.removeCookie("\\Q\\E");
        java.lang.String str12 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01186");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str10 = response9.contentType();
        org.jsoup.Connection.Method method11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.method(method11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01187");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.Connection.Method method15 = response9.method();
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.util.Map map17 = response16.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map17);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response19.removeHeader("hi!");
        java.lang.String str22 = response19.contentType();
        org.jsoup.Connection.Method method23 = response19.method();
        org.jsoup.Connection.Method method24 = response19.method();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.lang.String str27 = response25.statusMessage();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method29 = response28.method();
        java.lang.String str30 = response28.statusMessage();
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response28);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response34 = response32.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response35 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response37 = response35.removeHeader("hi!");
        java.lang.String str38 = response35.contentType();
        org.jsoup.Connection.Method method39 = response35.method();
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response35);
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response35);
        java.util.Map map42 = response35.headers();
        response32.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response25.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map42);
        boolean boolean48 = response1.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry50 = response1.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL51 = response1.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response52 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNotNull(response37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(method39);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(entry50);
        org.junit.Assert.assertNull(uRL51);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01188");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str20 = response17.getHeaderCaseInsensitive("");
        int int21 = response17.statusCode();
        java.util.Map.Entry entry23 = response17.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Method method25 = response24.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response24);
        java.util.Map map27 = response26.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        int int29 = response0.statusCode();
        java.lang.String str31 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass32 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01189");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = response0.body();
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
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01190");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01191");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01192");
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
        java.util.function.Predicate<java.lang.String> strPredicate22 = pattern2.asPredicate();
        int int23 = pattern2.flags();
        java.lang.String str24 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strPredicate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01193");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        org.jsoup.Connection.Response response4 = response0.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01194");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream11 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        int int13 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream15 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String str16 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01195");
        boolean boolean2 = java.util.regex.Pattern.matches("", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01196");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        java.util.Map map7 = response0.headers();
        java.lang.String str9 = response0.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.contentType();
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01197");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response6 = response0.removeCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str10 = response0.contentType();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01198");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response1.contentType();
        org.jsoup.Connection.Response response5 = response1.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.lang.String str7 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01199");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        java.lang.String str7 = response4.contentType();
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        boolean boolean12 = response4.hasCookie("");
        org.jsoup.Connection.Response response14 = response4.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.lang.String str17 = response15.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map18 = response15.headers();
        response3.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response3);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01200");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern1;
        java.lang.String str3 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01201");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
        java.lang.String str8 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.lang.String str16 = response11.charset();
        java.net.URL uRL17 = response11.url();
        java.lang.String str19 = response11.cookie("\\Q\\E");
        boolean boolean21 = response11.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map22 = response11.headers();
        org.jsoup.Connection.Response response24 = response11.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean26 = response11.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection10, (org.jsoup.Connection.Response) response11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRL17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01202");
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
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response18.method(method20);
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
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01203");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.function.Predicate<java.lang.String> strPredicate7 = pattern2.asPredicate();
        java.lang.String str8 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01204");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(uRL10);
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01205");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01206");
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
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray20 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate21 = pattern2.asPredicate();
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
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(strPredicate21);
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01207");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01208");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method6 = response5.method();
        java.util.Map.Entry entry8 = response5.scanHeaders("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response5);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response10 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01209");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        java.util.Map.Entry entry10 = response7.scanHeaders("hi!");
        java.lang.String str11 = response7.statusMessage();
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01210");
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
        java.lang.String str20 = pattern2.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01211");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL5 = response4.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response6 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01212");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        boolean boolean8 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map9 = response0.cookies();
        java.lang.Class<?> wildcardClass10 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01213");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01214");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01215");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Method method18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response8.method(method18);
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
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01216");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response7.url(uRL8);
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
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01217");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean6 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method25 = response24.method();
        java.lang.String str27 = response24.getHeaderCaseInsensitive("");
        int int28 = response24.statusCode();
        java.lang.String str30 = response24.getHeaderCaseInsensitive("");
        boolean boolean32 = response24.hasCookie("\\Qhi!\\E");
        java.util.Map map33 = response24.headers();
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNotNull(response20);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01218");
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
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str15 = response14.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
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
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01219");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01220");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response0.statusMessage();
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.Connection.Response response13 = null;
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection12, response13);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01221");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream7 = pattern2.splitAsStream((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strStream7);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01222");
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
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method14 = response13.method();
        java.lang.String str16 = response13.getHeaderCaseInsensitive("");
        int int17 = response13.statusCode();
        java.lang.String str18 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str22 = response20.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            response11.setupFromConnection(httpURLConnection12, (org.jsoup.Connection.Response) response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01223");
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
        org.jsoup.Connection.Method method15 = response14.method();
        org.jsoup.Connection.Response response18 = response14.cookie("\\Q\\Qhi!\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass19 = response18.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01224");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        org.jsoup.Connection.Method method12 = response7.method();
        org.jsoup.Connection.Method method13 = response7.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        boolean boolean16 = response7.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response19 = response7.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.util.Map map20 = response7.cookies();
        // The following exception was thrown during execution in test generation
        try {
            response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.util.List");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01225");
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
        java.lang.Class<?> wildcardClass13 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01226");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        org.jsoup.Connection.Response response13 = response0.cookie("\\Qhi!\\E", "hi!");
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01227");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL4 = response3.url();
        java.util.Map map5 = response3.cookies();
        java.lang.Class<?> wildcardClass6 = response3.getClass();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(uRL4);
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01228");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate14 = pattern2.asPredicate();
        java.lang.String str15 = pattern2.pattern();
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "hi!", (int) (byte) -1);
        java.util.regex.Matcher matcher20 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.String[] strArray22 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(matcher20);
        org.junit.Assert.assertEquals(matcher20.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01229");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01230");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean7 = response1.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01231");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01232");
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
        java.util.Map.Entry entry23 = response0.scanHeaders("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection24 = null;
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        java.lang.String str28 = response25.getHeaderCaseInsensitive("");
        int int29 = response25.statusCode();
        java.lang.String str31 = response25.getHeaderCaseInsensitive("");
        boolean boolean33 = response25.hasCookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection24, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(entry23);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01233");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response0.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
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
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01234");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str22 = response21.statusMessage();
        java.util.Map.Entry entry24 = response21.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL25 = response21.url();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str27 = response21.statusMessage();
        java.util.Map map28 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        java.util.Map.Entry entry31 = response0.scanHeaders("\\Qhi!\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(entry31);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01235");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01236");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        java.util.Map map3 = response1.cookies();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response4 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01237");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response6 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01238");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str18 = pattern2.pattern();
        java.lang.String str19 = pattern2.pattern();
        java.lang.String str20 = pattern2.pattern();
        java.lang.Class<?> wildcardClass21 = pattern2.getClass();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01239");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response10 = response0.cookie("hi!", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response0.url(uRL11);
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
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01240");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01241");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
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
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01242");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response5 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01243");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01244");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str7 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01245");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        int int10 = pattern2.flags();
        java.lang.Class<?> wildcardClass11 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01246");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response6.bodyAsBytes();
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
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01247");
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
        org.jsoup.Connection.Response response12 = response8.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01248");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response12.parse();
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01249");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", (int) (short) 100);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "", 2);
        java.util.stream.Stream<java.lang.String> strStream7 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\Qhi!\\E" + "'", str8, "\\Qhi!\\E");
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01250");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        java.lang.String str8 = response0.contentType();
        org.jsoup.Connection.Method method9 = response0.method();
        java.lang.String str10 = response0.contentType();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01251");
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
        org.jsoup.Connection.Response response13 = response7.cookie("hi!", "\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response13);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01252");
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
        int int63 = response7.statusCode();
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01253");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.String str10 = response0.charset();
        java.net.HttpURLConnection httpURLConnection11 = null;
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
        org.jsoup.Connection.Response response61 = response12.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection11, response61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
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
        org.junit.Assert.assertNotNull(response61);
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01254");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("hi!");
        java.util.Map map7 = response0.headers();
        java.lang.Class<?> wildcardClass8 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01255");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response0.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01256");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response30 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01257");
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
        boolean boolean18 = response7.hasHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response7.url(uRL19);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01258");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response0.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean6 = response0.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response8.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01259");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.statusMessage();
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01260");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream7 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.CharSequence charSequence8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = pattern2.split(charSequence8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strStream7);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01261");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        org.jsoup.Connection.Method method2 = response0.method();
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\E");
        java.lang.String str6 = response0.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response0.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01262");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Method method11 = response9.method();
        java.lang.String str12 = response9.statusMessage();
        java.lang.String str14 = response9.header("\\Qhi!\\E");
        java.util.Map map15 = response9.headers();
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
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01263");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean13 = response9.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        int int15 = response9.statusCode();
        org.jsoup.Connection.Response response18 = response9.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str19 = response9.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection8, (org.jsoup.Connection.Response) response9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01264");
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
        java.util.Map map18 = response8.cookies();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01265");
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
        java.util.stream.Stream<java.lang.String> strStream19 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(strStream19);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01266");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Method method4 = response1.method();
        java.lang.String str6 = response1.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean8 = response1.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response1.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response11 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01267");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        java.util.Map map10 = response0.cookies();
        java.util.Map.Entry entry12 = response0.scanHeaders("");
        java.lang.String str14 = response0.getHeaderCaseInsensitive("");
        java.lang.String str16 = response0.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method19 = response18.method();
        java.lang.String str21 = response18.getHeaderCaseInsensitive("");
        java.lang.String str23 = response18.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str24 = response18.charset();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response18);
        org.jsoup.Connection.Response response27 = response18.removeCookie("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection17, response27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01268");
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
            boolean boolean12 = response0.hasHeader("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Header name must not be empty");
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
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01269");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method10 = response9.method();
        java.lang.String str11 = response9.statusMessage();
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.util.Map map23 = response16.headers();
        response13.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response9.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map23);
        java.net.URL uRL27 = response8.url();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response28 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(uRL27);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01270");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 1);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "");
        java.util.regex.Matcher matcher6 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass7 = matcher6.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(matcher6);
        org.junit.Assert.assertEquals(matcher6.toString(), "java.util.regex.Matcher[pattern=\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E region=0,309 lastmatch=]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01271");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response7.contentType();
        java.lang.Class<?> wildcardClass9 = response7.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01272");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        java.lang.String str10 = response5.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01273");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Response response6 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document7 = response0.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01274");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 0);
        int int3 = pattern2.flags();
        java.lang.String str4 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str4, "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01275");
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
        java.lang.String str12 = response7.statusMessage();
        int int13 = response7.statusCode();
        org.jsoup.Connection.Response response15 = response7.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01276");
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
        java.lang.String str14 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01277");
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
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01278");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response9 = response7.removeHeader("hi!");
        java.lang.String str10 = response7.contentType();
        org.jsoup.Connection.Method method11 = response7.method();
        java.util.Map.Entry entry13 = response7.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str17 = response15.statusMessage();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response15);
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
        response15.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response14.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        response6.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map29);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response34 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(entry13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01279");
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
        java.util.Map map18 = response17.cookies();
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
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01280");
        java.util.regex.Pattern pattern2 = null; // flaky: java.util.regex.Pattern.compile("\\Q\\E", (int) (short) -1);
        java.lang.String[] strArray4 = null; // flaky: pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray6 = null; // flaky: pattern2.split((java.lang.CharSequence) "\\Q\\E");
        java.lang.String str7 = null; // flaky: pattern2.pattern();
        java.lang.CharSequence charSequence8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray9 = pattern2.split(charSequence8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(pattern2);
// flaky:         org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
// flaky:         org.junit.Assert.assertNotNull(strArray4);
// flaky:         org.junit.Assert.assertNotNull(strArray6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\\Q\\E" + "'", str7, "\\Q\\E");
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01281");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray21 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E", 128);
        java.lang.String str22 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01282");
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
        int int47 = response0.statusCode();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01283");
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
        java.lang.String str14 = response13.contentType();
        java.net.URL uRL15 = response13.url();
        org.jsoup.Connection.Method method16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response17 = response13.method(method16);
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01284");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.headers();
        boolean boolean9 = response0.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str13 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01285");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response6.parse();
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
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01286");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01287");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01288");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        java.util.Map.Entry entry7 = response1.scanHeaders("");
        java.lang.String str9 = response1.getHeaderCaseInsensitive("hi!");
        org.jsoup.Connection.Response response12 = response1.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str15 = response13.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean17 = response13.hasHeader("\\Qhi!\\E");
        java.lang.String str18 = response13.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response20 = org.jsoup.helper.HttpConnection.Response.execute(request0, response19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(entry7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01289");
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
        org.jsoup.Connection.Method method13 = response9.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = method13.getClass();
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
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01290");
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
        int int63 = response7.statusCode();
        org.jsoup.helper.HttpConnection.Response response64 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.Class<?> wildcardClass65 = response64.getClass();
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
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01291");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document14 = response7.parse();
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
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01292");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01293");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response4.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response8 = response4.url(uRL7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01294");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str16 = pattern2.pattern();
        java.lang.String[] strArray18 = pattern2.split((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.Class<?> wildcardClass20 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01295");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str6 = response4.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01296");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.util.regex.Matcher matcher12 = pattern2.matcher((java.lang.CharSequence) "hi!");
        java.lang.String str13 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(matcher10);
        org.junit.Assert.assertEquals(matcher10.toString(), "java.util.regex.Matcher[pattern= region=0,0 lastmatch=]");
        org.junit.Assert.assertNotNull(matcher12);
        org.junit.Assert.assertEquals(matcher12.toString(), "java.util.regex.Matcher[pattern= region=0,3 lastmatch=]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01297");
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
        java.lang.String str17 = response0.cookie("\\Qhi!\\E");
        java.net.URL uRL18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.url(uRL18);
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01298");
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
        org.jsoup.Connection.Response response16 = response0.cookie("\\Qhi!\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.cookie("", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01299");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        java.util.Map map7 = response1.cookies();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str11 = response1.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01300");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str19 = response8.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01301");
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
        java.net.HttpURLConnection httpURLConnection19 = null;
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response22 = response20.removeHeader("hi!");
        java.lang.String str23 = response20.contentType();
        org.jsoup.Connection.Method method24 = response20.method();
        org.jsoup.Connection.Method method25 = response20.method();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response26);
        org.jsoup.Connection.Method method30 = response26.method();
        org.jsoup.Connection.Response response32 = response26.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection19, (org.jsoup.Connection.Response) response26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNotNull(response32);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01302");
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
        boolean boolean16 = response8.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01303");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        boolean boolean17 = response9.hasCookie("");
        org.jsoup.Connection.Response response19 = response9.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.lang.String str22 = response20.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str24 = response20.getHeaderCaseInsensitive("hi!");
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response20);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
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
        int int39 = response27.statusCode();
        boolean boolean41 = response27.hasCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response(response27);
        java.util.Map map43 = response42.headers();
        response26.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        response8.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map43);
        java.net.HttpURLConnection httpURLConnection46 = null;
        org.jsoup.helper.HttpConnection.Response response47 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method48 = response47.method();
        java.lang.String str50 = response47.getHeaderCaseInsensitive("");
        java.lang.String str52 = response47.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response54 = response47.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response57 = response55.removeHeader("hi!");
        java.lang.String str58 = response55.contentType();
        org.jsoup.Connection.Method method59 = response55.method();
        org.jsoup.Connection.Method method60 = response55.method();
        org.jsoup.Connection.Method method61 = response55.method();
        org.jsoup.helper.HttpConnection.Response response62 = new org.jsoup.helper.HttpConnection.Response(response55);
        java.util.Map map63 = response62.headers();
        response47.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map63);
        org.jsoup.helper.HttpConnection.Response response65 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response67 = response65.removeHeader("hi!");
        java.lang.String str68 = response65.contentType();
        org.jsoup.Connection.Method method69 = response65.method();
        org.jsoup.Connection.Method method70 = response65.method();
        org.jsoup.helper.HttpConnection.Response response71 = new org.jsoup.helper.HttpConnection.Response(response65);
        org.jsoup.helper.HttpConnection.Response response72 = new org.jsoup.helper.HttpConnection.Response(response71);
        java.lang.String str73 = response71.statusMessage();
        org.jsoup.helper.HttpConnection.Response response74 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method75 = response74.method();
        java.lang.String str76 = response74.statusMessage();
        org.jsoup.helper.HttpConnection.Response response77 = new org.jsoup.helper.HttpConnection.Response(response74);
        org.jsoup.helper.HttpConnection.Response response78 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response80 = response78.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response81 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response83 = response81.removeHeader("hi!");
        java.lang.String str84 = response81.contentType();
        org.jsoup.Connection.Method method85 = response81.method();
        org.jsoup.helper.HttpConnection.Response response86 = new org.jsoup.helper.HttpConnection.Response(response81);
        org.jsoup.helper.HttpConnection.Response response87 = new org.jsoup.helper.HttpConnection.Response(response81);
        java.util.Map map88 = response81.headers();
        response78.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map88);
        response74.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map88);
        response71.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map88);
        response47.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map88);
        boolean boolean94 = response47.hasHeader("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str95 = response47.charset();
        org.jsoup.helper.HttpConnection.Response response96 = new org.jsoup.helper.HttpConnection.Response(response47);
        // The following exception was thrown during execution in test generation
        try {
            response8.setupFromConnection(httpURLConnection46, (org.jsoup.Connection.Response) response47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(method48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNotNull(response57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(method59);
        org.junit.Assert.assertNull(method60);
        org.junit.Assert.assertNull(method61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(response67);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertNull(method69);
        org.junit.Assert.assertNull(method70);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNull(method75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(response80);
        org.junit.Assert.assertNotNull(response83);
        org.junit.Assert.assertNull(str84);
        org.junit.Assert.assertNull(method85);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01304");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.Connection.Response response11 = response6.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = response12.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01305");
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
        java.util.Map map13 = response0.headers();
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
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01306");
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
        java.lang.String str18 = response7.contentType();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01307");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL5 = response4.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        java.util.Map.Entry entry8 = response4.scanHeaders("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response9 = org.jsoup.helper.HttpConnection.Response.execute(request0, response4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNull(entry8);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01308");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str6 = response1.charset();
        org.jsoup.Connection.Response response8 = response1.removeCookie("hi!");
        boolean boolean10 = response1.hasCookie("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response13 = response1.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map map14 = response1.headers();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response15 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01309");
        java.util.regex.Pattern pattern1 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate2 = pattern1.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate3 = pattern1.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream5 = pattern1.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str6 = pattern1.toString();
        org.junit.Assert.assertNotNull(pattern1);
        org.junit.Assert.assertEquals(pattern1.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strPredicate2);
        org.junit.Assert.assertNotNull(strPredicate3);
        org.junit.Assert.assertNotNull(strStream5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str6, "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01310");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
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
        java.util.Map map14 = response8.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map14);
        java.lang.String str16 = response0.statusMessage();
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(uRL12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01311");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01312");
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
        java.lang.String str37 = response11.statusMessage();
        java.lang.Class<?> wildcardClass38 = response11.getClass();
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
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01313");
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
        java.net.URL uRL15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response16 = response0.url(uRL15);
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
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01314");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01315");
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
        java.net.HttpURLConnection httpURLConnection18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response21 = response19.removeHeader("hi!");
        java.lang.String str22 = response19.contentType();
        org.jsoup.Connection.Method method23 = response19.method();
        org.jsoup.Connection.Method method24 = response19.method();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        org.jsoup.Connection.Method method28 = response25.method();
        java.lang.String str29 = response25.contentType();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection18, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(method24);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01316");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.cookie("", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNotNull(response4);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01317");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01318");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Method method10 = response1.method();
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
        org.junit.Assert.assertNull(method10);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01319");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) (short) 0);
        java.lang.String str3 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Qhi!\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Qhi!\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01320");
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
            byte[] byteArray21 = response16.bodyAsBytes();
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
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01321");
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
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray21 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.function.Predicate<java.lang.String> strPredicate22 = pattern2.asPredicate();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strPredicate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01322");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = response0.method();
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01323");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray16 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.stream.Stream<java.lang.String> strStream18 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String[] strArray21 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) '4');
        java.lang.Class<?> wildcardClass22 = strArray21.getClass();
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
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01324");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response7.statusMessage();
        java.lang.String str9 = response7.statusMessage();
        org.jsoup.Connection.Method method10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response11 = response7.method(method10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
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
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01325");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response2.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01326");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 2);
        java.lang.String str3 = pattern2.pattern();
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E", (int) 'a');
        java.util.function.Predicate<java.lang.String> strPredicate7 = pattern2.asPredicate();
        java.lang.String str8 = pattern2.pattern();
        java.lang.Class<?> wildcardClass9 = pattern2.getClass();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strPredicate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01327");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.charset();
        java.lang.String str13 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str17 = response15.statusMessage();
        java.lang.String str18 = response15.charset();
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response15);
        org.jsoup.Connection.Method method21 = response15.method();
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method21);
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01328");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        java.lang.String str9 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01329");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        int int4 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01330");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Response response7 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = response0.statusMessage();
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
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01331");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str9 = response0.statusMessage();
        java.net.HttpURLConnection httpURLConnection10 = null;
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.util.Map.Entry entry17 = response11.scanHeaders("\\Qhi!\\E");
        java.lang.String str18 = response11.contentType();
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(entry17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01332");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str6 = response5.charset();
        java.lang.String str8 = response5.getHeaderCaseInsensitive("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response5.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01333");
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
        int int14 = response9.statusCode();
        java.net.HttpURLConnection httpURLConnection15 = null;
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response18 = response16.removeHeader("hi!");
        java.lang.String str19 = response16.contentType();
        org.jsoup.Connection.Method method20 = response16.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response16);
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response16);
        java.net.URL uRL23 = response16.url();
        java.net.URL uRL24 = response16.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response27 = response25.removeHeader("hi!");
        java.lang.String str28 = response25.contentType();
        org.jsoup.Connection.Method method29 = response25.method();
        org.jsoup.Connection.Method method30 = response25.method();
        org.jsoup.Connection.Method method31 = response25.method();
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map33 = response32.headers();
        response16.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map33);
        java.lang.String str35 = response16.statusMessage();
        java.lang.String str37 = response16.cookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str38 = response16.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection15, (org.jsoup.Connection.Response) response16);
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
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(uRL23);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNotNull(response27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(method29);
        org.junit.Assert.assertNull(method30);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01334");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry8 = response6.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response10 = response6.removeHeader("\\Qhi!\\E");
        java.lang.String str11 = response6.contentType();
        java.lang.Class<?> wildcardClass12 = response6.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(entry8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01335");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        int int9 = response0.statusCode();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.Connection.Response response19 = response13.removeHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response13);
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01336");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str7 = response0.statusMessage();
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
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01337");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response7.hasCookie("");
        java.util.Map.Entry entry11 = response7.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(entry11);
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01338");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        java.util.function.Predicate<java.lang.String> strPredicate14 = pattern2.asPredicate();
        java.util.regex.Matcher matcher16 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(strPredicate14);
        org.junit.Assert.assertNotNull(matcher16);
        org.junit.Assert.assertEquals(matcher16.toString(), "java.util.regex.Matcher[pattern= region=0,13 lastmatch=]");
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01339");
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
        java.lang.Class<?> wildcardClass18 = response0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01340");
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
        org.jsoup.Connection.Response response19 = response2.cookie("hi!", "\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response2.method(method20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(entry9);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(response19);
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01341");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map10 = response9.headers();
        java.net.URL uRL11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response12 = response9.url(uRL11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01342");
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
        boolean boolean12 = response0.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str14 = response0.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document15 = response0.parse();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01343");
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
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method23 = response22.method();
        java.lang.String str25 = response22.getHeaderCaseInsensitive("");
        int int26 = response22.statusCode();
        java.lang.String str27 = response22.charset();
        org.jsoup.helper.HttpConnection.Response response28 = new org.jsoup.helper.HttpConnection.Response(response22);
        org.jsoup.Connection.Response response31 = response28.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response34 = response32.removeHeader("hi!");
        java.lang.String str35 = response32.contentType();
        org.jsoup.Connection.Method method36 = response32.method();
        org.jsoup.Connection.Method method37 = response32.method();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.helper.HttpConnection.Response response39 = new org.jsoup.helper.HttpConnection.Response(response38);
        java.lang.String str40 = response39.statusMessage();
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response39);
        boolean boolean43 = response39.hasCookie("\\Qhi!\\E");
        java.util.Map map44 = response39.cookies();
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map44);
        java.net.HttpURLConnection httpURLConnection47 = null;
        org.jsoup.helper.HttpConnection.Response response48 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method49 = response48.method();
        org.jsoup.helper.HttpConnection.Response response50 = new org.jsoup.helper.HttpConnection.Response(response48);
        java.util.Map.Entry entry52 = response48.scanHeaders("");
        java.util.Map map53 = response48.cookies();
        java.lang.String str54 = response48.statusMessage();
        org.jsoup.helper.HttpConnection.Response response55 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method56 = response55.method();
        java.lang.String str57 = response55.statusMessage();
        java.lang.String str58 = response55.charset();
        org.jsoup.Connection.Response response60 = response55.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response61 = new org.jsoup.helper.HttpConnection.Response(response55);
        java.util.Map.Entry entry63 = response61.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response66 = response61.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        java.util.Map map67 = response61.cookies();
        response48.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map67);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection47, (org.jsoup.Connection.Response) response48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(method23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(response31);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(method49);
        org.junit.Assert.assertNull(entry52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(method56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(response60);
        org.junit.Assert.assertNull(entry63);
        org.junit.Assert.assertNotNull(response66);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01344");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str13 = response11.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response11.method(method14);
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
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01345");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str8 = response0.cookie("\\Q\\E");
        java.util.Map map9 = response0.headers();
        java.lang.String str10 = response0.charset();
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
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01346");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str2 = response0.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection3 = null;
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response6 = response4.removeHeader("hi!");
        java.lang.String str7 = response4.contentType();
        org.jsoup.Connection.Method method8 = response4.method();
        org.jsoup.Connection.Method method9 = response4.method();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.Connection.Response response12 = response4.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response4);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response4);
        boolean boolean16 = response4.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection3, (org.jsoup.Connection.Response) response4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01347");
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
        java.lang.String str17 = response7.statusMessage();
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(uRL11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01348");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.contentType();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01349");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "", (int) (byte) 0);
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "hi!", 16);
        java.lang.String[] strArray17 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (-1));
        java.lang.String str18 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01350");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        java.util.Map.Entry entry6 = response0.scanHeaders("");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01351");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL8 = response0.url();
        java.net.HttpURLConnection httpURLConnection9 = null;
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method11 = response10.method();
        java.lang.String str13 = response10.getHeaderCaseInsensitive("");
        int int14 = response10.statusCode();
        java.lang.String str15 = response10.charset();
        java.net.URL uRL16 = response10.url();
        java.lang.String str18 = response10.cookie("\\Q\\E");
        boolean boolean20 = response10.hasCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map21 = response10.headers();
        boolean boolean23 = response10.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method25 = response24.method();
        org.jsoup.Connection.Method method26 = response24.method();
        org.jsoup.Connection.Method method27 = response24.method();
        java.util.Map map28 = response24.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection9, (org.jsoup.Connection.Response) response10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(uRL16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(method27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01352");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL8 = response1.url();
        java.net.URL uRL9 = response1.url();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response12 = response10.removeHeader("hi!");
        java.lang.String str13 = response10.contentType();
        org.jsoup.Connection.Method method14 = response10.method();
        org.jsoup.Connection.Method method15 = response10.method();
        org.jsoup.Connection.Method method16 = response10.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response10);
        java.util.Map map18 = response17.headers();
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map18);
        java.lang.String str20 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL22 = response1.url();
        java.lang.String str23 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response25 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01353");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.cookie("\\Qhi!\\E", "");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Q\\E");
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass14 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01354");
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
        org.jsoup.Connection.Response response20 = response14.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray21 = response14.bodyAsBytes();
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
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01355");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 0);
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String str4 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\\Q\\Q\\E\\\\E\\Q\\E" + "'", str4, "\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01356");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        java.lang.String str3 = response0.charset();
        org.jsoup.Connection.Response response5 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map7 = response0.cookies();
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
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01357");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.lang.String str8 = response6.statusMessage();
        java.lang.String str10 = response6.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int11 = response6.statusCode();
        java.util.Map map12 = response6.cookies();
        java.util.Map map13 = response6.headers();
        java.lang.String str15 = response6.cookie("");
        java.lang.String str16 = response6.statusMessage();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01358");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray7 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01359");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(uRL15);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01360");
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
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response13 = response11.removeHeader("hi!");
        java.lang.String str14 = response11.contentType();
        org.jsoup.Connection.Method method15 = response11.method();
        org.jsoup.Connection.Method method16 = response11.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response11);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str19 = response18.statusMessage();
        java.util.Map.Entry entry21 = response18.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL22 = response18.url();
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response18);
        java.util.Map map24 = response18.cookies();
        response10.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        java.lang.String str27 = response10.header("\\Q\\E");
        boolean boolean29 = response10.hasHeader("\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(entry21);
        org.junit.Assert.assertNull(uRL22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01361");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.net.URL uRL5 = response0.url();
        java.net.URL uRL6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response7 = response0.url(uRL6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01362");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = method8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01363");
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
        java.lang.String str15 = response0.statusMessage();
        java.net.HttpURLConnection httpURLConnection16 = null;
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method18 = response17.method();
        java.lang.String str19 = response17.statusMessage();
        java.lang.String str20 = response17.charset();
        org.jsoup.Connection.Response response22 = response17.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response17);
        java.lang.String str24 = response17.statusMessage();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response(response17);
        org.jsoup.Connection.Response response27 = response25.removeCookie("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection16, (org.jsoup.Connection.Response) response25);
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(response22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01364");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        boolean boolean7 = response0.hasCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
        boolean boolean10 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01365");
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
        java.util.Map map18 = response0.headers();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = response0.body();
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01366");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
        java.lang.Class<?> wildcardClass11 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01367");
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
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response17);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document19 = response17.parse();
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01368");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        boolean boolean6 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map map7 = response0.cookies();
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01369");
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
        java.lang.String str13 = response7.contentType();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response7.method(method14);
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01370");
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
        int int11 = response10.statusCode();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01371");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        boolean boolean10 = response7.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL11 = response7.url();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray12 = response7.bodyAsBytes();
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
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01372");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
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
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01373");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response4 = response0.removeCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean6 = response0.hasHeader("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method7 = response0.method();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray9 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNotNull(response4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01374");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.lang.Class<?> wildcardClass11 = response10.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01375");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL9 = response0.url();
        boolean boolean11 = response0.hasHeader("\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01376");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response9);
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
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01377");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        boolean boolean11 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response14 = response12.removeHeader("hi!");
        java.lang.String str15 = response12.contentType();
        org.jsoup.Connection.Method method16 = response12.method();
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Response response19 = response12.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response12);
        java.lang.String str23 = response21.header("");
        java.util.Map map24 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map24);
        org.jsoup.Connection.Response response27 = response0.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(response27);
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01378");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.Connection.Method method8 = response0.method();
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01379");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response6.hasCookie("");
        java.util.Map map9 = response6.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean12 = response10.hasHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        int int13 = response10.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray14 = response10.bodyAsBytes();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01380");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str9 = response1.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response1.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01381");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        java.net.URL uRL8 = response0.url();
        org.jsoup.Connection.Response response10 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str12 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response0.charset();
        org.jsoup.Connection.Response response15 = response0.removeCookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(uRL8);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01382");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response3.getHeaderCaseInsensitive("hi!");
        java.lang.String str7 = response3.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection8 = null;
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response11 = response9.removeHeader("hi!");
        java.lang.String str12 = response9.contentType();
        org.jsoup.Connection.Method method13 = response9.method();
        org.jsoup.Connection.Method method14 = response9.method();
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response(response9);
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response15);
        java.lang.String str17 = response16.statusMessage();
        java.lang.String str18 = response16.charset();
        org.jsoup.Connection.Response response20 = response16.removeHeader("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response3.setupFromConnection(httpURLConnection8, response20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(method14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(response20);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01383");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map8 = response1.headers();
        boolean boolean10 = response1.hasCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response1.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01384");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str4 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean6 = response0.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray8 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01385");
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
        java.lang.String str18 = response11.getHeaderCaseInsensitive("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response11.bodyAsBytes();
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
        org.junit.Assert.assertNull(entry15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01386");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\E", 100);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (int) (byte) 100);
        java.lang.String[] strArray7 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str8 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\E");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\\Q\\E" + "'", str8, "\\Q\\E");
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01387");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean7 = response0.hasCookie("");
        boolean boolean9 = response0.hasCookie("\\Qhi!\\E");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01388");
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
        java.lang.String str12 = response7.statusMessage();
        int int13 = response7.statusCode();
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01389");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 0);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "\\Qhi!\\E");
        java.lang.String str5 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E" + "'", str5, "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01390");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response9.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = response9.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01391");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream9 = pattern2.splitAsStream((java.lang.CharSequence) "");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.util.stream.Stream<java.lang.String> strStream12 = pattern2.splitAsStream((java.lang.CharSequence) "\\Qhi!\\E");
        java.util.function.Predicate<java.lang.String> strPredicate13 = pattern2.asPredicate();
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        java.lang.String[] strArray17 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", 4);
        int int18 = pattern2.flags();
        java.lang.String str19 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(strPredicate13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01392");
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
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01393");
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
        org.jsoup.Connection.Response response16 = response7.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response18 = response7.removeHeader("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method20 = response19.method();
        java.lang.String str22 = response19.getHeaderCaseInsensitive("");
        java.lang.String str24 = response19.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str25 = response19.charset();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.util.Map map27 = response26.headers();
        response7.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map27);
        java.net.HttpURLConnection httpURLConnection29 = null;
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method31 = response30.method();
        java.lang.String str33 = response30.getHeaderCaseInsensitive("");
        int int34 = response30.statusCode();
        java.util.Map.Entry entry36 = response30.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response30);
        java.lang.String str38 = response30.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            response7.setupFromConnection(httpURLConnection29, (org.jsoup.Connection.Response) response30);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(method31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNull(entry36);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01394");
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
        boolean boolean13 = response11.hasHeader("\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01395");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str10 = response0.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL11 = response0.url();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01396");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document30 = response0.parse();
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01397");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray10 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.toString();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01398");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean9 = response1.hasCookie("");
        org.jsoup.Connection.Response response11 = response1.removeCookie("");
        java.lang.String str12 = response1.charset();
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        boolean boolean15 = response13.hasCookie("\\Qhi!\\E");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01399");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        int int3 = pattern2.flags();
        java.util.regex.Matcher matcher5 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response.xmlContentTypeRxp = pattern2;
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
        org.junit.Assert.assertNotNull(matcher5);
        org.junit.Assert.assertEquals(matcher5.toString(), "java.util.regex.Matcher[pattern= region=0,150 lastmatch=]");
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01400");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean6 = response4.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method9 = response8.method();
        java.lang.String str10 = response8.statusMessage();
        java.lang.String str11 = response8.charset();
        org.jsoup.Connection.Response response13 = response8.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.util.Map.Entry entry16 = response14.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response14);
        boolean boolean19 = response14.hasCookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response4.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(entry16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01401");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01402");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        int int3 = response0.statusCode();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray5 = response0.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01403");
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
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response9);
        java.net.HttpURLConnection httpURLConnection12 = null;
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response15 = response13.removeHeader("hi!");
        java.lang.String str16 = response13.contentType();
        org.jsoup.Connection.Method method17 = response13.method();
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response13);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response13);
        boolean boolean21 = response13.hasCookie("");
        org.jsoup.Connection.Response response23 = response13.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response13);
        java.lang.String str26 = response24.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry28 = response24.scanHeaders("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response31 = response24.cookie("hi!", "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection12, response31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(response15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(entry28);
        org.junit.Assert.assertNotNull(response31);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01404");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Qhi!\\E", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01405");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01406");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.statusMessage();
        java.lang.String str8 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.Class<?> wildcardClass9 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01407");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response8 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map10 = response0.cookies();
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
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNotNull(map10);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01408");
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
            org.jsoup.nodes.Document document10 = response5.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
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
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01409");
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
        org.jsoup.Connection.Response response18 = response8.removeCookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str21 = response19.cookie("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response22 = org.jsoup.helper.HttpConnection.Response.execute(request0, response19);
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
        org.junit.Assert.assertNotNull(response18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01410");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response11 = response0.removeHeader("\\Qhi!\\E");
        org.jsoup.Connection.Response response14 = response0.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
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
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01411");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        java.lang.String str3 = response0.charset();
        java.lang.Class<?> wildcardClass4 = response0.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01412");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.cookie("\\Q\\E", "\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document10 = response6.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01413");
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
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01414");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01415");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response2.contentType();
        java.lang.String str5 = response2.cookie("");
        org.jsoup.Connection.Response response8 = response2.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response8);
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01416");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int10 = response9.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document11 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01417");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.Connection.Response response8 = response1.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method12 = response11.method();
        java.lang.String str14 = response11.getHeaderCaseInsensitive("");
        int int15 = response11.statusCode();
        java.lang.String str17 = response11.getHeaderCaseInsensitive("");
        boolean boolean19 = response11.hasCookie("\\Qhi!\\E");
        java.util.Map map20 = response11.headers();
        org.jsoup.Connection.Method method21 = response11.method();
        org.jsoup.helper.HttpConnection.Response response22 = new org.jsoup.helper.HttpConnection.Response(response11);
        int int23 = response22.statusCode();
        java.net.URL uRL24 = response22.url();
        org.jsoup.helper.HttpConnection.Response response25 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method26 = response25.method();
        java.lang.String str27 = response25.statusMessage();
        java.lang.String str28 = response25.charset();
        org.jsoup.helper.HttpConnection.Response response29 = new org.jsoup.helper.HttpConnection.Response(response25);
        java.util.Map map30 = response29.headers();
        response22.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        response1.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map30);
        org.jsoup.helper.HttpConnection.Response response33 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str34 = response33.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response35 = org.jsoup.helper.HttpConnection.Response.execute(request0, response33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(uRL24);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01418");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        org.jsoup.Connection.Response response10 = response7.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01419");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        java.lang.String str7 = pattern2.pattern();
        java.lang.String[] strArray10 = pattern2.split((java.lang.CharSequence) "\\Q\\E", (int) (byte) 10);
        java.lang.String str11 = pattern2.pattern();
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01420");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = response7.body();
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
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01421");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.regex.Matcher matcher10 = pattern2.matcher((java.lang.CharSequence) "");
        java.lang.String[] strArray12 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String[] strArray14 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01422");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        int int5 = response1.statusCode();
        java.lang.String str7 = response1.getHeaderCaseInsensitive("");
        java.lang.String str8 = response1.charset();
        java.lang.String str10 = response1.getHeaderCaseInsensitive("");
        java.lang.String str11 = response1.contentType();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
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
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01423");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str5 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        boolean boolean7 = response1.hasHeader("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map9 = response8.headers();
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response8);
        java.lang.String str11 = response10.charset();
        java.lang.String str13 = response10.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response15 = response10.removeCookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response16 = org.jsoup.helper.HttpConnection.Response.execute(request0, response10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01424");
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
        java.net.HttpURLConnection httpURLConnection14 = null;
        org.jsoup.helper.HttpConnection.Response response15 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method16 = response15.method();
        java.lang.String str18 = response15.getHeaderCaseInsensitive("");
        int int19 = response15.statusCode();
        java.lang.String str20 = response15.charset();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response15);
        int int22 = response15.statusCode();
        org.jsoup.Connection.Response response24 = response15.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str26 = response15.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response12.setupFromConnection(httpURLConnection14, (org.jsoup.Connection.Response) response15);
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
        org.junit.Assert.assertNull(method16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01425");
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
        java.net.HttpURLConnection httpURLConnection20 = null;
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response23 = response21.removeHeader("hi!");
        java.lang.String str24 = response21.contentType();
        org.jsoup.Connection.Method method25 = response21.method();
        org.jsoup.Connection.Method method26 = response21.method();
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response21);
        org.jsoup.Connection.Response response29 = response21.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str32 = response21.header("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection20, (org.jsoup.Connection.Response) response21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(response23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(method25);
        org.junit.Assert.assertNull(method26);
        org.junit.Assert.assertNotNull(response29);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01426");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        int int9 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream11 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.regex.Matcher matcher13 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 16 + "'", int7 == 16);
        org.junit.Assert.assertNotNull(strPredicate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(matcher13);
        org.junit.Assert.assertEquals(matcher13.toString(), "java.util.regex.Matcher[pattern= region=0,13 lastmatch=]");
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01427");
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
        java.lang.String str22 = response18.cookie("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01428");
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
        org.jsoup.Connection.Method method13 = response12.method();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response12.method(method14);
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
        org.junit.Assert.assertNull(method13);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01429");
        boolean boolean2 = java.util.regex.Pattern.matches("hi!", (java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01430");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str8 = response0.header("\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str10 = response0.getHeaderCaseInsensitive("\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01431");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response7 = response0.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str11 = response9.header("");
        java.util.Map map12 = response9.cookies();
        org.jsoup.Connection.Method method13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response14 = response9.method(method13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01432");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Q\\Qhi!\\E\\\\E\\Q\\E", 256);
        java.lang.String str3 = pattern2.pattern();
        java.util.regex.Matcher matcher5 = pattern2.matcher((java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.CharSequence charSequence6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray7 = pattern2.split(charSequence6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\Q\\Qhi!\\E\\\\E\\Q\\E" + "'", str3, "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(matcher5);
        org.junit.Assert.assertEquals(matcher5.toString(), "java.util.regex.Matcher[pattern=\\Q\\Qhi!\\E\\\\E\\Q\\E region=0,150 lastmatch=]");
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01433");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str2 = response0.statusMessage();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str4 = response0.charset();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(entry6);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01434");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("", 16);
        java.lang.String[] strArray4 = pattern2.split((java.lang.CharSequence) "hi!");
        java.lang.String[] strArray6 = pattern2.split((java.lang.CharSequence) "");
        int int7 = pattern2.flags();
        java.util.function.Predicate<java.lang.String> strPredicate8 = pattern2.asPredicate();
        java.util.stream.Stream<java.lang.String> strStream10 = pattern2.splitAsStream((java.lang.CharSequence) "");
        java.lang.String str11 = pattern2.pattern();
        java.lang.String str12 = pattern2.pattern();
        int int13 = pattern2.flags();
        java.util.stream.Stream<java.lang.String> strStream15 = pattern2.splitAsStream((java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str16 = pattern2.toString();
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
        org.junit.Assert.assertNotNull(strStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01435");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str5 = response0.cookie("\\Qhi!\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = response0.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01436");
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
            org.jsoup.Connection.Response response12 = response10.method(method11);
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
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01437");
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
        int int13 = response8.statusCode();
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01438");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean4 = response0.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray6 = response5.bodyAsBytes();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01439");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.util.Map map9 = response0.headers();
        org.jsoup.Connection.Method method10 = response0.method();
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
        int int12 = response11.statusCode();
        java.net.URL uRL13 = response11.url();
        org.jsoup.Connection.Method method14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response15 = response11.method(method14);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(uRL13);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01440");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map.Entry entry11 = response0.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str13 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(entry11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01441");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Method method3 = response0.method();
        java.lang.String str5 = response0.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean7 = response0.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str9 = response0.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
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
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response(response25);
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection13, (org.jsoup.Connection.Response) response25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(method3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01442");
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
        org.jsoup.Connection.Response response16 = response13.cookie("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray17 = response13.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01443");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.Connection.Response response21 = response18.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray22 = response18.bodyAsBytes();
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
        org.junit.Assert.assertNotNull(response21);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01444");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        org.jsoup.Connection.Method method8 = response6.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response6);
        java.util.Map map10 = response9.cookies();
        java.net.HttpURLConnection httpURLConnection11 = null;
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method13 = response12.method();
        java.lang.String str15 = response12.getHeaderCaseInsensitive("");
        int int16 = response12.statusCode();
        java.util.Map.Entry entry18 = response12.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response12);
        org.jsoup.Connection.Method method20 = response19.method();
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response19);
        org.jsoup.Connection.Response response24 = response19.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.lang.String str26 = response19.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response27 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method28 = response27.method();
        java.lang.String str30 = response27.getHeaderCaseInsensitive("");
        int int31 = response27.statusCode();
        java.util.Map.Entry entry33 = response27.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response34 = new org.jsoup.helper.HttpConnection.Response(response27);
        org.jsoup.Connection.Method method35 = response34.method();
        boolean boolean37 = response34.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map38 = response34.cookies();
        response19.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map38);
        org.jsoup.helper.HttpConnection.Response response40 = new org.jsoup.helper.HttpConnection.Response(response19);
        java.lang.String str42 = response40.getHeaderCaseInsensitive("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response9.setupFromConnection(httpURLConnection11, (org.jsoup.Connection.Response) response40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(method13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(entry18);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNotNull(response24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(method28);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNull(entry33);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01445");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str3 = response1.statusMessage();
        org.jsoup.helper.HttpConnection.Response response4 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.net.URL uRL5 = response4.url();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response4);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response7 = org.jsoup.helper.HttpConnection.Response.execute(request0, response6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(uRL5);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01446");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeCookie("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        boolean boolean5 = response1.hasHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response1);
        int int7 = response1.statusCode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response8 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01447");
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
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray19 = response18.bodyAsBytes();
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
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01448");
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
        java.lang.String str18 = response0.header("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.method(method19);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01449");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01450");
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
        org.jsoup.helper.HttpConnection.Response response23 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response24 = new org.jsoup.helper.HttpConnection.Response(response23);
        java.util.Map map25 = response24.cookies();
        java.lang.String str26 = response24.charset();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response27 = org.jsoup.helper.HttpConnection.Response.execute(request0, response24);
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
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01451");
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
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response18 = new org.jsoup.helper.HttpConnection.Response(response8);
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01452");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method7 = response6.method();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = response6.body();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before getting response body");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(method7);
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01453");
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
        java.net.URL uRL14 = response9.url();
        org.jsoup.Connection.Response response17 = response9.cookie("\\Qhi!\\E", "\\Q\\Q\\E\\\\E\\Q\\E");
        int int18 = response9.statusCode();
        java.lang.String str20 = response9.cookie("");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response21 = org.jsoup.helper.HttpConnection.Response.execute(request0, response9);
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
        org.junit.Assert.assertNull(uRL14);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01454");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL14);
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01455");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01456");
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
        java.lang.String str16 = response8.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01457");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01458");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response0.cookie("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response10 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL11 = response0.url();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNull(uRL11);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01459");
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
        org.jsoup.Connection.Method method17 = response0.method();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNotNull(response8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(method17);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01460");
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
        java.lang.String str14 = response0.statusMessage();
        org.jsoup.Connection.Response response16 = response0.removeHeader("\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response19 = response0.cookie("", "\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(response16);
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01461");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.contentType();
        org.jsoup.Connection.Response response9 = response0.removeCookie("hi!");
        org.jsoup.Connection.Response response12 = response0.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01462");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str7 = response1.statusMessage();
        java.util.Map map8 = response1.headers();
        org.jsoup.Connection.Response response11 = response1.header("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response12 = new org.jsoup.helper.HttpConnection.Response(response1);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response13 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(response11);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01463");
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
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response8);
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
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01464");
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
        java.lang.String str28 = response14.getHeaderCaseInsensitive("\\Q\\Q\\E\\\\E\\Q\\E");
        java.util.Map.Entry entry30 = response14.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response31 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response32 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response34 = response32.removeHeader("hi!");
        java.lang.String str35 = response32.contentType();
        org.jsoup.Connection.Method method36 = response32.method();
        org.jsoup.Connection.Method method37 = response32.method();
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Response response40 = response32.removeCookie("");
        org.jsoup.helper.HttpConnection.Response response41 = new org.jsoup.helper.HttpConnection.Response(response32);
        org.jsoup.Connection.Response response43 = response32.removeHeader("\\Q\\E");
        org.jsoup.Connection.Method method44 = response32.method();
        org.jsoup.Connection.Response response46 = response32.removeHeader("\\Qhi!\\E");
        java.util.Map map47 = response32.headers();
        response31.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map47);
        java.net.HttpURLConnection httpURLConnection50 = null;
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response53 = response51.removeHeader("hi!");
        java.lang.String str54 = response51.contentType();
        org.jsoup.Connection.Method method55 = response51.method();
        org.jsoup.Connection.Method method56 = response51.method();
        org.jsoup.helper.HttpConnection.Response response57 = new org.jsoup.helper.HttpConnection.Response(response51);
        org.jsoup.helper.HttpConnection.Response response58 = new org.jsoup.helper.HttpConnection.Response(response57);
        java.lang.String str59 = response58.statusMessage();
        java.util.Map.Entry entry61 = response58.scanHeaders("\\Qhi!\\E");
        int int62 = response58.statusCode();
        java.lang.String str64 = response58.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        boolean boolean66 = response58.hasCookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.lang.String str68 = response58.cookie("\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            response0.setupFromConnection(httpURLConnection50, (org.jsoup.Connection.Response) response58);
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
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNotNull(response19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(method21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(entry30);
        org.junit.Assert.assertNotNull(response34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(method36);
        org.junit.Assert.assertNull(method37);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(response43);
        org.junit.Assert.assertNull(method44);
        org.junit.Assert.assertNotNull(response46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(response53);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(method55);
        org.junit.Assert.assertNull(method56);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(entry61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(str68);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01465");
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
        boolean boolean15 = response8.hasCookie("");
        org.jsoup.helper.HttpConnection.Response response16 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response8);
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
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01466");
        java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("\\Qhi!\\E", 32);
        java.lang.String[] strArray5 = pattern2.split((java.lang.CharSequence) "", (int) (byte) -1);
        java.lang.String[] strArray8 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E", (int) (short) 100);
        java.lang.String[] strArray11 = pattern2.split((java.lang.CharSequence) "\\Q\\Q\\E\\\\E\\Q\\E", (int) '4');
        org.junit.Assert.assertNotNull(pattern2);
        org.junit.Assert.assertEquals(pattern2.toString(), "\\Qhi!\\E");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01467");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str5 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Response response9 = response6.header("\\Q\\Q\\E\\\\E\\Q\\E", "\\Qhi!\\E");
        java.lang.Class<?> wildcardClass10 = response6.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01468");
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
        java.lang.String str16 = response1.charset();
        java.util.Map.Entry entry18 = response1.scanHeaders("");
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
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(entry18);
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01469");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        boolean boolean8 = response0.hasCookie("\\Qhi!\\E");
        java.lang.String str9 = response0.contentType();
        int int10 = response0.statusCode();
        org.jsoup.Connection.Response response13 = response0.header("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response16 = response14.removeHeader("hi!");
        java.lang.String str17 = response14.contentType();
        org.jsoup.Connection.Method method18 = response14.method();
        org.jsoup.Connection.Method method19 = response14.method();
        org.jsoup.helper.HttpConnection.Response response20 = new org.jsoup.helper.HttpConnection.Response(response14);
        org.jsoup.helper.HttpConnection.Response response21 = new org.jsoup.helper.HttpConnection.Response(response20);
        java.lang.String str22 = response21.statusMessage();
        java.util.Map.Entry entry24 = response21.scanHeaders("\\Qhi!\\E");
        java.net.URL uRL25 = response21.url();
        org.jsoup.helper.HttpConnection.Response response26 = new org.jsoup.helper.HttpConnection.Response(response21);
        java.lang.String str27 = response21.statusMessage();
        java.util.Map map28 = response21.cookies();
        response0.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map28);
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.Class<?> wildcardClass31 = response0.getClass();
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNotNull(response16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(method18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(entry24);
        org.junit.Assert.assertNull(uRL25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01470");
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
        org.jsoup.Connection.Method method19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response20 = response0.method(method19);
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
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01471");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        boolean boolean8 = response1.hasCookie("");
        int int9 = response1.statusCode();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01472");
        org.jsoup.helper.HttpConnection.Response response0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str3 = response2.contentType();
        org.jsoup.Connection.Response response6 = response2.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.HttpURLConnection httpURLConnection7 = null;
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response10 = response8.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Method method11 = response8.method();
        java.lang.String str13 = response8.header("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response8);
        // The following exception was thrown during execution in test generation
        try {
            response2.setupFromConnection(httpURLConnection7, (org.jsoup.Connection.Response) response8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(method11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01473");
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
        java.net.HttpURLConnection httpURLConnection17 = null;
        org.jsoup.helper.HttpConnection.Response response18 = null;
        org.jsoup.helper.HttpConnection.Response response19 = new org.jsoup.helper.HttpConnection.Response(response18);
        // The following exception was thrown during execution in test generation
        try {
            response13.setupFromConnection(httpURLConnection17, (org.jsoup.Connection.Response) response19);
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
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(method16);
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01474");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeCookie("\\Qhi!\\E");
        org.jsoup.Connection.Response response4 = response0.removeHeader("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.net.URL uRL5 = response0.url();
        org.jsoup.Connection.Response response7 = response0.removeCookie("\\Q\\E");
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
        org.junit.Assert.assertNull(uRL5);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01475");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.lang.String str6 = response0.getHeaderCaseInsensitive("");
        java.lang.String str7 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("\\Q\\Qhi!\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response11 = new org.jsoup.helper.HttpConnection.Response(response0);
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
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(entry10);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01476");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.url(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01477");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response3 = response1.removeHeader("hi!");
        java.lang.String str4 = response1.contentType();
        org.jsoup.Connection.Method method5 = response1.method();
        org.jsoup.Connection.Method method6 = response1.method();
        org.jsoup.Connection.Method method7 = response1.method();
        org.jsoup.Connection.Response response10 = response1.cookie("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\E");
        java.util.Map.Entry entry12 = response1.scanHeaders("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response13 = new org.jsoup.helper.HttpConnection.Response(response1);
        org.jsoup.helper.HttpConnection.Response response14 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str16 = response14.header("\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response17 = org.jsoup.helper.HttpConnection.Response.execute(request0, response14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(response3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertNotNull(response10);
        org.junit.Assert.assertNull(entry12);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01478");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        java.lang.String str6 = response0.charset();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map map8 = response7.headers();
        java.lang.String str9 = response7.charset();
        boolean boolean11 = response7.hasCookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.Connection.Method method12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response13 = response7.method(method12);
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01479");
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
        java.util.Map.Entry entry18 = response8.scanHeaders("\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response21 = response8.cookie("", "\\Q\\Q\\E\\\\E\\Q\\E");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Cookie name must not be empty");
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
        org.junit.Assert.assertNull(entry18);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01480");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        int int5 = response0.statusCode();
        org.jsoup.Connection.Response response7 = response0.removeHeader("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(response7);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01481");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean8 = response0.hasCookie("");
        java.lang.String str10 = response0.cookie("\\Qhi!\\E");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01482");
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
        boolean boolean18 = response15.hasCookie("\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(response14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01483");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL1 = response0.url();
        org.jsoup.helper.HttpConnection.Response response2 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.lang.String str5 = response0.header("hi!");
        java.net.URL uRL6 = response0.url();
        java.lang.String str7 = response0.charset();
        java.net.URL uRL8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response9 = response0.url(uRL8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(uRL6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01484");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        java.lang.String str1 = response0.contentType();
        int int2 = response0.statusCode();
        java.lang.String str3 = response0.statusMessage();
        org.jsoup.Connection.Method method4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response5 = response0.method(method4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Method must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01485");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method2 = response1.method();
        java.lang.String str4 = response1.getHeaderCaseInsensitive("");
        java.lang.String str6 = response1.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response8 = response1.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.util.Map map10 = response9.headers();
        org.jsoup.Connection.Method method11 = response9.method();
        java.lang.String str12 = response9.statusMessage();
        java.lang.String str14 = response9.header("\\Qhi!\\E");
        java.lang.String str16 = response9.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.jsoup.helper.HttpConnection.Response response17 = new org.jsoup.helper.HttpConnection.Response(response9);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response18 = org.jsoup.helper.HttpConnection.Response.execute(request0, response17);
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
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01486");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        java.lang.String str5 = response0.getHeaderCaseInsensitive("\\Qhi!\\E");
        org.jsoup.Connection.Response response7 = response0.removeHeader("hi!");
        org.jsoup.helper.HttpConnection.Response response8 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.util.Map.Entry entry10 = response0.scanHeaders("");
        java.lang.String str11 = response0.statusMessage();
        java.lang.String str12 = response0.statusMessage();
        java.util.Map map13 = response0.cookies();
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
        org.junit.Assert.assertNotNull(response7);
        org.junit.Assert.assertNull(entry10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01487");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response6);
        boolean boolean9 = response7.hasCookie("");
        org.jsoup.Connection.Method method10 = response7.method();
        org.jsoup.Connection.Response response12 = response7.removeCookie("hi!");
        java.lang.Class<?> wildcardClass13 = response12.getClass();
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(method10);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01488");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.Connection.Method method5 = response0.method();
        org.jsoup.Connection.Method method6 = response0.method();
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        boolean boolean9 = response0.hasHeader("\\Q\\E");
        org.jsoup.Connection.Response response12 = response0.cookie("\\Q\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "hi!");
        java.util.Map map13 = response0.cookies();
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
        boolean boolean26 = response22.hasCookie("\\Qhi!\\E");
        java.util.Map map27 = response22.cookies();
        org.jsoup.Connection.Response response30 = response22.cookie("\\Q\\E", "\\Qhi!\\E");
        java.lang.String str32 = response22.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
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
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(response12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(response17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(method19);
        org.junit.Assert.assertNull(method20);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(response30);
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01489");
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
        org.jsoup.Connection.Response response16 = response0.header("\\Q\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = response0.body();
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
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01490");
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
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response12 = org.jsoup.helper.HttpConnection.Response.execute(request0, response11);
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
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01491");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(method15);
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01492");
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
        java.lang.String str29 = response28.contentType();
        org.jsoup.helper.HttpConnection.Response response30 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response32 = response30.removeHeader("hi!");
        java.lang.String str33 = response30.contentType();
        org.jsoup.Connection.Method method34 = response30.method();
        org.jsoup.Connection.Method method35 = response30.method();
        org.jsoup.helper.HttpConnection.Response response36 = new org.jsoup.helper.HttpConnection.Response(response30);
        org.jsoup.helper.HttpConnection.Response response37 = new org.jsoup.helper.HttpConnection.Response(response36);
        org.jsoup.helper.HttpConnection.Response response38 = new org.jsoup.helper.HttpConnection.Response(response36);
        org.jsoup.Connection.Response response40 = response38.removeHeader("hi!");
        java.util.Map map41 = response38.headers();
        org.jsoup.helper.HttpConnection.Response response42 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method43 = response42.method();
        java.lang.String str45 = response42.getHeaderCaseInsensitive("");
        int int46 = response42.statusCode();
        java.util.Map.Entry entry48 = response42.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response49 = new org.jsoup.helper.HttpConnection.Response(response42);
        org.jsoup.Connection.Method method50 = response49.method();
        org.jsoup.helper.HttpConnection.Response response51 = new org.jsoup.helper.HttpConnection.Response(response49);
        org.jsoup.Connection.Response response54 = response49.cookie("\\Q\\E", "\\Q\\Qhi!\\E\\\\E\\Q\\E");
        java.util.Map map55 = response49.cookies();
        java.util.Map map56 = response49.headers();
        response38.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        response28.processResponseHeaders((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) map56);
        // The following exception was thrown during execution in test generation
        try {
            byte[] byteArray59 = response28.bodyAsBytes();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(response32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(method34);
        org.junit.Assert.assertNull(method35);
        org.junit.Assert.assertNotNull(response40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(method43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNull(entry48);
        org.junit.Assert.assertNull(method50);
        org.junit.Assert.assertNotNull(response54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01493");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Method method1 = response0.method();
        java.lang.String str3 = response0.getHeaderCaseInsensitive("");
        int int4 = response0.statusCode();
        java.util.Map.Entry entry6 = response0.scanHeaders("\\Qhi!\\E");
        org.jsoup.helper.HttpConnection.Response response7 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.Connection.Method method8 = response7.method();
        org.jsoup.helper.HttpConnection.Response response9 = new org.jsoup.helper.HttpConnection.Response(response7);
        java.util.Map map10 = response9.cookies();
        boolean boolean12 = response9.hasCookie("");
        java.net.URL uRL13 = response9.url();
        org.jsoup.Connection.Response response15 = response9.removeHeader("\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Document document16 = response9.parse();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must be executed (with .execute(), .get(), or .post() before parsing response");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(entry6);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(uRL13);
        org.junit.Assert.assertNotNull(response15);
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01494");
        org.jsoup.helper.HttpConnection.Response response0 = new org.jsoup.helper.HttpConnection.Response();
        org.jsoup.Connection.Response response2 = response0.removeHeader("hi!");
        java.lang.String str3 = response0.contentType();
        org.jsoup.Connection.Method method4 = response0.method();
        org.jsoup.helper.HttpConnection.Response response5 = new org.jsoup.helper.HttpConnection.Response(response0);
        org.jsoup.helper.HttpConnection.Response response6 = new org.jsoup.helper.HttpConnection.Response(response0);
        java.net.URL uRL7 = response0.url();
        org.jsoup.Connection.Method method8 = response0.method();
        org.jsoup.Connection.Response response10 = response0.removeHeader("hi!");
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
        org.junit.Assert.assertNull(uRL7);
        org.junit.Assert.assertNull(method8);
        org.junit.Assert.assertNotNull(response10);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01495");
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
        boolean boolean20 = response2.hasCookie("\\Q\\E");
        org.jsoup.Connection.Response response23 = response2.header("\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E", "\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        java.net.URL uRL24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.Connection.Response response25 = response2.url(uRL24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: URL must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(method1);
        org.junit.Assert.assertNotNull(response5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(method7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(response13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(response23);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01496");
        org.jsoup.Connection.Request request0 = null;
        org.jsoup.helper.HttpConnection.Response response1 = new org.jsoup.helper.HttpConnection.Response();
        java.net.URL uRL2 = response1.url();
        org.jsoup.helper.HttpConnection.Response response3 = new org.jsoup.helper.HttpConnection.Response(response1);
        java.lang.String str4 = response1.statusMessage();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response5 = org.jsoup.helper.HttpConnection.Response.execute(request0, response1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Request must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(uRL2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01497");
        boolean boolean2 = java.util.regex.Pattern.matches("\\Q\\Qhi!\\E\\\\E\\Q\\E", (java.lang.CharSequence) "\\Q\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01498");
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
        org.jsoup.Connection.Response response14 = response10.header("\\Qhi!\\E", "\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        org.junit.Assert.assertNotNull(response2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNull(method5);
        org.junit.Assert.assertNull(method6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(uRL9);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(response14);
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01499");
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
        java.lang.String str28 = response7.cookie("\\Q\\Q\\Q\\Qhi!\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\Q\\E\\\\E\\Q\\\\E\\\\E\\Q\\Q\\E\\\\E\\Q\\E");
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.helper.HttpConnection.Response response29 = org.jsoup.helper.HttpConnection.Response.execute(request0, response7);
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
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01500");
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
        org.jsoup.Connection.Method method15 = response8.method();
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
        org.junit.Assert.assertNull(method15);
    }
}
