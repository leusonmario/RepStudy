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
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections2 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
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
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.Object[] objArray2 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(objArray2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = requestBuilder1.getconverter();
        retrofit.mime.TypedOutput typedOutput5 = requestBuilder1.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNull(typedOutput5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null; // flaky: requestBuilder3.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray3 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList4 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList4, headerArray3);
        requestBuilder2.setheaders((java.util.List<retrofit.client.Header>) headerList4);
        retrofit.converter.Converter converter7 = requestBuilder2.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
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
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str3 = null; // flaky: requestBuilder2.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request5 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter2 = requestBuilder1.converter;
        retrofit.client.Header[] headerArray3 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList4 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList4, headerArray3);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList4);
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = null;
        requestBuilder8.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.Object[] objArray11 = requestBuilder8.args;
        requestBuilder8.setapiUrl("");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        requestBuilder8.headers = headerList17;
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList17);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(converter2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = requestBuilder4.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter6 = requestBuilder1.getconverter();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(converter6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.lang.Class<?> wildcardClass4 = gsonConverter3.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
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
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         requestBuilder2.setapiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        requestBuilder2.apiUrl = "http://example.com";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.Object[] objArray5 = null;
        retrofit.RequestBuilder requestBuilder6 = requestBuilder4.args(objArray5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str6 = requestBuilder5.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.Class<?> wildcardClass5 = null; // flaky: requestBuilder4.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
        java.lang.Class<?> wildcardClass7 = requestBuilder5.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray9 = requestBuilder8.getargs();
        requestBuilder5.setargs(objArray9);
        retrofit.mime.TypedOutput typedOutput11 = requestBuilder5.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[pong]");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter4 = requestBuilder3.converter;
        java.lang.Class<?> wildcardClass5 = requestBuilder3.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray10 = requestBuilder9.getargs();
// flaky:         requestBuilder5.args = objArray10;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[pong]");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = null; // flaky: requestBuilder7.apiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
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
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        requestBuilder5.setapiUrl("http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList15 = null; // flaky: requestBuilder14.headers;
        requestBuilder8.headers = headerList15;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder8.getheaders();
// flaky:         requestBuilder4.headers = headerList17;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(headerList15);
// flaky:         org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
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
        retrofit.RequestBuilder requestBuilder16 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter17 = requestBuilder16.converter;
        retrofit.converter.Converter converter18 = requestBuilder16.getconverter();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(converter18);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        requestBuilder9.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder9.getheaders();
        retrofit.RequestBuilder requestBuilder13 = requestBuilder4.headers(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray6 = requestBuilder5.getargs();
        retrofit.RequestBuilder requestBuilder7 = requestBuilder2.args(objArray6);
        requestBuilder7.apiUrl = "hi!";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
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
            retrofit.mime.TypedOutput typedOutput16 = requestBuilder1.buildBody();
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
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = requestBuilder4.apiUrl("");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        requestBuilder4.apiUrl = "hi!";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        java.lang.String str16 = request13.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.lang.String str6 = requestBuilder5.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str7 = requestBuilder6.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = null;
        requestBuilder9.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.Object[] objArray12 = requestBuilder9.args;
        requestBuilder9.setapiUrl("");
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        requestBuilder9.headers = headerList18;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList18, typedOutput23);
        requestBuilder5.headers = headerList18;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = null;
        requestBuilder12.serializedObjectSupporter = serializedObjectSupporter13;
        java.lang.Object[] objArray15 = requestBuilder12.args;
        requestBuilder12.setapiUrl("");
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder12.headers = headerList21;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput26);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        requestBuilder4.headers = headerList21;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(objArray15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.RequestBuilder requestBuilder7 = requestBuilder2.apiUrl("");
        requestBuilder7.setapiUrl("");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        requestBuilder8.apiUrl = "http://example.com";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str6 = requestBuilder5.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str5 = requestBuilder4.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/" + "'", str5, "/");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = requestBuilder1.converter;
        java.lang.String str5 = requestBuilder1.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        retrofit.RequestBuilder requestBuilder16 = requestBuilder1.apiUrl("hi!");
        requestBuilder1.apiUrl = "/";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(requestBuilder16);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
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
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter4.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder18();
// flaky:         requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter4.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter7 = requestBuilder1.getconverter();
        java.lang.Object[] objArray8 = requestBuilder1.args;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str7 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
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
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typedOutput19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = requestBuilder2.serializedObjectSupporter;
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder2.headers;
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder2.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder12();
// flaky:         requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        java.util.List<retrofit.client.Header> headerList11 = null; // flaky: requestBuilder3.headers;
        retrofit.client.Request request12 = null; // flaky: requestBuilder3.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(headerList11);
// flaky:         org.junit.Assert.assertNotNull(request12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.headers;
        java.lang.String str7 = null; // flaky: requestBuilder5.getapiUrl();
        retrofit.client.Request request8 = null; // flaky: requestBuilder5.build();
        retrofit.mime.TypedOutput typedOutput9 = null; // flaky: request8.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNull(typedOutput9);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str7 = requestBuilder6.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        java.lang.Class<?> wildcardClass8 = requestBuilder7.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.lang.Class<?> wildcardClass4 = requestBuilder3.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList16 = null; // flaky: requestBuilder15.headers;
        requestBuilder9.headers = headerList16;
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder9.getheaders();
        requestBuilder5.headers = headerList18;
        requestBuilder5.apiUrl = "";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(headerList16);
// flaky:         org.junit.Assert.assertNotNull(headerList18);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray14 = requestBuilder13.getargs();
        requestBuilder10.setargs(objArray14);
        requestBuilder6.setargs(objArray14);
        retrofit.converter.Converter converter17 = requestBuilder6.converter;
        java.lang.String str18 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong]");
        org.junit.Assert.assertNotNull(converter17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com" + "'", str18, "http://example.com");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        requestBuilder5.apiUrl = "";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
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
        java.lang.Class<?> wildcardClass17 = headerList10.getClass();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null; // flaky: requestBuilder7.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter4 = requestBuilder3.converter;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.lang.Object[] objArray6 = requestBuilder5.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNull(objArray6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
        java.lang.String str8 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
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
        java.lang.String str20 = request18.getMethod();
        java.lang.String str21 = request18.getMethod();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        java.lang.String str16 = request13.getMethod();
        java.lang.String str17 = request13.getUrl();
        java.lang.String str18 = request13.getMethod();
        java.lang.String str19 = request13.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.client.Request request2 = requestBuilder1.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(request2);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.Class<?> wildcardClass6 = requestBuilder5.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.lang.String str6 = requestBuilder5.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.client.Request request4 = requestBuilder3.build();
        java.lang.String str5 = request4.getUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Request request6 = requestBuilder5.build();
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder2.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter3.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter3.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter3.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter3.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter3.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput11 = requestBuilder10.buildBody();
        retrofit.client.Request request12 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList2, typedOutput11);
        java.lang.Class<?> wildcardClass13 = request12.getClass();
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(typedOutput11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList7 = serializedObjectSupporter4.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder1();
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList13 = serializedObjectSupporter10.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder15();
        java.lang.Object[] objArray15 = null; // flaky: requestBuilder14.getargs();
        requestBuilder3.setargs(objArray15);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(arrayList13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[bar, pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[bar, pong]");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = requestBuilder5.apiUrl("http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        requestBuilder1.setapiUrl("hi!");
        java.lang.Object[] objArray4 = requestBuilder1.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter5.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter5.deserializeObjectRequestBuilder17();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter5;
        java.lang.String str16 = serializedObjectSupporter5.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com/" + "'", str16, "http://example.com/");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder5.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(typedOutput6);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        retrofit.client.Request request8 = null; // flaky: requestBuilder7.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(request8);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str10 = null; // flaky: requestBuilder9.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com" + "'", str10, "http://example.com");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str7 = requestBuilder6.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter7();
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter8;
        java.util.ArrayList arrayList16 = serializedObjectSupporter8.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(arrayList16);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = requestBuilder3.serializedObjectSupporter;
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        retrofit.converter.Converter converter10 = requestBuilder6.getconverter();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder6.args = objArray14;
        requestBuilder3.args = objArray14;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[100.0, 10, 4]");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
// flaky:         requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.RequestBuilder requestBuilder17 = null; // flaky: requestBuilder3.apiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter7 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = requestBuilder10.serializedObjectSupporter;
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder10.headers;
        requestBuilder1.setheaders(headerList12);
        java.lang.String str14 = requestBuilder1.apiUrl;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNull(serializedObjectSupporter11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        requestBuilder3.apiUrl = "http://example.com";
        java.lang.Object[] objArray6 = requestBuilder3.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(objArray6);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
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
        retrofit.converter.Converter converter25 = null;
        retrofit.RequestBuilder requestBuilder26 = new retrofit.RequestBuilder(converter25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = null;
        requestBuilder26.serializedObjectSupporter = serializedObjectSupporter27;
        java.lang.Object[] objArray29 = requestBuilder26.args;
        requestBuilder26.setapiUrl("");
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        requestBuilder26.headers = headerList35;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput40);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        java.lang.Object[] objArray44 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(objArray44);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder32();
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter20.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter20.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter20.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter20.deserializeObjectConverter6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter28.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter28.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter31 = requestBuilder30.converter;
        retrofit.RequestBuilder requestBuilder33 = requestBuilder30.apiUrl("http://example.com");
        retrofit.RequestBuilder requestBuilder35 = requestBuilder30.apiUrl("");
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter36.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter36.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter36.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter40 = null; // flaky: requestBuilder39.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter41.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter41.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList44 = serializedObjectSupporter41.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter41.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter41.deserializeObjectRequestBuilder9();
        java.lang.Object[] objArray47 = new java.lang.Object[] { request18, serializedObjectSupporter20, requestBuilder30, requestBuilder39, serializedObjectSupporter41 };
        requestBuilder7.setargs(objArray47);
        retrofit.RequestBuilder requestBuilder49 = null; // flaky: requestBuilder3.args(objArray47);
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter50.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder32();
        retrofit.client.Header[] headerArray58 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList59 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList59, headerArray58);
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList59, typedOutput61);
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList59, typedOutput63);
        java.lang.Class<?> wildcardClass65 = request64.getClass();
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder67 = serializedObjectSupporter66.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter66.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder69 = serializedObjectSupporter66.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter70 = serializedObjectSupporter66.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder71 = serializedObjectSupporter66.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder72 = serializedObjectSupporter66.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter73 = serializedObjectSupporter66.deserializeObjectConverter6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter74.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder76 = serializedObjectSupporter74.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter77 = requestBuilder76.converter;
        retrofit.RequestBuilder requestBuilder79 = requestBuilder76.apiUrl("http://example.com");
        retrofit.RequestBuilder requestBuilder81 = requestBuilder76.apiUrl("");
        retrofit.SerializedObjectSupporter serializedObjectSupporter82 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder83 = serializedObjectSupporter82.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder84 = serializedObjectSupporter82.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder85 = serializedObjectSupporter82.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter86 = null; // flaky: requestBuilder85.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter87 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter87.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder89 = serializedObjectSupporter87.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList90 = serializedObjectSupporter87.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder91 = serializedObjectSupporter87.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder92 = serializedObjectSupporter87.deserializeObjectRequestBuilder9();
        java.lang.Object[] objArray93 = new java.lang.Object[] { request64, serializedObjectSupporter66, requestBuilder76, requestBuilder85, serializedObjectSupporter87 };
        requestBuilder53.setargs(objArray93);
// flaky:         requestBuilder3.setargs(objArray93);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(converter31);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(converter40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(arrayList44);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(objArray47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(headerArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(requestBuilder67);
        org.junit.Assert.assertNotNull(requestBuilder68);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder69);
        org.junit.Assert.assertNotNull(gsonConverter70);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder71);
        org.junit.Assert.assertNotNull(requestBuilder72);
        org.junit.Assert.assertNotNull(gsonConverter73);
        org.junit.Assert.assertNotNull(requestBuilder75);
        org.junit.Assert.assertNotNull(requestBuilder76);
        org.junit.Assert.assertNotNull(converter77);
        org.junit.Assert.assertNotNull(requestBuilder79);
        org.junit.Assert.assertNotNull(requestBuilder81);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(requestBuilder84);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder85);
// flaky:         org.junit.Assert.assertNotNull(converter86);
        org.junit.Assert.assertNotNull(requestBuilder88);
        org.junit.Assert.assertNotNull(requestBuilder89);
        org.junit.Assert.assertNotNull(arrayList90);
        org.junit.Assert.assertNotNull(requestBuilder91);
        org.junit.Assert.assertNotNull(requestBuilder92);
        org.junit.Assert.assertNotNull(objArray93);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str7 = requestBuilder6.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter7();
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter8.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(gsonConverter16);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        requestBuilder2.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(arrayList9);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
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
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(objArray17);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = requestBuilder8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        requestBuilder3.apiUrl = "hi!";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
// flaky:         requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter20.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter20.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList26 = null; // flaky: requestBuilder25.headers;
        requestBuilder19.headers = headerList26;
// flaky:         requestBuilder3.headers = headerList26;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(headerList26);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.client.Request request5 = requestBuilder4.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder5.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[pong, [quick, brown, fox], kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[pong, [quick, brown, fox], kat]");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray8 = requestBuilder7.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[pong#, kat#]");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
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
        requestBuilder1.setapiUrl("http://example.com/");
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.lang.String str8 = requestBuilder7.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = requestBuilder1.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList8 = serializedObjectSupporter5.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder15();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter5;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter16.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder21 = requestBuilder19.apiUrl("");
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder21.headers;
        requestBuilder1.setheaders(headerList22);
        java.lang.String str24 = requestBuilder1.getapiUrl();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder5.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray6 = requestBuilder5.getargs();
        retrofit.RequestBuilder requestBuilder7 = requestBuilder2.args(objArray6);
        java.lang.Object[] objArray8 = requestBuilder7.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[pong]");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList4 = null; // flaky: requestBuilder3.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Class<?> wildcardClass8 = requestBuilder7.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        requestBuilder12.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList15 = requestBuilder12.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter18.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter18.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter18.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter18.deserializeObjectRequestBuilder3();
        requestBuilder23.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter26.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter26.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter26.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter30.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter30.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter30.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter30.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList36 = null; // flaky: requestBuilder35.headers;
        requestBuilder29.headers = headerList36;
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder29.getheaders();
        requestBuilder23.headers = headerList38;
        java.util.List<retrofit.client.Header> headerList42 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter43.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter43.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter43.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter43.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter43.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter43.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter43.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput51 = requestBuilder50.buildBody();
        retrofit.client.Request request52 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList42, typedOutput51);
        retrofit.client.Request request53 = new retrofit.client.Request("/", "hi!", headerList38, typedOutput51);
        retrofit.client.Request request54 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList15, typedOutput51);
        requestBuilder5.setheaders(headerList15);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(gsonConverter34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(headerList36);
// flaky:         org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(gsonConverter47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertNotNull(typedOutput51);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        requestBuilder6.headers = headerList15;
        retrofit.converter.Converter converter24 = null;
        retrofit.RequestBuilder requestBuilder25 = new retrofit.RequestBuilder(converter24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = null;
        requestBuilder25.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.Object[] objArray28 = requestBuilder25.args;
        requestBuilder25.setapiUrl("");
        retrofit.client.Header[] headerArray33 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList34 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList34, headerArray33);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList34, typedOutput36);
        requestBuilder25.headers = headerList34;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList34, typedOutput39);
        requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList34);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder4.headers((java.util.List<retrofit.client.Header>) headerList34);
        retrofit.mime.TypedOutput typedOutput43 = requestBuilder42.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objArray28);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNull(typedOutput43);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
// flaky:         requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = null;
        requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        java.lang.Object[] objArray24 = requestBuilder21.args;
        requestBuilder21.setapiUrl("");
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        requestBuilder21.headers = headerList30;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter37.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray39 = requestBuilder38.args;
        java.util.List<retrofit.client.Header> headerList40 = requestBuilder38.getheaders();
        java.util.List<retrofit.client.Header> headerList43 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter44.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter44.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter44.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter48 = serializedObjectSupporter44.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter44.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter44.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter44.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput52 = requestBuilder51.buildBody();
        retrofit.client.Request request53 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList43, typedOutput52);
        retrofit.client.Request request54 = new retrofit.client.Request("", "http://example.com", headerList40, typedOutput52);
        retrofit.client.Request request55 = new retrofit.client.Request("", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList30, typedOutput52);
        retrofit.client.Request request56 = new retrofit.client.Request("GET", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput52);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNull(objArray39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(requestBuilder46);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(gsonConverter48);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(typedOutput52);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray13 = requestBuilder12.getargs();
        retrofit.RequestBuilder requestBuilder14 = requestBuilder9.args(objArray13);
        requestBuilder6.setargs(objArray13);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        requestBuilder4.apiUrl = "/";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList8 = serializedObjectSupporter5.deserializeObjectList2();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.Converter converter7 = requestBuilder6.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter7();
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections5 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str7 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        requestBuilder7.setapiUrl("GET");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.String str6 = null; // flaky: requestBuilder5.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter8;
        java.util.ArrayList arrayList14 = serializedObjectSupporter8.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(arrayList14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.Converter converter7 = requestBuilder6.converter;
        retrofit.mime.TypedOutput typedOutput8 = requestBuilder6.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.Converter converter10 = null; // flaky: requestBuilder9.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder5.args;
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder5.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        requestBuilder3.setapiUrl("http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        java.lang.String str7 = requestBuilder5.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder2();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList14 = serializedObjectSupporter11.deserializeObjectList2();
        java.util.ArrayList arrayList15 = serializedObjectSupporter11.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter11.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = requestBuilder16.serializedObjectSupporter;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        requestBuilder16.headers = headerList25;
        retrofit.RequestBuilder requestBuilder27 = requestBuilder10.headers(headerList25);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNotNull(arrayList15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNull(serializedObjectSupporter17);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(requestBuilder27);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections6 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        requestBuilder2.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder13 = requestBuilder11.apiUrl("hi!");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.lang.Object[] objArray8 = requestBuilder7.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[pong]");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList10 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder12 = requestBuilder10.apiUrl("/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList15 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray20 = requestBuilder19.args;
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder19.getheaders();
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter25.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter25.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter25.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter25.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter25.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput33 = requestBuilder32.buildBody();
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList24, typedOutput33);
        retrofit.client.Request request35 = new retrofit.client.Request("", "http://example.com", headerList21, typedOutput33);
        retrofit.client.Request request36 = new retrofit.client.Request("http://example.com", "", headerList15, typedOutput33);
        retrofit.client.Request request37 = new retrofit.client.Request("http://example.com/", "GET", (java.util.List<retrofit.client.Header>) headerList7, typedOutput33);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(gsonConverter29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(typedOutput33);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str2 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter3 = requestBuilder1.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com" + "'", str2, "http://example.com");
        org.junit.Assert.assertNotNull(converter3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        requestBuilder5.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList18 = null; // flaky: requestBuilder17.headers;
        requestBuilder11.headers = headerList18;
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder11.getheaders();
        requestBuilder5.headers = headerList20;
        retrofit.client.Request request22 = requestBuilder5.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(headerList18);
// flaky:         org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(request22);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder8 = requestBuilder6.apiUrl("");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray9 = requestBuilder8.getargs();
        requestBuilder5.setargs(objArray9);
        java.lang.Object[] objArray11 = requestBuilder5.args;
        java.lang.Object[] objArray12 = null;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder5.args(objArray12);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[pong]");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.lang.String str9 = requestBuilder8.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com" + "'", str9, "http://example.com");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = null; // flaky: requestBuilder6.apiUrl("/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
// flaky:         requestBuilder5.setheaders(headerList14);
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = null;
        requestBuilder19.serializedObjectSupporter = serializedObjectSupporter20;
        java.lang.Object[] objArray22 = requestBuilder19.args;
        requestBuilder19.setapiUrl("");
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        requestBuilder19.headers = headerList28;
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter35.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray37 = requestBuilder36.args;
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder36.getheaders();
        java.util.List<retrofit.client.Header> headerList41 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter42.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter42.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter42.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter42.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter42.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter42.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter42.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput50 = requestBuilder49.buildBody();
        retrofit.client.Request request51 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList41, typedOutput50);
        retrofit.client.Request request52 = new retrofit.client.Request("", "http://example.com", headerList38, typedOutput50);
        retrofit.client.Request request53 = new retrofit.client.Request("", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList28, typedOutput50);
// flaky:         requestBuilder5.headers = headerList28;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(objArray22);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNull(objArray37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder44);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(gsonConverter46);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(typedOutput50);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter4 = requestBuilder3.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(converter4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter10.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter10.deserializeObjectRequestBuilder33();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter18.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter18.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter18.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter24.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray27 = requestBuilder26.getargs();
        requestBuilder23.setargs(objArray27);
        java.lang.Object[] objArray29 = requestBuilder23.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter30.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter30.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter30.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter30.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter30.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter30.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter39.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter39.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter39.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter39.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter39.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter45.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter45.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray48 = requestBuilder47.getargs();
        requestBuilder44.setargs(objArray48);
        java.lang.Object[] objArray50 = requestBuilder44.args;
// flaky:         requestBuilder38.setargs(objArray50);
        requestBuilder23.args = objArray50;
        requestBuilder17.setargs(objArray50);
// flaky:         requestBuilder9.setargs(objArray50);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[pong]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray29), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(gsonConverter36);
        org.junit.Assert.assertNotNull(requestBuilder37);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[pong]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[pong]");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        requestBuilder7.setapiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request13.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        requestBuilder2.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder15();
        retrofit.converter.Converter converter11 = null; // flaky: requestBuilder10.converter;
        retrofit.converter.Converter converter12 = null; // flaky: requestBuilder10.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(converter11);
// flaky:         org.junit.Assert.assertNotNull(converter12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        java.lang.String str6 = requestBuilder5.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput8 = requestBuilder7.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder17();
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        java.util.List<retrofit.client.Header> headerList23 = request21.getHeaders();
// flaky:         requestBuilder14.setheaders(headerList23);
        retrofit.RequestBuilder requestBuilder25 = requestBuilder7.headers(headerList23);
        java.lang.Class<?> wildcardClass26 = requestBuilder25.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(typedOutput8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        java.lang.String str7 = null; // flaky: requestBuilder6.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter6.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter15.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter15.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray24 = requestBuilder23.getargs();
        requestBuilder20.setargs(objArray24);
        java.lang.Object[] objArray26 = requestBuilder20.args;
// flaky:         requestBuilder14.setargs(objArray26);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder5.args(objArray26);
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request29 = requestBuilder5.build();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[pong]");
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder28);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter4 = requestBuilder3.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder3.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.lang.Class<?> wildcardClass9 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = requestBuilder4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.converter.Converter converter9 = requestBuilder8.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray6 = requestBuilder5.getargs();
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        retrofit.RequestBuilder requestBuilder14 = requestBuilder5.headers((java.util.List<retrofit.client.Header>) headerList10);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter7 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput16 = requestBuilder15.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter17.deserializeObjectRequestBuilder17();
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        java.util.List<retrofit.client.Header> headerList31 = request29.getHeaders();
// flaky:         requestBuilder22.setheaders(headerList31);
        retrofit.RequestBuilder requestBuilder33 = requestBuilder15.headers(headerList31);
        requestBuilder1.headers = headerList31;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(typedOutput16);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(requestBuilder33);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.lang.Object[] objArray9 = requestBuilder8.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(objArray9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter16.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter16.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder21 = requestBuilder19.apiUrl("");
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder21.headers;
        requestBuilder1.setheaders(headerList22);
        java.lang.Object[] objArray24 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNull(objArray24);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.List<retrofit.client.Header> headerList5 = null;
        retrofit.RequestBuilder requestBuilder6 = requestBuilder4.headers(headerList5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = requestBuilder6.apiUrl("/foo/bar/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str8 = requestBuilder7.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        requestBuilder6.headers = headerList15;
        retrofit.converter.Converter converter24 = null;
        retrofit.RequestBuilder requestBuilder25 = new retrofit.RequestBuilder(converter24);
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = null;
        requestBuilder25.serializedObjectSupporter = serializedObjectSupporter26;
        java.lang.Object[] objArray28 = requestBuilder25.args;
        requestBuilder25.setapiUrl("");
        retrofit.client.Header[] headerArray33 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList34 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList34, headerArray33);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList34, typedOutput36);
        requestBuilder25.headers = headerList34;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList34, typedOutput39);
        requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList34);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder4.headers((java.util.List<retrofit.client.Header>) headerList34);
        java.lang.Class<?> wildcardClass43 = headerList34.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(objArray28);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter1();
        java.util.ArrayList arrayList8 = serializedObjectSupporter5.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder3();
        requestBuilder7.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter14.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter14.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter14.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList20 = null; // flaky: requestBuilder19.headers;
        requestBuilder13.headers = headerList20;
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder13.getheaders();
        requestBuilder7.headers = headerList22;
        java.util.List<retrofit.client.Header> headerList26 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter27.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter27.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter27.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter27.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter27.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput35 = requestBuilder34.buildBody();
        retrofit.client.Request request36 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList26, typedOutput35);
        retrofit.client.Request request37 = new retrofit.client.Request("/", "hi!", headerList22, typedOutput35);
        java.util.List<retrofit.client.Header> headerList38 = request37.getHeaders();
        java.lang.String str39 = request37.getUrl();
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(gsonConverter18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(headerList20);
// flaky:         org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(gsonConverter31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        requestBuilder6.setapiUrl("");
        retrofit.converter.Converter converter12 = requestBuilder6.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = requestBuilder15.serializedObjectSupporter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder15.headers;
        requestBuilder6.setheaders(headerList17);
        retrofit.RequestBuilder requestBuilder19 = requestBuilder4.headers(headerList17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter20.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter20.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter20.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter20.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter20.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter20.deserializeObjectRequestBuilder17();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter20;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter11.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter11.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter11.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter11.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter11.deserializeObjectRequestBuilder33();
        requestBuilder10.serializedObjectSupporter = serializedObjectSupporter11;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder1();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder3();
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        requestBuilder9.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder9.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter15.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter15.deserializeObjectRequestBuilder3();
        requestBuilder20.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter23.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter23.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter23.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter27.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter27.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter27.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter27.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList33 = null; // flaky: requestBuilder32.headers;
        requestBuilder26.headers = headerList33;
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder26.getheaders();
        requestBuilder20.headers = headerList35;
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter40.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter40.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter40.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter44 = serializedObjectSupporter40.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter40.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter40.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter40.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput48 = requestBuilder47.buildBody();
        retrofit.client.Request request49 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList39, typedOutput48);
        retrofit.client.Request request50 = new retrofit.client.Request("/", "hi!", headerList35, typedOutput48);
        retrofit.client.Request request51 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList12, typedOutput48);
        retrofit.client.Request request52 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList2, typedOutput48);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(gsonConverter31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(headerList33);
// flaky:         org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(gsonConverter44);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(typedOutput48);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = requestBuilder4.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/foo/bar/" + "'", str5, "/foo/bar/");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter11 = requestBuilder10.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(converter11);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.lang.String str6 = requestBuilder5.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder10();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Request request7 = requestBuilder6.build();
        java.lang.String str8 = request7.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request7.getHeaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GET" + "'", str8, "GET");
        org.junit.Assert.assertNotNull(headerList9);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = requestBuilder12.serializedObjectSupporter;
        java.lang.Object[] objArray14 = requestBuilder12.args;
        requestBuilder6.setargs(objArray14);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        requestBuilder1.setapiUrl("hi!");
        java.lang.Object[] objArray4 = requestBuilder1.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter5.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter5.deserializeObjectRequestBuilder17();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter5.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.Converter converter2 = null; // flaky: requestBuilder1.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter2);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.headers;
        requestBuilder1.setheaders(headerList10);
        requestBuilder1.apiUrl = "hi!";
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        java.lang.Class<?> wildcardClass7 = requestBuilder5.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray7 = requestBuilder6.getargs();
        requestBuilder3.setargs(objArray7);
        retrofit.mime.TypedOutput typedOutput9 = requestBuilder3.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[pong]");
        org.junit.Assert.assertNull(typedOutput9);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter6();
        java.lang.Class<?> wildcardClass15 = gsonConverter14.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder5.buildBody();
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder5.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(typedOutput6);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[pong]");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.Class<?> wildcardClass7 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.lang.String str6 = requestBuilder5.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.converter.Converter converter7 = requestBuilder5.getconverter();
        java.lang.Object[] objArray8 = requestBuilder5.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getMethod();
        java.lang.String str9 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.Class<?> wildcardClass5 = requestBuilder4.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        retrofit.mime.TypedOutput typedOutput12 = requestBuilder11.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList11 = serializedObjectSupporter5.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter5.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        requestBuilder1.setapiUrl("");
        java.lang.String str7 = requestBuilder1.apiUrl;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        retrofit.converter.Converter converter7 = requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray6 = requestBuilder5.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.Object[] objArray7 = requestBuilder6.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.lang.Object[] objArray4 = requestBuilder3.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(objArray4);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = requestBuilder6.apiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = requestBuilder6.apiUrl("");
        requestBuilder6.apiUrl = "/foo/bar/";
        java.lang.String str11 = requestBuilder6.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "/" + "'", str11, "/");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = null;
        requestBuilder9.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.Object[] objArray12 = requestBuilder9.args;
        requestBuilder9.setapiUrl("");
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        requestBuilder9.headers = headerList18;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput23);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter28.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter28.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter28.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter28.deserializeObjectRequestBuilder30();
        requestBuilder32.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder32.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter38.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter38.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter38.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter38.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter38.deserializeObjectRequestBuilder3();
        requestBuilder43.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter46.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter46.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter46.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter50.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter54 = serializedObjectSupporter50.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter50.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList56 = null; // flaky: requestBuilder55.headers;
        requestBuilder49.headers = headerList56;
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder49.getheaders();
        requestBuilder43.headers = headerList58;
        java.util.List<retrofit.client.Header> headerList62 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter63 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder64 = serializedObjectSupporter63.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder65 = serializedObjectSupporter63.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder66 = serializedObjectSupporter63.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter67 = serializedObjectSupporter63.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter63.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder69 = serializedObjectSupporter63.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder70 = serializedObjectSupporter63.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput71 = requestBuilder70.buildBody();
        retrofit.client.Request request72 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList62, typedOutput71);
        retrofit.client.Request request73 = new retrofit.client.Request("/", "hi!", headerList58, typedOutput71);
        retrofit.client.Request request74 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList35, typedOutput71);
        retrofit.client.Request request75 = new retrofit.client.Request("hi!", "/foo/bar/pong%26/", (java.util.List<retrofit.client.Header>) headerList18, typedOutput71);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(gsonConverter54);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
// flaky:         org.junit.Assert.assertNotNull(headerList56);
// flaky:         org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNotNull(requestBuilder64);
        org.junit.Assert.assertNotNull(requestBuilder65);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder66);
        org.junit.Assert.assertNotNull(gsonConverter67);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder68);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder69);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertNotNull(typedOutput71);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter4.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList10 = null; // flaky: requestBuilder9.headers;
        requestBuilder3.headers = headerList10;
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder3.getheaders();
        java.lang.Object[] objArray13 = requestBuilder3.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(headerList10);
// flaky:         org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong, kat, raff]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong, kat, raff]");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.lang.Object[] objArray7 = requestBuilder6.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        java.lang.Object[] objArray14 = requestBuilder13.args;
        requestBuilder6.setargs(objArray14);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[pong&, kat&]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[pong&, kat&]");
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong, kat, raff]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong, kat, raff]");
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList4 = null; // flaky: requestBuilder3.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        requestBuilder7.apiUrl = "http://example.com";
        retrofit.RequestBuilder requestBuilder11 = requestBuilder7.apiUrl("http://example.com");
        java.lang.Object[] objArray12 = requestBuilder7.args;
        java.lang.String str13 = requestBuilder7.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://example.com" + "'", str13, "http://example.com");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        java.lang.Object[] objArray5 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(objArray5);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray17 = requestBuilder16.getargs();
        requestBuilder13.setargs(objArray17);
        java.lang.Object[] objArray19 = requestBuilder13.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter20.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter20.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter20.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter20.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter20.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter20.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter20.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter29.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter29.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter29.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter29.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter35.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter35.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray38 = requestBuilder37.getargs();
        requestBuilder34.setargs(objArray38);
        java.lang.Object[] objArray40 = requestBuilder34.args;
// flaky:         requestBuilder28.setargs(objArray40);
        requestBuilder13.args = objArray40;
        requestBuilder7.setargs(objArray40);
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter44.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter46 = serializedObjectSupporter44.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter44.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter44.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter44.deserializeObjectRequestBuilder29();
        java.util.ArrayList arrayList50 = serializedObjectSupporter44.deserializeObjectList2();
        requestBuilder7.serializedObjectSupporter = serializedObjectSupporter44;
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = requestBuilder7.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[pong]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(gsonConverter26);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[pong]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(gsonConverter46);
        org.junit.Assert.assertNotNull(requestBuilder47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(arrayList50);
        org.junit.Assert.assertNotNull(serializedObjectSupporter52);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.lang.String str6 = requestBuilder5.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
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
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray9 = requestBuilder8.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList13 = serializedObjectSupporter10.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter10.deserializeObjectRequestBuilder12();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList22 = serializedObjectSupporter19.deserializeObjectList2();
        java.util.ArrayList arrayList23 = serializedObjectSupporter19.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter19.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = requestBuilder24.serializedObjectSupporter;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        requestBuilder24.headers = headerList33;
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder24.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter38.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter38.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter38.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter38.deserializeObjectRequestBuilder30();
        requestBuilder42.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList45 = requestBuilder42.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter48.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter48.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter48.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter48.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter48.deserializeObjectRequestBuilder3();
        requestBuilder53.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder57 = serializedObjectSupporter56.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder58 = serializedObjectSupporter56.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter56.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter60 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter60.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder62 = serializedObjectSupporter60.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter60.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter64 = serializedObjectSupporter60.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder65 = serializedObjectSupporter60.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList66 = null; // flaky: requestBuilder65.headers;
        requestBuilder59.headers = headerList66;
        java.util.List<retrofit.client.Header> headerList68 = requestBuilder59.getheaders();
        requestBuilder53.headers = headerList68;
        java.util.List<retrofit.client.Header> headerList72 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder74 = serializedObjectSupporter73.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter73.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder76 = serializedObjectSupporter73.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter77 = serializedObjectSupporter73.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder78 = serializedObjectSupporter73.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder79 = serializedObjectSupporter73.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder80 = serializedObjectSupporter73.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput81 = requestBuilder80.buildBody();
        retrofit.client.Request request82 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList72, typedOutput81);
        retrofit.client.Request request83 = new retrofit.client.Request("/", "hi!", headerList68, typedOutput81);
        retrofit.client.Request request84 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList45, typedOutput81);
        retrofit.client.Request request85 = new retrofit.client.Request("GET", "/foo/bar/", headerList35, typedOutput81);
// flaky:         requestBuilder16.setheaders(headerList35);
        requestBuilder8.headers = headerList35;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(arrayList22);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNull(serializedObjectSupporter25);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(requestBuilder52);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(requestBuilder57);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNotNull(requestBuilder59);
        org.junit.Assert.assertNotNull(requestBuilder61);
        org.junit.Assert.assertNotNull(requestBuilder62);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder63);
        org.junit.Assert.assertNotNull(gsonConverter64);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder65);
// flaky:         org.junit.Assert.assertNotNull(headerList66);
// flaky:         org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertNotNull(requestBuilder74);
        org.junit.Assert.assertNotNull(requestBuilder75);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder76);
        org.junit.Assert.assertNotNull(gsonConverter77);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder78);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder79);
        org.junit.Assert.assertNotNull(requestBuilder80);
        org.junit.Assert.assertNotNull(typedOutput81);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray13 = requestBuilder12.getargs();
        requestBuilder6.args = objArray13;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong]");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        requestBuilder2.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder13 = requestBuilder11.apiUrl("/foo/bar/pong%26/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.lang.String str5 = requestBuilder4.getapiUrl();
        requestBuilder4.setapiUrl("POST");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter14);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.util.ArrayList arrayList10 = serializedObjectSupporter0.deserializeObjectList1();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter9.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter9.deserializeObjectConverter10();
        requestBuilder8.serializedObjectSupporter = serializedObjectSupporter9;
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter9.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(requestBuilder17);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = requestBuilder4.serializedObjectSupporter;
        java.lang.Object[] objArray6 = requestBuilder4.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNotNull(objArray6);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = null;
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter2;
        java.lang.Object[] objArray4 = requestBuilder1.args;
        retrofit.converter.Converter converter5 = requestBuilder1.getconverter();
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
        retrofit.converter.Converter converter25 = null;
        retrofit.RequestBuilder requestBuilder26 = new retrofit.RequestBuilder(converter25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = null;
        requestBuilder26.serializedObjectSupporter = serializedObjectSupporter27;
        java.lang.Object[] objArray29 = requestBuilder26.args;
        requestBuilder26.setapiUrl("");
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        requestBuilder26.headers = headerList35;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput40);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder1.getheaders();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(headerList44);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.String str6 = null; // flaky: requestBuilder5.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList13 = serializedObjectSupporter10.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder9();
        requestBuilder9.serializedObjectSupporter = serializedObjectSupporter10;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(arrayList13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder5.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.getheaders();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder6.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder2();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter5.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray14 = requestBuilder13.getargs();
        requestBuilder10.setargs(objArray14);
        requestBuilder5.args = objArray14;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong]");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.Class<?> wildcardClass9 = requestBuilder8.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getUrl();
        java.lang.String str14 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.Class<?> wildcardClass6 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder4 = requestBuilder1.apiUrl("GET");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder6.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         requestBuilder7.setapiUrl("/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder6.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder1();
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = null;
        requestBuilder19.serializedObjectSupporter = serializedObjectSupporter20;
        java.lang.Object[] objArray22 = requestBuilder19.args;
        requestBuilder19.setapiUrl("");
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        requestBuilder19.headers = headerList28;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList28, typedOutput33);
        requestBuilder15.setheaders((java.util.List<retrofit.client.Header>) headerList28);
        requestBuilder11.headers = headerList28;
        requestBuilder6.headers = headerList28;
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder6.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNull(objArray22);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(headerList38);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.client.Request request7 = null; // flaky: requestBuilder6.build();
        java.lang.String str8 = null; // flaky: requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(request7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter6();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter15 = requestBuilder14.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(converter15);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList9 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder15();
        java.lang.Object[] objArray11 = null; // flaky: requestBuilder10.getargs();
        retrofit.RequestBuilder requestBuilder12 = null; // flaky: requestBuilder5.args(objArray11);
        java.util.List<retrofit.client.Header> headerList13 = null;
// flaky:         requestBuilder12.headers = headerList13;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(objArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[bar, pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[bar, pong]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder2();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        requestBuilder6.setapiUrl("POST");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter2.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray9 = requestBuilder8.args;
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder8.headers((java.util.List<retrofit.client.Header>) headerList15);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray26 = requestBuilder25.args;
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder25.getheaders();
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter31.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter31.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter31.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter31.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput39 = requestBuilder38.buildBody();
        retrofit.client.Request request40 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList30, typedOutput39);
        retrofit.client.Request request41 = new retrofit.client.Request("", "http://example.com", headerList27, typedOutput39);
        retrofit.client.Request request42 = new retrofit.client.Request("", "/", (java.util.List<retrofit.client.Header>) headerList15, typedOutput39);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[pong]");
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(gsonConverter35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(typedOutput39);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray6 = requestBuilder5.args;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder5.getheaders();
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter11.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter11.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter11.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter11.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter11.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput19 = requestBuilder18.buildBody();
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList10, typedOutput19);
        retrofit.client.Request request21 = new retrofit.client.Request("", "http://example.com", headerList7, typedOutput19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray26 = requestBuilder25.args;
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder25.getheaders();
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter31.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter31.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter31.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter31.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput39 = requestBuilder38.buildBody();
        retrofit.client.Request request40 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList30, typedOutput39);
        retrofit.client.Request request41 = new retrofit.client.Request("", "http://example.com", headerList27, typedOutput39);
        retrofit.client.Request request42 = new retrofit.client.Request("http://example.com", "/", headerList7, typedOutput39);
        java.lang.String str43 = request42.getMethod();
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(typedOutput19);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(gsonConverter35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(typedOutput39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://example.com" + "'", str43, "http://example.com");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList12 = serializedObjectSupporter9.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter15.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray23 = requestBuilder22.args;
// flaky:         requestBuilder19.args = objArray23;
        requestBuilder14.args = objArray23;
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter26.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter26.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter26.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter26.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter26.deserializeObjectRequestBuilder16();
        java.lang.Object[] objArray32 = null; // flaky: requestBuilder31.args;
        requestBuilder14.args = objArray32;
// flaky:         requestBuilder8.args = objArray32;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[pong#, kat#]");
        org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(objArray32);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray32), "[]");
    }
}
