import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.Class<?> wildcardClass7 = headerList3.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections2 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder1.serializedObjectSupporter;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null;
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.Object[] objArray6 = requestBuilder3.args;
        requestBuilder3.setapiUrl("");
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder3.headers = headerList12;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null; // flaky: requestBuilder3.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput2 = requestBuilder1.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList2 = null; // flaky: requestBuilder1.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(headerList2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections3 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str3 = null; // flaky: requestBuilder2.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder1.args = objArray9;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request11 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 10, 4]");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         requestBuilder4.setapiUrl("http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.converter;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.lang.Class<?> wildcardClass6 = requestBuilder5.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder5.args;
// flaky:         requestBuilder2.setargs(objArray6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[pong, kat, raff]");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.String str8 = null; // flaky: requestBuilder7.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/foo/bar/pong/" + "'", str8, "/foo/bar/pong/");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = null; // flaky: requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter3);
        retrofit.RequestBuilder requestBuilder7 = requestBuilder5.apiUrl("");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray2 = null; // flaky: requestBuilder1.args;
        java.lang.String str3 = null; // flaky: requestBuilder1.getapiUrl();
        java.lang.Class<?> wildcardClass4 = null; // flaky: requestBuilder1.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(objArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[kat]");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder6.apiUrl = "http://example.com";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         requestBuilder7.apiUrl = "";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = requestBuilder4.apiUrl("");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         requestBuilder5.apiUrl = "http://example.com";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.Class<?> wildcardClass7 = requestBuilder6.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput14);
        requestBuilder1.headers = headerList10;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = requestBuilder1.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request18 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder5.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder5.setapiUrl("http://example.com/");
        retrofit.mime.TypedOutput typedOutput8 = null; // flaky: requestBuilder5.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        requestBuilder5.setapiUrl("http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.lang.String str15 = request10.getMethod();
        java.lang.String str16 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.Object[] objArray9 = requestBuilder8.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null;
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.Object[] objArray6 = requestBuilder3.args;
        requestBuilder3.setapiUrl("");
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder3.headers = headerList12;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList12, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         requestBuilder6.setapiUrl("http://example.com/");
        java.lang.String str9 = null; // flaky: requestBuilder6.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.lang.String str6 = null; // flaky: requestBuilder5.buildRelativeUrl();
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.getHeaders();
        java.lang.String str15 = request13.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request13.getHeaders();
// flaky:         requestBuilder5.headers = headerList16;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/" + "'", str6, "/foo/bar/");
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray4);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.getHeaders();
        java.lang.String str13 = request11.getMethod();
        java.util.List<retrofit.client.Header> headerList14 = request11.getHeaders();
// flaky:         requestBuilder4.headers = headerList14;
        retrofit.mime.TypedOutput typedOutput16 = null; // flaky: requestBuilder4.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray9 = null; // flaky: requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder10 = null; // flaky: requestBuilder5.args(objArray9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder1.headers;
        java.lang.String str6 = null; // flaky: requestBuilder1.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null;
        requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Object[] objArray10 = requestBuilder7.args;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        requestBuilder7.headers = headerList16;
// flaky:         requestBuilder5.headers = headerList16;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput14);
        requestBuilder1.headers = headerList10;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = requestBuilder1.serializedObjectSupporter;
        java.lang.String str18 = requestBuilder1.getapiUrl();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.Object[] objArray8 = null; // flaky: requestBuilder7.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[pong?, kat?]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[pong?, kat?]");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.lang.Object[] objArray4 = null;
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.args(objArray4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.client.Request request6 = null; // flaky: requestBuilder5.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = null; // flaky: requestBuilder2.converter;
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = null;
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.Object[] objArray8 = requestBuilder5.args;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput18);
        requestBuilder5.headers = headerList14;
// flaky:         requestBuilder2.setheaders((java.util.List<retrofit.client.Header>) headerList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        requestBuilder1.headers = headerList10;
        retrofit.converter.Converter converter15 = requestBuilder1.getconverter();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString1();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.client.Request request5 = null; // flaky: requestBuilder4.build();
        java.lang.String str6 = null; // flaky: request5.getMethod();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(request5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GET" + "'", str6, "GET");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.converter;
        retrofit.client.Header[] headerArray5 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList6 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList6, headerArray5);
// flaky:         requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList6, typedOutput9);
        java.lang.String str11 = request10.getUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(headerArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder1.serializedObjectSupporter;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList7 = serializedObjectSupporter4.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder13();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.getHeaders();
        java.lang.String str17 = request15.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request15.getHeaders();
// flaky:         requestBuilder8.headers = headerList18;
        requestBuilder3.headers = headerList18;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null;
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.Object[] objArray6 = requestBuilder3.args;
        requestBuilder3.setapiUrl("");
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder3.headers = headerList12;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList12, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typedOutput19);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.setapiUrl("GET");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.lang.String str5 = null; // flaky: requestBuilder4.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.getconverter();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder1.args = objArray9;
        retrofit.converter.Converter converter11 = requestBuilder1.converter;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 10, 4]");
        org.junit.Assert.assertNull(converter11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = null;
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.Object[] objArray8 = requestBuilder5.args;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput18);
        requestBuilder5.headers = headerList14;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "/foo/bar/", (java.util.List<retrofit.client.Header>) headerList14, typedOutput21);
        requestBuilder1.headers = headerList14;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder5.buildBody();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Body must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null; // flaky: requestBuilder10.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str6 = requestBuilder5.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.Object[] objArray6 = requestBuilder5.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        requestBuilder13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.Object[] objArray16 = requestBuilder13.args;
        requestBuilder13.setapiUrl("");
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        requestBuilder13.headers = headerList22;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput29);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         requestBuilder3.apiUrl = "/foo/bar/";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.getargs();
        java.lang.String str4 = null; // flaky: requestBuilder2.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter9();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter6.deserializeObjectConverter10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections12 = serializedObjectSupporter6.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Body must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request2 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter2.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter2.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList9 = null; // flaky: requestBuilder8.headers;
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("/foo/bar/", "hi!", headerList9, typedOutput10);
        retrofit.mime.TypedOutput typedOutput12 = request11.getBody();
        retrofit.mime.TypedOutput typedOutput13 = request11.getBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNull(typedOutput13);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.Object[] objArray5 = null; // flaky: requestBuilder4.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[pong&, kat&]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[pong&, kat&]");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList13 = null; // flaky: requestBuilder12.headers;
        requestBuilder8.setheaders(headerList13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder1.apiUrl("/foo/bar/pong/");
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.Class<?> wildcardClass8 = requestBuilder7.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.Class<?> wildcardClass6 = null; // flaky: requestBuilder5.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.getconverter();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder6.converter;
// flaky:         requestBuilder6.apiUrl = "";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.Converter converter6 = requestBuilder5.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter4.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray14 = null; // flaky: requestBuilder13.args;
        retrofit.RequestBuilder requestBuilder15 = null; // flaky: requestBuilder10.args(objArray14);
// flaky:         requestBuilder3.setargs(objArray14);
        java.lang.String str17 = null; // flaky: requestBuilder3.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com" + "'", str17, "http://example.com");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null; // flaky: requestBuilder6.serializedObjectSupporter;
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str8 = null; // flaky: requestBuilder7.getapiUrl();
        retrofit.converter.Converter converter9 = null; // flaky: requestBuilder7.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str6 = requestBuilder5.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
        java.lang.String str5 = null; // flaky: requestBuilder1.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/foo/bar/" + "'", str5, "/foo/bar/");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.headers;
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder4.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray9 = null; // flaky: requestBuilder8.args;
// flaky:         requestBuilder4.args = objArray9;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[kat]");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.lang.String str7 = null; // flaky: requestBuilder6.apiUrl;
        retrofit.client.Request request8 = null; // flaky: requestBuilder6.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(request8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder1.apiUrl("/foo/bar/pong/");
        java.lang.String str8 = null; // flaky: requestBuilder1.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/foo/bar/pong/" + "'", str8, "/foo/bar/pong/");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.String str5 = null; // flaky: requestBuilder4.apiUrl;
        java.lang.String str6 = null; // flaky: requestBuilder4.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = null;
        requestBuilder14.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.Object[] objArray17 = requestBuilder14.args;
        requestBuilder14.setapiUrl("");
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder14.headers = headerList23;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput30);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter13 = null; // flaky: requestBuilder12.converter;
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
// flaky:         requestBuilder12.setheaders((java.util.List<retrofit.client.Header>) headerList15);
// flaky:         requestBuilder10.setheaders((java.util.List<retrofit.client.Header>) headerList15);
// flaky:         requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.mime.TypedOutput typedOutput4 = null; // flaky: requestBuilder1.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNull(typedOutput4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        java.lang.Object[] objArray9 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder1.args = objArray9;
        java.util.List<retrofit.client.Header> headerList11 = requestBuilder1.headers;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[100.0, 10, 4]");
        org.junit.Assert.assertNull(headerList11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = null; // flaky: requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter3);
        java.lang.Object[] objArray6 = requestBuilder5.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNull(objArray6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter7 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = requestBuilder1.serializedObjectSupporter;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList7 = null;
// flaky:         requestBuilder6.headers = headerList7;
// flaky:         requestBuilder6.apiUrl = "";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder4.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[kat]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         requestBuilder4.apiUrl = "GET";
// flaky:         requestBuilder4.setapiUrl("http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter9();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.Converter converter10 = null; // flaky: requestBuilder5.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList6 = serializedObjectSupporter3.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter3.deserializeObjectRequestBuilder13();
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.String str16 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
// flaky:         requestBuilder7.headers = headerList17;
// flaky:         requestBuilder2.setheaders(headerList17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.args;
        java.util.List<retrofit.client.Header> headerList4 = null; // flaky: requestBuilder2.getheaders();
        java.lang.Class<?> wildcardClass5 = null; // flaky: headerList4.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(headerList4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.String str16 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        retrofit.RequestBuilder requestBuilder18 = requestBuilder7.headers(headerList17);
        java.lang.String str19 = requestBuilder7.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray8 = null; // flaky: requestBuilder7.getargs();
// flaky:         requestBuilder7.setapiUrl("");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.mime.TypedOutput typedOutput3 = null; // flaky: requestBuilder2.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(typedOutput3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        retrofit.converter.Converter converter10 = requestBuilder6.getconverter();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder6.args = objArray14;
        retrofit.RequestBuilder requestBuilder16 = null; // flaky: requestBuilder4.args(objArray14);
        java.lang.String str17 = null; // flaky: requestBuilder16.apiUrl;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = null; // flaky: requestBuilder16.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://example.com" + "'", str17, "http://example.com");
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter11 = null; // flaky: requestBuilder10.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(converter11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder5.setapiUrl("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder4();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList19 = serializedObjectSupporter16.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter16.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter21 = null;
        retrofit.RequestBuilder requestBuilder22 = new retrofit.RequestBuilder(converter21);
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = null;
        requestBuilder22.serializedObjectSupporter = serializedObjectSupporter23;
        java.lang.Object[] objArray25 = requestBuilder22.args;
        retrofit.converter.Converter converter26 = requestBuilder22.getconverter();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder22.args = objArray30;
        retrofit.RequestBuilder requestBuilder32 = null; // flaky: requestBuilder20.args(objArray30);
// flaky:         requestBuilder15.args = objArray30;
// flaky:         requestBuilder5.setargs(objArray30);
        retrofit.RequestBuilder requestBuilder36 = null; // flaky: requestBuilder5.apiUrl("");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(arrayList19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertNull(converter26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null;
        requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Object[] objArray10 = requestBuilder7.args;
        retrofit.converter.Converter converter11 = requestBuilder7.getconverter();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder7.args = objArray15;
        retrofit.RequestBuilder requestBuilder17 = requestBuilder5.args(objArray15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = requestBuilder17.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput16);
        retrofit.RequestBuilder requestBuilder18 = null; // flaky: requestBuilder6.headers((java.util.List<retrofit.client.Header>) headerList12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder9.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[pong]");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.client.Request request7 = requestBuilder6.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(request7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray9 = null; // flaky: requestBuilder8.args;
// flaky:         requestBuilder4.args = objArray9;
        java.lang.Object[] objArray11 = null; // flaky: requestBuilder4.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(objArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[pong, kat, raff]");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.Object[] objArray6 = requestBuilder5.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder5.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.client.Request request7 = requestBuilder6.build();
        java.lang.String str8 = request7.getMethod();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.lang.String str6 = null; // flaky: requestBuilder5.buildRelativeUrl();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder5.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/" + "'", str6, "/foo/bar/");
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.Object[] objArray4 = null; // flaky: requestBuilder3.getargs();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder3.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(objArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[pong]");
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str7 = null; // flaky: requestBuilder6.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com" + "'", str10, "http://example.com");
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList9 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder25();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.ArrayList arrayList12 = serializedObjectSupporter6.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList12);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.String str7 = requestBuilder6.buildRelativeUrl();
        requestBuilder6.setapiUrl("/foo/bar/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.util.ArrayList arrayList14 = serializedObjectSupporter7.deserializeObjectList3();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter7.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(arrayList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter3.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter3.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter3.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter3.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        requestBuilder10.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.Object[] objArray13 = requestBuilder10.args;
        retrofit.converter.Converter converter14 = requestBuilder10.getconverter();
        java.lang.Object[] objArray18 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder10.args = objArray18;
        retrofit.RequestBuilder requestBuilder20 = requestBuilder8.args(objArray18);
// flaky:         requestBuilder2.setargs(objArray18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = null; // flaky: requestBuilder2.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNull(serializedObjectSupporter22);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
        retrofit.RequestBuilder requestBuilder6 = null; // flaky: requestBuilder1.apiUrl("/foo/bar/pong/");
        java.lang.String str7 = null; // flaky: requestBuilder1.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/foo/bar/pong/" + "'", str7, "/foo/bar/pong/");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("/foo/bar/", "/foo/bar/pong/", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNull(typedOutput6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         requestBuilder9.setapiUrl("/foo/bar/pong/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.RequestBuilder requestBuilder3 = requestBuilder1.apiUrl("GET");
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.apiUrl("/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
// flaky:         requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter8.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder11();
        java.util.ArrayList arrayList15 = serializedObjectSupporter8.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(arrayList15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = null;
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.Object[] objArray7 = requestBuilder4.args;
        retrofit.converter.Converter converter8 = requestBuilder4.getconverter();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder4.args = objArray12;
        retrofit.RequestBuilder requestBuilder14 = requestBuilder2.args(objArray12);
        java.util.List<retrofit.client.Header> headerList15 = requestBuilder2.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
// flaky:         requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        java.util.List<retrofit.client.Header> headerList18 = null; // flaky: requestBuilder5.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter19.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter19.deserializeObjectRequestBuilder2();
        java.lang.String str24 = serializedObjectSupporter19.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter19.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter19.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput27 = requestBuilder26.buildBody();
        retrofit.client.Request request28 = new retrofit.client.Request("GET", "http://example.com", headerList18, typedOutput27);
        java.lang.String str29 = request28.getMethod();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://example.com" + "'", str24, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = null; // flaky: requestBuilder4.apiUrl("");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = requestBuilder11.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter17 = null; // flaky: requestBuilder16.converter;
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
// flaky:         requestBuilder16.setheaders((java.util.List<retrofit.client.Header>) headerList19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput22);
        requestBuilder11.headers = headerList19;
        retrofit.RequestBuilder requestBuilder25 = null; // flaky: requestBuilder8.headers((java.util.List<retrofit.client.Header>) headerList19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNull(serializedObjectSupporter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(converter17);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.getHeaders();
        java.lang.String str13 = request11.getMethod();
        java.util.List<retrofit.client.Header> headerList14 = request11.getHeaders();
// flaky:         requestBuilder4.headers = headerList14;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         requestBuilder4.apiUrl = "GET";
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList10 = serializedObjectSupporter7.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList14 = null; // flaky: requestBuilder13.headers;
// flaky:         requestBuilder4.headers = headerList14;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.Converter converter10 = null; // flaky: requestBuilder9.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder6.setapiUrl("/foo/bar/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder5.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder21();
        java.lang.Object[] objArray14 = null; // flaky: requestBuilder13.getargs();
// flaky:         requestBuilder7.args = objArray14;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(objArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.apiUrl = "hi!";
// flaky:         requestBuilder4.apiUrl = "/foo/bar/";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        java.lang.String str7 = null; // flaky: requestBuilder6.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.String str5 = null; // flaky: requestBuilder4.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList9 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList11 = null; // flaky: requestBuilder10.headers;
// flaky:         requestBuilder5.setheaders(headerList11);
        java.lang.Object[] objArray13 = null; // flaky: requestBuilder5.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(headerList11);
// flaky:         org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong, kat, raff]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter5.deserializeObjectRequestBuilder26();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str15 = serializedObjectSupporter5.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com" + "'", str15, "http://example.com");
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString1();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter6;
        java.util.List<retrofit.client.Header> headerList13 = requestBuilder1.getheaders();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
        org.junit.Assert.assertNull(headerList13);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter2);
        requestBuilder3.setapiUrl("http://example.com");
        java.lang.Class<?> wildcardClass6 = requestBuilder3.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder1.apiUrl("/foo/bar/pong/");
        java.lang.Class<?> wildcardClass8 = null; // flaky: requestBuilder7.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray6 = null;
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.args(objArray6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null; // flaky: requestBuilder5.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.Converter converter7 = requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = null;
        requestBuilder18.serializedObjectSupporter = serializedObjectSupporter19;
        java.lang.Object[] objArray21 = requestBuilder18.args;
        retrofit.converter.Converter converter22 = requestBuilder18.getconverter();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder18.args = objArray26;
        retrofit.RequestBuilder requestBuilder28 = requestBuilder16.args(objArray26);
// flaky:         requestBuilder13.setargs(objArray26);
// flaky:         requestBuilder7.setargs(objArray26);
        java.lang.Object[] objArray31 = null; // flaky: requestBuilder7.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[100.0, 10, 4]");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder10.setapiUrl("hi!");
        retrofit.converter.Converter converter13 = null; // flaky: requestBuilder10.getconverter();
        retrofit.mime.TypedOutput typedOutput14 = null; // flaky: requestBuilder10.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
// flaky:         requestBuilder17.setheaders(headerList29);
// flaky:         requestBuilder10.setheaders(headerList29);
        retrofit.RequestBuilder requestBuilder32 = null; // flaky: requestBuilder8.headers(headerList29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNull(typedOutput14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.Converter converter9 = requestBuilder8.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.util.ArrayList arrayList14 = serializedObjectSupporter7.deserializeObjectList3();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter7.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter18 = null; // flaky: requestBuilder17.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(arrayList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(converter18);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder2();
        java.lang.String str6 = null; // flaky: requestBuilder5.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder9.getargs();
// flaky:         requestBuilder5.setargs(objArray10);
        retrofit.RequestBuilder requestBuilder12 = null; // flaky: requestBuilder2.args(objArray10);
// flaky:         requestBuilder2.apiUrl = "/foo/bar/";
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = null;
        requestBuilder20.serializedObjectSupporter = serializedObjectSupporter21;
        java.lang.Object[] objArray23 = requestBuilder20.args;
        requestBuilder20.setapiUrl("");
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        requestBuilder20.headers = headerList29;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList29, typedOutput34);
        java.util.List<retrofit.client.Header> headerList36 = request35.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter37.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter37.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter37.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter37.deserializeObjectRequestBuilder2();
        java.lang.String str42 = serializedObjectSupporter37.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter37.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter37.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput45 = requestBuilder44.buildBody();
        retrofit.client.Request request46 = new retrofit.client.Request("GET", "GET", headerList36, typedOutput45);
// flaky:         requestBuilder2.setheaders(headerList36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(objArray23);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerList36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertNotNull(requestBuilder40);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "http://example.com" + "'", str42, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(typedOutput45);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.Object[] objArray5 = null; // flaky: requestBuilder4.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[pong]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request5 = null; // flaky: requestBuilder4.build();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Path parameters must not be null: ping.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null; // flaky: requestBuilder7.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder11.headers(headerList20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = null; // flaky: requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter3);
        java.lang.Class<?> wildcardClass6 = null; // flaky: converter3.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(converter3);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = null; // flaky: requestBuilder5.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        requestBuilder4.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder4.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder21();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter8;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        retrofit.RequestBuilder requestBuilder18 = requestBuilder5.headers(headerList17);
        java.lang.String str19 = requestBuilder5.getapiUrl();
        java.lang.Object[] objArray20 = requestBuilder5.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com" + "'", str19, "http://example.com");
        org.junit.Assert.assertNull(objArray20);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str12 = null; // flaky: requestBuilder11.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter2.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter2.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter2.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList10 = null; // flaky: requestBuilder9.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder14.setapiUrl("hi!");
        retrofit.converter.Converter converter17 = null; // flaky: requestBuilder14.getconverter();
        retrofit.mime.TypedOutput typedOutput18 = null; // flaky: requestBuilder14.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
// flaky:         requestBuilder21.setheaders(headerList33);
// flaky:         requestBuilder14.setheaders(headerList33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter36.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter36.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter36.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter36.deserializeObjectRequestBuilder2();
        java.lang.String str41 = serializedObjectSupporter36.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter36.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter36.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput44 = requestBuilder43.buildBody();
        retrofit.client.Request request45 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList33, typedOutput44);
        retrofit.client.Request request46 = new retrofit.client.Request("/", "GET", headerList10, typedOutput44);
        java.lang.String str47 = request46.getUrl();
        java.lang.String str48 = request46.getUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(headerList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(converter17);
        org.junit.Assert.assertNull(typedOutput18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "http://example.com" + "'", str41, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(typedOutput44);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "GET" + "'", str47, "GET");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "GET" + "'", str48, "GET");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        java.lang.String str10 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.getargs();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder2.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList10 = serializedObjectSupporter5.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter5.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter7();
// flaky:         requestBuilder2.serializedObjectSupporter = serializedObjectSupporter5;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList11 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.List<retrofit.client.Header> headerList4 = null; // flaky: requestBuilder3.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.util.ArrayList arrayList14 = serializedObjectSupporter7.deserializeObjectList3();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter7.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter7.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(arrayList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        java.lang.String str5 = null; // flaky: requestBuilder4.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/foo" + "'", str5, "/foo");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter2.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.getheaders();
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        requestBuilder13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.Object[] objArray16 = requestBuilder13.args;
        requestBuilder13.setapiUrl("");
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        requestBuilder13.headers = headerList22;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList22, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter30.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter30.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter30.deserializeObjectRequestBuilder2();
        java.lang.String str35 = serializedObjectSupporter30.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter30.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter30.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput38 = requestBuilder37.buildBody();
        retrofit.client.Request request39 = new retrofit.client.Request("GET", "GET", headerList29, typedOutput38);
        retrofit.client.Request request40 = new retrofit.client.Request("/foo/bar/pong/", "", headerList7, typedOutput38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com" + "'", str35, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(typedOutput38);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder9.args;
        retrofit.RequestBuilder requestBuilder11 = null; // flaky: requestBuilder6.args(objArray10);
        java.lang.String str12 = null; // flaky: requestBuilder11.apiUrl;
        retrofit.client.Request request13 = null; // flaky: requestBuilder11.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com" + "'", str12, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString1();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
// flaky:         requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.Converter converter13 = null; // flaky: requestBuilder7.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(converter13);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter8();
        java.util.ArrayList arrayList17 = serializedObjectSupporter12.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter12.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder11.serializedObjectSupporter = serializedObjectSupporter12;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(arrayList17);
        org.junit.Assert.assertNotNull(gsonConverter18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = null;
        requestBuilder14.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.Object[] objArray17 = requestBuilder14.args;
        retrofit.converter.Converter converter18 = requestBuilder14.getconverter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder14.args = objArray22;
        retrofit.RequestBuilder requestBuilder24 = requestBuilder12.args(objArray22);
// flaky:         requestBuilder9.setargs(objArray22);
        requestBuilder4.setargs(objArray22);
        retrofit.client.Request request27 = requestBuilder4.build();
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(request27);
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder14();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         requestBuilder5.apiUrl = "GET";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter2 = null; // flaky: requestBuilder1.converter;
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = null;
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.Object[] objArray7 = requestBuilder4.args;
        requestBuilder4.setapiUrl("");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        requestBuilder4.headers = headerList13;
// flaky:         requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.mime.TypedOutput typedOutput19 = null; // flaky: requestBuilder1.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter2);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput19);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.Class<?> wildcardClass6 = null; // flaky: requestBuilder5.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.apiUrl = "hi!";
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder4.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.Class<?> wildcardClass11 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null;
        requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Object[] objArray10 = requestBuilder7.args;
        requestBuilder7.setapiUrl("");
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        requestBuilder7.headers = headerList16;
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder5.headers((java.util.List<retrofit.client.Header>) headerList16);
        java.lang.Object[] objArray22 = null; // flaky: requestBuilder5.args;
        java.lang.String str23 = null; // flaky: requestBuilder5.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str8 = null; // flaky: requestBuilder7.getapiUrl();
        java.lang.Object[] objArray9 = null; // flaky: requestBuilder7.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[kat]");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.converter;
        retrofit.client.Header[] headerArray5 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList6 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList6, headerArray5);
// flaky:         requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList6, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(headerArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.mime.TypedOutput typedOutput7 = null; // flaky: requestBuilder6.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(typedOutput7);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
        java.lang.String str6 = null; // flaky: requestBuilder4.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("/foo/bar/", "/foo/bar/pong/", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/pong/" + "'", str6, "/foo/bar/pong/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/foo/bar/" + "'", str7, "/foo/bar/");
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
        java.lang.Object[] objArray8 = requestBuilder7.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str7 = null; // flaky: requestBuilder6.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/foo/bar/" + "'", str7, "/foo/bar/");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.client.Request request3 = null; // flaky: requestBuilder2.build();
        java.lang.String str4 = null; // flaky: request3.getMethod();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(request3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "POST" + "'", str4, "POST");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter4.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter4.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList11 = null; // flaky: requestBuilder10.getheaders();
// flaky:         requestBuilder3.setheaders(headerList11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        retrofit.converter.Converter converter10 = requestBuilder6.getconverter();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder6.args = objArray14;
        retrofit.RequestBuilder requestBuilder16 = null; // flaky: requestBuilder4.args(objArray14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter10();
// flaky:         requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        java.util.List<retrofit.client.Header> headerList27 = null; // flaky: requestBuilder21.headers;
// flaky:         requestBuilder4.headers = headerList27;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter29.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter32 = null;
        retrofit.RequestBuilder requestBuilder33 = new retrofit.RequestBuilder(converter32);
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = null;
        requestBuilder33.serializedObjectSupporter = serializedObjectSupporter34;
        java.lang.Object[] objArray36 = requestBuilder33.args;
        retrofit.converter.Converter converter37 = requestBuilder33.getconverter();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder33.args = objArray41;
        retrofit.RequestBuilder requestBuilder43 = requestBuilder31.args(objArray41);
// flaky:         requestBuilder4.setargs(objArray41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(gsonConverter25);
// flaky:         org.junit.Assert.assertNotNull(headerList27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(objArray36);
        org.junit.Assert.assertNull(converter37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder43);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         requestBuilder4.setapiUrl("http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList11 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.getargs();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder2.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
// flaky:         requestBuilder7.setheaders(headerList19);
// flaky:         requestBuilder2.headers = headerList19;
        java.lang.String str22 = null; // flaky: requestBuilder2.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com" + "'", str22, "http://example.com");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder25();
        java.lang.Object[] objArray11 = requestBuilder10.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNull(objArray11);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null;
        requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        java.lang.Object[] objArray10 = requestBuilder7.args;
        retrofit.converter.Converter converter11 = requestBuilder7.getconverter();
        java.lang.Object[] objArray15 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder7.args = objArray15;
        retrofit.RequestBuilder requestBuilder17 = requestBuilder5.args(objArray15);
        java.lang.Object[] objArray18 = requestBuilder17.args;
        java.lang.Class<?> wildcardClass19 = objArray18.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("/foo/bar/", "/foo/bar/pong/", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        org.junit.Assert.assertNull(typedOutput5);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str5 = null; // flaky: requestBuilder4.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter4.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder9.getargs();
// flaky:         requestBuilder2.args = objArray10;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[]");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.getheaders();
        java.lang.String str8 = null; // flaky: requestBuilder6.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder5.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        requestBuilder8.setapiUrl("/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter2);
        requestBuilder3.setapiUrl("http://example.com");
        java.lang.Object[] objArray6 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder3.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(headerList7);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.Object[] objArray7 = requestBuilder6.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(objArray7);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = null;
        requestBuilder14.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.Object[] objArray17 = requestBuilder14.args;
        retrofit.converter.Converter converter18 = requestBuilder14.getconverter();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder14.args = objArray22;
        retrofit.RequestBuilder requestBuilder24 = requestBuilder12.args(objArray22);
// flaky:         requestBuilder9.setargs(objArray22);
        requestBuilder4.setargs(objArray22);
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder4.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = null;
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.Object[] objArray7 = requestBuilder4.args;
        retrofit.converter.Converter converter8 = requestBuilder4.getconverter();
        java.lang.Object[] objArray12 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder4.args = objArray12;
        retrofit.RequestBuilder requestBuilder14 = requestBuilder2.args(objArray12);
        java.lang.String str15 = requestBuilder14.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com" + "'", str15, "http://example.com");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder2();
        java.lang.String str6 = null; // flaky: requestBuilder5.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder9.getargs();
// flaky:         requestBuilder5.setargs(objArray10);
        retrofit.RequestBuilder requestBuilder12 = null; // flaky: requestBuilder2.args(objArray10);
        java.util.List<retrofit.client.Header> headerList13 = null; // flaky: requestBuilder12.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter9();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter6.deserializeObjectConverter10();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter6.deserializeObjectConverter10();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter6.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder26();
        java.util.ArrayList arrayList16 = serializedObjectSupporter10.deserializeObjectList2();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter10;
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter10.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = null; // flaky: requestBuilder18.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(arrayList16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getMethod();
        java.lang.String str14 = request10.getUrl();
        java.lang.String str15 = request10.getMethod();
        java.lang.String str16 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        java.lang.Object[] objArray8 = null; // flaky: requestBuilder7.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[bar, null, kat]");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter7.deserializeObjectConverter1();
        java.util.ArrayList arrayList14 = serializedObjectSupporter7.deserializeObjectList3();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter7.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray18 = null; // flaky: requestBuilder17.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder6();
        java.lang.Object[] objArray22 = null; // flaky: requestBuilder21.args;
// flaky:         requestBuilder17.args = objArray22;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(arrayList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[kat]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(objArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[bar, null, kat]");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.Class<?> wildcardClass2 = null; // flaky: requestBuilder1.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.headers;
        java.util.List<retrofit.client.Header> headerList9 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList15 = serializedObjectSupporter12.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter12.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter12.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList20 = null; // flaky: requestBuilder19.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter23.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder24.setapiUrl("hi!");
        retrofit.converter.Converter converter27 = null; // flaky: requestBuilder24.getconverter();
        retrofit.mime.TypedOutput typedOutput28 = null; // flaky: requestBuilder24.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter29.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray36 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList37 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList37, headerArray36);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList37, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList37, typedOutput41);
        java.util.List<retrofit.client.Header> headerList43 = request42.getHeaders();
// flaky:         requestBuilder31.setheaders(headerList43);
// flaky:         requestBuilder24.setheaders(headerList43);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter46.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter46.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter46.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter46.deserializeObjectRequestBuilder2();
        java.lang.String str51 = serializedObjectSupporter46.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter46.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter46.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput54 = requestBuilder53.buildBody();
        retrofit.client.Request request55 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList43, typedOutput54);
        retrofit.client.Request request56 = new retrofit.client.Request("/", "GET", headerList20, typedOutput54);
        retrofit.client.Request request57 = new retrofit.client.Request("http://example.com", "/foo/bar/", headerList9, typedOutput54);
        retrofit.client.Request request58 = new retrofit.client.Request("POST", "", headerList6, typedOutput54);
        java.lang.String str59 = request58.getMethod();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(arrayList15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(headerList20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(converter27);
        org.junit.Assert.assertNull(typedOutput28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(headerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(headerList43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com" + "'", str51, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder52);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(typedOutput54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "POST" + "'", str59, "POST");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder4 = null; // flaky: requestBuilder2.apiUrl("GET");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.apiUrl("/foo/bar/pong/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.converter;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
// flaky:         requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList10);
// flaky:         requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null; // flaky: requestBuilder5.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         requestBuilder3.apiUrl = "http://example.com";
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder3.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder1();
        java.lang.Object[] objArray12 = requestBuilder11.args;
// flaky:         requestBuilder3.setargs(objArray12);
// flaky:         requestBuilder3.setapiUrl("hi!");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[[quick, brown, fox]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[[quick, brown, fox]]");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null; // flaky: requestBuilder6.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter9();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder4.headers;
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder4.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter2();
        java.lang.String str11 = serializedObjectSupporter6.deserializeObjectString1();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder22();
        java.lang.String str14 = null; // flaky: requestBuilder13.buildRelativeUrl();
        java.lang.String str15 = null; // flaky: requestBuilder13.apiUrl;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "/foo/bar/" + "'", str14, "/foo/bar/");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://example.com" + "'", str15, "http://example.com");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        java.lang.String str9 = requestBuilder8.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         requestBuilder3.apiUrl = "http://example.com";
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder3.buildBody();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput16);
// flaky:         requestBuilder3.headers = headerList12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter19.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter19.deserializeObjectRequestBuilder1();
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder24.getheaders();
        retrofit.RequestBuilder requestBuilder26 = null; // flaky: requestBuilder3.headers(headerList25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(headerList25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList12 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(arrayList12);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder5.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         requestBuilder3.apiUrl = "/foo/bar/";
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder3.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter10();
// flaky:         requestBuilder11.serializedObjectSupporter = serializedObjectSupporter12;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        java.lang.String str22 = serializedObjectSupporter17.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter17.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter17.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter27.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList30 = serializedObjectSupporter27.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter27.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter27.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter27.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList34 = null; // flaky: requestBuilder33.headers;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("/foo/bar/", "hi!", headerList34, typedOutput35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder24.headers(headerList34);
// flaky:         requestBuilder11.setheaders(headerList34);
// flaky:         requestBuilder3.headers = headerList34;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://example.com" + "'", str22, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter23);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(arrayList30);
        org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(requestBuilder37);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray11 = null; // flaky: requestBuilder10.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder1();
        java.lang.Object[] objArray17 = requestBuilder16.args;
// flaky:         requestBuilder10.args = objArray17;
        retrofit.RequestBuilder requestBuilder19 = null; // flaky: requestBuilder8.args(objArray17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(objArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[kat]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[[quick, brown, fox]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[[quick, brown, fox]]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder5.setapiUrl("http://example.com/");
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder5.getconverter();
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.headers;
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder4.getconverter();
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder4.args;
// flaky:         requestBuilder4.setapiUrl("http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.lang.String str11 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter2.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter2.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList11 = serializedObjectSupporter2.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter2.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder1();
        requestBuilder17.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = requestBuilder17.serializedObjectSupporter;
        java.lang.Object[] objArray21 = requestBuilder17.args;
        retrofit.RequestBuilder requestBuilder22 = null; // flaky: requestBuilder12.args(objArray21);
// flaky:         requestBuilder1.args = objArray21;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[quick, brown, fox]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[[quick, brown, fox]]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.headers;
// flaky:         requestBuilder4.apiUrl = "POST";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
    }
}
